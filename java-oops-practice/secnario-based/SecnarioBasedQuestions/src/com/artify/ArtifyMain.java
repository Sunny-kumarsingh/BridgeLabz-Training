package com.artify;

import java.util.Scanner;


public class ArtifyMain {
	public static void main(String args[]) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter user name: ");
        String userName = sc.nextLine();
        
        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        
		User user = new User(userName, balance);

        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();
        
        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter license type: ");
        String licenseType = sc.nextLine();
        
		IPurchasable art = new DigitalArt(artist, title, price, licenseType);

		art.purchase(user);
	    art.license();

	    System.out.println("Remaining Balance: " + user.getWalletBalance());
	}

}
