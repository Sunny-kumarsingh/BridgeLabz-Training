import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean nextCustomer = true;

        do {
            double moviePrice = 0;
            double seatPrice = 0;
            double snackPrice = 0;

            // Movie Type
            System.out.println("Select Movie Type:");
            System.out.println("1. Bollywood");
            System.out.println("2. Hollywood");
            System.out.println("3. South Indian");
            System.out.print("Enter choice: ");
            int movieChoice = sc.nextInt();

            switch (movieChoice) {
                case 1:
                    moviePrice = 150;
                    break;
                case 2:
                    moviePrice = 200;
                    break;
                case 3:
                    moviePrice = 180;
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            // Seat Type
            System.out.print("Enter seat type (gold/silver): ");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("gold")) {
                seatPrice = 120;
            } else if (seatType.equalsIgnoreCase("silver")) {
                seatPrice = 80;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 60;
            }

            double totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("------ BILL DETAILS ------");
            System.out.println("Movie Price  : ₹" + moviePrice);
            System.out.println("Seat Price   : ₹" + seatPrice);
            System.out.println("Snack Price  : ₹" + snackPrice);
            System.out.println("Total Amount : ₹" + totalBill);

            // Next Customer
            System.out.print("Next customer? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                nextCustomer = false;
            }

        } while (nextCustomer);

        System.out.println("Booking Closed. Thank you!");
        sc.close();
    }
}
