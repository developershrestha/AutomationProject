import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class ModelPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");


        driver.findElement(By.id("button2")).click();
        Thread.sleep(2000);
       WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
       Close.click();




    }

}
