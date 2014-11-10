package eg2_z;

import com.google.inject.Inject;
import eg2_partially_initialised.Gardener;

// Let Guice create the gardener, and have a
// provider configure it.
class Garden {
    Gardener joe;
    @Inject
    Garden(Gardener joe) {
        this.joe = joe;
    }

    public void notifyGardenerSickShrubbery() {

    }
    // ...
}

