package SelectorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ClickButtonTest {
   // final int collectionSize =11;
    @Test
    public void clickButtonTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

                driver.findElement(By.linkText("Challenging DOM")).click();
                driver.findElement(By.cssSelector("div a:nth-of-type(1).button")).click();
                driver.findElement(By.cssSelector(".alert.button")).click();
                driver.findElement(By.cssSelector(".success.button")).click();


        List<WebElement> links = driver.findElements(By.xpath("//tr/td[4]"));
        links.forEach(w->System.out.println(w.getText()));
            driver.quit();
        }
    }

