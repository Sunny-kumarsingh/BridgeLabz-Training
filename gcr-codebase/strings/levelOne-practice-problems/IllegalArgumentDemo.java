import java.util.Scanner;

public class IllegalArgumentDemo {

    //llegalArgumentException
    public static void generateException(String str ) {
 
        System.out.println(str .substring(5, 2));
    }

    //handle IllegalArgumentException
    public static void handleException(String str ) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string value:");
        String str = sc.next();

        //generates exception
        try {
            generateException(str );
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception");
        }

        //handles exception
        handleException(str );
    }
}
