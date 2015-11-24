package li.koly.simplefactory.client;

import li.koly.simplefactory.factorymodule.Animal;
import li.koly.simplefactory.factorymodule.AnimalFactory;
import li.koly.simplefactory.factorymodule.Cat;

public class AnimalFactoryUser {

    public static void main(String[] args) {
        Animal aCat = new Cat();
        // Animal aDog = new Dog(); cannot do this, because Dog is package available
        System.out.println(aCat.makeSound());

        // here is the real usage of factory, client doesn't need to know implementations like Cat or Dog
        Animal cat = AnimalFactory.buildAnimal("cat");
        System.out.println(cat.makeSound());

        System.out.println(AnimalFactory.buildAnimal("dog").makeSound());
    }
}
