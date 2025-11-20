package structural.adapter.pg;

public interface PaymentGateway {

  public void processPayment(String fromAccount, String toAccount, String amount);
}
