package eg4_z;

import com.google.inject.Provides;
import eg4_creating_3rd_party_objects.Engine;
import eg4_creating_3rd_party_objects.EngineFactory;

public class Eg4Module {
    // Have a provider in the Module
    // to give you the Engine
    @Provides
    Engine getEngine(
            EngineFactory engineFactory,
            @EngineModel String model) {
        //
        return engineFactory
                .create(model);
    }
// Elsewhere there is a provider to
// get the factory and model
}
