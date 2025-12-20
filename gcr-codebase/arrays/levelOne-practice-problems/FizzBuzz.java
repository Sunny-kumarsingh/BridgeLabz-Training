import java.util.*;

public class FizzBuzz{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		//Take input 
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		
		
		String [] arr = new String[n+1];
		if(n<0){
			System.out.println("Enter valid number");
			return;
		}
		else{
			for(int i=0; i<=n; i++){
				if(i%3 ==0 && i!=0){
				arr[i] = "Fizz";
				}
				else if(i%5==0 && i!=0){
					arr[i] = "Buzz";
				}
				else if((i%3==0) && (i%5==0)){
					arr[i] = "FizzBuzz";
				}
				else{
				arr[i] = Integer.toString(i);
				}
			}
		}
		for(int i=0; i<= n; i++){
			System.out.println("Position "+ i + " = "+ arr[i]);
		}
		
		
	}
}