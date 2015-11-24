package li.koly.simplefactory.factorymodule;

public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(String message) {
        super(message);
    }
}
