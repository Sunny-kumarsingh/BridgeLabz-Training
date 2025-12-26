import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 100; 

        while (balance > 0) {

            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance (km) or 0 to quit: ");
            int distance = sc.nextInt();

            // Exit condition
            if (distance == 0) {
                System.out.println("Thank you for using Delhi Metro!");
                break;
            }

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 : 20;

            // Check sufficient balance
            if (fare > balance) {
                System.out.println("Insufficient balance!");
                break;
            }

            // Deduct fare
            balance = balance - fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        }

        System.out.println("Journey Ended.");
        sc.close();
    }
}
