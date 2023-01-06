package Hillel.test;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 10)
    public void firstTest (){
        System.out.println("my first test");
        System.out.println("Running test on " + System.getProperty("url"));

    }
    @Test(priority = 20, dependsOnMethods = "firstTest")
    public void firstTest2(){
        System.out.println("Test number 2");
    }

    @Test(priority = 30)
    public void firstTest3(){
        System.out.println("Test number 3");
    }

}
