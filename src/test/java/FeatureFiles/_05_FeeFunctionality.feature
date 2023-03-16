Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Create A Fee
    Given Navigate to Fee Page
    And Click on add button
    And Fill the add fee form
    When Click on save button
    Then Success message should be displayed

