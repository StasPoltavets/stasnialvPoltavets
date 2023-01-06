package SelectorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxTest {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void beforeTest (){
        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test
    public void checkBoxTest() {
        WebElement checkBoxOne = driver.findElement(By.xpath("//input[1]"));
        WebElement checkBoxTwo = driver.findElement(By.xpath("//input[2]"));

        if (checkBoxOne.isSelected()) {
            System.out.println("First checkBox is selected");
        } else {
            System.out.println("First checkBox is not selected");
            checkBoxOne.click();
        }
        if (checkBoxTwo.isSelected()) {
            System.out.println("Second checkBox is selected");
        } else {
            System.out.println("Second checkBox is not selected");
            checkBoxTwo.click();
        }
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
