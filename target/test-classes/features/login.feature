Feature: Login Functionality

  @Login
  Scenario Outline: To verify the successful template
    Given User launches valid URL
    When  User enters valid "<UserId>" and "<Password>"
    Then  user should be able to navigate to the homepage
Examples:
    |UserId|                      |Password|
    |vijay.minimalist@gmail.com| |Asdx#1234|