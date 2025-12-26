import java.util.*;

public class BmiTracker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weigth in (kg) :");
		double weigth = sc.nextDouble();
		System.out.println("Enter heigth in (cm) :");
		double heigth = sc.nextDouble();
		
		//calculating the bmi using formula
		double bmi = weigth/(heigth*heigth);
		
		
		// check condition
		if(bmi<18.5){
			System.out.println("Underweigth");
		}
		else if((18.5<=bmi)&&(24.9>=bmi)){
			System.out.println("Normal");
		}
		else if((25<=bmi)&&(29.9>=bmi)){
			System.out.println("Overweigth");
		}
		else{
			System.out.println("Obese");
		}
		
		sc.close();
	}
}