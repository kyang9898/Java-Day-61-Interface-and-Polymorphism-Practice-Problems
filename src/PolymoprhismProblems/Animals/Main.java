package PolymoprhismProblems.Animals;

public class Main {

    public static void main(String[] args) {

       NoiseCapable dog = new Dog();
       dog.makeNoise();

       NoiseCapable cat = new Cat("Kitty");
       cat.makeNoise();
       Cat c = (Cat) cat;
       c.purr();

    }

}
