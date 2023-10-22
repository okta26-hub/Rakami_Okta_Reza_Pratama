Feature: Login to the Sauce Demo Website

  Scenario: Negative Login
    Given I Am on the Sauce Demo homepage
    When I Enter the username "standard_user"
    And I Enter the password "locked_out_user"
    And I Click the Login button
    Then I Should see an error message
