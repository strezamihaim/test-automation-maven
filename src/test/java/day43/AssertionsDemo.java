package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    void testTitle(){
        String expected_title = "Opencart";
        String actual_title = "Opencart";

        /*if(expected_title.equals(actual_title)){
            System.out.println("test passed");
        } else System.out.println("test failed");*/

        Assert.assertEquals(expected_title, actual_title);

    }
}
