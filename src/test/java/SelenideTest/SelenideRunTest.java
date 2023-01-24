package SelenideTest;


import SelenidePages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static com.codeborne.selenide.Condition.text;

public class SelenideRunTest extends SelenideBaseTest {

    @Test
    public void downloadChangeUploadFile() throws IOException, NullPointerException, IllegalMonitorStateException {

        File file = new MainPage().goFileDownload().clickFileToDownload();

        List<String> lines = Files.readAllLines(file.toPath());
        for (int i=1; i<3; i++) {
            lines.add("added new line " + i);
            Files.write(file.toPath(), lines);
        }
        newSession();

        new MainPage().goFileUpload().uploadFile(file).clickOnUploadButton();
        new UploadPage().getSuccessMessage().shouldHave(text("File Uploaded!"));
    }

    @Test
    public void textAfterLoader(){
        newSession();

        new MainPage().goDynamicallyLoadedPage().example1();

        LoadedPageLink1 page1 = new LoadedPageLink1();
        Assert.assertTrue(page1.clickStartButton1().getLoadedText1().contains("Hello World!"));

        newSession();

        new MainPage().goDynamicallyLoadedPage().example2();

        LoadedPageLink2 page2 = new LoadedPageLink2();
        Assert.assertTrue(page2.clickStartButton2().getLoadedText2().contains("Hello World!"));
    }

}
