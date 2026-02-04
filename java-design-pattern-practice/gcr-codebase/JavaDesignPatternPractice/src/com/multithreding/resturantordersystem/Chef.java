package com.multithreding.resturantordersystem;

public class Chef extends Thread {
	
	private String dish;
	private Long preparationTime;
	
	Chef(String name, String dish, long preparationTime){
		super(name);
		this.dish = dish;
		this.preparationTime = preparationTime;
	}
	
	@Override
	public void run() {
		  System.out.println(getName() + " started preparing " + dish);
		  
		 
	        int[] progress = {25, 50, 75, 100};
	        long stepTime = preparationTime / 4;
	        
	        for(int p : progress) {
	        	try {
	        		Thread.sleep(stepTime);
	        	}catch(InterruptedException e) {
	        		  System.out.println(getName() + " was interrupted");
	        	}
	        	 System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
	        }
	        
	        System.out.println(getName() + " finished preparing " + dish);


	}

}
