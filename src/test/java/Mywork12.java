import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Mywork12 {
    public static void main(String[] args)  {
            WebDriver driver =  new ChromeDriver();
            driver.get("https://salinaka-ecommerce.web.app");
 driver.manage().window().fullscreen();
 driver.findElement(By.id("L2AGLb")).click();



        }
    }

