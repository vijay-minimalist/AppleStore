Feature: Adding Products to the cart

  @ProductFinder
  Scenario Outline: To verify user is able to add products to the cart
    Given User click on the "<Product>"
    When  User enters valid "<Model>"
    Then  User click on Buy button to add the product to cart
    Examples:
      |Product| |Model|
      |mac| |MacBook Air|
      
