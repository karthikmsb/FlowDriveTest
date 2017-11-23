Feature: As a user
         I should use app without interruptions
         And the app should also not interrupt to general activities.

Background: Logged in user

@General
Scenario: validate orientaion

Given I'm on home screen
When I rotate my phone to landscape mode
Then I shouldn't be able to use app in the landscape mode

