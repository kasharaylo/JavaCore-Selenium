package seleniumHomeWork01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        //Setup URL variable
        String url = "http://www.leafground.com/pages/Window.html";

        //Open Driver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");

        //Start Driver
        ChromeDriver driver = new ChromeDriver(options);
        Thread.sleep(1000);

        //Open link
        driver.get(url);
        Thread.sleep(1000);

        //Clink on button
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
        Thread.sleep(1000);

        //Show title of the first window
        By title01 = By.xpath("//*[@id=\"content\"]/div/div");
        WebElement titleName = driver.findElement(title01);

        System.out.println("First tab is show? - " + titleName.isDisplayed());
        if (titleName.isDisplayed()) {
            System.out.println("First tab title is: " + titleName.getText());
        }

        //Switch to the second window
        Set<String> tabsSwitcher = driver.getWindowHandles();
        driver.switchTo().window(tabsSwitcher.toArray()[1].toString());
        Thread.sleep(1000);

        //Show title of the second window
        By title02 = By.xpath("//*[@id=\"content\"]/div/div/h1");
        WebElement titleName2 = driver.findElement(title02);

        System.out.println("Second tab is show? - " + titleName2.isDisplayed());
        if (titleName2.isDisplayed()) {
            System.out.println("Second tab title is: " + titleName2.getText());
        }
        Thread.sleep(1000);

        //Switch to Bond with Buttons tab
        Set<String> tabsSwitcher2 = driver.getWindowHandles();
        driver.switchTo().window(tabsSwitcher2.toArray()[2].toString());
        Thread.sleep(1000);

        //Make this window full screen
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        //Display button title to console
        By buttonTitle = By.xpath("//*[@id=\"position\"]");
        WebElement titleButton = driver.findElement(buttonTitle);

        System.out.println("Button is show? - " + titleButton.isDisplayed());
        if (titleButton.isDisplayed()) {
            System.out.println("Button title is: " + titleButton.getText());
        }
        Thread.sleep(1000);

        //Close Driver session
        driver.quit();
    }
}
