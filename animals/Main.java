package animals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Dog> dogs = new HashMap<>();
        HashMap<String, Cat> cats = new HashMap<>();
        HashMap<String, Hamster> hamsters = new HashMap<>();

        while (true) {
            
            System.out.println("\nвведите команду: ");
            Scanner scanner = Animal.getScanner();
            String userInput = scanner.nextLine();
            String[] split = userInput.split("-");
            String[] arguments = Arrays.copyOfRange(split, 1, split.length);

            if (userInput.startsWith("добавить")
                                    && split.length == 2) {
                try (Counter counter = new Counter()) {
                    if (arguments[0].equals("собака")) {
                    Dog dog = new Dog();
                    Dog.setAnimal(dog);
                    dogs.put(dog.name, dog);
                    counter.add();
                } else if (arguments[0].equals("кот")) {
                    Cat cat = new Cat();
                    Cat.setAnimal(cat);
                    cats.put(cat.name, cat);
                    counter.add();
                } else if (arguments[0].equals("хомяк")) {
                    Hamster hamster = new Hamster();
                    Hamster.setAnimal(hamster);
                    hamsters.put(hamster.name, hamster);
                    counter.add();
                } else {
                    throw new Exception("данные введены неправильно");
                }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (userInput.startsWith("посмотреть") && split.length == 3) {
                if (arguments[0].equals("собака")) {
                dogs.get(arguments[1]).showAnimal(dogs.get(arguments[1]));
                } else if (arguments[0].equals("кот")) {
                cats.get(arguments[1]).showAnimal(cats.get(arguments[1]));
                } else if (arguments[0].equals("хомяк")) {
                hamsters.get(arguments[1]).showAnimal(hamsters.get(arguments[1]));
                }
            } else if (userInput.startsWith("обучить") && split.length == 4) {
                if (arguments[0].equals("собака")) {
                Dog dog = dogs.get(arguments[1]);
                dog.commands = dog.commands + " " + arguments[2];
                dogs.put(dog.name, dog);
                } else if (arguments[0].equals("кот")) {
                Cat cat = cats.get(arguments[1]);
                cat.commands = cat.commands + " " + arguments[2];
                cats.put(cat.name, cat);
                } else if (arguments[0].equals("хомяк")) {
                Hamster hamster = hamsters.get(arguments[1]);
                hamster.commands = hamster.commands + " " + arguments[2];
                hamsters.put(hamster.name, hamster);
                } else {
                    System.out.println("введены неправильные данные!");
                    break;
                }
            } else if (userInput.equals("выход")){
                break;
            } else {
                System.out.println("\nввод не соотвествует треованиям, попробуйте еще раз:");
            }
        }
    }
}