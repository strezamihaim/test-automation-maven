package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {
        LoginPageNoPF loginPage = new LoginPageNoPF(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLogin();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown() {
        //driver.quit();
    }
}
