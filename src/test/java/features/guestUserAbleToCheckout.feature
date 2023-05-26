Feature: Guest user able to checkout
  Background:
    Given I am on DemonopCommerce homepage
  @guest_User_Checkout @all
  Scenario: As a guest user I should be able to checkout successfully with desired product
    When I click on Build your own computer image
    Then I should able to navigate to related product page
    When I select all the required configuration
    And click on  ADD TO CART button
    And click on Shopping cart button on green bar
    Then I should able to navigate to shopping cart page
    And I should able to verify desired product with desired configuration in shopping cart
    When I click on checkbox of Terms And Conditions
    And I click on CHECKOUT button
    Then I should able to navigate to checkout as guest and returning customer login page
    When I click on CHECKOUT AS GUEST button
    Then I should able to navigate to checkout billing page
    When I fill in all the required details of billing address
    And click on CONTINUE button
    Then I should be able to navigate to shipping method page
    When I click on Next Day Air($0.00) radio button
    And click CONTINUE button
    Then I should be navigate to payment method page
    When I click on Credit Card radio button
    And click on CONTINUE button
    And I fill in cerdit card details
    And click on CONTINUE button
    And click on CONFIRM button
    Then I should be able to see "Your order has been successfully processed!" message and Order no. successfully


