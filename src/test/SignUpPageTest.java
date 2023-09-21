package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.FirstPage;
import pages.SignUpPage;

public class SignUpPageTest {
    public static void main(String[] args) {

        WebDriver driver = BasePage.setupWebDriver();

        clickonSignUpButton(driver);
        check_username(driver);
        check_password(driver);
        clickon_signup_btn(driver);
        clickon_close_btn(driver);
        // Close the WebDriver
        driver.quit();
    }

    public static void clickonSignUpButton(WebDriver driver) {
        WebElement signUpButton = FirstPage.btn_signup_present(driver);

        signUpButton.click();
        System.out.println("Clicking on Sign Up button.");
        WebElement signUpText = SignUpPage.text_signup(driver);
        if (signUpText != null) {
            System.out.println("SignUp Page");
        } else {
            System.out.println("Old Page");
        }
    }

    public static void check_username(WebDriver driver) {
        WebElement usernameText = SignUpPage.textBox_username(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(usernameText)).clear();
        usernameText.clear();
        usernameText.click();
        String username = "trisha.hazra@madgicaltechdom.com";
        usernameText.sendKeys(username);
        System.out.println("Username is present: " + username);
    }

    public static void check_password(WebDriver driver) {
        WebElement passwordText = SignUpPage.textbox_password(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        wait.until(ExpectedConditions.elementToBeClickable(passwordText)).clear();
        passwordText.clear();
        passwordText.click();
        String password = "123456";
        passwordText.sendKeys(password);
        System.out.println("Password is present: " + password);
    }

    public static void clickon_signup_btn(WebDriver driver) {
        WebElement signUpButton = SignUpPage.button_signup(driver);
        signUpButton.click();
        System.out.println("SignUp Button Clicked");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
         alert.accept();

    }
     public static void clickon_close_btn(WebDriver driver) {
        WebElement closeButton = SignUpPage.button_close(driver);
        closeButton.click();
         System.out.println("Close Button Clicked");
        WebElement homeScreen = FirstPage.btn_login_present(driver);
        if(homeScreen != null){
              System.out.println("HomeScreen Open Again");
        }else{
            System.out.println("Check the Test case again");
        }
    }
}
