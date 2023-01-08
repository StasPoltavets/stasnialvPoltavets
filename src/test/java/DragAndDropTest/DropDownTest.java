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

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DropDownTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
    }
    @Test
    public void dropDownTest(){
        Actions act = new Actions(driver);
        WebElement dropdownToolBar= driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown ')]"));
        WebElement secondaryMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu ')]"));
        WebElement secondaryAction = driver.findElement(By.xpath("//a[@onclick='handleSecondaryAction()']"));
        WebElement secondaryPageText = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']"));

        act.moveToElement(dropdownToolBar).click().pause(1000).moveToElement(secondaryMenu).pause(1000).moveToElement(secondaryAction).click().perform();
        Assert.assertTrue(secondaryPageText.getText().contains("Secondary Page"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\Стас\\Pictures\\TestScreens\\DropDownSecondPage.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @AfterTest public void  endTest(){
        driver.close();
    }
}
