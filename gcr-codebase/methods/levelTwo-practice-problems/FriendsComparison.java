import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest of the 3 friends
    // Returns the index of the youngest friend
    public static int findYoungestIndex(int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.size; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return index;
    }

    // Method to find the tallest of the 3 friends
    // Returns the index of the tallest friend
    public static int findTallestIndex(double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Finding indices
        int youngestIdx = findYoungestIndex(ages);
        int tallestIdx = findTallestIndex(heights);

        // Displaying results
        System.out.println("The youngest friend is: " + names[youngestIdx] + " (Age: " + ages[youngestIdx] + ")");
        System.out.println("The tallest friend is: " + names[tallestIdx] + " (Height: " + heights[tallestIdx] + " cm)");

        sc.close();
    }
}