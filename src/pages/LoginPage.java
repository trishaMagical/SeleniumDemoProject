package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private   static WebElement element = null;
      public static WebElement text_login(WebDriver driver){

       element= driver.findElement(By.xpath("//label[@for='log-name'][contains(.,'Username:')]"));
      return element;
    }
    public static WebElement textbox_username_logain(WebDriver driver){

       element= driver.findElement(By.xpath("//input[@id='loginusername']"));
      return element;
    }
    public static WebElement textbox_passoword_login(WebDriver driver){

       element= driver.findElement(By.xpath("//input[@id='loginpassword']"));
      return element;
    }
    public static WebElement btn_login(WebDriver driver){

       element= driver.findElement(By.xpath("//button[contains(.,'Log in')]"));
      return element;
    }
    public static WebElement btn_close_loginPage(WebDriver driver){

       element= driver.findElement(By.xpath("(//button[contains(.,'Close')])[3]"));
      return element;
    }
    public static WebElement btn_logout_present(WebDriver driver){

        element= driver.findElement(By.xpath("//a[contains(.,'Log out')]"));
       return element;
     }
}
