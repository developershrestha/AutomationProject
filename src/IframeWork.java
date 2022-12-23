
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");
        WebDriver driver = new ChromeDriver();

        // chrome driver elements the Webdriver(interface)
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");
        driver.switchTo().frame("ourframe");
        WebElement intro = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        intro.click();

        WebElement introData = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[1]/a"));
        introData.click();
        System.out.println(intro.getText());

    }
}
