@vwoapplication
Feature: vwo Application Feature

  Background: 
    Given User has launched applicaton 'Login' dashboard

  Scenario Outline: Validate the valid and invalid function of vwo application
    When user enter valid 'username'
    When user enter valid 'password'
    And user click on sign button
    Then user should succesfull login to application

    Examples: 
      | username                 | password  |
      | dorababuch5424@gmail.com | Dora@1995 |

     