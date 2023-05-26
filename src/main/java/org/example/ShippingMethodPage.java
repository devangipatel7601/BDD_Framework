package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShippingMethodPage extends Utils{
    String expectedOrderConfirmationMessage = "Your order has been successfully processed!";
    private By _nextDayAir = By.cssSelector("input#shippingoption_1");
    private By _continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditCard = By.cssSelector("input#paymentmethod_1");
    private By _continueButtonCrdCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private By _visa = By.cssSelector("select.dropdownlists");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardType = By.id("CreditCardType");
    private By _cardNumber = By.cssSelector("input#CardNumber");
    private By _expireMonth = By.cssSelector("select#ExpireMonth");
    private By _expireYear = By.cssSelector("select#ExpireYear");
    private By _cardCode = By.cssSelector("input#CardCode");
    private By _continueButton3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _confirmButton = By.xpath("//button[text()='Confirm']");
    private By _orderSuccessfullyMessage = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    private By _orderNumber = By.xpath("//div[@class='order-number']");
    LoadProp loadProp = new LoadProp();
    public void clickOnShippingMethod(){

        //click on next day air radio button
        clickOnElement(_nextDayAir);

        //click on continue button
        clickOnElement(_continueButton);

        //click on credit card radio button
        clickOnElement(_creditCard);

        //click on continue button
        clickOnElement(_continueButtonCrdCard);



    }
    public void paymentMethod(){

        //select visa card type
        selectElementByValue(_cardType, loadProp.getProperty("card_Type"));

        //type cardholder name
        typeText(_cardHolderName, loadProp.getProperty("cardHolder_Name"));

        //type card number
        typeText(_cardNumber, loadProp.getProperty("card_Number"));

        //select expiry month
        selectElementByText(_expireMonth,loadProp.getProperty("card_Expiry_Month"));

        //select expiry year
        selectElementByText(_expireYear, loadProp.getProperty("card_Expiry_Year"));

        //type card code
        typeText(_cardCode, loadProp.getProperty("card_Security_Code"));

        //click on continue
        clickOnElement(_continueButton3);


    }
    public void confirmOrder(){

        //click on confirm button
        clickOnElement(_confirmButton);
    }
    public void verifyConfirmOrderDetails(){

        //verify and assert order is successful message
        String orderSuccessfullyMessage = getTextFromElement(_orderSuccessfullyMessage);
        System.out.println("Order Details: " +orderSuccessfullyMessage);
        //print order no.
        String orderNumber = getTextFromElement(_orderNumber);
        System.out.println(orderNumber);
        Assert.assertEquals(orderSuccessfullyMessage,loadProp.getProperty("expectedOrderConfirmationMessage"));


    }
    public void verifyShippingMethodPage(){
        Assert.assertEquals(getCurrentURL(), loadProp.getProperty("shipping_Method_Page_URL2"));
    }
    public void verifyPaymentMethodPage(){
        Assert.assertEquals(getCurrentURL(),loadProp.getProperty("payment_Method_Page_URL"));
    }
}
