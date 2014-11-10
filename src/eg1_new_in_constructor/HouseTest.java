package eg1_new_in_constructor;

import junit.framework.TestCase;

// An attempted test that becomes pretty hard
public class HouseTest extends TestCase {

    public void testThisIsReallyHard() {
        House house = new House();
        // Darn! I'm stuck with those Kitchen and
        // Bedroom objects created in the
        // constructor.
        // ...
        house.renovate();
    }
}
