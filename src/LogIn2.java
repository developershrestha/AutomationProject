import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class LogIn2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        // chrome driver implements the WebDriver (interface)
        driver.get("https://www.webdriveruniversity.com");



        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        Login.click();
        driver.manage().window().maximize();

        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs.size());
      // go to other tab
        driver.switchTo().window(tabs.get(1)); // 0 for first 1 for second and so on...


        WebElement Username = driver.findElement(By.id("text"));
        Username.sendKeys("webdriver");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("webdriver123");

        driver.findElement(By.id("login-button")).click();

    }
}
