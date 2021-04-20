package practics04.PageObject.pages;

import org.openqa.selenium.By;
import practics04.PageObject.Page;

public class LoginPage {

    private Page page;

    //*********Constructor*********
    public LoginPage(Page p) {
        page = p;
    }

    //*********Selectors*********
    public By emailInput = By.id("userEmail");
    public By passwordInput = By.cssSelector("#userPass");
    public By loginButton = By.id("se_userLogin");
    public By errorMessagePassword = By.cssSelector("div.errorbox");


    //*********Page Methods*********
    public void login (String email, String password){
        //Enter Username(Email)
        page.typeText(emailInput, email);
        //Enter Password
        page.typeText(passwordInput, password);
        //Click Login Button
        page.click(loginButton);
    }

    // Returns error text.
    public String getErrorText() {
        return page.getText(errorMessagePassword);
    }
}
