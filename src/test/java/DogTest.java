import org.testng.Assert;
import org.testng.annotations.Test;

public class DogTest {

    Dog dog1 = new Dog("Burek", BreedType.York);
    Dog dog2 = new Dog("Rambo", BreedType.Bulldog);
    Dog dog3 = new Dog("Pimpek", BreedType.Husky);

    @Test
    public void getSoundTest() {
        Assert.assertEquals(dog1.getSound(), "Burek Hau Hau");
        Assert.assertEquals(dog2.getSound(), "Rambo Hau Hau");
        Assert.assertEquals(dog3.getSound(), "Pimpek Hau Hau");
    }
}
