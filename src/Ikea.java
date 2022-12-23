import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ikea {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Data-Table/index.html");

        WebElement box = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/ul[3]"));


        Thread.sleep(3000);

        List<WebElement> list = box.findElements(By.tagName("li"));

        for (WebElement l : list) {
            System.out.println(l.getText());
        }




    }
}

