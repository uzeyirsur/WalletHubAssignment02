Feature: Write a review on WalletHub

  Scenario: Write a review and verify it on the profile
    Given the user is on the WalletHub Test Insurance Company page
    When the user hovers over the fourth star in the reviews section
#   Then the 4 stars get lit up when the user hover over them
    When the user clicks on the fourth star
#  And the user selects "Health Insurance" from the Policy dropdown
    And the user enters a "random text" with a minimum of 200 characters in write your review box
    And the user submits the review
    Then the user should see a confirmation screen with the message "Your review has been posted." in their profile page
    And the user navigates to Test Insurance Company Page
    And the user should see the review in Test Insurance Company Page
