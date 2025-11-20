package structural.adapter.pg;

public class PaypalAdapter implements PaymentGateway {
  PaypalPG paypalPG;

  public PaypalAdapter (PaypalPG paypalPG) {
    this.paypalPG = paypalPG;
  }

  @Override
  public void processPayment(String fromAccount, String toAccount, String amount) {
    paypalPG.pay(fromAccount, toAccount, amount);
  }
}
