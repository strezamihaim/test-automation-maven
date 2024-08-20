package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Test case
 1. Launch browser(chrome)
 2. Open URL: https://demo.opencart.com
 3. Validate title: Your store
 4. Close browser*/
public class FirstTestCase {
    public static void main(String[] args) {
        // 1. Launch browser(chrome) - create a chromedriver class
        //ChromeDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);

        //2. Open URL: https://demo.opencart.com
        driver.get("https://demo.opencart.com");

        //3. Validate title: Your store
        String act_title = driver.getTitle();
        if(act_title.equals("Your Store")){
            System.out.println("Test passed");
        } else System.out.println("Test failed");

        // 4. Close browser
        driver.close();
    }
}
