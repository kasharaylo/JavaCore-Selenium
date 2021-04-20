package practics04.POFactory.autotests;

import org.testng.Assert;
import org.testng.annotations.Test;
import practics04.POFactory.BaseTest;
import practics04.POFactory.pages.AccountBar;
import practics04.POFactory.pages.LoginPage;
import practics04.POFactory.pages.MyAdvertPage;

public class LoginTests extends BaseTest {

    private String email = "terminator067067@gmail.com";
    private String password = "My_password";
    private String invalidPassword = "qwerty";
    private String expectedText = "Не удалось подтвердить пользователя.";

    @Test(priority = 1)
    public void LoginTest() {
        // *************PAGE METHODS WITH JAVA GENERICS********************
        page.open(baseURL);

        // Initialize elements by using PageFactory
        //page.GetInstance(AccountBar.class).clickUkrainianLink();
        //page.GetInstance(AccountBar.class).clickRussianLink();

        page.GetInstance(AccountBar.class).clickMyAccountButton();

        // Chain of Invocation (Go to Login Page and then Login)
        page.GetInstance(LoginPage.class).login(email, invalidPassword);

        // *************ASSERTIONS***********************
        String actualErrorText = page.GetInstance(LoginPage.class).getErrorText();
        Assert.assertEquals(actualErrorText, expectedText);
    }

    @Test(priority = 0)
    public void InvalidPasswordLoginTest() {
        // *************PAGE METHODS WITH JAVA GENERICS********************
        page.open(baseURL);

        // Initialize elements by using PageFactory
        page.GetInstance(AccountBar.class).clickMyAccountButton();
        page.GetInstance(AccountBar.class).acceptCoockies();

        // Chain of Invocation (Go to Login Page and then LoginToN11)
        page.GetInstance(LoginPage.class).login(email, invalidPassword);

        // *************ASSERTIONS***********************
        String actualErrorText = page.GetInstance(LoginPage.class).getErrorText();
        Assert.assertEquals(actualErrorText, expectedText);
    }
}

