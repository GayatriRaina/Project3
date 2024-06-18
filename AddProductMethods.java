package TestScenarios;

import example.Object.AddProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddProductMethods extends AutomationUtilities{
    static WebDriver driver;

    @Test
    public void Products(){
        driver = super.Initialization();
        AddProduct ad = new AddProduct(driver);
        ad.addProduct();
        ad.cartbutton();
        ad.removeproductfromproductpage();
        ad.removeproductfromcart();
        ad.checkoutbutton();
        ad.continueshoppingbutton();
        ad.twitterbutton();
        ad.facebookbutton();
        ad.linkedInbutton();
    }
}
