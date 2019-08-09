Feature: Write Review for Health Insurance

  Scenario Outline: User should be able to navigate to the Wallet Hub profile, write a review for Health Insurance and validate it
    Given User opens the browser
    When User navigates to the URL for Wallet Hub
    And User should be able to hover and click on the fifth rating star
    Then User should be abe to select the insurance type "<Insurance>" and write a review "<Review>" for the company
    And User should be able to click on the Submit button
    When User is on the login page
    Then User should be able to provide the username "<Username>" and password "<Password>" to login
    And User should be able to verify the review "<Review>" is posted

    Examples: 
      | Insurance        | Review                                                                                                                                                                                                                      | Username               | Password  |
      | Health Insurance | this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review | namrata.juhi@gmail.com | Pass@1234 |
