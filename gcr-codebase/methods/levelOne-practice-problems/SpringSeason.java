import java.util.*;


public class SpringSeason{
		
	public static void getSpringSeason(int m, int d ){
		if((m == 3 && (d>=20 && d<=31))
			|| (m == 4  && (d>=1 && d<=30))
			|| (m == 5 && (d>=1 && d<=31))
			|| (m == 6 && (d>=1 && d<=20))
		){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}	

	public static void main(String args[]){
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		getSpringSeason(month, day);
	}
}