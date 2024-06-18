package example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

   String url = "https://www.saucedemo.com/"; // URL
    By l1 = By.xpath("//*[@id=\"root\"]/div/div[1]"); // SWAG LABS verify
    By l2 = By.xpath("//input[@data-test=\"username\"]"); // Username
    By l3 = By.xpath("//input[@data-test=\"password\"]"); // password
    By l4 = By.xpath("//input[@data-test=\"login-button\"]"); // login button
    By l5 = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"); // error message verify
    By l6 = By.xpath("//*[@id=\"header_container\"]/div[2]/span"); // verify PRODUCT
    By l9 = By.xpath("//select[@data-test=\"product-sort-container\"]");
    By l10 = By.xpath("//button[@id=\"react-burger-menu-btn\"]"); // 3 horizontal lines
    By l11 = By.xpath("//a[@data-test=\"logout-sidebar-link\"]"); // logout button
    By l12 = By.xpath("//a[@id=\"inventory_sidebar_link\"]"); // All items
    By l13 = By.xpath("//a[@id=\"about_sidebar_link\"]");
    By l14 = By.xpath("//img[@src=\"/images/logo.svg\"]");
    By l15 = By.xpath("//a[@id=\"reset_sidebar_link\"]");
    By l16 = By.xpath("//button[@id=\"react-burger-cross-btn\"]");
    By l17 = By.xpath("//*[@id=\"item_2_title_link\"]/div");
    By l18 = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    By l19 = By.xpath("//button[@id=\"add-to-cart\"]");
    By l20 = By.xpath("//button[@id=\"back-to-products\"]");
    By l21 = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By l22 = By.xpath("//img[@class=\"inventory_item_img\"]");
    By l23 = By.xpath("//div[@class=\"shopping_cart_container visual_failure\"]");
    By l24 = By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button btn_visual_failure\"]");
    By l25 = By.xpath("//*[@id=\"login_credentials\"]/h4");
    By l26 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4");
    By l27 = By.xpath("//*[@id=\"page_wrapper\"]/footer/div");

    public void loginpage(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
    }

    public void incorrectcred(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("gayatriraina@gmail.com");
        driver.findElement(l3).sendKeys("Gayu@12345");
        driver.findElement(l4).click();
        driver.findElement(l5).getText();
        System.out.println("Verify Error message");
    }

    public void correctcred(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
    }

    public void filterButton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l9).getText();
        System.out.println("Verify Filter");
        Select dropdown = new Select(driver.findElement(l9));
        dropdown.selectByVisibleText("Price (high to low)");
    }

    public void loginwitherroruser(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("error_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l9).getText();
        System.out.println("Verify Filter");
        Select dropdown = new Select(driver.findElement(l9));
        dropdown.selectByVisibleText("Price (high to low)");
        driver.switchTo().alert().accept();
    }

    public void logout(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l10).click();
        driver.findElement(l11).click();
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
    }

    public void allitems(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l10).click();
        driver.findElement(l12).click();
    }

    public void About(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l10).click();
        driver.findElement(l13).click();
        driver.findElement(l14).getText();
        System.out.println("Verify Saucelabs");
    }

    public void reset(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l10).click();
        driver.findElement(l15).click();
        driver.findElement(l16).click();
    }

    public void loginwithglitchuser(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("performance_glitch_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l9).getText();
        System.out.println("Verify Filter");
        Select dropdown = new Select(driver.findElement(l9));
        dropdown.selectByVisibleText("Price (low to high)");
        driver.findElement(l17).click();
        driver.findElement(l18).getText();
        System.out.println("Verify the same product which was clicked");
        driver.findElement(l19).click();
    }

    public void backtoproducts(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("performance_glitch_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l9).getText();
        System.out.println("Verify Filter");
        Select dropdown = new Select(driver.findElement(l9));
        dropdown.selectByVisibleText("Price (low to high)");
        driver.findElement(l17).click();
        driver.findElement(l18).getText();
        System.out.println("Verify the same product which was clicked");
        driver.findElement(l19).click();
        driver.findElement(l20).getText();
        System.out.println("Verify Back to Products");
        driver.findElement(l20).click();
    }

    public void loginwithlockedoutuser(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("locked_out_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l21).getText();
        System.out.println("Verify Error Message");
    }

    public void loginwithproblemuser(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("problem_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l22).getText();
        System.out.println("Verify each product has same image");
    }

    public void loginwithvisualuser(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("visual_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l23).click();
        driver.findElement(l24).getText();
        System.out.println("Verify checkout button place");
    }

    public void verifyusrnamepass(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l25).getText();
        System.out.println("Verify Accepted usernames are:");
        driver.findElement(l26).getText();
        System.out.println("Verify Password for all users:");
    }

    public void footer(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("visual_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,700)");
        driver.findElement(l27).getText();
        System.out.println("Verify footer");
    }
}
