package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadedPageLink2 {
    private SelenideElement startButton2 = $x("//button[text()='Start']");
    private SelenideElement text2 = $x("//h4[text()='Hello World!']");

    public LoadedPageLink2 clickStartButton2(){
        startButton2.shouldBe(Condition.visible).click();
        return new LoadedPageLink2();
    }
    public String getLoadedText2(){
        return text2.shouldBe(Condition.visible).getText();
    }
}

