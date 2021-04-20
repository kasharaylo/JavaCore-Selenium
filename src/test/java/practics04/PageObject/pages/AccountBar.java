package practics04.PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import practics04.PageObject.Page;

public class AccountBar {

    private Page page;

    // *********Constructor*********
    public AccountBar(Page p) {
        page = p;
    }

    //selenium pagefactory selectors

	/*
	// *********Web Elements By Using Page Factory*********
	@FindBy(how = How.ID, using = "topLoginLink")
	public WebElement myAccount;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'ìîâà')]")
	public WebElement ukrainianLink;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'ÿçûê')]")
	public WebElement russianLink;
	 */

    public By ukrainianLink = By.xpath("//*[@id=\"changeLang\"]");
    public By russianLink = By.xpath("//*[@id=\"changeLang\"]");
    public By myAccount = By.id("topLoginLink");
    public By acceptButton = By.cssSelector("button.cookie-close.abs.cookiesBarClose");

    // Go to LoginPage
    public void clickMyAccountButton() {
        page.click(myAccount);
    }

    // Select Ukrainian language
    public void clickUkrainianLink() {
        page.click(ukrainianLink);
    }

    // Select Russian language
    public void clickRussianLink() {
        page.click(russianLink);
    }

    // Clicks Accept on Cookies Pop-up
    public void acceptCoockies() {
        page.wait.until(ExpectedConditions.visibilityOfElementLocated(acceptButton));
        page.click(acceptButton);
    }
}
