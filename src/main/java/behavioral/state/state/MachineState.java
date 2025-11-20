package behavioral.state.state;

import behavioral.state.VendingMachine;

public abstract class MachineState {

  public abstract void selectItem(VendingMachine context, String itemName);
  public abstract void insertCoin(VendingMachine context, double amount);
  public abstract void dispenseItem(VendingMachine context);
}
