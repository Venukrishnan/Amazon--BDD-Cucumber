Feature: Amazon PLP test

@Chrome
Scenario: Amazon product search scenario
Given User is on the Amazon home page
When User search for a product
Then Product List page is displayed
And Select product from PLP
Then User choose product quantity
And Add to basket
Then Proceed to basket
And Verify product details
Then Close the browser