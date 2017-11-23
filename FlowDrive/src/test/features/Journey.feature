
Feature: As a user
         I should track my journey

Background: Logged in user

@Journeys
Scenario: validate breakdown emergency  option

Given I'm on home screen
When I click emergency button
And I click breakdown option in the popup
And I click CALL NOW button
Then I should be able to get a pop up with a validation message


@Journeys
Scenario: validate Accident emergency option

Given I'm on home screen
When I click accident button
And I click breakdown option in the popup
And I click CALL NOW button
Then I should be able to get a pop up with a validation message


@Journeys
Scenario: validate Past Journey data

Given I'm on home screen
When I choose journeys option
Then I should see recorded data


@Journeys
Scenario: Validate Past Journey data after consecutive installations

Given I'm on Journeys screen
When I get the existing record
And I unistall the app
And I re-install the app
And I provide the valid username
And I provide the valid password
And I navigate to the journeys screen
Then I should see the previously recorded data

