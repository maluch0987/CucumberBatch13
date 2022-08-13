Feature:Login feature

  Scenario: Valid admin login
    Given user is navigate to HRMS application
    When user enters valid admin username and password
    And user click on login button
    Then admin user is successful logged in