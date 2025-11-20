package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.responsibility.*;

public class ChainOfResponsibilityPatternApplication {

  public static void main(String[] args) {
    RequestHandler authenticationHandler = new AuthenticationHandler();
    RequestHandler authorizationHandler = new AuthorizationHandler();
    RequestHandler rateLimitHandler = new RateLimitHandler();
    RequestHandler payloadValidationHandler = new PayloadValidationHandler();

    authenticationHandler.setNext(authorizationHandler);
    authorizationHandler.setNext(rateLimitHandler);
    rateLimitHandler.setNext(payloadValidationHandler);

    authenticationHandler.forwardRequest();
  }

}
