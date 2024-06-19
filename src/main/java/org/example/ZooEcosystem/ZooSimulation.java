package org.example.ZooEcosystem;

public class ZooSimulation {
    public static void main(String[] args) {

        Animal lion = new Lion("Simba", 5);
        Animal elephant=new Elephant("Bomba",4);
        Animal parrot = new Parrot("Polly", 3);
        Animal eagle=new Eagle("Baldy", 3);


        lion.eat();
        lion.makeSound();
        lion.sleep();
        lion.displayInformation();
        System.out.println("******************************");

        elephant.eat();
        elephant.makeSound();
        elephant.sleep();
        elephant.displayInformation();
        System.out.println("******************************");

        parrot.eat();
        parrot.makeSound();
        parrot.sleep();
        parrot.displayInformation();
        System.out.println("******************************");

        eagle.eat();
        eagle.makeSound();
        eagle.sleep();
        eagle.displayInformation();
        System.out.println("******************************");


    }
}
