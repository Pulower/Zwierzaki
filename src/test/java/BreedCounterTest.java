import org.testng.Assert;
import org.testng.annotations.Test;

public class BreedCounterTest {
    BreedCounter bc = new BreedCounter();
    @Test
    public void differentBreedsTest(){
        Assert.assertEquals(bc.differentBreeds(), 0);
    }
}
