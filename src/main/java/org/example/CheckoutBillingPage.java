package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutBillingPage extends Utils{
    private By _firstName = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _addLine1 = By.cssSelector("input#BillingNewAddress_Address1");
    private By _postalCode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _continueButton = By.xpath("//button[@onclick='Billing.save()']");
    LoadProp loadProp = new LoadProp();
    public void fillInCheckoutBillingDetails(){
    //enter first name
    typeText(_firstName,loadProp.getProperty("firstname"));

    //enter last name
    typeText(_lastName,loadProp.getProperty("lastname"));

    //enter email
    typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("email_Domain"));

    //select country from dropdown
    selectElementByValue(_country,loadProp.getProperty("country"));

    //type city name
    typeText(_city,loadProp.getProperty("city"));

    //type 1st line of address
    typeText(_addLine1,loadProp.getProperty("address"));

    //type postal code
    typeText(_postalCode,loadProp.getProperty("postcode"));

    //type phone number
    typeText(_phoneNumber,loadProp.getProperty("phone_no"));

    //click on continue
    clickOnElement(_continueButton);

}
public void verifyCheckoutBillingPage(){
    Assert.assertEquals(getCurrentURL(),loadProp.getProperty("checkout_BillingPage_URL"));
}
}
