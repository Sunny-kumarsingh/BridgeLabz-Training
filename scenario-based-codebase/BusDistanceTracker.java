import java.util.Scanner;

public class BusDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopDistance = 5;
        String choice = "no";

        while (!choice.equalsIgnoreCase("yes")) {

            totalDistance = totalDistance + stopDistance;

            System.out.println("Bus reached next stop.");
            

            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("Passenger got off.");
        System.out.println("Final distance travelled: " + totalDistance + " km");

        sc.close();
    }
}
