Feature: Create Account on Conduit
  As automation tester
  I want to create a account
  in Conduit page

  Scenario: Create Account
    Given 'juan' wants to navigate to Conduit page "https://angular.realworld.io/"
    When creates an account with username "QvisionTest" and email "test111121@gmail.com" and password "123456789"
    Then validates the text "QvisionTest"
