package org.example;

public class Main {
    public static void main(String[] args) {

        Zoo<Animal> zoo = new Zoo<>();

        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Garfield");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");

        zoo.addAnimal(cat1);
        zoo.addAnimal(cat2);
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);

//        Animal animal1 = zoo.getAnimal();
//        if (animal1 != null) {
//            System.out.println("Animal 1: " + animal1.getName());
//            System.out.println(animal1.getClass());
//        }
//        String infoOutput= animal1.printInfo("Meow");
//
//        Animal animal2 = zoo.getAnimal();
//        if (animal2 != null) {
//            System.out.println("Animal 2: " + animal2.getName());
//        }


//        double info2Output=animal2.printInfo(4.5);
        System.out.println(zoo.toString());
        for (Animal animal:zoo){
            System.out.println(animal);
        }
    }
}