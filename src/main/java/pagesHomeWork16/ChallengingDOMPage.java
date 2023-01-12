package pagesHomeWork16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDOMPage extends BasePage{
    @FindBy (css = "div a:nth-of-type(1).button")
    private WebElement bazButton;

    @FindBy (css = ".alert.button")
    private WebElement quxButton;

    @FindBy (css = ".success.button")
    private WebElement successButton;

    @FindBy (xpath = "//tr/td[4]")
    private List<WebElement> links;

    public ChallengingDOMPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public ChallengingDOMPage getTextTest (){
        links.forEach(w->System.out.println(w.getText()));
        return this;
    }
    public ChallengingDOMPage clickBazButton (){
        clickButton(bazButton);
        return this;
    }
    public ChallengingDOMPage clickQuxButton (){
        clickButton(quxButton);
        return this;
    }
    public ChallengingDOMPage clickSuccessButton (){
        clickButton(successButton);
        return this;
    }




}
