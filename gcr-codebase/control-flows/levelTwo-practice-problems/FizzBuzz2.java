import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
		//create Scanner Object
        Scanner s = new Scanner(System.in);

		//take number input
        System.out.print("Enter a number: ");
        int n = s.nextInt();
		
		
		// check for operation
		if(n>0){
			while(n>0){
				if(n%3==0){
					System.out.println("Fizz");	
				}
				else if(n%5==0){
					System.out.println("Buzz");
				}
				else if((n%3==0) && (n%5==0)){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println(i);
				}
			 n--;
			}
		}

        
    }
}
