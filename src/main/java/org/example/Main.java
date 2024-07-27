package org.example;

public class Main {
    public static void main(String[] args) {
        // Using the constructor with a start value
        Counter counter1 = new Counter(5);
        System.out.println("Counter1 initial value: " + counter1.value());

        // Using the default constructor
        Counter counter2 = new Counter();
        System.out.println("Counter2 initial value: " + counter2.value());

        // Using increase() method
        counter1.increase();
        System.out.println("Counter1 after increase: " + counter1.value());

        // Using decrease() method
        counter1.decrease();
        System.out.println("Counter1 after decrease: " + counter1.value());

        // Using increase(int) method
        counter2.increase(3);
        System.out.println("Counter2 after increase by 3: " + counter2.value());

        // Using decrease(int) method
        counter2.decrease(2);
        System.out.println("Counter2 after decrease by 2: " + counter2.value());

        // Testing with negative values
        counter1.increase(-1);
        System.out.println("Counter1 after increase by -1: " + counter1.value());

        counter2.decrease(-1);
        System.out.println("Counter2 after decrease by -1: " + counter2.value());
    }
}