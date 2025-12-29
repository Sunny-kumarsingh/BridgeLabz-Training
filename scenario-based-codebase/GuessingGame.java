import java.util.*;

public class GuessingGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//ram
		int random = (int)Math.floor(Math.random()*99)+1;
		int attemp = 0;
		
		
		do{			
			System.out.println("Guess the number : ");
			int guessNumber = sc.nextInt();
			attemp++;
			
		    if(guessNumber>random){
				System.out.println("Too high");
			}
			else if(guessNumber==random){
				System.out.println("Total attemp is : " + attemp);
				System.out.println("Congrats! you guess the right number :");
			}
			else{
				System.out.println("Too Low ");
			}
		}while(attemp<5);
			System.out.println("Total attemp is : " + attemp);
			System.out.println("Sorry Better Luck Next Time ! ");
		
	}
}