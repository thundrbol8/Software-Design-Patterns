package structural.adapter.pg;

public class PaypalPG {

  public void pay(String fromAccount, String toAccount, String amount) {
    System.out.println(
      "Transferring amount: " + amount + " from " + fromAccount + " to " + toAccount
        + " using PayPal PG");
  }

}
