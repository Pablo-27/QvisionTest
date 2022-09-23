Feature: Create Account on Conduit
  As automation tester
  I want to create a account
  in Conduit page

  Scenario: Login Conduit
    Given 'juan' wants to navigate to Conduit page "https://angular.realworld.io/"
    When he enter the email "test111121@gmail.com" and password "123456789"
    Then validates teh text "QvisionTest1"