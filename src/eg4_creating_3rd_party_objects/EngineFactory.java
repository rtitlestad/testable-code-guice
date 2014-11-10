package eg4_creating_3rd_party_objects;

public class EngineFactory {
    public Engine create(String model) {
        throw new RuntimeException("Created a real engine!");
        //return null;
    }
}
