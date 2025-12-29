import java.util.*;


public class DiscountDashboard{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of item : ");
		int totalItems = sc.nextInt();
		
		int []items = new int[totalItems];
		System.out.println("Enter the price of item");
		
		for(int i=0; i<totalItems; i++){
			items[i] = sc.nextInt();
		}
		
		int totalBill =0;
		for(int i=0; i<totalItems; i++){
			totalBill += items[i];
		}
		
		
		if(totalBill>=500 && totalBill <=1000){
			int finalPrice = totalBill;
			System.out.println("you will get 10% discount : ");
			finalPrice = finalPrice - (int)(finalPrice*0.1);
			System.out.println("final price is : " + finalPrice);
		}
		else if(totalBill>1000 ){
			int finalPrice = totalBill;
			System.out.println("you will get 20% discount : ");
			finalPrice = finalPrice - (int)(finalPrice*0.2);
			System.out.println("final price is : " + finalPrice);
		}
		else{
			System.out.println("No discount !");
		}
		
	}
}