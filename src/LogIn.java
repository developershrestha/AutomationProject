import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        // chrome driver implements the WebDriver (interface)
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        // insert values or keys in the text box and login
        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("webdriver");

        WebElement passWord =driver.findElement(By.id("password"));
        passWord.sendKeys ("webdriver123");
        //copy Xpath for login
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        login.click();



    }
}
