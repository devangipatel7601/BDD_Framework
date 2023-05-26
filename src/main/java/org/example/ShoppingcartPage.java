package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingcartPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _computerDetailsInShoppingCart = By.xpath("//td[@class='product']/div[1]");
    private By _checkoutButton = By.cssSelector("button#checkout");
    private By _termsServiceCheckbox = By.cssSelector("input#termsofservice");
    private By _buildYourOwnComputername = By.cssSelector("a.product-name");

    public void verifyDetailsOfBuildYourOwnComputer(){
        String productname = getTextFromElement(_buildYourOwnComputername);
        System.out.println("Product Name: " + productname);

        //verify and assert computer details in shopping cart
        String actualComputerDetails = getTextFromElement(_computerDetailsInShoppingCart);
        System.out.println("ComputerDetails: " +actualComputerDetails);

        Assert.assertNotEquals(actualComputerDetails,"Details not matched");

        //click on terms of service
        clickOnElement(_termsServiceCheckbox);

        //click on checkout button
        clickOnElement(_checkoutButton);
    }
    public void verifyShoppingCartPage(){


        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("shoppingcartpage_URL"));

    }
}
