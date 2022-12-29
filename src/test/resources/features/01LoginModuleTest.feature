@01LoginModuleTest
Feature: Perform enough assertion to ensure below modules pass the specified test cases.

  @LoginModule_TC001
  Scenario: User should see login form if not authenticated. Login Form should contain username password and login button.
    Given User goes to pitonTest url address.
    And User verifies the login form.
    And User verifies username button.
    And User verifies password button.
    And User verifies login button.

  @LoginModule_TC002
  Scenario: User should see validation errors if click the login button without fill the login form.
    Given User goes to pitonTest url address.
    And User clicks the login button.
    And User sees the username error if click the login button without fill the login form.
    And User sees the password error if click the login button without fill the login form.

  @LoginModule_TC003
  Scenario: User should navigate to the dashboard and see welcome message if authenticate successfully.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User navigates to the dashboard and sees the welcome message.










