import java.util.*;

//campare the fomula and sum for n natural using for loop

public class CompareFormula2{
    public static void main(String[] args) {
	
		//Creating object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter number : ");
        int n = s.nextInt();
		
		
		int sum =0;
		//sum the number
        
		if(n>=0){

		 for(int i=1;i<=n; i++) {
			sum  = sum + i;
			
		 }
		}
		else{
			System.out.println("Not natural number");
		   }
        
		int formulaSum = (n*(n+1))/2;
		if(formulaSum == sum){
			System.out.println("both have the same value");
		}
		else{
			System.out.println("Both have not the same value");
		}

        s.close();
    }
}