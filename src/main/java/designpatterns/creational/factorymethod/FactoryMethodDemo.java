package designpatterns.creational.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        Animal dog = dogFactory.createAnimal();
        Animal cat = catFactory.createAnimal();

        dog.makeNoise();
        cat.makeNoise();

    }


}
