import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ikealist {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ikea.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement shopping = driver.findElement(By.xpath("//*[@id=\"mountId\"]/div/main/div[1]/div/div/section/div[2]/div/div/a/span[2]"));
        shopping.click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div/nav/div[1]/div[1]/div/span")).click();

        WebElement box = driver.findElement(By.xpath("/html/body/div[4]/div/div/nav/div[2]/div[3]/div/div[2]/div/div/div[2]/div[2]/div/div[4]"));
        List<WebElement> locations = box.findElements(By.className("store_information__name"));
        Thread.sleep(2000);
        for (WebElement w : locations) {
            System.out.println(w.getText());
        }
    }
}














