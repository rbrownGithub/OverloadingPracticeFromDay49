package org.example;
import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    private String name;
    private boolean isDog;

    // Existing constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // New constructors
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + isDog();
    }
}