import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Items {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");
//        driver.manage().window().maximize();
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//
//        driver.findElement(By.xpath("//*[@id=\"data-table\"]/div/div[1]")).click();
//        driver.switchTo().window(tabs.get(1));


        WebElement jobslist = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/ul[3]/ul"));
        Thread.sleep(2000);

        List<WebElement> jobs= jobslist.findElements(By.tagName("li"));
        for (WebElement j : jobs) {
            System.out.println(j.getText());



        }
    }
}
