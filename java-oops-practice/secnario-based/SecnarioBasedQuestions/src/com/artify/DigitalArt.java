package com.artify;

public class DigitalArt extends Artwork implements IPurchasable {
	
	public DigitalArt(String artist, String title, double price, String licenseType){
		super(artist, title, price, licenseType);
	}
	
	
	@Override
	public void purchase(User user) {
		user.deductAmount(price);
	}
	
	@Override
	public void license() {
        System.out.println("Digital art licensed for online use");
	}
}
