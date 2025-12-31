import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book);

            System.out.print("Enter Due Date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;

                System.out.println("Returned Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);

                totalFine = totalFine + fine;
            } else {
                System.out.println("Returned on time. No fine");
            }
        }

        System.out.println("\n----------------------------");
        System.out.println("Total Fine for 5 Books: ₹" + totalFine);
        System.out.println("----------------------------");

        sc.close();
    }
}
