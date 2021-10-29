package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        //System.out.println(bmw.power);
        System.out.println(bmw.getPower());
        bmw.setName("BMW X5");
        System.out.println(bmw.getName());

        Car audi = new Car();
        Car opel = new Car("Corsa",45,100);
        Car toyota = new Car("Toyota",45,200,"Toyota beep!");
        toyota.doBeep();

        ElectroCar tesla = new ElectroCar();
        tesla.setName("Model S");
        tesla.setMaxspeed(200);

        Car tesla2 = new ElectroCar();
        tesla2.doBeep(); //

        Object object = new Object();
    }

}
