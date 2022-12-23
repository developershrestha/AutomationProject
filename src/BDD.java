import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        driver.get("https://webdriveruniversity.com");
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.className("section-title")).click();


        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]")).click();
        Thread.sleep(2000);
        String detail = driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]")).getText();
        System.out.println(detail);





    }
}
