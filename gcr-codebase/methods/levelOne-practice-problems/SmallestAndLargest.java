import java.util.*;


public class SmallestAndLargest{
		
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int[] arr = new int[2];
		int idx =0;
		
		if((number1> number2) && (number1>number3)){
			arr[0] = number1;
		}
		else if((number2> number3) && (number2>number1)){
			arr[0] = number2;
		}
		else{
			arr[0] = number3;
		}
		
		if((number1< number2) && (number1<number3)){
			arr[1] = number1;
		}
		else if((number2< number3) && (number2<number1)){
			arr[1] = number2;
		}
		else{
			arr[1] = number3;
		}
		return arr;
	}	
		

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the  3 number respectively :");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int[] resultArr = new int [2];
		resultArr = findSmallestAndLargest(n1,n2,n3);
		
		
		System.out.println("Largest and smallest number are respectively :  ");
		for(int i=0; i<2; i++){
			System.out.print(resultArr[i] +" ");
		}
	}
}