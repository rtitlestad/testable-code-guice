package eg4_z;

import eg4_creating_3rd_party_objects.Engine;
import junit.framework.TestCase;

// Now we can see a flexible, injectible design
public class CarTest extends TestCase {

    public void testShowsWeHaveCleanDesign() {
        Engine fakeEngine = new FakeEngine();
        Car car = new Car(fakeEngine);
        // Now testing is easy, with the car taking
        // exactly what it needs.
    }

    private class FakeEngine extends Engine {
    }
}
