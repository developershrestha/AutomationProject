import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Multipeople {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.imdb.com/");

       Thread.sleep(6000);

        js.executeScript("window.scrollBy(0,2000)");

        Thread.sleep(3000);

        WebElement netflix = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/div[6]/div/section/div/div/div/div[1]/div/ul/li[2]"));
        netflix.click();




    }
}
