package wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class wdTest {
    @Test
    public void wdTest(){
        WebDriver driver;

//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        } else

        //System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.id("page-footer"));

        //System.out.println(driver.getTitle());
        driver.quit();



    }
}
