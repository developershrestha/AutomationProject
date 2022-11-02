import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filltheform {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName = driver.findElement(By.name("first_name"));

        firstName.sendKeys("Bimal");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Sharma");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("hello@gmail.com");

        WebElement message= driver.findElement(By.name("message"));
        message.sendKeys("you are in right page");

        WebElement submit =driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();



    }
}
