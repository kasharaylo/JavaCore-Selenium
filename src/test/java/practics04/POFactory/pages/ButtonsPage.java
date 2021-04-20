package practics04.POFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import practics04.POFactory.Page;

public class ButtonsPage extends Page {

    // *********Constructor*********
    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "button#btn") //"#color")
    public WebElement colorButton;

    @FindBy(how = How.CSS, using = "#show.disappear") //"#color")
    public WebElement appearedText;


    public void waitToDesapear() {
        wait.until(ExpectedConditions.invisibilityOf(colorButton));
    }
    public String getText() {
        return appearedText.getText();
    }
}
