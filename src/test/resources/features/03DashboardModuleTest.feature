@03DashboardModuleTest
Feature: Perform enough assertion to ensure below modules pass the specified test cases.

  @DashboardModule_TC001
  Scenario: User should view dashboard if authenticated
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And Authenticated user verifies dashboard.

  @DashboardModule_TC002
  Scenario: User should redirect to login page if not authenticated.
    Given User goes to pitonTest url address.
    And Not authenticated user goes to pitonTest for redirects to login page.
    And User verifies that they are redirected to the login page.

  @DashboardModule_TC003
  Scenario: – User should view list of events if any event created otherwise user should view notification message states no registered event found.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User enters a event name in event name box.
    And User enters a event description in event description box.
    And User enters a event date in event date box.
    And User enters a first name in first name box.
    And User enters a last name in last name box.
    And User enters a phone number in contact box.
    And User clicks the Create New Event button.
    And User verifies list of created events.
    And User waits 3 seconds.
    And User deletes the event.
    And User waits 3 seconds.
    And User verifies no registered event has been found alert.

  @DashboardModule_TC004
  Scenario: – User should be able navigate edit event when click the edit event button.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User enters a event name in event name box.
    And User enters a event description in event description box.
    And User enters a event date in event date box.
    And User enters a first name in first name box.
    And User enters a last name in last name box.
    And User enters a phone number in contact box.
    And User clicks the Create New Event button.
    And User clicks the Edit Event button.
    And User navigates in edit event page.

  @DashboardModule_TC005
  Scenario: – User should be able to delete event when click the delete button.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User enters a event name in event name box.
    And User enters a event description in event description box.
    And User enters a event date in event date box.
    And User enters a first name in first name box.
    And User enters a last name in last name box.
    And User enters a phone number in contact box.
    And User clicks the Create New Event button.
    And User waits 3 seconds.
    And User clicks the delete event button.
    And User waits 3 seconds.

  @DashboardModule_TC006
  Scenario: User should be able to view event participants.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User enters a event name in event name box.
    And User enters a event description in event description box.
    And User enters a event date in event date box.
    And User enters a first name in first name box.
    And User enters a last name in last name box.
    And User enters a phone number in contact box.
    And User clicks the Create New Event button.
    And User views event participants.
    And User waits 3 seconds.