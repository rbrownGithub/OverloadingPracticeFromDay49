package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalProgram {
    public static void main(String[] args) {
        ArrayList<org.example.Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no:");
            boolean isDog = scanner.nextLine().equalsIgnoreCase("yes");

            animals.add(new org.example.Animal(name, isDog));
        }

        for (org.example.Animal animal : animals) {
            System.out.println(animal);
        }

        // Creating Animal objects
        Animal animal1 = new Animal("Buddy", true);
        Animal animal2 = new Animal();
        Animal animal3 = new Animal("Whiskers");
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        scanner.close();
    }
}