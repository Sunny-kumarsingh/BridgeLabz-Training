import java.util.*;

public class Recharge {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double balance = 0;
		
		while(true){
			System.out.println("\nEnter Mobile Operator (Jio / Airtel ) or 'exit' to quit:");
            String operator = sc.next();
			
			
			if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using Phone Recharge);
                break;
            }
			
			System.out.println("Enter Recharge Amount:");
            double amount = sc.nextDouble();

            
            balance += amount;
			switch(operator.toLowerCase()){
				case "jio" :
					System.out.println("jio offer 1.5GB/day + Unlimited Calls");
					break;
				case "airtel":
                    System.out.println("Airtel offer  2GB/day + Free Wynk Music");
                    break;
				default:
                    System.out.println("Invalid Operator");
                    balance -= amount; 
                    continue;
			}
			System.out.println("Recharge Successful!");
            System.out.println("Current Balance: ₹" + balance);
		}
		sc.close();
		
	}
}