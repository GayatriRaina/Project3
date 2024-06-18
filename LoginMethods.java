package TestScenarios;

import example.Object.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginMethods extends AutomationUtilities{
    static WebDriver driver;

    @Test
    public void login(){
        driver = super.Initialization();
        Login lg = new Login(driver);
        lg.loginpage();
        lg.incorrectcred();
        lg.correctcred();
        lg.filterButton();
        lg.loginwitherroruser();
        lg.logout();
        lg.allitems();
        lg.About();
        lg.reset();
        lg.loginwithglitchuser();
        lg.backtoproducts();
        lg.loginwithlockedoutuser();
        lg.loginwithproblemuser();
        lg.loginwithvisualuser();
        lg.verifyusrnamepass();
        lg.footer();
    }
}
