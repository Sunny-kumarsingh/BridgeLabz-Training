package com.tourmate;
public class TourMateApp {

    public static void main(String[] args) {

        Transport transport = new Transport(15000);
        Hotel hotel = new Hotel(20000);
        Activity activity = new Activity(5000);

        IBookable trip = new DomesticTrip(
                "Goa",
                5,
                transport,
                hotel,
                activity
        );

        trip.book();
        trip.cancel();
    }
}
