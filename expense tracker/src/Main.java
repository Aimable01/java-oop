import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Budget manager
        BudgetManager budgetManager = new BudgetManager();

        // Get choice and other input
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        // User input for name
        UserInput.userInput();

        do {
            choice = UserInput.getChoice(); // Get the current choice

            switch (choice) {
                case 1:
                    System.out.print("Enter income description: ");
                    String description = sc.nextLine();
                    double incomeAmount = getValidDoubleInput(sc,"Enter income amount: ");
                    budgetManager.addTransaction(description, incomeAmount, "income", null);
                    System.out.println("Income added.");
                    break;

                case 2:
                    System.out.print("Enter expense description: ");
                    String expenseDescription = sc.nextLine();
                    double expenseAmount = getValidDoubleInput(sc,"Enter expense amount: ");
                    System.out.print("Enter expense category (e.g., rent, food, utilities): ");
                    String expenseCategory = sc.nextLine();
                    budgetManager.addTransaction(expenseDescription, expenseAmount, "expense", expenseCategory);
                    System.out.println("Expense added.");
                    break;

                case 3:
                    System.out.println("Transactions: ");
                    budgetManager.listTransactions();
                    break;

                case 4:
                    System.out.println("Balance: $" + budgetManager.getBalance());
                    System.out.println("Total income: $" + budgetManager.getTotalIncome());
                    System.out.println("Total expense: $" + budgetManager.getTotalExpense());
                    break;

                case 5:
                    System.out.println("👋👋 Goodbye, " + UserInput.getName() + "! Thank you for using our expense tracker.");
                    System.out.println("Exiting the application: ");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Ask for user input again unless the choice is 5
            if (choice != 5) {
                UserInput.userInput();
            }

        } while (choice != 5);
    }

    // Validate numeric input
    public static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Invalid input, amount must be positive");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }
        return value;
    }
}
