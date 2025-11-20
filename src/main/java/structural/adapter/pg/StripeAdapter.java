package structural.adapter.pg;

import org.json.JSONObject;

public class StripeAdapter implements PaymentGateway {
  StripePG stripePG;

  public StripeAdapter(StripePG stripePG) {
    this.stripePG = stripePG;
  }

  @Override
  public void processPayment(String fromAccount, String toAccount, String amount) {
    JSONObject paymentData = new JSONObject();
    paymentData.put("fromAccount", fromAccount);
    paymentData.put("toAccount", toAccount);
    paymentData.put("amount", amount);

    stripePG.makePayment(paymentData);
  }
}
