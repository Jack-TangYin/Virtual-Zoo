// Subclass of Animal: Represents Mammals
public class Mammal extends Animal {

    // Constructor initializes Mammal-specific details
    public Mammal(String name, String diet) {
        super(name, "Mammal", diet);  // Call the superclass constructor
    }

    // Overrides the abstract method: Defines how mammals make sounds
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Roar or growl!");
    }
}
