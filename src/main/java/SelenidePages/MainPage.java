package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement fileDownloadLink = $(By.linkText("File Download"));
    private SelenideElement fileUploadLink = $(By.linkText("File Upload"));
    private SelenideElement dynamicLoading = $(By.linkText("Dynamic Loading"));

    public DownloadPage goFileDownload() {
        fileDownloadLink.shouldBe(Condition.visible).click();
        return new DownloadPage();
    }

    public UploadPage goFileUpload() {
        fileUploadLink.shouldBe(Condition.visible).click();
        return new UploadPage();
    }
    public DynamicallyLoadedPage goDynamicallyLoadedPage() {
        dynamicLoading.click();
        return new DynamicallyLoadedPage();
    }
}
