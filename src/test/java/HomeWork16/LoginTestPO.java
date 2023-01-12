package HomeWork16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagesHomeWork16.SecurePage;




public class LoginTestPO extends BaseTest {
    @Test
    public void loginTest(){
        SecurePage securePage = openMainPage().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();

        String text = securePage.getPageName();
        Assert.assertTrue(text.contains("Secure Area"));

        driver.close();

    }


}
