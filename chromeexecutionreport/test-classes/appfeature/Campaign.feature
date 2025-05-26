@campaign
Feature: Send campaign functionality
@sanity
Scenario: Create campaign
Given user is at campaigns page
When user click on create campaign button
And user click on save button
Then campaign should get created

@regression
Scenario: Schedule a campaign
Given user is at campaigns page
When user click on edit camapaign
And user enters the time
Then campaign should get scheduled

@functional @regression
Scenario: Send campaign
Given user is at campaigns page
When user click on send campaign
Then campaign should get sent to contacts