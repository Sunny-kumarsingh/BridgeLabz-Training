//Strings - Handling strings and common string functions
//Functions - parameter passing, return

import java.util.*;

public class CountVowelsConsonants{

	public static int[] getcountVowelsAndString(String str){
		int vowel =0;
		int consonants =0;
		str.toLowerCase();
		for(int i= 0; i<str.length(); i++){
			char ch = str.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
				vowel++;
			}
			else{
				consonants++;
			}
			
		}
		return  new int[]{vowel,consonants};
	}

	public static void main(String argss[]){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int arr[] = getcountVowelsAndString(s);
		System.out.println("count of vowel : "+ arr[0]);
		System.out.println("count of consonants : "+ arr[1]);
		
	}
}