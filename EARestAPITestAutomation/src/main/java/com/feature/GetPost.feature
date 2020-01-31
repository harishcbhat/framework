Feature: Verify different GET operation

Scenario: Verify one author of the post
Given I perform GET operation for "/post"
And I perform GET for post number "1"
Then I should see author name as "Harish B"