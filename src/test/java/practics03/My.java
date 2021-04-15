package practics03;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class My {

    @BeforeMethod
    public void preconditions() {
        System.out.println("Start something");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Stop something");
    }

    @Test
    public void myFirstTestNGTest() {
        System.out.println("Hello world!");
    }

    @Test
    public void mySecondTestNGTest() {
        System.out.println("Hello world! #2");
    }
}
