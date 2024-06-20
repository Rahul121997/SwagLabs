Feature: Login Feature
         In-order to perform user login,so need to enter username and password

  Scenario Outline: Login to SwagLabs with Valid Creds
    Given User should land on SwagLabs Page
    Then Validate User Landed Page <"URL">
    |URL|
    |https://www.saucedemo.com/v1/|
    When User Enters valid <"Username">
    And User Enter valid <"Password">
    And Click On LoginButton
    Then Validate the User login

    Examples:
    | Username | Password |
    | standard_user | secret_sauce |
    | standard_user | WrongPassword |