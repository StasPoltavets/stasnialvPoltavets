package SelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedPage {
    private SelenideElement example1 = $x("//a[contains(@href, '/1')]");
    private SelenideElement example2 = $x("//a[contains(@href, '/2')]");

    public DynamicallyLoadedPage example1() {
        example1.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage();
    }

    public DynamicallyLoadedPage example2() {
        example2.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage();

    }
}
