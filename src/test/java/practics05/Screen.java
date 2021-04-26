package practics05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import practics04.PageObject.BaseTest;

public class Screen extends BaseTest {
    private String url = "http://www.leafground.com/pages/drag.html";
    private By title = By.cssSelector("h1.wp-heading");

    @Test
    public void ScreenshotTest(){
        driver.get(url);
        Assert.assertEquals(driver.findElement(title).getText(), "1Play with Draggable");
    }
}
