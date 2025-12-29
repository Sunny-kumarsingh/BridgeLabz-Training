import java.util.*;

public class ParkingLot{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total parking slot :");
		int totalParkingLot = sc.nextInt();
		int occupyLot =0;
		
		while(true){
		
			//check parking is full or not
			if (occupyLot == totalParkingLot) {
                System.out.println("Parking is full ");
                break;
            }
			
			System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit from the parking area ");
            System.out.println("Choose an option: ");
			
			int number = sc.nextInt();
			
			switch(number){
				case 1: 
						// Park
						if (occupyLot < totalParkingLot) {
							occupyLot++;
							System.out.println("Vehicle parked successfully ");
						} else {
							System.out.println("No space available!");
						}
						break;
				case 2: 
						// Exit
						if (occupyLot > 0) {
							occupyLot--;
							System.out.println("Vehicle exited successfully ");
						} else {
							System.out.println("Parking lot is already empty!");
						}
						break;
				case 3: 
					// Show occupancy
                    System.out.println("Occupied Slots: " + occupyLot);
                    System.out.println("Available Slots: " + (totalParkingLot - occupyLot));
                    break;

                case 4: 
					// Exit system
                    System.out.println("Exiting FROM Parking System ");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
			}
		}
		sc.close();
		
	}

}