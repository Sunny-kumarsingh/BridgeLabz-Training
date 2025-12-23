import java.util.Scanner;

public class CanVote {

    // Method to random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Generate 2-digit age (10 to 99)
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    //check voting
    // Returns 2D String array 
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); 

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }


    public static void displayTable(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                Integer.parseInt(data[i][0]) + "\t" +
                Boolean.parseBoolean(data[i][1])
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateAges(n);


        String[][] votingResult = checkVotingEligibility(ages);

        // Display result
        displayTable(votingResult);

        sc.close();
    }
}
