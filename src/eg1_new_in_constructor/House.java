package eg1_new_in_constructor;

// Basic new operators called directly in
// the class' constructor. (Forever
// preventing a seam to create different
// kitchen and bedroom collaborators).
class House {
    Kitchen kitchen = new Kitchen();
    Bedroom bedroom;

    House() {
        bedroom = new Bedroom();
    }

    public void renovate() {
        kitchen.renovate();
        bedroom.renovate();
    }
    // ...
}