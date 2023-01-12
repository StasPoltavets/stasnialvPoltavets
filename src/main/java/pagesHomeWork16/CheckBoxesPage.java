package pagesHomeWork16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage extends BasePage {

    @FindBy(xpath = "//input[1]")
    private WebElement checkBoxOne;

    @FindBy(xpath = "//input[2]")
    private WebElement checkBoxTwo;

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CheckBoxesPage checkBoxTest() {
        if (checkBoxOne.isSelected()) {
            System.out.println("First checkBox is selected");
        } else {
            System.out.println("First checkBox is not selected");
            checkBoxOne.click();
        }
        if (checkBoxTwo.isSelected()) {
            System.out.println("Second checkBox is selected");
        } else {
            System.out.println("Second checkBox is not selected");
            checkBoxTwo.click();
        } return this;

    }
}



