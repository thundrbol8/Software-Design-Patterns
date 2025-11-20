package behavioral.state.state;

import behavioral.state.VendingMachine;

public class DispensingState extends MachineState {

  @Override
  public void selectItem(VendingMachine context,String itemName) {
    System.out.println("Cannot select item while dispensing..");
  }

  @Override
  public void insertCoin(VendingMachine context, double amount) {
    System.out.println("Cannot insert coin. Product is selected");
  }

  @Override
  public void dispenseItem(VendingMachine context) {
    System.out.println("Already dispensing product");
  }
}
