import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter a year: ");
       int year = s.nextInt();

       if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
		
        s.close();
    }
}
