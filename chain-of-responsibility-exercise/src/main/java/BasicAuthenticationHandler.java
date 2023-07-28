public class BasicAuthenticationHandler extends AuthenticationHandler {

    public BasicAuthenticationHandler(AuthenticationHandler handler){
        super(handler);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("basic")){
            System.out.println("Handling basic request");
        } else {
            super.handleRequest(requestType);
        }
    }

}
