package ru.samsung.itschool.mdev;

public class Car {
    /*
    ООП
    Инкапсуляция (incapsulation)
    Полиморфизм (polymorphism)
    Наследование (inheritance)
     */
    String name; // ""
    private int maxspeed; // 0
    protected double power;  // 0.0
    private String sound;

    public void doBeep() {
        //this.power

        System.out.println(this.sound);
    }

    Car() {

    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int maxspeed, double power, String sound) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.power = power;
        this.sound = sound;
    }

    public Car(String name, int maxspeed, double power) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
