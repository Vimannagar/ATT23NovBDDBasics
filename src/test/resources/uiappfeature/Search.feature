Feature: Search functionality
Scenario: search on homepage
Given user is at landing page
When user searches for "mobile" in text box
Then mobile search results should displayed