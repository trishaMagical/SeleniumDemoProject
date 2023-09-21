package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;
import pages.FirstPage;
import pages.LoginPage;
import pages.SignUpPage;


public class LoginPageTest {

    public static void main(String[] args) {

        WebDriver driver = BasePage.setupWebDriver();

        checl_login_page(driver);
        check_username_login(driver);
        check_password_login(driver);
        clickon_login_btn(driver);
        // clickon_close_btn(driver);
       
        // Close the WebDriver
        driver.quit();
    }

    public static void checl_login_page(WebDriver driver) {
        WebElement loginButton = FirstPage.btn_login_present(driver);

        loginButton.click();
        System.out.println("Clicking on Log In button.");
        WebElement loginText = LoginPage.text_login(driver);
        if (loginText != null) {
            System.out.println("Log In Page");
        } else {
            System.out.println("Old Page");
        }
    }

    public static void check_username_login(WebDriver driver) {
        WebElement usernameText = LoginPage.textbox_username_logain(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(usernameText)).clear();
        usernameText.clear();
        usernameText.click();
        String username = "trisha.hazra@madgicaltechdom.com";
        usernameText.sendKeys(username);
        System.out.println("Username is present: " + username);
        // String currentUsername = usernameText.getAttribute("value");
        // System.out.println("Login page Username field is empty"+currentUsername);

        // if (currentUsername != null && !currentUsername.isEmpty()) {
        // System.out.println("Login page Username field is already filled with value: "
        // + currentUsername);
        // } else {
        // System.out.println("Login page Username field is empty");
        // }
    }

    public static void check_password_login(WebDriver driver) {
        WebElement paaswordText = LoginPage.textbox_passoword_login(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(paaswordText)).clear();
        paaswordText.clear();
        paaswordText.click();
        String paasword = "123456";
        paaswordText.sendKeys(paasword);
        System.out.println("Password is present: " + paasword);
    }

    public static void clickon_login_btn(WebDriver driver) {
        WebElement logInButton = LoginPage.btn_login(driver);
        logInButton.click();
        System.out.println("Login Button Clicked");

        WebElement logOutbtn = FirstPage.btn_logout_present(driver);
        if (logOutbtn != null) {
            System.out.println("HomeScreen with Contain");
        } else {
            System.out.println("Check the Test case again");
        }

    }

    public static void clickon_close_btn(WebDriver driver) {
        WebElement closeButton = LoginPage.btn_close_loginPage(driver);
        closeButton.click();
        System.out.println("Close Button Clicked");
        WebElement homeScreen = FirstPage.btn_login_present(driver);
        if (homeScreen != null) {
            System.out.println("HomeScreen Open Again");
        } else {
            System.out.println("Check the Test case again");
        }
    }

   
}
