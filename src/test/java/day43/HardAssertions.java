package day43;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    void test(){
        //Assert.assertEquals("xyz", "xyz1");
        //Assert.assertEquals("xyz", 123);
        Assert.assertEquals("123", 123);

        Assert.assertTrue(true);
        Assert.assertTrue(1 == 2);
        Assert.assertTrue(1 == 1);

        Assert.fail(); // will directly fail the test
    }
}
