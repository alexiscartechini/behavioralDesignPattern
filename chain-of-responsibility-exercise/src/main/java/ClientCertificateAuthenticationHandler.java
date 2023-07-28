public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

    public ClientCertificateAuthenticationHandler(AuthenticationHandler handler){
        super(handler);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("client")){
            System.out.println("Handling client certificate request");
        } else {
            super.handleRequest(requestType);
        }
    }

}
