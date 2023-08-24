Feature: verify login module


  Scenario Outline: Verify login functionality
    Given I am on the home page
    When Entered the login credentials username as<Username> and password as<password>
    Then I should be redirected to Dashboard
    Examples:
      |    Username                     | password                   |
      |    test | Test  |