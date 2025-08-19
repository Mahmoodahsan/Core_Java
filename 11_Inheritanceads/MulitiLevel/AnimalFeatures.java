class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    @Override
    public void sound() {
        System.out.println("Mammal sound");
    }
}

class Dog extends Mammal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks: Woof Woof!");
    }

    public void guard() {
        System.out.println("Dog is guarding the house");
    }
}

public class AnimalFeatures{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.guard();
    }
}
