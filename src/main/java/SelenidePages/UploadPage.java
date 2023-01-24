package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    private SelenideElement browseButton = $(By.id("file-upload"));
    private SelenideElement uploadButton = $(By.id("file-submit"));
    private SelenideElement successMessage = $(By.tagName("h3"));


    public UploadPage uploadFile(File file) {
        browseButton.uploadFile(file);
        return new UploadPage();
    }

    public void clickUploadButton() {
        uploadButton.shouldBe(Condition.visible).click();
    }
    public SelenideElement getSuccessMessage(){
        return this.successMessage;
    }
    public UploadPage clickOnUploadButton(){
        uploadButton.shouldBe(Condition.visible).click();
        return this;
    }
}
