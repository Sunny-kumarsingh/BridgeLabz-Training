import java.util.Scanner;

public class RandomStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Formula: Math.random() * (max - min + 1) + min
            // For 4 digits: (9999 - 1000 + 1) + 1000 = 9000 + 1000
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = sum / numbers.length;

        // Returning as an array: [0] = average, [1] = min, [2] = max
        return new double[]{average, (double) min, (double) max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated 4-Digit Numbers:");
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Calculate stats
        double[] stats = findAverageMinMax(randomNumbers);

        // Display Results
        System.out.println("--- Statistics ---");
        System.out.printf("Average Value: %.2f%n", stats[0]);
        System.out.println("Minimum Value: " + (int) stats[1]);
        System.out.println("Maximum Value: " + (int) stats[2]);
    }
}