// Abstract class Animal: Defines the common structure for all animals in the zoo.
public abstract class Animal {
    private String name;  // Name of the animal
    private String type;  // Type of the animal (e.g., Mammal, Bird, Reptile)
    private String diet;  // The animal's diet (e.g., meat, plants)

    // Constructor to initialize common attributes of an animal
    public Animal(String name, String type, String diet) {
        this.name = name;
        this.type = type;
        this.diet = diet;
    }

    // Getter for the animal's name
    public String getName() {
        return name;
    }

    // Getter for the animal's type
    public String getType() {
        return type;
    }

    // Getter for the animal's diet
    public String getDiet() {
        return diet;
    }

    // Abstract method to be implemented by subclasses: defines the animal's sound
    public abstract void makeSound();

    // Method for eating behavior (common for all animals)
    public void eat() {
        System.out.println(name + " is eating " + diet + ".");
    }
}
