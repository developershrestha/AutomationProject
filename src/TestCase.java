import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html");

        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");

        WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        Login.click();
        String text = driver.switchTo().alert().getText();


    }
}
