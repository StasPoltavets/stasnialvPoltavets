package SelectorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxTest {

    @Test
    public void checkBoxTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        for (int i = 1; i <= 2; i++){
            if (driver.findElement(By.xpath("//input[" + i + "]")).isSelected()){
                System.out.println("Selected Checkbox");
            } else {
                System.out.println("Not Selected Checkbox");
            }
        }
            driver.quit();


    }
}
