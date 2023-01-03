@SelectHotel
Feature: Verfiying the Select Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verfiying by Select Hotel Name
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should search the respective hotel details "<location>","<hotels>","<roomType>","<noOfRoom>","<inDate>","<outDate>","<adult>" and "<child>"
    Then User should verify the success message after search "Select Hotel"
    And User should select the Hotel name
    Then User should verify the success message after click the continue "Book A Hotel"

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two |

  Scenario Outline: Verifying by without Select the Hotel name
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should search the respective hotel details "<location>","<hotels>","<roomType>","<noOfRoom>","<inDate>","<outDate>","<adult>" and "<child>"
    Then User should verify the success message after search "Select Hotel"
    And User should click the continue button
    Then User should verify the error message after click the continue "Please Select a Hotel"

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two |
