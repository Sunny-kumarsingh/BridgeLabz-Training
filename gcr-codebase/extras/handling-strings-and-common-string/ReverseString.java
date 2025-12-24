import java.util.*; 

public class ReverseString{


	public static String getReverse(String str){
		String revers = "";
		for(int i = str.length()-1; i>=0; i--){
			
			revers += str.charAt(i);
		}
		
		return revers;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		System.out.println("reverse of string " + getReverse(s));
	}

}