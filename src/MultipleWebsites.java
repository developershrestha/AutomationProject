import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MultipleWebsites {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
// 1. Open Amazon.in website
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchbox = driver.findElement(By.name("field-keywords"));
        searchbox.sendKeys("Apple iPhone 14 128GB Blue");
        searchbox.submit();


        String price1Text = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
        System.out.println(price1Text);
        double price1 = Double.parseDouble(price1Text);

    }

}
