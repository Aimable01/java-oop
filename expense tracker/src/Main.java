import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // ask the user his choice
        // Variables
        String name = "";
        int choice = -1;

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

        while (choice != 7) {
            System.out.println("\n🚀🚀 Please choose what you want to do:");
            System.out.println("1 - Add income ");
            System.out.println("2 - Add expense ");
            System.out.println("3 - View summary ");
            System.out.println("4 - View transactions ");
            System.out.println("5 - Group expenses by category ");
            System.out.println("6 - Save and load data ");
            System.out.println("7 - Exit");

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

        System.out.println("👋👋 Goodbye, " + name + "! Thank you for using our expense tracker.");
    }
}
