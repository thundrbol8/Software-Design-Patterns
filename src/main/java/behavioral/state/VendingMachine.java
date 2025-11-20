package behavioral.state;

import behavioral.state.state.IdleState;
import behavioral.state.state.MachineState;

public class VendingMachine {
  public MachineState currentState;
  public String itemName;
  public double amount;

  public VendingMachine() {
    this.currentState = new IdleState();
  }

  public void setSelectedItem(String name) {
    this.itemName = name;
  }

  public void setCurrentState(MachineState newState) {
    this.currentState = newState;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  /***
   Client Side Methods
   */

  public void selectItem(String itemName) {
    currentState.selectItem(this, itemName);
  }

  public void insertCoin(double amount) {
    currentState.insertCoin(this, amount);
  }

  public void dispenseItem() {
    currentState.dispenseItem(this);
  }

}
