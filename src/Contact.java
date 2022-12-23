import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Contact {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement contactus = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]"));
        contactus.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        System.out.println("Total no of tabs");
//        System.out.println(tabs);
//
        driver.switchTo().window(tabs.get(1));



        driver.findElement(By.name("first_name")).sendKeys("Ajit");
        driver.findElement(By.name("last_name")).sendKeys("Shrestha");
       driver.findElement(By.name("email")).sendKeys("ajit.shrestha@gmail");
      driver.findElement(By.name("message")).sendKeys("Hi I am Ajit, trying to learn automate web testing.");
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();
        Thread.sleep(3000);

        driver.navigate().back();
       driver.close();

       driver.switchTo().window(tabs.get(0));

        driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]")).click();

        ArrayList<String> newtabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(newtabs);
        System.out.println("Total num of newtabs");

        driver.switchTo().window(newtabs.get(1));

        driver.findElement(By.name("first_name")).sendKeys("Ajit");
        driver.findElement(By.name("last_name")).sendKeys("Shrestha");
        driver.findElement(By.name("email")).sendKeys("ajit.shrestha@gmail.com");
        driver.findElement(By.name("message")).sendKeys("Hi I am Ajit, trying to learn automate web testing.");
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();

        Thread.sleep(2000);

        driver.quit();

   }

}
