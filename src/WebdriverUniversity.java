import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class WebdriverUniversity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
// 1. Open Web Driver University
        driver.get("https://webdriveruniversity.com/");
// 2. Click LOGINPORTAL
        driver.manage().window().maximize();
        WebElement LOGINPORTAL = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        LOGINPORTAL.click();
        ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // insert values or keys in the text box and login
        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("webdriver");

        WebElement passWord =driver.findElement(By.id("password"));
        passWord.sendKeys ("webdriver123");

        //copy Xpath for login

        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        Login.click();



    }
}
