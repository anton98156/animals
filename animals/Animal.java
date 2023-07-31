package animals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Animal {

    String name;
    String commands;
    LocalDate dateOfBirth;

    protected static Animal setAnimal(Animal animal) {

        Scanner scanner = getScanner();
        System.out.println("\nвведите имя животного: ");
        animal.name = scanner.nextLine();
        System.out.println("введите команды животного: ");
        animal.commands = scanner.nextLine();
        animal.dateOfBirth = getDate();
    
        return animal;
    }

    protected void showAnimal(Animal animal) {
        System.out.println("\nимя животного: " + animal.name);
        System.out.println("команды животного: " + animal.commands);
        System.out.println("дата рождения животного: " + animal.dateOfBirth + "\n");
    }

    private static LocalDate getDate() {

        Scanner scanner = getScanner();
        System.out.print("введите дату в формате 'дд-мм-гггг': ");
        String userInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(userInput, formatter);

        return date;
    }

    protected static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

}
