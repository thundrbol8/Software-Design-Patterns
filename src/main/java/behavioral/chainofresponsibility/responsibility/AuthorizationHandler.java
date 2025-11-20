package behavioral.chainofresponsibility.responsibility;

public class AuthorizationHandler extends RequestHandler {

  @Override
  public void processRequest() {
    System.out.println("Processing Request Authorization!!");
  }
}
