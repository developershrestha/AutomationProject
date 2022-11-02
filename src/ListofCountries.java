import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ListofCountries {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        WebElement box = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div"));
        List<WebElement> allCountries = box.findElements(By.tagName("a"));

        for(WebElement w: allCountries){
            System.out.println(w.getText());
        }


    }

}
