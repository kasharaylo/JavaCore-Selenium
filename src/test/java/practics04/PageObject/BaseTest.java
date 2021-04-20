package practics04.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import practics04.PageObject.utils.FileUtils;
import practics04.PageObject.utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private final static int SECONDSTOWAIT = 5;
    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;
    public String baseUrl;

    @BeforeClass
    public void setup() {
        //Create a Chrome driver. All test classes use this.

        ChromeOptions co = new ChromeOptions();
        //driver = new ChromeDriver();
        //driver = WebDriverFactory.GetDriver("Chrome");
        driver = WebDriverFactory.GetDriver(FileUtils.getConfigProperty("browser"));

        //Set baseURL
        //baseUrl = "https://www.olx.ua/";
        baseUrl = FileUtils.getConfigProperty("baseUrl"); //"https://www.olx.ua/";

        driver.manage().timeouts().implicitlyWait(SECONDSTOWAIT, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        page = new Page(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
