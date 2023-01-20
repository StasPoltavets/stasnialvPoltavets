package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class FileUploadPage extends BasePage {
    @FindBy(tagName = "h3")
    private WebElement successText;
    @FindBy (xpath = "//*[@id=\"file-upload\"]")
    private WebElement fileUploadButton;
    @FindBy (css = "#file-submit")
    private WebElement fileSubmitButton;

    public FileUploadPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FileUploadPage clickFileUploadButton() throws IOException {
        fileUploadButton.sendKeys(new File(("target/downloads/aaaStasTest.txt")).getAbsolutePath());

        return this;
    }

    public FileUploadPage clickFileSubmitButton (){
        fileSubmitButton.click();
        return this;
    }

    public String checkSuccessText (){
        return successText.getTagName();
    }
}
