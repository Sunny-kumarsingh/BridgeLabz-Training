package com.lambdaexpressions;
import java.util.*;
import java.util.function.Predicate;


public class HospitalAlertApp {
	
	public static void main(String[] args) {
		List<Alert>alerts = new ArrayList<>();
		 alerts.add(new Alert("Heart rate critical", "EMERGENCY"));
	     alerts.add(new Alert("Take medicine at 8 PM", "MEDICINE"));
	     alerts.add(new Alert("Doctor appointment tomorrow", "APPOINTMENT"));
	     alerts.add(new Alert("Blood pressure high", "EMERGENCY"));
	        
	        
	     Predicate<Alert> emergencyFilter = alert-> 
	     			alert.type.equals("EMERGENCY");
	     			
	     for(Alert alert : alerts) {
	    	 if (emergencyFilter.test(alert)) {
	                System.out.println(alert);
	            }
	     }
	}
}
