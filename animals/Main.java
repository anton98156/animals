package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = Animal.getScanner();
            String userInput = scanner.nextLine();
            if (userInput.equals("Собака") || userInput.equals("собака")) {
                Dog dog = new Dog();
                Dog.setAnimal(dog);
                dog.showAnimal(dog);
            } else {
                break;
            }
        }
    }
}