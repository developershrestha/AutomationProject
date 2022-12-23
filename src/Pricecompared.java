import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pricecompared {
    public static void main(String[] args) throws InterruptedException {
        String productName = "iphone 14 Pro 256GB Black";
        System.setProperty("webdriver.chrome.driver", "/Users/ajitshrestha/Desktop/automation/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys(productName);
        search.submit();

        Thread.sleep(4000);

        String price1Text = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[2]")).getText();
        price1Text = price1Text.replace(",","");
        System.out.println(price1Text);
        double price1 = Double.parseDouble(price1Text);

        Thread.sleep(2000);

//         For another website


        driver.get("https://www.flipkart.com/");


        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        Thread.sleep(2000);

        WebElement search1 = driver.findElement(By.name("q"));
        search1.sendKeys(productName);
        search1.submit();

        Thread.sleep(2000);

        String price2Text = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div")).getText();
        price2Text = price2Text.replace(",","");
        System.out.println(price2Text);
        double price2 = Double.parseDouble(price2Text);

        if(price1<price2) {
            System.out.println("Amazon price is low");
        }
            else if(price1>price2) {
            System.out.println("Flipcart price is low");
        }
            else if (price1 == price2){
            System.out.println("Both are equal");
        }else{
            System.out.println("something went wrong");
        }

            }
        }











