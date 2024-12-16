Feature: Login functionality
Scenario: login to application
Given I am at login page
When I enter username
And I enter password
And I click on login button
Then I should get logged into application

Scenario: verify title of page
Given I am at login page
Then I should verify title of page