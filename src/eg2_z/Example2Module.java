package eg2_z;

import com.google.inject.Provides;
import eg2_partially_initialised.BootsWithMassiveStaticInitBlock;
import eg2_partially_initialised.Gardener;
import eg2_partially_initialised.Workday;

public class Example2Module {

    // In the Module configuring Guice.
    @Provides
    Gardener getGardenerJoe(Workday workday,
                            BootsWithMassiveStaticInitBlock badBoots) {
        Gardener joe = new Gardener();
        joe.setWorkday(workday);
        // Ideally, you'll refactor the static init.
        joe.setBoots(badBoots);
        return joe;
    }
}
