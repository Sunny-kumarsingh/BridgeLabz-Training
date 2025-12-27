package com.constructors.levelone;

public class HotelBooking {
	
	String guestName = "";
	String roomType = "";
	int nights = 0;
	
	
	//default constructor
	public HotelBooking(){
		guestName = "Sunny Kumar Singh";
		roomType = "VIP";
		nights = 3;
	}
	
	// parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	
	//copy constructor
	HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = nights;
    }
	
	
	void display() {
        System.out.println("guestName  : " + guestName);
        System.out.println("roomType : " + roomType);
        System.out.println("nights  : " + nights);
        
    }
}
