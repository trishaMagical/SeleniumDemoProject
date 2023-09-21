package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
      private   static WebElement element = null;
    public static WebElement btn_signup_present(WebDriver driver){

       element= driver.findElement(By.xpath("//a[@class='nav-link'][contains(.,'Sign up')]"));
      return element;
    }
     public static WebElement btn_login_present(WebDriver driver){

       element= driver.findElement(By.id("login2"));
      return element;
    }
     public static WebElement btn_logout_present(WebDriver driver){

       element= driver.findElement(By.xpath("//a[contains(.,'Log out')]"));
      return element;
    }
    public static WebElement text_home(WebDriver driver){

        element= driver.findElement(By.xpath("//a[@class='nav-link'][contains(.,'Home (current)')]"));
       return element;
     }
}
