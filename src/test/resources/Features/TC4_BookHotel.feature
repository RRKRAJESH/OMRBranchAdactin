@BookHotel
Feature: Verifying the Book Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verifying the Book Hotel by passing all fields
    When User should perform login "<userName>","<password>"
    And User should search the respective hotel details "<location>","<hotels>","<roomType>","<noOfRoom>","<inDate>","<outDate>","<adult>" and "<child>"
    Then User should verify the success message after search "Select Hotel"
    And User should select the Hotel name
    Then User should verify the success message after click the continue "Book A Hotel"
    And User should enter the "<firstName>","<lastName>" and "<billingAddress>"
      | Creditcard No    | Card type        | Exp Month | Exp Year | cvv |
      | 1111222233334444 | American Express | January   |     2022 | 123 |
      | 5555222233334444 | VISA             | August    |     2022 | 989 |
      | 6666222233334444 | Master Card      | October   |     2022 | 987 |
      | 7777222233334444 | Other            | June      |     2022 | 768 |
    Then User should verify success message after booking "Booking Confirmation" and save the generated order id

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   | firstName | lastName | billingAddress |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two | CONTAINER | PORT     | JAPAN          |

  Scenario Outline: Verifying the Book Hotel by without passing any fields
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should search the respective hotel details "<location>","<hotels>","<roomType>","<noOfRoom>","<inDate>","<outDate>","<adult>" and "<child>"
    Then User should verify the success message after search "Select Hotel"
    And User should select the Hotel name
    Then User should verify the success message after click the continue "Book A Hotel"
    And User should click the Book now button
    Then User should verify the error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two |
