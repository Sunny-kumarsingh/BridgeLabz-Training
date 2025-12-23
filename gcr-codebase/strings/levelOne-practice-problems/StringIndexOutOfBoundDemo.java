import java.util.*;

public class StringIndexOutOfBoundDemo{
	
	
	public static void getStringIndexOutOfBound(String arr){
			System.out.println(arr.charAt(arr.length()));
		}
		public static void handleException(String str){
			try{
				System.out.println(str.charAt(str.length()));
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("Execption handle " + e);
			}
			
		}
		
		
		
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string value :");
		String str = s.next();
		try{
			getStringIndexOutOfBound(str);
		}catch (Exception e){
		
		System.out.println("Program stopped due toRuntime Exception");
		}
		
		handleException(str);
		
	}
}