Feature: Veepee FR Login page testing

  Background:
    When User is on the Home Page


  @FunctionalTesta
  Scenario: To verify that user can login with valid credentials and logout


    When User clicks on login button
    And User pass login credentials username as "saifsh12786@gmail.com" and password as "SAffin@123." for "valid" login
    Then user logs out of the application

  @FunctionalTesta
  Scenario Outline: To verify that user cannot login with Invalid credentials

    When User clicks on login button
    And User pass login credentials username as "<EmailId>" and password as "<password>" for "invalidlogin" login

    Examples:
      | EmailId                     | password |
      | testingpurposesel@gmail.com | asas     |
      | testingpurpose@gmail.com    | eqw      |



  @FunctionalTest
  Scenario: To verify that user can not login with Blank Email address

    When User clicks on login button
    And User pass login credentials username as "" and password as "SAffin@123." for "invalidlogin" login

  @FunctionalTest
  Scenario: To verify that user can not login with Blank Password

    When User clicks on login button
    And User pass login credentials username as "saifsh12786@gmail.com" and password as "" for "invalidlogin" login
