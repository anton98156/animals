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
        System.out.println("\nВведите имя животного: ");
        animal.name = scanner.nextLine();
        System.out.println("Введите команды животного: ");
        animal.commands = scanner.nextLine();
        animal.dateOfBirth = getDate();
    
        return animal;
    }

    protected void showAnimal(Animal animal) {
        System.out.println("\nИмя животного: " + animal.name);
        System.out.println("Команды животного: " + animal.commands);
        System.out.println("Дата рождения животного: " + animal.dateOfBirth + "\n");
    }

    private static LocalDate getDate() {

        Scanner scanner = getScanner();
        System.out.print("Введите дату в формате 'дд-мм-гггг': ");
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
