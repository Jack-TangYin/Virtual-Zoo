import java.util.ArrayList;

// Zoo class: Manages a collection of animals and provides interaction
public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();  // List of animals in the zoo

    // Method to add an animal to the zoo
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " the " + animal.getType() + " has been added to the zoo!");
    }

    // Method to list all animals in the zoo
    public void listAnimals() {
        if (animals.isEmpty()) {  // Check if the zoo is empty
            System.out.println("The zoo is empty!");
            return;
        }

        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {  // Loop through and print details of each animal
            System.out.println("- " + animal.getName() + " (" + animal.getType() + ")");
        }
    }

    // Method to interact with all animals in the zoo
    public void interactWithAnimals() {
        for (Animal animal : animals) {  // Loop through and call each animal's behaviors
            animal.makeSound();  // Polymorphism: Each animal's overridden makeSound() is called
            animal.eat();
        }
    }
}
