package com.petpal;
import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pet type (dog/cat/bird): ");
        String type = sc.next().toLowerCase();

        System.out.print("Enter pet name: ");
        String name = sc.next();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet;

        switch (type) {
            case "dog": pet = new Dog(name, age); break;
            case "cat": pet = new Cat(name, age); break;
            case "bird": pet = new Bird(name, age); break;
            default:
                System.out.println("Invalid pet type!");
                sc.close();
                return;
        }

        int choice;

        do {
            System.out.println("\n1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: pet.feed(); break;
                case 2: pet.play(); break;
                case 3: pet.sleep(); break;
                case 4: pet.makeSound(); break;
                case 0: System.out.println("Thank you for using PetPal!"); break;
                default: System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}