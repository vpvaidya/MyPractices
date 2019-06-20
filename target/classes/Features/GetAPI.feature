Feature: To Verify All the Get opreations 
Scenario: To validate the one post author
    Given I want to perform get opreation for "/post"
    Then I should the see the author name as"Carlo"