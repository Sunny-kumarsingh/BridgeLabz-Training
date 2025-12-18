import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = s.nextDouble();
        System.out.print("Enter years of service: ");
        int years = s.nextInt();

        // Check for bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5 years.");
        }

        s.close();
    }
}
