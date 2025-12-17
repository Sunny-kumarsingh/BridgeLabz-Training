public class ProfitAndLoss{
	public static void main(String args[]){
		
		int cp = 129;
		int sp = 191;
		double profit = sp - cp;
		double profitPercentage = (profit/cp)*100;
		
		// print the result
		System.out.print("The cost Price is INR " +cp +" and Selling Price is INR\n"+ sp + " The Profit is INR " + profit + " and the profitPercentage
		 is " + profitPercentage  );
	}
}