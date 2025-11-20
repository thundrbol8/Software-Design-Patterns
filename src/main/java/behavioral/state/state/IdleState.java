package behavioral.state.state;

import behavioral.state.VendingMachine;

public class IdleState extends MachineState {

  @Override
  public void selectItem(VendingMachine context, String itemName) {
    System.out.println("Selecting item");
    context.setSelectedItem(itemName);
    context.setCurrentState(new ProductSelectedState());
  }

  @Override
  public void insertCoin(VendingMachine context, double amount) {
    System.out.println("Cannot insert coin. Machine in idle state");
  }

  @Override
  public void dispenseItem(VendingMachine context) {
    System.out.println("Cannot dispense item. Machine in idle state");
  }
}
