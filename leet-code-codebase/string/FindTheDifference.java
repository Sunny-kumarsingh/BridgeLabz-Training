import java.util.*;

public class FindTheDifference{
	
	public static String findDifference(String str, String t){
		//String store ="";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t.length(); i++){
			char c = t.charAt(i);
			if(str.indexOf(c)==-1){
				sb.append(t.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str = sc.nextLine();
		System.out.println("Enter the second String : ");
		String t = sc.nextLine();
		String strResult = findDifference(str,t);
		System.out.println(strResult);
	}
	
}