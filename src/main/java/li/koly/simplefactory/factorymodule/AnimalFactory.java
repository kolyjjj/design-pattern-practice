package li.koly.simplefactory.factorymodule;

public class AnimalFactory {
    public static Animal buildAnimal(String animalName) {
        if ("dog".equals(animalName.toLowerCase())) {
            return new Dog();
        }
        if ("cat".equals(animalName.toLowerCase())) {
            return new Cat();
        }

        throw new AnimalNotFoundException("the expected animal is " + animalName);
    }
}
