import java.util.Scanner;

public class Euclidean {

    public static double euclideanFormula(double x1, double x2, double y1, double y2){
	
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	} 
	public static double[] slopeFormula(double x1, double x2, double y1, double y2){
		
		// find slope first 
		double m = (y2 - y1)/(x2 - x1);
		
		// finding the y-intercept b using the formulae
		double b = y1 - (m*x1);
	     
        return new double[]{m, b};
	 
	}

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter point x1 : ");
        double x1 = s.nextDouble();
		System.out.print("Enter point x2 : ");
		double x2 = s.nextDouble();
		System.out.print("Enter point y1 : ");
		double y1 = s.nextDouble();
		System.out.print("Enter point y2 : ");
		double y2 = s.nextDouble();

       
	   
        double[] slopeFormulaResult = slopeFormula(x1, x2, y1, y2);
		System.out.println("Result of euclidean Formula is : " + euclideanFormula(x1, x2, y1, y2));
        System.out.println("Result of slope  'm'  is : " + slopeFormulaResult[0]);
        System.out.println("Result of y-intercept b  is : " + slopeFormulaResult[1]);
		System.out.println("Equation of line is  : " + slopeFormulaResult[0] + "x + "+ slopeFormulaResult[1]);



	
    }
}
