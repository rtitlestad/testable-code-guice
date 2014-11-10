package eg4_creating_3rd_party_objects;

import java.io.File;

// Creating unneeded third party objects,
// Mixing object construction with logic, &
// "new" keyword removes a seam for other
// EngineFactory's to be used in tests.
// Also ties you to the (slow) file system.
class Car {
    Engine engine;
    Car(File file) {
        String model = readEngineModel(file);
        engine = new EngineFactory().create(model);
    }

    private String readEngineModel(File file) {
        throw new RuntimeException("Tried to read a file!");
//        return null;
    }
    // ...
}
