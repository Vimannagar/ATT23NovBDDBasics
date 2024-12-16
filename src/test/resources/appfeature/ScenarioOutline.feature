Feature: Signup functionality
Background:
Given user is at login
When user perform login
Then home page should get displayed

Scenario Outline: signup to application
Given user is at signup page
When user enters name as "<name>" over form
And user select gender as "<gender>"
And user select the slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber |
| Eder | Male | 1 |
| Ron | Male | 2 |
| Diana | Female | 3 |
| Alex | Male | 4 |

