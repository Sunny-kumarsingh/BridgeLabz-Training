import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

		//Create Scanner object
        Scanner s = new Scanner(System.in);


		//Take input
        System.out.print("Enter Physics marks: ");
        int physics = s.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = s.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = s.nextInt();


		//calculate Average
        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below but approaching standards");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below standards");
        }
        else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1, too below standards");
        }
        else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
		
		
    }
}
