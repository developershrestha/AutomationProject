import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FavoriteBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

       WebElement Alert = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
       Alert.click();
        System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
       driver.quit();

    }
}
