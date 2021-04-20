package practics04.POFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import practics04.POFactory.pages.LoginPage;
import practics04.PageObject.pages.AccountBar;
import practics04.PageObject.pages.MyAdvertPage;

public class Page extends PageGenerator {

    private int timeOut = 10;
    //public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public Page(WebDriver driver) {
        //this.driver = driver;
        super(driver);

        //Create wait object for all pages.
        wait = new WebDriverWait(this.driver, timeOut);
    }

    public Page getLoginPage() {
        return GetInstance(LoginPage.class);
    }

    // Open URL
    public void open(String url) {
        driver.get(url);
    }

    //Clicks by selector
    public void click(By selector) {
        driver.findElement(selector).click();
    }

    //Clicks on WebElement
    public void click(WebElement element) {
        element.click();
    }

    // Write Text to element via Selector
    public void typeText(By selector, String text) {
        driver.findElement(selector).sendKeys(text);
    }

    // Write Text to WebElement
    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Get Text from By selector
    public String getText(By selector) {
        return driver.findElement(selector).getText();
    }

    // Get Text from Web Element
    public String getText(WebElement element) {
        return element.getText();
    }
}
