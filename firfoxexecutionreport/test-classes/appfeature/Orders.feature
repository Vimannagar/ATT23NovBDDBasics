Feature: Order information
Background:
Given user should be logged into app
When user clicks on order button
Then user redirects to orders page

Scenario: Fetching currently placed order
When user clicks on currently placed order
Then user should see current order information

Scenario: Fetching past order information
When user clicks on past order
Then user should see past order information

Scenario: Fetching cancelled order information
When user clicks on cancelled order
Then user should see cancelled order information