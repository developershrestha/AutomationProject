import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PriceCompare {
    public static void main(String[] args) throws InterruptedException {String productName = "Apple iPhone 14 128GB Blue";
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("Https://www.amazon.com");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys(productName);
        searchBox.submit();


        String prize1Text = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
        prize1Text = prize1Text.replace(",","");
        System.out.println(prize1Text);
        double prize1 = Double.parseDouble(prize1Text);

// For Another Website

        driver.get("https://www.flipkart.com/&quot");
                        Actions action = new Actions ((WebDriver) driver);
        action.sendKeys(Keys.ESCAPE);

        WebElement searchBox1 = driver.findElement(By.name("q"));
        searchBox1.sendKeys(productName);
        searchBox1.submit();

        Thread.sleep(2000);

        String prize2Text = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div")).getText();
        prize2Text = prize1Text.replace(",","");
        System.out.println(prize2Text);
        double price2 = Double.parseDouble(prize1Text);

        if(prize1<price2){
            System.out.println("Amazon prize is low");
        }else if(price2<prize1){
            System.out.println("Flipcart prize is low");
        }else if(prize1 == price2){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Something went wrong.");
        }


    }
}
