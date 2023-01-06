package DragAndDropTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class UserNameTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest(){
            WebDriverManager.chromedriver().setup();
            driver.get("https://the-internet.herokuapp.com/hovers");
    }
    @Test
    public void userNameTest(){
        Actions act = new Actions(driver);
        List<Integer> list = new ArrayList<>();

        int count = driver.findElements(By.xpath("//*[@class ='example']/div/img[1]")).size();
        for (int i=1; i<=count; i++) {
            act.moveToElement(driver.findElement(By.xpath("//*[@class ='example']/div["+i+"]/img[1]"))).perform();
            WebElement userNames =  driver.findElement(By.xpath("//h5[contains(text(), 'name: user"+i+"')]"));
            System.out.println(userNames.getText());
        }
    }
    @AfterTest
    public void endTest(){
        driver.close();
    }
}
