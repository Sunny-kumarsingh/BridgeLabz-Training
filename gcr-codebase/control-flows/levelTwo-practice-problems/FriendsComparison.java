import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

		//Create Scanner object
        Scanner s = new Scanner(System.in);

        // Input age and height of Amar
        System.out.print("Enter Amar age: ");
        int amarAge = s.nextInt();
        System.out.print("Enter height: ");
        double amarHeight = s.nextDouble();

        // Input age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = s.nextInt();
        System.out.print("Enter height: ");
        double akbarHeight = s.nextDouble();

        // Input age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = s.nextInt();
        System.out.print("Enter height: ");
        double anthonyHeight = s.nextDouble();

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        s.close();
    }
}
