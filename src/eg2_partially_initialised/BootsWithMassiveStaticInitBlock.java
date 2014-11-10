package eg2_partially_initialised;

public class BootsWithMassiveStaticInitBlock {

    static {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
