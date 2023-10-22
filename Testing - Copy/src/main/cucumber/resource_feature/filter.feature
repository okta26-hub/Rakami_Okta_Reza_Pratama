Feature: Filter Products on Sauce Demo Website

  Scenario: Filter Products
    Given I go homepage
    When I Log in with username "visual_user" and password "secret_sauce"
    And I filter products by "Name (A to Z)"
    And I filter products by "Name (Z to A)"
    And I filter products by "Price (low to high)"
    And I filter products by "Price (high to low)"
    Then I should see the filtered products

