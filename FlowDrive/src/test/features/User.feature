
Feature: As a user
         I should register and access the app

@User
Scenario: Validate user registration

Given I launch app
When I click Signup
And I provide data

| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Date Of Birth          | 22/05/1990          |
| Company                | ABX                 |
| Postcode               | H34 5ct             |
| Password               | Password1           |
| Confirm Password       | Password1           |

Then I should register
And gets redirected to login page


@User
Scenario: Validate login

Given I'm in login screen
And I provide the valid username
And I provide the valid password
Then I should login
And I gets redirected to home screen

@User
Scenario: validate user profile

Given I'm on home screen
When I click social tab
And I provide name
And I click next
And I enter description
And I click done
Then I should've created my profile
