package practics04.PageObject.utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.net.MalformedURLException;

public class WebDriverFactory {

    //private static final boolean REMOTE = FileUtils.getConfigProperty("remote").equals("true");
    //private static final String HUB = FileUtils.getConfigProperty("hub");

    public static WebDriver GetDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                return new ChromeDriver(chromeOptions);
                //return REMOTE ? new RemoteWebDriver(new URL(HUB), chromeOptions) : new ChromeDriver(chromeOptions);
            case "firefox":
                FirefoxOptions ffOptions = new FirefoxOptions();
                return new FirefoxDriver(ffOptions);
                //return REMOTE ? new RemoteWebDriver(new URL(HUB), ffOptions) : new FirefoxDriver(ffOptions);
            case "ie":
                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
                return new InternetExplorerDriver(ieOptions);
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                return new EdgeDriver(edgeOptions);
            default:
                throw new InvalidArgumentException("Add valid parameters 'browser'. instead of " + browser );
        }
    }
}
