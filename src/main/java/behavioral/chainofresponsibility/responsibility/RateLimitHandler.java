package behavioral.chainofresponsibility.responsibility;

public class RateLimitHandler extends RequestHandler {

  @Override
  public void processRequest() {
    System.out.println("Processing Request Rate Limiter!!");
  }
}
