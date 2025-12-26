import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks[] = new int[5];

        // Taking marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        // Calculate average
        int average = total / 5;
        System.out.println("Average Marks: " + average);

        // give grade using switch
        switch (average / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
