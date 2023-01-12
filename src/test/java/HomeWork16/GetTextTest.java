package HomeWork16;

import org.testng.annotations.Test;
import pagesHomeWork16.ChallengingDOMPage;

public class GetTextTest extends BaseTest{
    @Test
    public void getTextTest (){
        ChallengingDOMPage challengingDOMPage = openMainPage().challengingDOMPage()
                .clickBazButton()
                .clickQuxButton()
                .clickSuccessButton()
                .getTextTest();
    }

}
