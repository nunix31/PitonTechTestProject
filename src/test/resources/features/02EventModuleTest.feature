@02EventModuleTest
Feature: Perform enough assertion to ensure below modules pass the specified test cases.

  @EventModule_TC001
  Scenario: User should view create event form if click the Create Event button on dashboard.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User views create event form when clicks the create event button on dashboard.

  @EventModule_TC002
  Scenario: User should view validation errors if click the Create Event buttonwithout fill the event form.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User clicks the Create New Event button.
    And User views validation error of event name.
    And User views validation error of valid date.
    And User views validation error of participant first name.
    And User views validation error of participant last name.
    And User views validation error of email or phone number.

  @EventModule_TC003
  Scenario: User should be able to add new participant when click the Add Participant button.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User verifies able to add new participant when click the add participant button.

  @EventModule_TC004
  Scenario: User should view error message if removes all participants.
    Given User goes to pitonTest url address.
    And User enters the user name information.
    And User enters the password information.
    And User clicks the login button.
    And User clicks the Create Event button.
    And User clicks the delete button.
    And User views error message when removes all participants.

  @EventModule_TC005
  Scenario: User should be able to create new event if fills all required fields and redirect to dashboard page with create successful message.
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
    And User verifies the successful message.

  @EventModule_TC006
  Scenario: User should be able to edit event. When user click the edit button all event fields must be filled according to editing event.
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
    And User waits 2 seconds.
    And User edits all event fields.
    And User waits 3 seconds.

  @EventModule_TC007
  Scenario: User should be able to update event if required fields filled and redirect to dashboard page with update successful message.
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
    And User waits 2 seconds.
    And User edits all event fields.
    And User waits 3 seconds.
    And User verifies the Event updated succesfully alert.