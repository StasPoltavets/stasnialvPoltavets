package SelenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    private SelenideElement someFile = $(By.linkText("some-file.txt"));

    
    public File clickFileToDownload() throws IOException, NullPointerException {
    return this.someFile.download();
    }
}
