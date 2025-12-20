import java.util.*;

public class TwoDArr{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		//take input
		int row = s.nextInt();
		int column = s.nextInt();
		
		int [][] arr = new int [row][column];
		int [] OneDArr = new int [row*column];
		int idx =0;
		
		for(int i=0; i<arr.length; i++){
			for(int j = 0; j<arr[row].length){
				OneDArr[idx++] = arr[i][j];
			}
		}
		
	}
}