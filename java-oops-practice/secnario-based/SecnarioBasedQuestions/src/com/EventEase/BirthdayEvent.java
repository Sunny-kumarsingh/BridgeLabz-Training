package com.EventEase;
public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                          int attendees, User organizer,
                          double venueCost, double serviceCost) {

        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, 500); // flat birthday discount
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decoration and cake setup.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event booking cancelled.");
    }
}