import java.util.Scanner;

public class FootballTeamStats {

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        // Formula: sum of all elements / number of elements
        double sum = findSum(heights);
        return sum / heights.length;
    }

    // Method to find the shortest (minimum) height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            min = Math.min(min, heights[i]);
        }
        return min;
    }

    // Method to find the tallest (maximum) height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        // Create an int array named heights of size 11
        int[] heights = new int[11];

        //  3-digit random heights in the range 150 cms to 250 cms
        // Formula: (Math.random() * (max - min + 1)) + min
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * (250 - 150 + 1)) + 150;
        }

        // Display the generated player heights
        System.out.println("Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + (i < heights.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // Calculate and display results
        System.out.println("Total Sum of Heights: " + findSum(heights) + " cms");
        System.out.println("Mean Height:  "+ findMean(heights));
        System.out.println("Shortest Player:      " + findShortest(heights) + " cms");
        System.out.println("Tallest Player:       " + findTallest(heights) + " cms");
    }
}