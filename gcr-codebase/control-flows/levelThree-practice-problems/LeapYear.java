import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       System.out.print("Enter a year: ");
       int year = s.nextInt();

       if(year<1582){
		System.out.println("Enter valid year After 1582");
	   }else{
			if(year%400 == 0){
				System.out.println(year + " is a Leap year");
			}
			else if(year %100 == 0){
				System.out.println(year + " is not a Leap Year");
			}
			else if (year % 4 == 0) {
					System.out.println("Year is a Leap Year");
				} 
			else {
					System.out.println("Year is not a Leap Year");
			}
	   }

        s.close();
    }
}
