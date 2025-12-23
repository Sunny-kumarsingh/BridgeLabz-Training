import java.util.*;

public class CompareString{

	public static boolean compareTwoString(String a, String b){
		if(a.length()!= b.length()){
				return false;
		}
		
		//checking for string equal
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i) != b.charAt(i)){
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		//taking input string
		System.out.print("Enter first String : ");
		String str = s.next();
		System.out.print("Enter Second String : ");
		String str2 = s.next();
		
		//calling the compareTwoString method
		boolean strResult = compareTwoString(str,str2);
		
		//using the equal method of string
		boolean str1Result = str.equals(str2);
		
		//print output
		if(strResult ||str1Result ){
		
			System.out.println("String are equal : ");
		}
		else{
			System.out.println("String are not equal : ");
			
		}
		
	
	}
}