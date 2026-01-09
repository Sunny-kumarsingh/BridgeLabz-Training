package com.tourmate;

public class Trip {
	protected String destination ;
	protected double budget;
	protected int duration;
	
	
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;
	
	public Trip(String destination, int duration,
            	Transport transport, Hotel hotel,
            	Activity activity)
	{
	    this.destination = destination;
	    this.duration = duration;
	    this.transport = transport;
	    this.hotel = hotel;
	    this.activity = activity;

    // total budget = hotel + transport + activities
    this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
}

}
