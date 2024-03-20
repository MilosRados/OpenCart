Feature: Login Functionality for Open E Commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account


  Background:
    Given I am on the OpenCart login page


    Scenario: Successful login with valid credentials
      Given I am click on the My Account dropdown
      Given I have clicked on Login
      When I enter email address
      And password
      Then I click on the Login button
