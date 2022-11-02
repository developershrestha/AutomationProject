import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
// 1. Open Web Driver University
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement Option2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]"));
        Option2.click();

        WebElement Option4 = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7)"));
        Option4.click();
    }

}
