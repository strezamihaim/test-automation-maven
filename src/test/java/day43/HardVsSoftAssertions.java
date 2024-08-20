package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
    @Test
    void test_hardassertions(){
        System.out.println("testing1...");
        Assert.assertEquals(1,2);
        System.out.println("testing2...");
    }

    @Test
    void test_softassertions(){
        System.out.println("testing1...");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1,2);
        System.out.println("testing2...");

        sa.assertAll();//mandatory to make sure the test will fail
    }
}
