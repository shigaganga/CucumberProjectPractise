Feature: Login into tekarch application
Scenario: user should login with valid usename and valid password
Given user is on tekarch application
When user enter valid username and valid password
And user enter the valid password
Then click on login button
Then click home