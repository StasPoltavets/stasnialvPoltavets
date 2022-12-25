package Hillel.test;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest (){
        System.out.println("test");
        System.out.println("Running test on " + System.getProperty("url"));

    }
}
