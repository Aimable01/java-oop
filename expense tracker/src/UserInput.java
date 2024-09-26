import java.util.Scanner;

public class UserInput {
    public static int choice = -1;
    public static String name = "";

    public static void userInput() {

    // ask the user his choice

        Scanner scanner = new Scanner(System.in);

        System.out.println("🎉🎉 Welcome to our expense tracker app");
        do {
            try {
                System.out.print("Please enter your name: ");
                name = (scanner.nextLine()).strip();

                if (name.isEmpty()) {
                    System.out.println("❌ Name cannot be empty. Please enter a valid name.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        } while (name.isEmpty());

        System.out.println("👋👋 Hello, " + name + "!");

        System.out.println("\n🚀🚀 Please choose what you want to do:");
        System.out.println("1 - Add Income ");
        System.out.println("2 - Add Expense ");
        System.out.println("3 - View Transactions ");
        System.out.println("4 - View Balance ");
        System.out.println("5 - Exit");

        System.out.print("🪧🪧 Please enter your choice, " + name + ": ");

        // validate choice
        try {
            choice = scanner.nextInt();

            if (choice < 1 || choice > 7) {
                System.out.println("❌ Invalid choice. Please choose a number between 1 and 7.");
            } else {
                System.out.println(name + ", you chose: " + choice);
            }

        } catch (Exception e) {
            System.out.println("❌ Invalid input. Please enter a number.");
            scanner.next();
        }
    }

    public static int getChoice() {
        return choice;
    }
    public static String getName() {
        return name;
    }
}
