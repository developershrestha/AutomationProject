import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberBdd {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("http://www.webdriveruniversity.com/Accordion/index.html");


        }
}
