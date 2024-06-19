package org.example.ZooEcosystem;

class Bird extends Animal implements AnimalBehavior {
        public Bird(String name, int age) {
            super(name, age);
        }

        public void eat() {
            System.out.println(name + " is pecking.");
        }

        public void makeSound() {
            System.out.println(name + " makes a bird sound.");
        }

        public void displayInformation() {
            System.out.println("Bird: " + name + ", Age: " + age);
        }
    }
class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("gurgles");
    }
}
class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Whistling");
    }
}