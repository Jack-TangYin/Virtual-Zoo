import java.util.Scanner;

// Main class: Entry point of the program
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();  // Create a Zoo object
        Scanner scanner = new Scanner(System.in);  // Scanner for user input

        while (true) {  // Infinite loop for the menu
            // Display menu options
            System.out.println("\n=== Virtual Zoo ===");
            System.out.println("1. Add a Mammal");
            System.out.println("2. Add a Bird");
            System.out.println("3. Add a Reptile");
            System.out.println("4. List All Animals");
            System.out.println("5. Interact with Animals");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();  // Read user choice
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:  // Add a Mammal
                    System.out.print("Enter Mammal Name: ");
                    String mammalName = scanner.nextLine();
                    System.out.print("Enter Diet (e.g., meat, plants): ");
                    String mammalDiet = scanner.nextLine();
                    zoo.addAnimal(new Mammal(mammalName, mammalDiet));  // Create and add a Mammal
                    break;

                case 2:  // Add a Bird
                    System.out.print("Enter Bird Name: ");
                    String birdName = scanner.nextLine();
                    System.out.print("Enter Diet (e.g., seeds, insects): ");
                    String birdDiet = scanner.nextLine();
                    zoo.addAnimal(new Bird(birdName, birdDiet));  // Create and add a Bird
                    break;

                case 3:  // Add a Reptile
                    System.out.print("Enter Reptile Name: ");
                    String reptileName = scanner.nextLine();
                    System.out.print("Enter Diet (e.g., insects, meat): ");
                    String reptileDiet = scanner.nextLine();
                    zoo.addAnimal(new Reptile(reptileName, reptileDiet));  // Create and add a Reptile
                    break;

                case 4:  // List All Animals
                    zoo.listAnimals();
                    break;

                case 5:  // Interact with Animals
                    zoo.interactWithAnimals();
                    break;

                case 6:  // Exit the program
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();  // Close the scanner
                    return;  // Exit the loop and program

                default:  // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
