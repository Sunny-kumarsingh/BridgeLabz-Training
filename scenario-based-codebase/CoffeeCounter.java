import java.util.*;

public class CoffeeCounter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true){
		
		
			//take input string for coffee
			System.out.println("Enter the coffee type : ");
			String coffeeType = sc.nextLine();
			
			//Exit 
			if(coffeeType.equalsIgnoreCase("exit")){
				System.out.println("Thank you for visting ");
				break;
			}
			
			double price = 0;
			
			switch(coffeeType.toLowerCase()){
			
				case  "espresso" : price =100;
						break;
				case  "cold coffee" : price = 110;
						break;
				case  "latte" : price = 150; 
						break;	
				default:
                    System.out.println("Invalid coffee type!");
                    continue;
			 
			}
			
			// take input for quantity
			System.out.println("Enter the quntity of coffee :");
			int quantity = sc.nextInt();
			
			//bill calculate
			double total = price * quantity;
			double totalgst = total * 0.05;
			double finalPrice = total + totalgst;
			
			System.out.println("Total Price : " + finalPrice);
		}
		sc.close();
	}
}