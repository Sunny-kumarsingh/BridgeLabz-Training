import java.util.Scanner;

public class FactorsOfNumber {

	public static int[] getFactor(int number){
		int count =0;
		// Loop from 1 to less than number to count
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
		int[] arrCount = new int[count];
		int idx =0;
	
		// Loop from 1 to less than number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
               arrCount[idx++] = i;
            }
        }
		return arrCount;
	}
	
	public static int getSum(int arrCount[]){
		int sum =0; 
		for(int i=0; i<arrCount.length; i++){
			sum = sum+ arrCount[i];
		}
		return sum;
	}
	
	
	public static int getProduct(int arrCount[]){
		int product =1; 
		for(int i=0; i<arrCount.length; i++){
			product  = product * arrCount[i];
		}
		return product;
	}
	
	public static double getSumOfSquare(int arrCount[]){
		double sumOfSquare = 0; 
		for(int i=0; i<arrCount.length; i++){
			sumOfSquare  += Math.pow(arrCount[i],2);
		}
		return sumOfSquare;
	}
	
	

    public static void main(String[] args) {
		
		//Create Scanner object
        Scanner s = new Scanner(System.in);

		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();
		
		int[] totalFactor = getFactor(number);
		
		System.out.print ("Factor are : ");
		for(int i=0; i<totalFactor.length; i++){
			System.out.print(totalFactor[i]+ " ");
		}
		
		System.out.println();
		// Calculate and display results
        System.out.println("Sum of factors: " + getSum(totalFactor));
        System.out.println("Product of factors: " + getProduct(totalFactor));
        System.out.println("Sum of square of factors: " + getSumOfSquare(totalFactor));
       

        s.close();
    }
}
