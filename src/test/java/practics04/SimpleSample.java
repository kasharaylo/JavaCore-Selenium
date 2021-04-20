package practics04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleSample {

    private  ChromeDriver driver;
    private String baseUrl = "https://www.olx.ua/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();

    }

    @Test
    public void SampleTest() throws InterruptedException {
        driver.navigate().to(baseUrl);

        Thread.sleep(2000);
        By langLink = By.id("changeLang");

        Thread.sleep(2000);
        driver.findElement(langLink).click();

        Thread.sleep(2000);
        driver.close();

    }
}
