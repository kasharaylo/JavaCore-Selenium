package practics03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsAsserts {

    @Test
    public void first() {
        System.err.println("--- --- --- --- @Test");
        Assert.assertFalse(1 == 2);
    }

    @Test(enabled = true)
    public void second() {
        System.err.println("--- --- --- --- @Test Second");
        Assert.fail("If failed...");
        //Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "second")
    public void third() {
        System.err.println("--- --- --- --- @Test Third");
        Assert.assertEquals(1, 1);
    }

    @Test(timeOut = 1000)
    public void forth() throws InterruptedException {
        System.err.println("--- --- --- --- @Test Forth");

        Thread.sleep(2000);
        Assert.assertEquals(1, 1);
    }
}
