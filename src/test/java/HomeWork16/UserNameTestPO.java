package HomeWork16;

import HomeWork16.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

public class UserNameTestPO extends BaseTest {

    @Test
    public void  getUserNameTest(){
        HoversPage hoversPage = openMainPage().goToHoversPage()
                .userNameBlock();

    }
}
