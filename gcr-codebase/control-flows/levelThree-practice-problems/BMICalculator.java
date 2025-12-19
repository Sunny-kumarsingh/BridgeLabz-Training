import java.util.Scanner;

//find the BMI of a person


public class BMICalculator {
    public static void main(String[] args) {
		
		//Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Take input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        //Convert height from cm to meter
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // result
        System.out.println("BMI is: " + bmi);

        //Determine weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        }
        else {
            System.out.println("Status: Obese");
        }
    }
}
