Feature: Login with data functionality
Scenario: Login with valid credentials
Given user should be at loginpage
When user enters username as 22.56
And user enters password as "Test@1234"
And user click on submit 1 button
Then user should get logged into app