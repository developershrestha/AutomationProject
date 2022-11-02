import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("The pursuit of Happiness");
        searchBox.submit();
    }
}