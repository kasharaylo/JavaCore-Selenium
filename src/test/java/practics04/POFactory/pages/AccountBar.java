package practics04.POFactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import practics04.POFactory.Page;

public class AccountBar extends Page {

    //private WebDriver driver;

    // *********Constructor*********
    public AccountBar(WebDriver d) {
        super(d);
    }

    //selenium Page Factory selectors
    // *********Web Elements By Using Page Factory*********
    @FindBy(how = How.ID, using = "topLoginLink")
    public WebElement myAccount;

    @FindBy(how = How.ID, using = "changeLang")
    public WebElement ukrainianLink;

    @FindBy(how = How.ID, using = "changeLang")
    public WebElement russianLink;

    @FindBy(how = How.CSS, using = "button.cookie-close.abs.cookiesBarClose")
    public WebElement acceptButton;

    // Go to LoginPage
    public void clickMyAccountButton() {
        click(myAccount);
    }

    // Select Ukrainian language
    public void clickUkrainianLink() {
        click(ukrainianLink);
    }

    // Select Russian language
    public void clickRussianLink() {
        click(russianLink);
    }

    public void acceptCoockies() {
        wait.until(ExpectedConditions.visibilityOf(acceptButton));
        click(acceptButton);
    }
}

