import java.util.*;

public class ElectionBoothManager{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		int countVoteA =0;
		int countVoteB =0;
		int countVoteC =0;
		
		
		while(true){
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			
			//exits condition
			if(age == 0){
				break;
			}
			
			
			//condition for valid voter
			if(age<18){
				System.out.println("Not eligible for vote ");
				continue;
			}
			
			
			System.out.println("Press 1 for Candidate A");
			System.out.println("Press 2 for Candidate B");
			System.out.println("Press 3 for Candidate C");
			
			System.out.println("press the number");
			int n = sc.nextInt();
			
			switch(n){
				case 1 : 
						countVoteA++;
						break;
				case 2 :
						countVoteB++;
						break;
				case 3 :
						countVoteC++;
						break;
				
				default:
				System.out.println("Invalid vote");
			}
		}	
			if((countVoteA>countVoteB)&&(countVoteA>countVoteC)){
				System.out.println("Candidate A get and win "+ countVoteA +" vote");
			}else if((countVoteB>countVoteA)&&(countVoteB>countVoteC)){
				System.out.println("Candidate B get and win "+ countVoteB +" vote");
			}else{
				System.out.println("Candidate C get and win "+ countVoteC +" vote");
			
			}

			
		
		
	}
}