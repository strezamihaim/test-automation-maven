package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPagePF {
    WebDriver driver;

    //constructor
    LoginPagePF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // @FindBy annotation
    //@FindBy(xpath="//input[@placeholder='Username']")
    @FindBy(how= How.XPATH, using="//input[@placeholder='Username']")
    WebElement txt_username;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement txt_password;

    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement btn_login;

    @FindBy(tagName="a")
    List<WebElement> links;

    //Action methods
    public void setUsername(String user){
        txt_username.sendKeys(user);
    }

    public void setPassword(String pwd){
        txt_password.sendKeys(pwd);
    }

    public void clickLogin(){
        btn_login.click();
    }
}
