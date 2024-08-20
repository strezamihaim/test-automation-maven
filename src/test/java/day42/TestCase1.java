package day42;

/*1. Open app
2. Login
3. Logout*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
    @AfterMethod
    void logout(){
        System.out.println("Logging out...");
    }
    @Test (priority = 1)
    void openApp(){
        System.out.println("Opening app...");
    }
    @BeforeMethod
    void login(){
        System.out.println("Logging in app...");
    }
}
