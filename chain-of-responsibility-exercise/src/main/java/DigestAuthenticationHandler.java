public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler handler){
    super(handler);
  }

  public void handleRequest(String requestType) {
      if(requestType.equals("digest")){
          System.out.println("Handling digest request");
      } else {
          super.handleRequest(requestType);
      }
  }

}
