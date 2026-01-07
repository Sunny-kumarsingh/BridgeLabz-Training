package com.EventEase;
import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Organizer details
        System.out.print("Enter organizer name: ");
        String name = sc.nextLine();

        System.out.print("Enter organizer email: ");
        String email = sc.nextLine();

        System.out.print("Enter organizer phone: ");
        String phone = sc.nextLine();

        User organizer = new User(name, email, phone);

        // Event details
        System.out.print("Enter event type (birthday/conference): ");
        String eventType = sc.nextLine().toLowerCase();

        System.out.print("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter event date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter venue cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Enter service cost (catering/decoration): ");
        double serviceCost = sc.nextDouble();

        Event event;

        // Polymorphic object creation
        if (eventType.equals("birthday")) {
            event = new BirthdayEvent(
                    eventName, location, date,
                    attendees, organizer,
                    venueCost, serviceCost
            );
        } else if (eventType.equals("conference")) {
            event = new ConferenceEvent(
                    eventName, location, date,
                    attendees, organizer,
                    venueCost, serviceCost
            );
        } else {
            System.out.println("Invalid event type!");
            sc.close();
            return;
        }

        // Scheduling operations
        event.schedule();
        event.showEventDetails();

        System.out.print("\nDo you want to reschedule the event? (yes/no): ");
        sc.nextLine(); 
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter new date: ");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
            event.showEventDetails();
        }

    }
}