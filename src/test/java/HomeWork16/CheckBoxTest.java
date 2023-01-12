package HomeWork16;

import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest (){
        CheckBoxesPage checkBoxesPage = openMainPage().goToCheckBoxPage()
                .checkBoxTest();

    }
}
