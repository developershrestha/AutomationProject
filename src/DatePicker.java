import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class DatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Datepicker/index.html");

        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span/i")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[1]")).click();


    }
}
