package behavioral.chainofresponsibility.responsibility;

public class AuthenticationHandler extends RequestHandler {

  @Override
  public void processRequest() {
    System.out.println("Processing Request Authentication!!");
  }
}
