package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadedPageLink1 {

    private SelenideElement startButton1 = $x("//button[text()='Start']");
    private SelenideElement text1 = $x("//h4[text()='Hello World!']");

    public LoadedPageLink1 clickStartButton1(){
        startButton1.shouldBe(Condition.visible).click();
        return new LoadedPageLink1();
    }
    public String getLoadedText1(){
        return text1.shouldHave(Condition.visible).getText();
    }
}
