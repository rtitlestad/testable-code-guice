package eg4_creating_3rd_party_objects;

import junit.framework.TestCase;

import java.io.File;

// The test exposes the brittleness of the Car
public class CarTest extends TestCase {

    public void testNoSeamForFakeEngine() {
        // Aggh! I hate using files in unit tests
        File file = new File("engine.config");
        Car car = new Car(file);
        // I want to test with a fake engine
        // but I can't since the EngineFactory
        // only knows how to make real engines.
    }
}
