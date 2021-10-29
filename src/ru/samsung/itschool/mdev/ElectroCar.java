package ru.samsung.itschool.mdev;



public class ElectroCar extends Car {
    private int batteryCapacity;

    public ElectroCar() {

    }
    
    public ElectroCar(String name, int maxspeed, double power, String sound, int batteryCapacity) {
        super(name, maxspeed, power, sound);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void doBeep() {
        System.out.println("Beep tesla!");
    }
}
class TTT {

}

