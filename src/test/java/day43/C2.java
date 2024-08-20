package day43;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
    @Test
    void abc(){
        System.out.println(("This is abc from C2 .. "));
    }

    @AfterTest
    void at(){
        System.out.println(("This is bt from C2 .. "));
    }
}
