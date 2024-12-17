Feature: Home page functionality
Scenario: verify title of page
Given user is at landing page
Then page title should contains "Shopping"

Scenario: verify cart icon
Given user is at landing page
Then cart icon should get displayed

Scenario: checkout deals section
Given user is at landing page
When user clicks on deals
Then user should redirects to helmets deal section