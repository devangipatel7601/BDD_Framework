package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _enterPersonalMessage = By.xpath("//textarea[contains(@name,'PersonalMessage')]");
    private By _sendEmailButton = By.xpath("//button[text()='Send email']");
    private By _sendEmailMessage = By.xpath("//div[@class='result']");
    private By _enterYourEmailId = By.id("YourEmailAddress");
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    private By _processor = By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _os = By.cssSelector("input#product_attribute_4_9");
    private By _checkBox1 = By.cssSelector("input#product_attribute_5_10");
    private By _checkBox2 = By.cssSelector("input#product_attribute_5_11");
    private By _checkBox3 = By.cssSelector("input#product_attribute_5_12");
    private By _addToCart = By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCart = By.xpath("//a[text()='shopping cart']");

    public void emailAFriend_BuildYourOwnComputer() {
        //click on email friend button
        clickOnElement(_emailAFriendButton);
    }
    public void fillInEmailAFriendDetails() {

        //type friend's email
        typeText(_enterFriendEmail, loadProp.getProperty("friend_Email") + loadProp.getProperty("email_Domain"));

        //type personal message
        typeText(_enterPersonalMessage, loadProp.getProperty("personal_Message"));
    }
    public void clickOnSendEmailButton() {

        //click on Send Email button
        clickOnElement(_sendEmailButton);
    }
    public void sendEmailSuccessMessage(){

        String actualmessage = getTextFromElement(_sendEmailMessage);

        //to print sent message
        System.out.println("my message: " +actualmessage);

        Assert.assertEquals(actualmessage,loadProp.getProperty("sent_Email_Message"));


    }
    public void verifyProductPage(){
        String productpageURL = getCurrentURL();

        Assert.assertEquals(productpageURL,loadProp.getProperty("productpage_URL"));
    }
    public void verifyEmailAFriendPage(){
        String emailAFriendPageURL=getCurrentURL();

        Assert.assertEquals(emailAFriendPageURL,loadProp.getProperty("emailAFriendPage_URL"));

    }
    public void buildYourOwnComputer(){
        //select 2.2 GHz processor
        selectElementByValue(_processor,loadProp.getProperty("processor"));

        //select 8GB RAM
        selectElementByValue(_ram,loadProp.getProperty("ram"));

        //click on 320 GB HDD radio button
        clickOnElement(_hdd);

        //click on vista premium OS radio button
        clickOnElement(_os);

        //uncheck on checkbox 1
        clickOnElement(_checkBox1);

        //click on all checkboxes
        clickOnElement(_checkBox1);
        clickOnElement(_checkBox2);
        clickOnElement(_checkBox3);

        //click on add to cart
        clickOnElement(_addToCart);

        //click on shopping cart on green bar
        clickOnElement(_shoppingCart);

    }
}
