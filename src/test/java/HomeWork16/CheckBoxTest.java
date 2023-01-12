package HomeWork16;

import org.testng.annotations.Test;
import pagesHomeWork16.CheckBoxesPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest (){
        CheckBoxesPage checkBoxesPage = openMainPage().goToCheckBoxPage()
                .checkBoxTest();

    }
}
