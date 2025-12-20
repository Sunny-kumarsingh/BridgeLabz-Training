import java.util.Scanner;

public class StudentGradeCalculation {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        // physics, chemistry, maths 
        int[][] marks = new int[n][3]; 
        double[] percentage = new double[n];
        char[] grade = new char[n];
        // take input details of students   
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();

            if(marks[i][0]<0 || marks[i][1]<0 || marks[i][2]<0){
                System.out.println("Marks must be positive. Enter again.");
                i--;
            }
        }

        // Calculate grade
        for(int i=0;i<n;i++){
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if(percentage[i] >= 80){
                grade[i] = 'A';
            }
            else if(percentage[i] >= 70){
                grade[i] = 'B';
            }
            else if(percentage[i] >= 60){
                grade[i] = 'C';
            }
            else if(percentage[i] >= 50){
                grade[i] = 'D';
            }
            else if(percentage[i] >= 40){
                grade[i] = 'E';
            }
            else{
                grade[i] = 'R';
            }
        }


       // Print result
        for(int i=0;i<n;i++){
            System.out.println("Physics: "+marks[i][0]+" Chemistry: "+marks[i][1]+" Maths: "+marks[i][2]+" Percentage: "+percentage[i]+" Grade: "+grade[i]);
        }
    }
}
