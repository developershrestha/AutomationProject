import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class LoginTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");
        String username = "webdriver";
        String password = "webdriver123";

        WebDriver driver = new ChromeDriver();
        // chrome driver implements the WebDriver (interface)
        driver.get("https://webdriveruniversity.com");

        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.id("text")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();

        String message = driver.switchTo().alert().getText();
        System.out.println(message);
        if (message.equals("validation succeeded")) {
            System.out.println("Test case pass");
        }else{
            System.out.println("Test case fail");

        }


        driver.quit();


    }
}
