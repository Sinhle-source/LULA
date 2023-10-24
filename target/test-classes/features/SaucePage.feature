@sauce
Feature: Lula Practical Test

  Background:
    Given User on login page

  Scenario Outline: Test Case 1, Test Case 2, Test Case 3

   # Then Verify that Username and Password text displays
  #  Then Confirm the Login button has the correct css value
    When user enter incorrect username and password
    Then User clicks the login button
    #4_4.1
    Then Confirm that the error message displays when login button is clicked <error_mesage>
    #4_4.2
    Then Users can click the X icon on the error message to make it disappear

    Examples:
      | error_mesage                                                              |
      | Epic sadface: Username and password do not match any user in this service |

  Scenario: Test Case 4, Test Case 5, Test Case 6, Test Case 7, Test Case 8 and Test Case 9

    When user enter username and password
    Then User clicks the login button
    Then User verify the landing page name
    Then Select the product sorting icon and select the option Price low to high
    Then Add the item Sauce Labs Backpack to your cart
    Then Confirm that the notification badge displays on the shopping cart icon.
    Then Click the hamburger bar and logout



  Scenario Outline: Test Case 10, Test Case 11 and Test Case 12

    When user enter username and password
    Then User clicks the login button
    Then confirm that the item Sauce Labs Backpack has the remove button displaying
    Then Confirm that clicking the remove button will remove the item from the basket
   Then Go buy the Sauce Lab Onesie and add validations on the payment information and confirm the order is <SauceCard> and <firstname> and <lastname> and <postalCode>
    Then Green tick icon displays
    Then Your order has been dispatched <dispatchMessage>
    Then Back Home button is active and user can click on it

    Examples:
      | SauceCard | firstname | lastname | postalCode | dispatchMessage                                                                         |
      | 31337     | testtest  | test     | 1739       |Your order has been dispatched, and will arrive just as fast as the pony can get there! |
