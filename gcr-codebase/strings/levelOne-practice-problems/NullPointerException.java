import java.util.*;


////code for review;


public class NullPointerException{

	public static char[] getException(String a){
		
	}
	
	

	public static boolean getEqual(char arr[], char arr2[]){
		
		if(arr.length!= arr2.length){
			return false;
		}
		//checking for string equal
		for(int i=0; i<arr.length; i++){
			if(arr[i] != arr2[i]){
				return false;
			}
		}
		return true;
		
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		//taking input string
		System.out.print("Enter first String : ");
		String text = "";
		
		//calling the getCharactersmethod
		char[] strResult = getCharacters(text);
		
		
		//calling the charArray in - built method
		char[] arrResult = text.toCharArray();
		
		
		//camparing both charArray
		boolean result = getEqual(strResult,arrResult);
		
		//print the output
		System.out.print("Both String are same  : ");
		System.out.println(result);
		
		
	
	}
}