import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = 10;

        // Arrays for salary & years of service
        double[] salary = new double[n];
        double[] years = new double[n];

        //Arrays for bonus & new salary
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Take input with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = s.nextDouble();

            System.out.print("Years of Service: ");
            years[i] = s.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; // decrement index to retry
            }
        }

        // Step 4: Calculate bonus & new salary
        for (int i = 0; i < n; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 5: Print results
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

        s.close();
    }
}
