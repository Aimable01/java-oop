import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive types
        // numbers
        byte age = 30;
        int viewsCount = 123_456_789;
        long allViewsCount = 3_123_456_789L;
        double price = 10.99;
        float totalPrice = 10.99F;

        // characters
        char letter = 'A';

        // boolean
        boolean isEligible = true;

        // reference types
        Date now = new Date();

        // primitive vs reference types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        point2.y = 4;

        // strings
        String message = "Hello World";
        String concatString = "Hello" + "World";
        boolean endsWith = message.endsWith("!!");
        boolean startsWith = message.startsWith("!!");
        int length = message.length();
        int indexOf = message.indexOf("H");
        String replacedMessage = message.replace("World","Earth");
        /*
        other string methods:
            message.toLowerCase()
            message.toUpperCase()
            message.trim()
        * */

        // escape sequences
        String escapeSequenceMessage = "Hello \"Mosh\"";
        String pathToDirectory = "C:\\Windows\\Users\\Aimable";
        String withNewLine = "This is line 1 \nThis is line 2";
        String withTab = "This is a tabbed line \t This is after the tab";


        // Arrays
        // older syntax
        int[] numbersOlder = new int[5];
        numbersOlder[0] = 1;
        numbersOlder[1] = 2;

        // newer syntax
        int[] numbersNewer = {2,8,4,1,6,7};
        Arrays.sort(numbersNewer);

        // multi-dimensional arrays
        int[][] doubleDimensionalArray = new int[2][3];
        doubleDimensionalArray[0][0] = 1;

        int[][] doubleDimensionalNewer = {{1,2,3},{4,5,6}};



        // constants
        final float PI = 3.14F;



        // arithmetic operations
        // +,-,*,/,%
        int addResult = 10 + 3;
        int subtractResult = 10 - 3;
        int multiplyResult = 10 * 3;
        double divideResult = (double) 10 / (double) 3;


        // casting and type conversion
        // Implicit casting
        // byte > short > int > long > float > double
        short variable1 = 1;
        int variable2 = variable1 + 2;

        // Explicit casting
        double x = 3;
        int y = (int)x + 2; // output 3
        String castString = "1";
        int castInt = Integer.parseInt(castString); // return int 1



        // the Math class
        int roundedResult = Math.round(1.1F);
        int ceilResult = (int)Math.ceil(3.6F);
        int flooredResult = (int)Math.floor(3.6F);
        int maxResult = Math.max(1,2);
        int minResult = Math.min(2,3);
        int randomResult = (int) (Math.random() * 100);

        // formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(1234567.891);

        String percentageResult = NumberFormat.getPercentInstance().format(0.2);

        // methods usage
        String greeting = greetUser("Aimable","KWIZERA");
        System.out.println(greeting);
    }

    // methods
    public static String greetUser(String firstName, String lastName){
        return "Hello "+ firstName + " " + lastName;
    }
}