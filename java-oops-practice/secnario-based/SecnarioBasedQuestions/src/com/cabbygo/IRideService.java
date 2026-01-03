package com.cabbygo;

public interface IRideService {
    void bookRide(Vechicle vehicle, Driver driver, double distance);
    void endRide();
}
