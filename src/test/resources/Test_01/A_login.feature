Feature: User login credentioal regression test

  Scenario: Unsuccessful Login with Invalid Username and Valid Password
    Given User is on login page
    When User enter Password " 1215"
    And User Click LogIn button
    Then User check login alert "Please enter valid email address"
