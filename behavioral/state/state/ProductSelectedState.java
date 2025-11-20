package behavioral.state.state;

import behavioral.state.VendingMachine;

public class ProductSelectedState extends MachineState {

  @Override
  public void selectItem(VendingMachine context,String itemName) {
    System.out.println("Item already selected");
  }

  @Override
  public void insertCoin(VendingMachine context, double amount) {
    System.out.println("Inserting coin....");
    context.setAmount(amount);
    context.setCurrentState(new ReceivedMoneyState());
  }

  @Override
  public void dispenseItem(VendingMachine context) {
    System.out.println("Cannot dispense item. Have not received money yet");
  }
}
