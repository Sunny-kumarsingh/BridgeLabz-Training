import java.util.*;

public class MultipleValue{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		// initialise
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;
		
		while(true){
			System.out.println("Enter a number");
			double num = s.nextDouble();
			
			if(num == 0){
				break;
			}
			else if(num<0){
				break;
			}
			if(index>=10){
				break;
			}
			arr[index] = num;
			index++;
		}
		
		
		//sum total element of array
		for(int i=0; i<arr.length; i++){
			total = total+arr[i];
		}
		
		System.out.println("The sum of total element is: " + total);
		
	}
}