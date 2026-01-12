package com.traincompanion;


public class TrainCompanionMain {
    public static void main(String[] args) {

        TrainRoute train = new TrainRoute();

        train.addCompartmentAtEnd("Sleeper");
        train.addCompartmentAtEnd("Pantry");
        train.addCompartmentAtEnd("WiFi");
        train.addCompartmentAtEnd("AC Coach");

        train.showAdjacent();
        train.moveNext();
        train.showAdjacent();

        train.removeCompartment("Pantry");
        train.showAdjacent();
    }
}
