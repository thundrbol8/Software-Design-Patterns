package structural.adapter;

import structural.adapter.pg.*;

public class AdapterPatternApplication {

  public static void main(String[] args) {

    String fromAccount = "1234";
    String toAccount = "5678";
    String amount = "20.97";

    PaymentGateway paypalGateway = new PaypalAdapter(new PaypalPG());
    paypalGateway.processPayment(fromAccount, toAccount, amount);

    PaymentGateway stripeGateway = new StripeAdapter(new StripePG());
    stripeGateway.processPayment(fromAccount, toAccount, amount);
  }
}
