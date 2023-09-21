package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
   public static WebDriver setupWebDriver() {
        
        System.setProperty("webdriver.chrome.driver", "/home/trisha/SeleniumDemoProject/chromedriver-linux64/chromedriver");

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.demoblaze.com/");

        return driver;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

       

        System.out.println("Test Completed");
    }
}
