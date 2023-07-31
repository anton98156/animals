package animals;

public class PackAnimal extends Animal{
}

class Horse extends PackAnimal {
    @Override
    protected void showAnimal(Animal animal) {
        super.showAnimal(animal);
    }
}

class Camel extends PackAnimal {
    @Override
    protected void showAnimal(Animal animal) {
        super.showAnimal(animal);
    }
}

class Donkey extends PetAnimal {
    @Override
    protected void showAnimal(Animal animal) {
        super.showAnimal(animal);
    }
}
