package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage  extends BasePage {

    @FindBy(linkText = "aaaStasTest.txt")
    private WebElement someFile;

    public FileDownloadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public FileDownloadPage downloadFile (){
        clickButton(someFile);
        return this;
    }
}