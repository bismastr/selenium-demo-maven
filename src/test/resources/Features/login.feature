Feature: Login

  Scenario: Login is successful with valid credential
    Given user is on login page
    When user enter bisma@mail.com and 123
    And user click login button