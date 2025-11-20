package structural.adapter.pg;

import org.json.JSONObject;

public class StripePG {

  public void makePayment(JSONObject paymentData) {
    String fromAccount = paymentData.optString("fromAccount", "");
    String toAccount = paymentData.optString("toAccount", "");
    String amount = paymentData.optString("amount", "");

    System.out.println(
      "Transferring amount: " + amount + " from " + fromAccount + " to " + toAccount +
        " using Stripe PG");
  }

}
