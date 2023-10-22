Feature: Adding and Removing Items from the Shopping Cart on Sauce Demo

  Scenario: Add and Remove Items from the Shopping Cart
    Given I opened the website page
    When I log in with user_name "standard_user" and password "secret_sauce"
    And I add item_one the "item_one" to the cart
    And I add item_two the "item_two" to the cart
    And I add item_tree  the "item_three" to the cart
    And I add item_four  "item_four" to the cart
    And I add item_five  "item_five" to the cart
    And I add item_six "item_six" to the cart
    And I go to the shopping cart
    And I remove_one the "item_one" from the cart
    And I remove_two the "item_two" from the cart
    And I remove_tree the "item_three" from the cart
    And I remove_four the "item_four" from the cart
    And I remove_five the "item_five" from the cart
    And I remove_six the "item_six" from the cart
    Then I should see an empty shopping cart
