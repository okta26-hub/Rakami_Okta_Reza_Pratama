Feature: Add Products to Cart and Complete Checkout on Sauce Demo Website

  Scenario: Add Products to Cart and Complete Checkout
    Given I opened the homepage of the website
    When I log in with username "standard_user" and password "secret_sauce"
    And I add the "Sauce Labs Backpack" to the cart
    And I proceed to the shopping cart
    And I proceed to checkout
    And I enter the first name "okta"
    And I enter the last name "reza"
    And I enter the postal code "1600"
    And I continue the checkout
    And I finish the checkout
    Then I should see the confirmation page
