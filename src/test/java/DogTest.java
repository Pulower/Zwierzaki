import org.testng.Assert;
import org.testng.annotations.Test;

public class DogTest {

    Dog dog = new Dog("Burek", BreedType.York);

    @Test
    public void getSoundTest() {

        Assert.assertEquals(dog.getSound(), "Burek Hau Hau");
    }

}
