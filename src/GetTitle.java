import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.indeed.com/");

//        String Title = driver.getTitle();
//        System.out.println("The title is " +Title);
      WebElement Search = driver.findElement(By.name("q"));
      Search.sendKeys("Quality tester");

      driver.findElement(By.xpath("//*[@id=\"jobsearch\"]/button")).click();
    }
}
