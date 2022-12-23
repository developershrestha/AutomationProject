import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ContactUs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/");
        driver.manage().window().maximize();


        WebElement ContactUs = driver.findElement(By.xpath("//*[@id=\"contact-us\"]"));
        ContactUs.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        // go to other tab

        driver.switchTo().window(tabs.get(1));

        WebElement FirstName = driver.findElement(By.id("text"));
        FirstName.sendKeys("Aakash");

        WebElement LastName = driver.findElement(By.id("text"));
        LastName.sendKeys("Shrestha");

        WebElement EmailAddress = driver.findElement(By.id("text"));
        EmailAddress.sendKeys("AakashShrestha@gmail.com");

        WebElement Comments = driver.findElement(By.id("Comments"));
        Comments.sendKeys("Practise");

        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        Submit.click();


    }
}
