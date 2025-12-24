//4


import java.util.*;

public class RemoveDuplicate{


	// Method to find unique characters and make string then return
    public static String removeDuplicate(String str) {
        String rDuplicate ="";
		int uniqueCount = 0;
		char[] temp = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            // Check if character already exists
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            
			if(isUnique){
			  temp[uniqueCount++] = ch;
			  rDuplicate +=ch;
			}
            
        }
		return rDuplicate;
	}
	
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		
		String resultStr = removeDuplicate(String s)
	}
}
