package SelenideTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class SelenideBaseTest {

    @BeforeTest
    public void selenideBaseTest(){
            Configuration.browser = "chrome";

            open ("https://the-internet.herokuapp.com");

            Configuration.savePageSource = false;
            Configuration.holdBrowserOpen = false;
            Configuration.downloadsFolder = "target/download/";
            Configuration.timeout = 10000;




        }
    public void newSession() {
        Selenide.closeWindow();
        Selenide.open("https://the-internet.herokuapp.com/");
    }
    }

