@CancelBooking
Feature: Verifying Cancel the Hotel Booking

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verifying the cancel booking by passing the generated order id
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
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
    And User should cancel booking by passing the generated order id
    Then User should verify the cancel success message "The booking has been cancelled."

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   | firstName | lastName | billingAddress |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two | CONTAINER | PORT     | JAPAN          |

  Scenario Outline: Verifying the cancel booking by passing the existing order id
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should click the Booked Itinerary
    And User should cancel booking by passing the existing order id "<orderid>"
    Then User should verify the cancel success message "The booking has been cancelled."

    Examples: 
      | userName  | password   | orderid    |
      | CONTAINER | 9940356983 | SS0F147654 |
