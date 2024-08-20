package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNoPF {
    WebDriver driver;

    //constructor
    LoginPageNoPF(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By txt_username_locator = By.xpath("//input[@placeholder='Username']");
    By txt_password_locator = By.xpath("//input[@placeholder='Password']");
    By btn_login_locator = By.xpath("//button[normalize-space()='Login']");




    //Action methods
    public void setUsername(String user){
        driver.findElement(txt_username_locator).sendKeys(user);
    }

    public void setPassword(String pwd){
        driver.findElement(txt_password_locator).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(btn_login_locator).click();
    }
}
