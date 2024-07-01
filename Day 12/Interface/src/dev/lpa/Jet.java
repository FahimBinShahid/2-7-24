package dev.lpa;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking OFF");

    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinates records");
    }
}
