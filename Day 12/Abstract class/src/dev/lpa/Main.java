package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//       Animal animal = new Animal("animal", "big",100);

Dog dog = new Dog("Wolf", "big", 100);
dog.makeNoise();
doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big",100));
        animals.add(new Fish("Goldfish", "small",1));
        animals.add(new Fish("Neon Tetra", "tiny",1));
        animals.add(new Dog("Pamerin", "medium",80));
animals.add(new Horse("Clydesdale", "large",500));


        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }



    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}