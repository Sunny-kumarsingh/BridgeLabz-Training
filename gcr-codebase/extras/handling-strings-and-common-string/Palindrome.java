import java.util.*; 

public class Palindrome{

	
	public static boolean isPalindrome(String str){
		
		String palinedrom = "";
		for(int i = str.length()-1; i>=0; i--){
			
			palinedrom += str.charAt(i);
		}
		
		if(str.equals(palinedrom)){
			return true;
		}
		
		return false;
		
	}
	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
			
		boolean strResult = isPalindrome(s);
		if(strResult){
			System.out.println("String is palinedrom. ");
		}
		else{
			System.out.println("String is not a palindrome. ");
		}
	}

}