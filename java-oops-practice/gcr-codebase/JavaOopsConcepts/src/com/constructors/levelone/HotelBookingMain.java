package com.constructors.levelone;

public class HotelBookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelBooking h = new HotelBooking();
		h.display();
		
		HotelBooking h1 = new HotelBooking("Sunny", "Vip", 2);
		h1.display();
		
		HotelBooking h2 = new HotelBooking(h1);
		h2.display();

	}

}
