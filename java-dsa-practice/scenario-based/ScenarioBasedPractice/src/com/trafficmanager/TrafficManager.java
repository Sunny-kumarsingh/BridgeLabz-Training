package com.trafficmanager;
public class TrafficManager {

    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout(3);
        WaitingQueue waitingQueue = new WaitingQueue(5);

        // Vehicles arriving
        waitingQueue.enqueue("Car-A");
        waitingQueue.enqueue("Car-B");
        waitingQueue.enqueue("Car-C");
        waitingQueue.enqueue("Car-D");

        // Vehicles entering roundabout
        enterRoundabout(roundabout, waitingQueue);
        enterRoundabout(roundabout, waitingQueue);
        enterRoundabout(roundabout, waitingQueue);

        roundabout.printState();

        // Exit
        roundabout.removeVehicle();
        roundabout.printState();

        // New entry
        enterRoundabout(roundabout, waitingQueue);
        roundabout.printState();
    }

    private static void enterRoundabout(Roundabout roundabout, WaitingQueue queue) {
        if (!roundabout.hasSpace()) {
            System.out.println("Roundabout full.");
            return;
        }

        String car = queue.dequeue();
        if (car != null) {
            roundabout.addVehicle(car);
        }
    }
}
