import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://webdriveruniversity.com/Actions/index.html#");

    }

}
