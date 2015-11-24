package li.koly.simplefactory.factorymodule;

public class AnimalFactory {
    public static Animal buildAnimal(String animalName) {
        String temp = animalName.toLowerCase();
        String result = temp.substring(0, 1).toUpperCase() + temp.substring(1);
        try {
            Class<?> animalClass = AnimalFactory.class.forName("li.koly.simplefactory.factorymodule." + result);
            return (Animal) animalClass.newInstance();
        } catch (ClassNotFoundException e) {
            throw new AnimalNotFoundException("cannot find animal class with name: " + animalName);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        throw new AnimalNotFoundException("the expected animal is " + animalName);
    }
}
