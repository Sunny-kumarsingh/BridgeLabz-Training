import java.util.*;

class CelsiusAndFahrenheit{
	public static void main(String args[]){
		System.out.println("Enter the value of celsius");
		Scanner sc = new Scanner(System.in);
		int cel = sc.nextInt();
		int Fahren  = (cel *9/5) + 32;
		System.out.println(Fahren);
	}

}