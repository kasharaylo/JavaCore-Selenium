package practics02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriverWait wait;
    static WebDriver driver;

    public static void main (String args[]) {
        String url = "http://www.leafground.com/pages/appear.html";

        //Options
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        options.addArguments("incognito");

        //Create Driver
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //Fluent waiter
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        //Implicitly waiter
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Explicit waiter
        wait = new WebDriverWait(driver, 10);

        //open url
        driver.navigate().to(url);

        //Selectors
        By heyButton = By.xpath("//b[contains(text(), 'Hey')]");
        By mysteryButton = By.cssSelector("#btn > b");

        //Explicit waiter
        wait.until(ExpectedConditions.visibilityOfElementLocated(mysteryButton));

        //Action
        clickOnVisible(mysteryButton);

        System.out.println(driver.getTitle());

        //Close driver session
        driver.quit();
    }

    public static void clickOnVisible(By selector) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        driver.findElement(selector).click();
    }
}
