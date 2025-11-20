package behavioral.chainofresponsibility.responsibility;

public abstract class RequestHandler {
  public RequestHandler requestHandler;

  public void setNext(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  public void forwardRequest() {
    processRequest();
    if (requestHandler != null) {
      requestHandler.forwardRequest();
    }
  }

  public abstract void processRequest();
}
