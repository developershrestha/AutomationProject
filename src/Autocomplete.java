import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

        WebElement Fooditem = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
        Fooditem.click();

        Fooditem.sendKeys("b");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div[3]")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("submit-button")).click();

    }
}
