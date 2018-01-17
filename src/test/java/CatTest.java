import org.testng.Assert;
import org.testng.annotations.Test;

public class CatTest {

    Cat cat1 = new Cat("Darek", "#FFFFFF");
    Cat cat2 = new Cat("Jurek", "#123123");
    Cat cat3 = new Cat("Zbyszek", "#12ffAA");
    Cat cat4 = new Cat("Mirek", "#000000");

    @Test
    public void getSoundTest() {
        Assert.assertEquals(cat1.getSound(), "Darek Miau Miau");
        Assert.assertEquals(cat2.getSound(), "Jurek Miau Miau");
        Assert.assertEquals(cat3.getSound(), "Zbyszek Miau Miau");
        Assert.assertEquals(cat4.getSound(), "Mirek Miau Miau");
    }

    @Test
    public void drawColorTest() {
        Assert.assertEquals(cat1.drawColor(), "R:255 G:255 B:255");
        Assert.assertEquals(cat2.drawColor(), "R:18 G:49 B:35");
        Assert.assertEquals(cat3.drawColor(), "R:18 G:255 B:170");
        Assert.assertEquals(cat4.drawColor(), "R:0 G:0 B:0");
    }
}
