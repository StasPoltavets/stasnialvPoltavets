package HomeWork16;

import org.testng.annotations.Test;
import pages.ChallengingDOMPage;

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
