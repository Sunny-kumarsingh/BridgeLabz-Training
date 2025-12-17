import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take unit price
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();

        // Take quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);

    }
}
