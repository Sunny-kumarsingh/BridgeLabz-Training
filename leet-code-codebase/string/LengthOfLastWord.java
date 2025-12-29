import java.util.*;

public class LengthOfLastWord{
	public static int wordCount(String str){
		str = str.trim();
		int count =0;
		for(int i = str.length()-1; i>=0; i--){
			char c = str.charAt(i);
			if(c != ' '){
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		System.out.println(wordCount(str));
	}
	
}