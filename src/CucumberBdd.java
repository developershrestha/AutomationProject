import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class CucumberBdd {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("http://www.webdriveruniversity.com/Accordion/index.html");


        WebElement bdd = driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
           bdd.click();
           String result = driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]")).getText();
        System.out.println(result);

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));





    }
}
