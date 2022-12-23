import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Data {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.webdriveruniversity.com/");

        driver.findElement(By.xpath("//*[@id=\"data-table\"]/div/div[1]")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,4000)","");

        WebElement TypeofJobs = driver.findElement(By.className("menu"));
        List<WebElement> jobs =  TypeofJobs.findElements(By.tagName("li"));

        for (WebElement j: jobs) {
            System.out.println(j.getText());
        }

        ///html/body/div/div[9]/div[1]/ul[3]/ul


    }
}
