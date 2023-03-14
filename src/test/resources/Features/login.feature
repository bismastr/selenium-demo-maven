Feature: Login

  Scenario: Login is succesful with valid credential
    Given user is on login page
    When user enter <username> and <password>
    And user click login button
    Then verify user redirected to homepage