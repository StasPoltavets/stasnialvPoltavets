package HomeWork16;

import org.testng.annotations.Test;
import pagesHomeWork16.HoversPage;

public class UserNameTestPO extends BaseTest {

    @Test
    public void  getUserNameTest(){
        HoversPage hoversPage = openMainPage().goToHoversPage()
                .userNameBlock();

    }
}
