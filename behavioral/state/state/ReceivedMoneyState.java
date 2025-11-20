package behavioral.state.state;

import behavioral.state.VendingMachine;

public class ReceivedMoneyState extends MachineState {

  @Override
  public void selectItem(VendingMachine context,String itemName) {
    System.out.println("Cannot select item. Money for selected item already received.");
  }

  @Override
  public void insertCoin(VendingMachine context, double amount) {
    System.out.println("Money has already been received");
  }

  @Override
  public void dispenseItem(VendingMachine context) {
    System.out.println("Starting dispensing items");
    context.setCurrentState(new IdleState());
  }
}
