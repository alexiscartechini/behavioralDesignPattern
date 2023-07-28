public class Client {

  public static void main(String[] args) {

      AuthenticationHandler handler = new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(new BasicAuthenticationHandler(null)));

      handler.handleRequest("basic");
      handler.handleRequest("client");
      handler.handleRequest("digest");

  }

}
