// Subclass of Animal: Represents Birds
public class Bird extends Animal {

    // Constructor initializes Bird-specific details
    public Bird(String name, String diet) {
        super(name, "Bird", diet);  // Call the superclass constructor
    }

    // Overrides the abstract method: Defines how birds make sounds
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp chirp!");
    }
}
