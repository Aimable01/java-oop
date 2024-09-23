import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // comparison operators
        // ==, !=, >, <, >=, <=
        int x = 1;
        int y = 1;
        boolean isEqual = x == y;

        // logical operators
        // &&, ||,  !
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord ;

        // if statements
        if (temperature > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("It's a beautiful day");
        } else{
            System.out.println("It's a cold day");
        }

        // the ternary operator
        int income = 120_000;
        String className = (income > 100_000) ? "First" : "Economy";


        // switch statements
        String role = "admin";
         switch (role) {
             case "admin":
                 System.out.println("You're an admin");
                 break;
             case "moderator":
                 System.out.println("You're a moderator");
                 break;
             default:
                 System.out.println("You're a guest");
         }

         // EXERCISE: Fizz Buzz
         Scanner scanner = new Scanner(System.in);
         System.out.print("Number: ");
         int number = scanner.nextInt();

         // check the logic
         if ((number % 15) == 0){
             System.out.println("Fizz Buzz");
         }else if ((number % 5) == 0){
             System.out.println("Buzz");
         } else if ((number %3) == 0) {
             System.out.println("Fizz");
         }else {
             System.out.println(number);
         }

         // for loops
        for (int i = 0; i < 5; i++){
            System.out.println("Hello world");
        }

        // while loops
        int i = 5;
        while (i > 0){
            System.out.println("Hello world");
            i--;
        }

        String input = "";
        while (!input.equals("quit")){
            System.out.printf("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // Do... While loops
        do {
            System.out.printf("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));


        // For... Each loops
        String[] fruits  ={"Apple","Banana","Orange"};
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}