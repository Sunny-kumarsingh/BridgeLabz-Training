package com.EventEase;
public abstract class Event implements ISchedulable {

    private final int eventId;   
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // pricing 
    private double venueCost;
    private double serviceCost;
    private double discount;

    private static int counter = 1000;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {

        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
    }

    // Constructor with services (catering / decoration)
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {

        this(eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public final int getEventId() {
        return eventId;
    }

    public void showEventDetails() {
        System.out.println("\nEvent ID   : " + eventId);
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        System.out.println("Organizer  : " + organizer.getName());
        System.out.println("Total Cost : " + calculateTotalCost());
    }
}