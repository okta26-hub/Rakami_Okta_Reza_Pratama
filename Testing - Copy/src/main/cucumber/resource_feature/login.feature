Feature: Login to the Sauce Demo Website

  Scenario: Positive Login Test
    Given I am on the Sauce Demo homepage
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click the Login button
    Then I should be redirected to the "https://www.saucedemo.com/inventory.html" page
