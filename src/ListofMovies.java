import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedList;
import java.util.List;

public class ListofMovies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/chart/top/");

        WebElement box = driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]"));

        List<WebElement> allMovies = box.findElements(By.tagName("a"));
        LinkedList<String> names = new LinkedList<String>();

        for (WebElement we: allMovies){
            names.add(we.getText());
        }

        System.out.println(names.size());

        for (String name: names) {
            if(name==(""))continue;
            System.out.println(name);

        }


    }
}
