package li.koly.simplefactory.factorymodule;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AnimalFactoryTest {
    @Test
    public void should_return_cat() {
        Animal cat = AnimalFactory.buildAnimal("cat");
        assertThat(cat.makeSound(), is("miao"));
    }

    @Test
    public void should_return_dog() {
        assertThat(AnimalFactory.buildAnimal("dog").makeSound(), is("Wang"));
    }


    @Test (expected = AnimalNotFoundException.class)
    public void should_throw_exception_when_cannot_find() {
        AnimalFactory.buildAnimal("woo");
    }
}