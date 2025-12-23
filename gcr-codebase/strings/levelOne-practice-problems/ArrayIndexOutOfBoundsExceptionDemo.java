import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    //ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    // handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names:");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        //generates exception
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program show Runtime Exception");
        }

        //handles exception
        handleException(names);
    }
}
