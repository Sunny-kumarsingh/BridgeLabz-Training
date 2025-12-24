import java.util.*;

public class ToggleCharacter{

	public static String getToggle(String str){
		String result = "";
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90){
				result += Character.toLowerCase(ch);
			}
			else{
				result += Character.toUpperCase(ch);
			}
		}
		return result;
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.next();
		
		System.out.print("The toggle String is :");
		System.out.println(getToggle(s));
		
		
	}
	
}