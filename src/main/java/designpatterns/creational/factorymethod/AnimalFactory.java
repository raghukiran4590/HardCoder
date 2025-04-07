package designpatterns.creational.factorymethod;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}

class CatFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

class DogFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
