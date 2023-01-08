package DragAndDropTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class DragTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }
        @Test
        public void dragTest() {
            WebElement firstBlock =driver.findElement(By.cssSelector("#draggable.ui-widget-content"));
            WebElement secondBlock = driver.findElement(By.cssSelector("#droppable.ui-widget-header "));

            Actions action = new Actions(driver);
            action.dragAndDrop(firstBlock, secondBlock).build().perform();
            Assert.assertEquals(driver.findElement(By.cssSelector("#droppable > p")).getText(), "Dropped!");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(screenshot, new File("C:\\Users\\Стас\\Pictures\\TestScreens\\dragnDrop.png"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }




        }
        @AfterTest
    public void endTest(){
        driver.close();
        }
    }

