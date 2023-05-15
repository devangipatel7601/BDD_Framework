package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.cssSelector("input#FirstName");
    private By _lastName = By.cssSelector("input#LastName");
    private By _dateOFBirth = By.xpath("//select[contains(@name,'DateOfBirthDay')]");
    private By _monthOFBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.xpath("//select[contains(@name,'DateOfBirthYear')]");
    private By _emailId = By.cssSelector("input#Email");
    private By _password = By.cssSelector("input#Password");
    private By _confirmPassword = By.cssSelector("input#ConfirmPassword");
    private By _registerButton = By.cssSelector("button#register-button");

    public void enterRegistrationDetails_forNewRegistration(){

        //type first name
        typeText(_firstName,loadProp.getProperty("firstName"));

        //type last name
        typeText(_lastName,loadProp.getProperty("lastName"));

        //select DOB from dropdown
        selectElementByText(_dateOFBirth,loadProp.getProperty("date_Of_Birth"));

        //select month of year
        selectElementByValue(_monthOFBirth,loadProp.getProperty("month_Of_Birth"));

        //select year of birth
        selectElementByValue(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));

        //type email
        typeText(_emailId,loadProp.getProperty("email")+timeStamp()+loadProp.getProperty("email_Domain"));

        //type password
        typeText(_password,loadProp.getProperty("password"));

        //confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirm_Password"));

        //click on register button
        clickOnElement(_registerButton);

    }
    public void enterRegistrationDetails_ForAlreadyRegisteredUser(){
        //type first name
        typeText(_firstName,loadProp.getProperty("firstName"));

        //type last name
        typeText(_lastName,loadProp.getProperty("lastName"));

        //select DOB from dropdown
        selectElementByText(_dateOFBirth,loadProp.getProperty("date_Of_Birth"));

        //select month of year
        selectElementByValue(_monthOFBirth,loadProp.getProperty("month_Of_Birth"));

        //select year of birth
        selectElementByValue(_yearOfBirth,loadProp.getProperty("year_Of_Birth"));

        //type email
        typeText(_emailId,loadProp.getProperty("email")+loadProp.getProperty("email_Domain"));

        //type password
        typeText(_password,loadProp.getProperty("password"));

        //confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirm_Password"));

        //click on register button
        clickOnElement(_registerButton);

    }

}
