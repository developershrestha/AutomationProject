import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MultipleWebsite {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        HashMap<String,String> websites = new HashMap<String,String>();

        websites.put("tccd","https://www.tccd.edu");
        websites.put("Facebook","https://www.bestbuy.com");


        for (String i : websites.keySet()) {
            System.out.println(websites.get(i));
            driver.get(websites.get(i));{
                File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src,new File("/Users/ajitshrestha/Documents/SC/"+i+".png"));

            }
        }
    }
}
