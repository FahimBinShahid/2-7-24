package dev.lpa;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.print(getExplicitType() + "lazily swimming");
        }else{
            System.out.print(getExplicitType() + "darting frantically");
        }

    }

    @Override
    public void makeNoise() {

        if(type == "Goldflish"){
            System.out.print(" swish");

        }else{
            System.out.println(" splash");
        }

    }


}
