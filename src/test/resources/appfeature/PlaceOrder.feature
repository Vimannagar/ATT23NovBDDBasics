Feature: Place order functionality
Scenario: Order confirmation validation
Given I should be at the product page
When I click on add to cart button
Then Product should get added
When I click on place order button
Then order should get placed

Scenario: Verify the order id
Given I should be at the product page
Then I verify the id available