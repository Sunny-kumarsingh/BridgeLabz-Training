import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI and populate the 3rd column of the 2D array
    public static void calculateBmi(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            
            // Convert cm to meters
            double heightM = heightCm / 100.0;
            
            // BMI formula: weight / (height * height)
            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to determine status based on BMI value
    public static String[] getBmiStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D array: 10 rows (persons), 3 columns (weight, height, BMI)
        double[][] personData = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Weight: ");
            personData[i][0] = sc.nextDouble(); // Column 0: Weight
            System.out.print("  Height: ");
            personData[i][1] = sc.nextDouble(); // Column 1: Height
        }

        // Calculate BMIs
        calculateBmi(personData);
        
        // Get Statuses
        String[] statuses = getBmiStatus(personData);

        // Display results
       
        System.out.println("Member" + "Weight" + "Height"+ "BMI" + "Status");
        
        for (int i = 0; i < 10; i++) {
            System.out.println( 
                (i + 1)+ personData[i][0] + personData[i][1] + personData[i][2] + statuses[i]);
        }
        
        sc.close();
    }
}