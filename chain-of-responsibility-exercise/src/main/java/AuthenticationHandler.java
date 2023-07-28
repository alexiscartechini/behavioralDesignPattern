import static java.util.Objects.nonNull;
public abstract class AuthenticationHandler {

    private AuthenticationHandler next;

    public AuthenticationHandler(AuthenticationHandler next) {
        this.next = next;
    }

    public void handleRequest(String requestType) {
      if (nonNull(next)){
          next.handleRequest(requestType);
      }
  }

}
