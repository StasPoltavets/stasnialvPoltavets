package SelectorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        WebDriverManager.chromedriver().setup();

    }

    @Test
    public void validLoginTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("ali baba");
        driver.findElement(By.id("password")).sendKeys("0000");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.success")).getText(), "You logged into a secure area\n" + "×");
    driver.quit();
    }

    @Test
    public void invalidLoginTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("ali babi");
        driver.findElement(By.id("password")).sendKeys("001");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.error")).getText(), "Your username is invalid!\n" + "×");
        driver.quit();
    }
}
