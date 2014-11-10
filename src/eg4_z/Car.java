package eg4_z;

import com.google.inject.Inject;
import eg4_creating_3rd_party_objects.Engine;

// Asks for precisely what it needs
class Car {
    Engine engine;
    @Inject
    Car(Engine engine) {
        this.engine = engine;
    }
    // ...
}

