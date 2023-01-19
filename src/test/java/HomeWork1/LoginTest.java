package HomeWork1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
    @Test(priority = 10, dataProvider = "userData", groups = "login")
    public void dataTest(String userName, String pass, String role) {
        System.out.println("start test for " + userName);
        if (role.equals("admin")) {
            throw new RuntimeException("this is a bug");
        }
    }
    @Test( priority = 12, dependsOnGroups = "login")
    public void ageTest(){
        int[] signUpDate ={1991, 2000, 2020};
                for (int date : signUpDate)
                    if (date ==2020){
                        throw new RuntimeException("This is bot");
                    }
    }

    @Test(priority = 11)
    @Parameters({"userNameValue", "passValue", "roleValue"})
    public void newParam(String userName, String pass, String role){
        System.out.println("Firs Name"+ userName);
        System.out.println("Password "+ pass);
        System.out.println("Role "+ role);

    }
    @Test(priority = 20)
    @DataProvider(name = "userData")
    public Object[][] loginData() {
        Object[][] result = {
                {"userName1", "000", "admin"},
                {"userName2", "010", "Maker"},
                {"userName3", "001", "guest"}
        };
        return result;
    }
}
