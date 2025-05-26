Feature: Opening bank account
Scenario: Registration with nominee
Given user should be at registration page
When user enters data in following format
| firstname | lastname | email | mobile |
| Eder | Smith | eder.smith@gmail.com | 9876543210 |
| Ron | Dutta | ron.dutta@gmail.com | 9988776655 |
And click on submit button
Then account should get created