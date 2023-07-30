package animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.createAnimal();
        Dog dog = (Dog) animal;
        Animal.showAnimal(dog);
    }
}