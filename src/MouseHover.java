import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://webdriveruniversity.com/Actions/index.html#");

        WebElement hover = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
        hover.click();

        WebElement link1 = (WebElement) driver.findElements(By.xpath("//*[@id=\\\"div-hover\\\"]/div[1]/div/a"));

        link1.click();

        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.close();


    }
}
