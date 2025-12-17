import java.util.*;

public class DiscountCalculationTwo {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//taking input fee and discountPercent 
		System.out.println("Enter the Fee");
        int fee = input.nextInt();
		System.out.println("Enter the discountPercent");
        int discountPercent = input.nextInt();
		
		//Calculating the discounting fee
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}