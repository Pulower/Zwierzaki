import org.testng.Assert;
import org.testng.annotations.Test;

public class BreedCounterTest {
    BreedCounter bc = new BreedCounter();

    @Test
    public void differentBreedsTest() {
        Assert.assertEquals(bc.differentBreeds(), 0);
        Assert.assertNotEquals(bc.differentBreeds(), 1);
    }

    @Test(priority = 1)
    public void countBreedTest() {
        bc.countBreed("Bulldog");
        Assert.assertEquals(bc.differentBreeds(), 1);
        bc.countBreed("York");
        Assert.assertEquals(bc.differentBreeds(), 2);
        bc.countBreed("Labrador");
        Assert.assertEquals(bc.differentBreeds(), 3);
        bc.countBreed("Labrador");
        Assert.assertEquals(bc.differentBreeds(), 3);
    }
}
