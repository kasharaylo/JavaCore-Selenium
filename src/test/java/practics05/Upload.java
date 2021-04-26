package practics05;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import practics04.PageObject.BaseTest;

public class Upload extends BaseTest{
    private String url = "http://www.leafground.com/pages/upload.html";
    private String workingDir = System.getProperty("user.dir");
    private String filePath = workingDir + "/src/test/java/practics05/upload.png";
    private By input = By.cssSelector("input[type=file]");

    @Test
    public void uploadTest() throws InterruptedException {
        driver.navigate().to(url);
        driver.findElement(input).sendKeys(filePath);

        Thread.sleep(5000);
    }
}
