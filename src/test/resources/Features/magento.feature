Feature: Website magento normal checkout
  Scenario: As a registered customer, I want to purchase 2 mens top and 1 mens bottom successfully
    Given User open web URL "https://magento.softwaretestingboard.com"
    And User click sign in hyperlink text
    And User Input email "argavikoto76@gmail.com" and password "Argavikoto76"
    And User click sign in button
    And User click Mens dropdown
    And User click Jackets hyperlink text on Top section
    And User click Proteus Fitness Jackshirt section
    And User click XS size and color black
    And User change the qty
    And User click Add to chart button
    And User click Mens dropdown
    And User click Pants hyperlink text on Bottoms section
    And User click Cronus Yoga Pant section
    And User click size and color black
    And User click Add to chart button
    And User click Cart icon
    And User click proceed to checkout button
    And User click order summary dropdown
    And User verify product and price jackets on order summary section
    And User verify product and price pants on order summary section
    And User click next button
    And User click Place Order button
    And User click automation tester dropdown
    And User click My Account hyperlink text
    And User click My Order hyperlink text
    When User click the latest View Order hyperlink text
    Then User could verify product and price on items ordered section
