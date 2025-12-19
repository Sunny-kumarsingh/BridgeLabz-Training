import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
		//create Scanner Object
        Scanner s = new Scanner(System.in);

		//take number input
        System.out.print("Enter a number: ");
        int n = s.nextInt();
		
		
		// check for operation
		if(n>0){
			for(int i = 1; i<=n; i++){
				if(i%3==0){
					System.out.println("Fizz");	
				}
				else if(i%5==0){
					System.out.println("Buzz");
				}
				else if((i%3==0) && (i%5==0)){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println(i);
				}
			
			}
		}

        
    }
}
