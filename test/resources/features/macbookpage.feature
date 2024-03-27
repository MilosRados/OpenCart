Feature: MacBook product page

  As a user I want to buy MacBook

  Background:
    Given I'm on the offers Mac page
  @smokemac
  Scenario: Open Macbook page and add it to cart

    When I am click on the MacBook to go on Macbook product page

    Then I click on the MacBook image to see product

    And I click 5 times on right arrow to see all images of the product

    Then I click 5 times on left arrow

    And I click on the close button to close image window

    Then Enter number of products in Qty input field

    And I am click on Add to cart button

    When I am clicking on the Reviews tab

    Then I write my name in Your Name field

    And I write my review in Your Review field

    Then I click on the Rating radio button

    And I click on the Continue button