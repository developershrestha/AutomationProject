import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Scshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        HashMap<String, String> images = new HashMap<String, String>();


        images.put("youtube", "https://youtube.com");
        images.put("justwatch", "https://justwatch.com");

        for (String i : images.keySet()) {
            System.out.println(images.get(i));


        driver.get(images.get(i));

      File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src,new File("/Users/ajitshrestha/Desktop/SC/"+i+".png"));



    }
}

}