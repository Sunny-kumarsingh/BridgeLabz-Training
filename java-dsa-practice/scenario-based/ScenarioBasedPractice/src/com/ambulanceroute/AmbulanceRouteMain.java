package com.ambulanceroute;
public class AmbulanceRouteMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        HospitalUnit unit = route.findAvailableUnit();
        if (unit != null) {
            System.out.println("Patient redirected to: " + unit.name);
        }

        route.removeUnit("Radiology");
    }
}
