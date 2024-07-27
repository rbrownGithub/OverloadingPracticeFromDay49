package org.example;

public class Counter {
    private int count;

    // Constructor that sets the start value to startValue
    public Counter(int startValue) {
        this.count = startValue;
    }

    // Constructor that sets the start value to 0
    public Counter() {
        this.count = 0;
    }

    // Returns the current value of the counter
    public int value() {
        return count;
    }

    // Increases the value by 1
    public void increase() {
        count++;
    }

    // Decreases the value by 1
    public void decrease() {
        count--;
    }

    // Increases the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            count += increaseBy;
        }
    }

    // Decreases the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            count -= decreaseBy;
        }
    }
}
