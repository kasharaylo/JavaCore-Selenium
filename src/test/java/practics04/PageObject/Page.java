package practics04.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import practics04.PageObject.pages.AccountBar;
import practics04.PageObject.pages.LoginPage;
import practics04.PageObject.pages.MyAdvertPage;

public class Page {

    private int timeOut = 10;

    public WebDriver driver;
    public WebDriverWait wait;

    //Pages
    private AccountBar _accountBar;
    private LoginPage _loginPage;
    private MyAdvertPage _myAdvertPage;

    //Constructor
    public Page(WebDriver driver) {
        this.driver = driver;

        //Create wait object for all pages.
        wait = new WebDriverWait(this.driver, timeOut);
    }


    public AccountBar accountBar() {
        return (_accountBar == null) ? (_accountBar = new AccountBar(this)) : (_accountBar);
    }

    public LoginPage loginPage() {
        return _loginPage == null ? _loginPage = new LoginPage(this) : _loginPage;
    }

    public MyAdvertPage myAdvertPage() {
        return _myAdvertPage == null ? _myAdvertPage = new MyAdvertPage(this) : _myAdvertPage;
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

    // Get Text from Webelement
    public String getText(WebElement element) {
        return element.getText();
    }
}

