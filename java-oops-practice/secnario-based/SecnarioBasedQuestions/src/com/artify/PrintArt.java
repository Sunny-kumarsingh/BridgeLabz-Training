package com.artify;

public class PrintArt extends Artwork implements IPurchasable{
	
	public PrintArt(String artist, String title, double price, String licenseType){
		super(artist, title, price, licenseType);
	}
	
	 @Override
	    public void purchase(User user) {
	        user.deductAmount(price);
	    }

	    @Override
	    public void license() {
	        System.out.println("Print art licensed for physical use");
	    }
}
