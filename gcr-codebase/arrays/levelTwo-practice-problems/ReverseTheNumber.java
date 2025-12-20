import java.uitl.Scanner;

public class ReverseTheNumber{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		//take input
		System.out.println("Enter number : ");
		int num = s.nextInt();
		
		int countTemp = num;
		int temp = num;
		int count =0;
		
		while(countTemp>0){
			count++;
			countTemp = countTemp/10;
		}
		
		int idx =0;
		int reverseArr[]  = new int [count];
		while(temp>0){
			int digit = temp%10;
			reverseArr[idx++] = digit;
			temp  = temp/10;
		}
		System.out.println("Reverse Number is ");
		for(int i=0; i<count; i++){
			System.out.print(reverseArr[i]);
		}
	}
}