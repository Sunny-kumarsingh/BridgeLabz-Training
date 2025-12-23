import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text); 
        System.out.println("Number is: " + number);
    }

    // handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        String text = sc.next();

        // generates exception
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception");
        }

        // handles exception
        handleException(text);
    }
}
