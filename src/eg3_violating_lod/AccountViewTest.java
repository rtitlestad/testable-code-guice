package eg3_violating_lod;

import junit.framework.TestCase;

// Hard to test because needs real RPCClient
public class AccountViewTest extends TestCase {

    public void testUnfortunatelyWithRealRPC() {
        AccountView view = new AccountView();
        // Shucks! We just had to connect to a real
        // RPCClient. This test is now slow.
        // ...
    }
}
