package eg3_z;

import eg3_violating_lod.User;
import junit.framework.TestCase;

// Easy to test with Dependency Injection
public class AccountViewTest extends TestCase {

    public void testLightweightAndFlexible() {
        User user = new DummyUser();
        AccountView view = new AccountView(user);
        // Easy to test and fast with test-double
        // user.
        // ...
    }

    private class DummyUser extends User {
    }
}