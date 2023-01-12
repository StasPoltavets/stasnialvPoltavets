package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy (css = "input#username")
    private WebElement usernameInput;
    @FindBy (css = "input#password")
    private WebElement passwordInput;
    @FindBy (css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy (css = ".flash.error")
    private WebElement errorPopup;



    public LoginPage (WebDriver driver){
    super(driver);
        PageFactory.initElements(driver, this);
    }

   public LoginPage setUsername (String username){
        setText(usernameInput, username);
   return this;
    }

   public LoginPage setPassword (String password){
        setText(passwordInput, password);
   return this;
    }
   public  SecurePage clickLoginButton(){
        clickButton(loginButton);
        return new SecurePage(driver);
   }
   public SecurePage login (String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
   }
   public LoginPage loginWithInvalidCreds(String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();

        return new LoginPage(driver);
   }
}
