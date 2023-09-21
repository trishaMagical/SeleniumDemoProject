package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.FirstPage;
import pages.BasePage;
import pages.SignUpPage;
import pages.LoginPage;

public class FirstPageTest {
    public static void main(String[] args) {
        WebDriver driver = BasePage.setupWebDriver();

        // Check if the "Sign Up" button is present
        checkSignUpButton(driver);

        // Check if the "Log In" button is present
        checkLoginButton(driver);
       //clickonSignUpButton(driver);
        clickonLogInButton(driver);
        // Close the WebDriver
        driver.quit();
    }

    public static void checkSignUpButton(WebDriver driver) {
        WebElement signUpButton = FirstPage.btn_signup_present(driver);

        if (signUpButton != null) {
            System.out.println("Sign Up button is present.");
        } else {
            System.out.println("Sign Up button is not present.");
        }
    }

    public static void checkLoginButton(WebDriver driver) {
        WebElement logInButton = FirstPage.btn_login_present(driver);

        if (logInButton != null) {
            System.out.println("Log In button is present.");
        } else {
            System.out.println("Log In button is not present.");
        }
    }

    public static void clickonSignUpButton(WebDriver driver) {
        WebElement signUpButton = FirstPage.btn_signup_present(driver);
       
        signUpButton.click();
        System.out.println("Clicking on Sign Up button.");
        WebElement signUpText = SignUpPage.text_signup(driver);
        if(signUpText != null){
             System.out.println("SignUp Page");
        }else{
            System.out.println("Old Page");
        }
        
    }
      public static void clickonLogInButton(WebDriver driver) {
        WebElement logInButton = FirstPage.btn_login_present(driver);
       
        logInButton.click();
        System.out.println("Clicking on Log Inbutton.");
        WebElement logInText = LoginPage.text_login(driver);
        if(logInText != null){
             System.out.println("Log in  Page");
        }else{
            System.out.println("Old Page");
        }
        
    }
}
