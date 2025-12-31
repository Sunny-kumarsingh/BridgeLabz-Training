import java.util.*;

public class LuckyDraw{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter the number :");
			int num = sc.nextInt();
			System.out.println("If you want to exit from the game press :0");
			if(num ==0 ){
				break;
			}
			if((num%3==0)&&(num%5==0)){
				System.out.println("Congrats you win a gift !");
			}else{
				System.out.println("You lose !");
			}
		}while(true);
		System.out.println("Thank you for playing game ");
		sc.close();
	}
}