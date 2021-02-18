package ru.geekbrains.Moiseeva;

public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public int getFood() {
        return food;
    }

    public void fillMax(){
        food = capacity;
    }
    public void decreaseFood(int a){
            food -= a;
    }
    public void info() {
        System.out.printf("Plate: %d / %d\n ", food, capacity);
    }

}
