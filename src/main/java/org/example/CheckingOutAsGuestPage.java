package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckingOutAsGuestPage extends Utils{
    private By _checkingoutAsGuestButton = By.xpath("//button[text()='Checkout as Guest']");
    LoadProp loadProp = new LoadProp();
    public void clickOnCheckoutAsAGuest(){

        //click on checkout as guest button
        clickOnElement(_checkingoutAsGuestButton);

    }
    public void verifyCheckOutAsGuestPage(){
        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("checkout_As_Guest_Page_URL"));
    }

}
