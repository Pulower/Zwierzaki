import org.testng.Assert;
import org.testng.annotations.Test;

public class CatTest {

    Cat cat = new Cat("Darek", "#FFFFFF");
    @Test
    public void getSoundTest() {
        Assert.assertEquals(cat.getSound(), "Darek Miau Miau");
    }

    @Test
    public void drawColorTest()
    {
        Assert.assertEquals(cat.drawColor(),"R:255 G:255 B:255");
    }
}
