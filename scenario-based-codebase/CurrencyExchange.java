import java.util.*;

public class CurrencyExchange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do{
			System.out.println("Enter in your amount in INR :");
			double amount = sc.nextDouble();
			
	
			System.out.println("press 1: USD");
			System.out.println("press 2: dhr");
			System.out.println("press 3: rubal");
			System.out.println("press 4: Eur");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			double exchangeAmount = 0;
			switch(choice){
				case 1:
						exchangeAmount = amount*0.012;
						System.out.println("Amount in USD is : " + exchangeAmount);
						break;
						
				case 2:
						exchangeAmount = amount*0.044;
						System.out.println("Amount in DHR is : " + exchangeAmount);
						break;
						
				case 3:
						exchangeAmount = amount*1.05;
						System.out.println("Amount in RUB is : " + exchangeAmount);
						break;
						
				case 4:
						exchangeAmount = amount*0.011;
						System.out.println("Amount in EUR is : " + exchangeAmount);
						break;
						
				default:
						System.out.println("Invalid options");
			}
			System.out.println("Do you want another conversion? (Y/N)");
             ch = sc.next().toUpperCase().charAt(0);
		}while(ch == 'Y');
	}
}