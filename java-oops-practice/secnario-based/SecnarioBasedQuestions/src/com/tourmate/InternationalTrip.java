package com.tourmate;
public class InternationalTrip extends Trip implements IBookable {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination);
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled");
    }
}
