Feature: verify Dashboard functionalities

  Background: user is on dashboard page
    Given perform valid login

@regression
  Scenario: Open add income
    Given verify that add transaction button is visible
    Then click on add transaction button
    And verify that addincome is visible
    Then click at add income button 

    