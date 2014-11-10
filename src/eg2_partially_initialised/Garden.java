package eg2_partially_initialised;

// SUT initializes collaborators. This prevents
// tests and users of Garden from altering them.
class Garden {
    private final Gardener joe;

    Garden(Gardener joe) {
        joe.setWorkday(new TwelveHourWorkday());
        joe.setBoots(
                new BootsWithMassiveStaticInitBlock());
        this.joe = joe;
    }

    public void notifyGardenerSickShrubbery() {

    }
    // ...
}
