package org.example.ZooEcosystem;

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " is eating mammal food.");
    }

    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    public void displayInformation() {
        System.out.println("Mammal: " + name + ", Age: " + age);
    }
}
class Lion extends Mammal implements AnimalBehavior {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating it is prey");
    }

    @Override
    public void makeSound() {
        System.out.println("Roarrrrrr");
    }
}
class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating grass");
    }
}

