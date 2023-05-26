package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils {
    private By _registerButton = By.cssSelector("a.ico-register");
    private By _buildYourOwnComputer = By.xpath("//a[text()='Build your own computer']");
    private By _loginButton = By.xpath("//a[text()='Log in' ]");
    //private By _clickOnBuildyourowncomputerImg = By.xpath("//img[@alt='Picture of Build your own computer']");
  //  private By _clickOnAddToCartBuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");


    LoadProp loadProp = new LoadProp();
    public String expectedAfterHoverColor = "rgba(74, 178, 241, 1)";
    public String expectedBeforeHoverColor = "rgba(85, 85, 85, 1)";

    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);

    }

    public void clickOnBuildYourOwnComputer() {

        //click on build your own computer
        clickOnElement(_buildYourOwnComputer);
    }

    public void clickOnLoginButton() {
        //click on log in button
        clickOnElement(_loginButton);

    }

    public void verifyHomePage() {

        String homepageURL = getCurrentURL();

        Assert.assertEquals(homepageURL, loadProp.getProperty("url"));
    }

    public void clickOnCategory(String button_name) {
        clickOnElement(By.linkText(button_name));
    }

    public void verifyURL(String page_url) {
        Assert.assertEquals(getCurrentURL(), page_url);
    }

    public void verifyPageTitle(String page_title) {
        Assert.assertEquals(getTextFromElement(By.tagName("h1")), page_title);
    }

    public void hoverOverCategoryNames(String categoryName) {
        WebElement ele = driver.findElement(By.linkText(categoryName));
        System.out.println("Before hover color of category --> " + ele.getCssValue("color"));
        Assert.assertEquals(ele.getCssValue("color"), expectedBeforeHoverColor);
        Actions action = new Actions(driver);

        action.moveToElement(ele).perform();
        System.out.println("After hover color of category: " + ele.getCssValue("color"));
        Assert.assertEquals(ele.getCssValue("color"), expectedAfterHoverColor);
    }

    public void hoverOverSubCategory(String subcategory) {

        WebElement ele = driver.findElement(By.linkText(subcategory));

        Actions action = new Actions(driver);

        action.moveToElement(ele).perform();


    }

    public void clickOnNotebooksSubCategory(String subcategory) {

        clickOnElement(By.linkText(subcategory));
    }
   public void verifysubCategoryPage(String page){

   }
}
