package com.artify;

public class Artwork {
	protected String artist;
	protected String title;
	protected double price;
	protected String licenseType;
	
	
	Artwork(String artist, String title, double price, String licenseType){
		this.artist = artist;
		this.title = title;
		this.price = price;
		this.licenseType = licenseType; 
	}
}
