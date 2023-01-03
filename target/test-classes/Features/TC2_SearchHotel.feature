@SearchHotel
Feature: Verifying the Search Hotel Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verifying the search hotel details by select all fields
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should search the respective hotel details "<location>","<hotels>","<roomType>","<noOfRoom>","<inDate>","<outDate>","<adult>" and "<child>"
    Then User should verify the success message after search "Select Hotel"

    Examples: 
      | userName  | password   | location | hotels       | roomType | noOfRoom | inDate     | outDate    | adult   | child   |
      | CONTAINER | 9940356983 | New York | Hotel Hervey | Deluxe   | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two | 2 - Two |

  Scenario Outline: Verifying the search hotel details by only select the mandatory fields
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should enter only the mandatory fields "<location>","<noOfRoom>","<inDate>","<outDate>" and "<adult>"
    Then User should verify the success message after search "Select Hotel"

    Examples: 
      | userName  | password   | location | noOfRoom | inDate     | outDate    | adult   |
      | CONTAINER | 9940356983 | New York | 4 - Four | 27/12/2022 | 29/12/2022 | 2 - Two |

  Scenario Outline: Verifying the search hotel details by passing the invalid dates
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should search the respective hotel details "<location>","<noOfRoom>","<inDate>","<outDate>" and "<adult>"
    Then User should verify the invalid date message after search "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName  | password   | location | noOfRoom | inDate     | outDate    | adult   |
      | CONTAINER | 9940356983 | New York | 4 - Four | 27/12/2023 | 29/12/2022 | 2 - Two |

  Scenario Outline: Verifying the search hotel details by without passing any fields
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"
    And User should click the search button without passing any fields
    Then User should verify the error message after search "Please Select a Location"

    Examples: 
      | userName  | password   |
      | CONTAINER | 9940356983 |
