package practics04.PageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practics04.PageObject.Page;

public class MyAdvertPage {

    private Page page;

    //*********Constructor*********
    public MyAdvertPage(Page p) {
        page = p;
    }

    //*********Page Selector*********
    public By messageLink = By.xpath("//*[@id=\"loginForm\"]/div/p");

    //*********Page Methods*********
    public void waitForMessageLink (){
        WebDriverWait localWait = new WebDriverWait(page.driver, 10);
        localWait.until(ExpectedConditions.visibilityOfElementLocated(messageLink));
    }

    //Check if user login successfully
    public boolean isUserLogedIn() {
        waitForMessageLink();
        return true;
    }
}
