// Subclass of Animal: Represents Reptiles
public class Reptile extends Animal {

    // Constructor initializes Reptile-specific details
    public Reptile(String name, String diet) {
        super(name, "Reptile", diet);  // Call the superclass constructor
    }

    // Overrides the abstract method: Defines how reptiles make sounds
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hiss hiss!");
    }
}
