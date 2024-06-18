package example.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddProduct {
    WebDriver driver;
    public AddProduct(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://www.saucedemo.com/"; // URL
    By l1 = By.xpath("//*[@id=\"root\"]/div/div[1]"); // SWAG LABS verify
    By l2 = By.xpath("//input[@data-test=\"username\"]"); // Username
    By l3 = By.xpath("//input[@data-test=\"password\"]"); // password
    By l4 = By.xpath("//input[@data-test=\"login-button\"]"); // login button
    By l6 = By.xpath("//*[@id=\"header_container\"]/div[2]/span"); // verify PRODUCT
    By l7 = By.xpath("//*[@id=\"item_4_title_link\"]/div"); // verify 2nd product
    By l8 = By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-bike-light\"]");
    By a1 = By.xpath("//a[@class=\"shopping_cart_link\"]");
    By a2 = By.xpath("//span[@class=\"title\"]");
    By a3 = By.xpath("//button[@data-test=\"remove-sauce-labs-bike-light\"]");
    By a4 = By.xpath("//button[@data-test=\"remove-sauce-labs-bike-light\"]");
    By a5 = By.xpath("//button[@data-test=\"checkout\"]");
    By a6 = By.xpath("//span[@data-test=\"title\"]");
    By a7 = By.xpath("//input[@id=\"first-name\"]");
    By a8 = By.xpath("//input[@id=\"last-name\"]");
    By a9 = By.xpath("//input[@id=\"postal-code\"]");
    By a10 = By.xpath("//input[@id=\"continue\"]");
    By a11 = By.xpath("//button[@id=\"finish\"]");
    By a12 = By.xpath("//h2[@data-test=\"complete-header\"]");
    By a13 = By.xpath("//button[@id=\"continue-shopping\"]");
    By a14 = By.xpath("//a[@data-test=\"social-twitter\"]");
    By a15 = By.xpath("//a[@data-test=\"social-facebook\"]");
    By a16 = By.xpath("//a[@data-test=\"social-linkedin\"]");


    public void addProduct(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
    }

    public void cartbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
        driver.findElement(a1).click();
        driver.findElement(a2).getText();
        System.out.println("Verify Your Cart");
    }

    public void removeproductfromproductpage(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
        driver.findElement(a3).click();
    }

    public void removeproductfromcart(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
        driver.findElement(a1).click();
        driver.findElement(a2).getText();
        System.out.println("Verify Your Cart");
        driver.findElement(a4).click();
    }

    public void checkoutbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
        driver.findElement(a1).click();
        driver.findElement(a2).getText();
        System.out.println("Verify Your Cart");
        driver.findElement(a5).click();
        driver.findElement(a6).getText();
        System.out.println("Verify Your Address");
        driver.findElement(a7).sendKeys("Gayatri");
        driver.findElement(a8).sendKeys("Raina");
        driver.findElement(a9).sendKeys("411014");
        driver.findElement(a10).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(a11).click();
        driver.findElement(a12).getText();
        System.out.println("Verify Successful Message");
    }

    public void continueshoppingbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        driver.findElement(l6).getText();
        System.out.println("Verify Products");
        driver.findElement(l7).getText();
        System.out.println("Verify 2nd Product");
        driver.findElement(l8).click();
        driver.findElement(a1).click();
        driver.findElement(a2).getText();
        System.out.println("Verify Your Cart");
        driver.findElement(a13).click();
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
    }

    public void twitterbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(a14).click();
    }

    public void facebookbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(a15).click();
    }

    public void linkedInbutton(){
        driver.get(url);
        driver.findElement(l1).getText();
        System.out.println("Verify SWAG LABS");
        driver.findElement(l2).sendKeys("standard_user");
        driver.findElement(l3).sendKeys("secret_sauce");
        driver.findElement(l4).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        driver.findElement(a16).click();
    }

}
