package com.functionalinterface.markerinterface.cloningprototypeobjects;
public class PrototypeApp {

    public static void main(String[] args) {

        try {
            Employee emp1 = new Employee(101, "Sunny");

            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Original: " + emp1.id + " " + emp1.name);
            System.out.println("Cloned  : " + emp2.id + " " + emp2.name);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
