package pagesHomeWork16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HoversPage extends BasePage{

    @FindBy(xpath = "//*[@class ='example']/div/img[1]")
    private List<WebElement> icons;
    @FindBy(tagName = "h5")
    private List<WebElement> userNames;

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HoversPage userNameBlock() {
        for (WebElement icon : icons) {
            actions.moveToElement(icon).perform();
            for (WebElement userName : userNames) {
                System.out.println(userName.getText().replaceAll("name:", ""));
            }
        }return this;
    }
}