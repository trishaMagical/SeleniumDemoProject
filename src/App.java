import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "/home/trisha/SeleniumDemoProject/chromedriver-linux64/chromedriver");
       // System.setProperty("webdriver.chrome.driver", "/home/trisha/SeleniumDemoProject/src/drivers/chrome-linux64");
        //  System.setProperty("webdriver.chrome.driver", "/home/trisha/SeleniumDemoProject/src/drivers/geckodriver");
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        System.out.println("Test Completed");
        driver.quit();
    }
}