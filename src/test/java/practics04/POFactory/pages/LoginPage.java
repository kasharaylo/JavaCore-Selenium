package practics04.POFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import practics04.POFactory.Page;

public class LoginPage extends Page {

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*********Web Elements by using Page Factory*********
    //Other approach but works the same:
    //public WebElement userEmail = driver.findElement(By.id("userEmail"));
    @FindBy(how = How.ID, using = "userEmail")
    public WebElement emailInput;

    @FindBy(how = How.CSS, using = "#userPass")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "se_userLogin")
    public WebElement loginButton;

    @FindBy(how = How.CSS, using = "div.errorbox")
    public WebElement errorMessagePassword;


    //*********Page Methods*********
    public void login (String email, String password){
        //Enter Username(Email)
        typeText(emailInput, email);
        //Enter Password
        typeText(passwordInput, password);
        //Click Login Button
        click(loginButton);
    }

    // Returns error text.
    public String getErrorText() {
        return errorMessagePassword.getText();
    }
}
