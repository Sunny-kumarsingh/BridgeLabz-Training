import java.util.*;

public class Factor{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int maxFactor = 10;
		int[] arrFactor = new int[maxFactor];
		int idx = 0;
		
		for(int i=1; i<num; i++){
			if(num%i == 0){
				if(maxFactor ==idx){
					maxFactor = maxFactor*2;
					int []temp = new int[maxFactor];
					for(int j=0; j<maxFactor; j++){
						temp[j] = arrFactor[j];
					
					}
					
					arrFactor = temp;
				}
				
				arrFactor[idx++] = i;
			}
			
		}
		
		
		System.out.println("The factor of " + num + " are ");
		for(int k=0; k<idx; k++){
			System.out.println(arrFactor[k]);
		}
	}
}