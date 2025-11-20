package behavioral.chainofresponsibility.responsibility;

public class PayloadValidationHandler extends RequestHandler {

  @Override
  public void processRequest() {
    System.out.println("Processing Request Payload Validation!!");
  }
}
