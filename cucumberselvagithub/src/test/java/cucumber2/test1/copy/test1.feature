Feature: Test Calculator
 THis file describes calculator functionality
 
 Scenario: Add two numbers
 
 Given I enter 50 in this calculator
 And I press add
 And I have entered 50 in this calculator
 When I press equal symbol
 Then The result should be 100 on the screen
 
  Scenario: sub two numbers
 
 Given I enter 40 in this calculator
 And I press sub
 And I have entered 30 in this calculator
 When I press equal symbol
 Then The result should be 10 on the screen
 