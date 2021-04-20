package practics04.POFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import practics04.POFactory.utils.FileUtils;
import practics04.PageObject.utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final static int SECONDSTOWAIT = 5;
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
    public String baseURL; //= "https://www.olx.ua/"; // "http://www.leafground.com/pages/disapper.html";

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.

        ChromeOptions co = new ChromeOptions();
        //driver = new ChromeDriver();
        driver = WebDriverFactory.GetDriver(practics04.POFactory.utils.FileUtils.getConfigProperty("browser"));
        //Set baseURL
        baseURL = "https://www.olx.ua/";
        //baseURL = FileUtils.getConfigProperty("baseURL"); //"https://www.olx.ua/"
        driver.manage().timeouts().implicitlyWait(SECONDSTOWAIT, TimeUnit.SECONDS);

        //Maximize Window
        driver.manage().window().maximize();

        //Instantiate the Page Class
        page = new Page(driver);
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }


}
