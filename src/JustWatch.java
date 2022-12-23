import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustWatch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.justwatch.com/");

        Thread.sleep(5000);

        WebElement box = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div[2]/div[1]/div[1]/ion-searchbar/div/input"));

        box.sendKeys("The Crown");
        box.click();
        Thread.sleep(2000);
        WebElement box1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]"));
        box1.click();

    }

}
