package com.functionalinterface.staticmethod.passwordvalidator;

public interface SecurityUtils {
	 static boolean isStrongPassword(String password) {

	        if (password == null) return false;


	        String regex =
	                "^(?=.*[A-Z])" +     
	                "(?=.*[a-z])" +  
	                "(?=.*\\d)" +   
	                "(?=.*[@#$%!])" +  
	                ".{8,}$"; 

	        return password.matches(regex);
	    }
}
