package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ProductPage productPage = new ProductPage();
    LogInPage logInPage = new LogInPage();
    ShoppingcartPage shoppingcartPage = new ShoppingcartPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    CheckoutBillingPage checkoutBillingPage = new CheckoutBillingPage();
    CheckingOutAsGuestPage checkingOutAsGuestPage = new CheckingOutAsGuestPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.enterRegistrationDetails_forNewRegistration();

    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {

        registrationResultPage.verifyUserRegisteredSuccessfully();
    }
    @Given("I am a registered user")
    public void i_am_a_registered_user() {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails_ForAlreadyRegisteredUser();

    }
    @Given("I Log in into my account")
    public void i_log_in_into_my_account() {
        homePage.clickOnLoginButton();
        logInPage.fillInLoginDetails();


    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        homePage.verifyHomePage();


    }
    @When("I click on Build your own computer")
    public void i_click_on_build_your_own_computer() {
        homePage.clickOnBuildYourOwnComputer();

    }
    @When("I am on product page")
    public void i_am_on_product_page() {
        productPage.verifyProductPage();


    }
    @When("I click on Email a friend button")
    public void i_click_on_email_a_friend_button() {
        productPage.emailAFriend_BuildYourOwnComputer();


    }
    @Then("Email a friend page should appear")
    public void email_a_friend_page_should_appear() {
        productPage.verifyEmailAFriendPage();

    }
    @Then("I enter required Email a friend details")
    public void i_enter_required_email_a_friend_details() {
        productPage.fillInEmailAFriendDetails();

    }
    @Then("I click on send email button")
    public void i_click_on_send_email_button() {
        productPage.clickOnSendEmailButton();

    }
    @Then("{string} should be seen successfully.")
    public void should_be_seen_successfully(String string) {
        productPage.sendEmailSuccessMessage();

    }

    @Given("i am on homepage of https:\\/\\/demo.nopcommerce.com\\/")
    public void iAmOnHomepageOfHttpsDemoNopcommerceCom() {
        homePage.verifyHomePage();
    }

    @When("I click on {string}button")
    public void iClickOnButton(String button_name) {

        homePage.clickOnCategory(button_name);
    }

    @Then("I should be able to verify I am navigated to related page {string} successfully")
    public void iShouldBeAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {

        homePage.verifyURL(page_url);
    }

    @And("I should be able to verify the page title as {string} successfully")
    public void iShouldBeAbleToVerifyThePageTitleAsSuccessfully(String page_title) {
        homePage.verifyPageTitle(page_title);
    }

    @Given("I am on DemonopCommerce homepage")
    public void iAmOnDemonopCommerceHomepage() {
    }

    @When("I hover over {string} category link")
    public void iHoverOverCategoryLink(String categoryName) {
        homePage.hoverOverCategoryNames(categoryName);
    }

    @Then("I should be able to verify after hover changes color of category")
    public void iShouldBeAbleToVerifyAfterHoverChangesColorOfCategory(String subcategory) {
        homePage.hoverOverSubCategory(subcategory);
    }

    @When("I click on {string} subcategory")
    public void iClickOnSubcategory(String subcategory) {
        homePage.clickOnNotebooksSubCategory(subcategory);
    }

    @Then("I should able to navigated to {string} page successfully")
    public void iShouldAbleToNavigatedToPageSuccessfully(String page) {
        homePage.verifysubCategoryPage(page);
    }


    @When("I click on Build your own computer image")
    public void i_click_on_build_your_own_computer_image() {
        homePage.clickOnBuildYourOwnComputer();

    }
    @Then("I should able to navigate to related product page")
    public void i_should_able_to_navigate_to_related_product_page() {
        productPage.verifyProductPage();

    }
    @When("I select all the required configuration")
    public void i_select_all_the_required_configuration() {
        productPage.buildYourOwnComputer();
    }
    @When("click on  ADD TO CART button")
    public void click_on_add_to_cart_button() {

    }
    @When("click on Shopping cart button on green bar")
    public void click_on_shopping_cart_button_on_green_bar() {

    }
    @Then("I should able to navigate to shopping cart page")
    public void i_should_able_to_navigate_to_shopping_cart_page() {
        shoppingcartPage.verifyShoppingCartPage();



    }
    @Then("I should able to verify desired product with desired configuration in shopping cart")
    public void i_should_able_to_verify_desired_product_with_desired_configuration_in_shopping_cart() {
        shoppingcartPage.verifyDetailsOfBuildYourOwnComputer();
    }
    @When("I click on checkbox of Terms And Conditions")
    public void i_click_on_checkbox_of_terms_and_conditions() {

    }
    @When("I click on CHECKOUT button")
    public void i_click_on_checkout_button() {


    }
    @Then("I should able to navigate to checkout as guest and returning customer login page")
    public void i_should_able_to_navigate_to_checkout_as_guest_and_returning_customer_login_page() {
        checkingOutAsGuestPage.verifyCheckOutAsGuestPage();


    }
    @When("I click on CHECKOUT AS GUEST button")
    public void i_click_on_checkout_as_guest_button() {
        checkingOutAsGuestPage.clickOnCheckoutAsAGuest();

    }
    @Then("I should able to navigate to checkout billing page")
    public void i_should_able_to_navigate_to_checkout_billing_page() {
        checkoutBillingPage.verifyCheckoutBillingPage();

    }
    @When("I fill in all the required details of billing address")
    public void i_fill_in_all_the_required_details_of_billing_address() {
        checkoutBillingPage.fillInCheckoutBillingDetails();

    }
    @When("click on CONTINUE button")
    public void click_on_continue_button() {

    }
    @Then("I should be able to navigate to shipping method page")
    public void i_should_be_able_to_navigate_to_shipping_method_page() {
        shippingMethodPage.verifyShippingMethodPage();

    }
    @When("I click on Next Day Air\\(${double}) radio button")
    public void i_click_on_next_day_air_$_radio_button(Double double1) {
        shippingMethodPage.clickOnShippingMethod();

    }
    @When("click CONTINUE button")
    public void click_continue_button() {

    }
    @Then("I should be navigate to payment method page")
    public void i_should_be_navigate_to_payment_method_page() {
        shippingMethodPage.verifyPaymentMethodPage();

    }
    @When("I click on Credit Card radio button")
    public void i_click_on_credit_card_radio_button() {


    }
    @When("I fill in cerdit card details")
    public void i_fill_in_cerdit_card_details() {
        shippingMethodPage.paymentMethod();



    }
    @When("click on CONFIRM button")
    public void click_on_confirm_button() {


    }
    @Then("I should be able to see {string} message and Order no. successfully")
    public void i_should_be_able_to_see_message_and_order_no_successfully(String string) {
        shippingMethodPage.confirmOrder();
        shippingMethodPage.verifyConfirmOrderDetails();
      


}
}


