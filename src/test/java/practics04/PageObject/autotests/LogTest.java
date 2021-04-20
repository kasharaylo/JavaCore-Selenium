package practics04.PageObject.autotests;

import org.testng.Assert;
import org.testng.annotations.Test;
import practics04.PageObject.BaseTest;

public class LogTest extends BaseTest {

    private String email = "email@email.com";
    private String password = "Qwerty21";
    private String invalidPassword = "qwerty";
    private String expectedText = "Не удалось подтвердить пользователя.";

    @Test(priority = 1)
    public void LoginTest() throws InterruptedException {
        page.open(baseUrl);

        page.accountBar().clickUkrainianLink();
        Thread.sleep(3000);
        page.accountBar().clickRussianLink();
        Thread.sleep(3000);
        page.accountBar().clickUkrainianLink();
        Thread.sleep(3000);

        page.accountBar().clickMyAccountButton();
        Thread.sleep(3000);

        page.loginPage().login(email, password);
        Thread.sleep(3000);

        Assert.assertTrue(
                page.myAdvertPage().isUserLogedIn(),
                "user didn't log in");
    }

    @Test(priority = 0)
    public void InvalidPasswordLoginTest() {
        page.open(baseUrl);

        // Initialize elements by using PageFactory
        page.accountBar().clickMyAccountButton();
        page.accountBar().acceptCoockies();

        // Chain of Invocation (Go to Login Page and then LoginToN11)
        page.loginPage().login(email, invalidPassword);

        // *************ASSERTIONS***********************
        String actualErrorText = page.loginPage().getErrorText();
        Assert.assertEquals(actualErrorText, expectedText);
    }
}
