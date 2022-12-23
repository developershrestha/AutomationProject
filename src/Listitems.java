import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Listitems {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

        WebElement Fooditem = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
        Fooditem.click();
        Fooditem.sendKeys("b");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchbox =driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]"));

        List<WebElement> allitems = searchbox.findElements(By.tagName("input"));

        System.out.println(allitems.size());

        for(WebElement e : allitems){
            System.out.println(e.getAttribute("value"));
        }

        driver.quit();



    }


}
