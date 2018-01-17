import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {
    @Test
    public void setBreedTypeCasesTest() {
        Assert.assertEquals(Utils.setBreedType("york"), BreedType.York);
        Assert.assertEquals(Utils.setBreedType("BULLDOG"), BreedType.Bulldog);
        Assert.assertEquals(Utils.setBreedType("lABRadoR"), BreedType.Labrador);
    }

    @Test
    public void validNameTest() {
        Assert.assertEquals(Utils.validName("Burek"), "Burek");
    }
}
