package Hillel.test;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest (){
        System.out.println("my first1 test ");
        System.out.println("Running test on " + System.getProperty("url"));

    }
}
