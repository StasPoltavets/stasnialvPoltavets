package SelectorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
        WebDriver driver = new ChromeDriver();
@BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/login");
}
    @Test
    public void validLoginTest() {
       WebElement username =driver.findElement(By.id("username"));
       WebElement password =driver.findElement(By.id("password"));
       WebElement loginButton =driver.findElement(By.cssSelector(".radius"));

       username.sendKeys("tomsmith");
       password.sendKeys("SuperSecretPassword!");
       loginButton.click();
       Assert.assertEquals(driver.findElement(By.cssSelector(".flash.success")).getText(), "You logged into a secure area!\n" + "×");
    }

    @Test
    public void invalidLoginTest(){
        WebElement username =driver.findElement(By.id("username"));
        WebElement password =driver.findElement(By.id("password"));
        WebElement loginButton =driver.findElement(By.cssSelector(".radius"));

        username.sendKeys("tomsmith?");
        password.sendKeys("NotSuperSecretPassword!");
        loginButton.click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.error")).getText(), "Your username is invalid!\n" + "×");
    }
    @AfterTest
    public void finishTest(){
    driver.close();
    }
}
