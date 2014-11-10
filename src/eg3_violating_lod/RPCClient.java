package eg3_violating_lod;

public class RPCClient {
    public static RPCClient getInstance() {
        return new RPCClient();
    }

    public User getUser() {
        throw new RuntimeException("Simulated connection failure");
        //return new User();
    }
}
