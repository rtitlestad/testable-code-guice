package eg1_z;

import eg1_new_in_constructor.Bedroom;
import eg1_new_in_constructor.Kitchen;
import junit.framework.TestCase;

// New and Improved is trivially testable, with any
// test-double objects as collaborators.
public class HouseTest extends TestCase {

    public void testThisIsEasyAndFlexible() {
        Kitchen dummyKitchen = new DummyKitchen();
        Bedroom dummyBedroom = new DummyBedroom();
        House house =
                new House(dummyKitchen, dummyBedroom);
        // Awesome, I can use test doubles that
        // are lighter weight.
        // ...
        house.renovate();
    }

    private class DummyKitchen extends Kitchen {
        @Override
        public void renovate() {
        }
    }

    private class DummyBedroom extends Bedroom {
        @Override
        public void renovate() {
        }
    }
}
