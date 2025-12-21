import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student is eligible to vote
    public boolean canStudentVote(int age) {
        // Validate for negative numbers
        if (age < 0) {
            return false;
        }
        
        // Check for age 18 or above
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Define an array of 10 integer elements
        int[] studentAges = new int[10];

        System.out.println("Enter the age for 10 students:");

        // Loop through the array to take user input
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = scanner.nextInt();
        }



        // Loop through the array to call the method and display results
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            boolean eligible = checker.canStudentVote(age);
            
            if (eligible) {
                System.out.println("Student " + (i + 1) + " (Age: " + age + "): Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + age + "): Cannot Vote");
            }
        }

        scanner.close();
    }
}