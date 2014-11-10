package eg2_z;

import eg2_partially_initialised.Gardener;
import junit.framework.TestCase;

// The new tests run quickly and are not
// dependent on the slow
// BootsWithMassiveStaticInitBlock
public class GardenTest extends TestCase {

    public void testUsesGardenerWithDummies() {
        Gardener gardener = new Gardener();
        gardener.setWorkday(new OneMinuteWorkday());
        // Okay to pass in null, b/c not relevant
        // in this test.
        gardener.setBoots(null);
        Garden garden = new Garden(gardener);
        new AphidPlague(garden).infect();
        garden.notifyGardenerSickShrubbery();
        assertTrue(gardener.isWorking());
    }
}