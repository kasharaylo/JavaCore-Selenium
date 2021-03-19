package practics01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Main {
    public static void main (String args[]) throws InterruptedException {
        //Setup variables
        String url = "http://www.leafground.com/";
        String currentUrl;

        //Start WebDriver with options
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-fullscreen");
        //options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        //Setting for Driver when it started
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Open URL and start testcase
        driver.get(url);
        Thread.sleep(1000);

        //Find element
        By homeButtonSelector = By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5");
        WebElement homeButtonElement = driver.findElement(homeButtonSelector);

        //Show name of this element
        System.out.println("Is displayed? - " + homeButtonElement.isDisplayed());
        if (homeButtonElement.isDisplayed()) {
            System.out.println("Current text  on element: " + homeButtonElement.getText());
        }
        Thread.sleep(1000);

        //Action with element
        homeButtonElement.click();

        //Get the new page URL after action
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Thread.sleep(1000);

        //Actions - open link in a new tab
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).perform();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
        Thread.sleep(1000);

        //Switch to another tab
        Set<String> tabsSwitcher = driver.getWindowHandles();
        driver.switchTo().window(tabsSwitcher.toArray()[1].toString());
        Thread.sleep(1000);

        //Close driver session
        driver.quit();
    }
}
