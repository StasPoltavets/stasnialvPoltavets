package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy (css = "#content > ul > li:nth-child(21) > a")
    private WebElement formAuthLink;
    @FindBy (linkText = "Hovers")
    private WebElement  hoversLink;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkBoxLink;
    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingLink;

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public LoginPage goToLoginPage(){
        clickButton(formAuthLink);
        return new LoginPage(driver);

    }
    public HoversPage goToHoversPage(){
        clickButton(hoversLink);
        return new HoversPage(driver);
    }

    public CheckBoxesPage goToCheckBoxPage(){
        clickButton(checkBoxLink);
        return new CheckBoxesPage(driver);
    }
    public  ChallengingDOMPage challengingDOMPage(){
        clickButton(challengingLink);
        return new ChallengingDOMPage(driver);
    }
}
