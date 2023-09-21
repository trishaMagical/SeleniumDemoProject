package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
     private   static WebElement element = null;
      public static WebElement text_signup(WebDriver driver){

       element= driver.findElement(By.id("signInModalLabel"));
      return element;
    }
    public static WebElement textBox_username(WebDriver driver){

       element= driver.findElement(By.xpath("//input[@id='sign-username']"));
      return element;
    }
     public static WebElement textbox_password(WebDriver driver){

       element= driver.findElement(By.id("sign-password"));
      return element;
    }
    public static WebElement button_signup(WebDriver driver){

        element= driver.findElement(By.xpath("//button[@type='button'][contains(.,'Sign up')]"));
        return element;
    }
    public static WebElement button_close(WebDriver driver){

        element= driver.findElement(By.xpath("(//button[@type='button'][contains(.,'Close')])[2]"));
        return element;
    }
}
