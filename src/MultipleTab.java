import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class MultipleTab {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
// 1. Open Web Driver University
        driver.get("https://webdriveruniversity.com/");
// 2. Click Contact Us
                driver.manage().window().maximize();

        WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"contact-us\"]"));
        Thread.sleep(2000);
        contactUs.click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs);
//3. Go to other tab
        driver.switchTo().window(tabs.get(1));
// 4. Enter Firstname, lastname, email, comments
        driver.findElement(By.name("first_name")).sendKeys("Bishworaj");
        driver.findElement(By.name("last_name")).sendKeys("Poudel");
        driver.findElement(By.name("email")).sendKeys("bishworajpoudelofficial@gmail.com");
        driver.findElement(By.name("message")).sendKeys("Hello How are you.");
        Thread.sleep(2000);

// 5. Click submit button
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
        Thread.sleep(2000);
// 6. Close the current tab
        driver.close();
        driver.switchTo().window(tabs.get(0));


    }
}
