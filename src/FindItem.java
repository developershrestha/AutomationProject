import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindItem {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
// 1. Open Web Driver University
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");


                
        Thread.sleep(5000);
        driver.quit();
    }
}