import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {


    @Test
    public void setBreedTypeTest() {
        Assert.assertEquals(Utils.setBreedType("york"), BreedType.York);
        Assert.assertEquals(Utils.setBreedType("BULLDOG"), BreedType.Bulldog);
        Assert.assertEquals(Utils.setBreedType("lABRadoR"), BreedType.Labrador);
    }

    @Test
    public void countAndSetTest() {
        Assert.assertEquals(Utils.countAndSet("York", null), BreedType.York);
    }
    @Test
    public void validNameTest(){
       Assert.assertEquals( Utils.validName("Burek"), "Burek");
    }
}


