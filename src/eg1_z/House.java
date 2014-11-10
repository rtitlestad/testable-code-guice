package eg1_z;

import eg1_new_in_constructor.Bedroom;
import eg1_new_in_constructor.Kitchen;

import javax.inject.Inject;

class House {
    Kitchen kitchen;
    Bedroom bedroom;
    // Have Guice create the objects
    // and pass them in
    @Inject
    House(Kitchen k, Bedroom b) {
        kitchen = k;
        bedroom = b;
    }

    public void renovate() {
        kitchen.renovate();
        bedroom.renovate();
    }
    // ...
}
