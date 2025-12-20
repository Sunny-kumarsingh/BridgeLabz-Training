import java.util.*;

public class MeanHeight{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		double[] height = new double[11];
		
		//taking input in array
		System.out.println("Enter the height of 11  football player : ");
		for(int i=0; i<height.length; i++){
			height[i] = s.nextDouble();
		}
		
		double sum =0;
		
		
		//total sum 
		for(int i =0; i<height.length; i++){
			sum = sum+height[i];
		}
		double mean = sum/height.length;
		
		System.out.println("the mean height of the football team is : " + mean);
		
	}
}