package HomeWork;


import org.testng.annotations.Test;
import pages.FileDownloadPage;
import pages.FileUploadPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileTest extends BaseTest {

    @Test
    public void downloadTest() throws IOException, InterruptedException {
        FileDownloadPage fileDownloadPage = openMainPage().goToFileDownloadPage()
                .downloadFile();
        waitForPreparation();
        File fileInPackage = new File("target/downloads");
        File[] files = fileInPackage.listFiles();
        for (File file : files) {
            List<String> lines = Files.readAllLines(file.toPath());
            lines.add("Add new message Poltavets Test 7");
            Files.write(file.toPath(), lines);
        }
    }
    @Test
    public void  uploadTest () throws IOException {
        FileUploadPage fileUploadPage = openMainPage().goToFileUploadPage()
                .clickFileUploadButton().clickFileSubmitButton();

    }
}

