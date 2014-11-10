package eg2_partially_initialised;

import junit.framework.TestCase;

// A test that is very slow, and forced
// to run the static init block multiple times.
public class GardenTest extends TestCase {

    public void testMustUseFullFledgedGardener() {
        Gardener gardener = new Gardener();
        Garden garden = new Garden(gardener);
        new AphidPlague(garden).infect();
        garden.notifyGardenerSickShrubbery();
        assertTrue(gardener.isWorking());
    }
}
