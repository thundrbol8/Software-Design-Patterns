package behavioral.state;

public class StatePatternApplication {

  public static void main(String[] args) {

    VendingMachine machine = new VendingMachine();

    machine.selectItem("Mango");
    machine.insertCoin(10.5);
    machine.dispenseItem();

    // Inserting money without product selection
    machine.insertCoin(5);

    // Try dispensing without money received and product selection
    machine.dispenseItem();

    // Item selected, directly trying to dispense without receiving money
    machine.setSelectedItem("Spinach");
    machine.dispenseItem();
  }

}
