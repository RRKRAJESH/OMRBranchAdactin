@Login
Feature: Verifying Adactin Hotel Login Details

  Background: 
    Given User is on the adactin page

  Scenario Outline: Verifying the Adactin Hotel Login page with valid Details
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with success message "Hello CONTAINER!"

    Examples: 
      | userName  | password   |
      | CONTAINER | 9940356983 |

  Scenario Outline: Verifying the Adactin Hotel Login page with Enter key
    When User should perform login "<userName>","<password>" with Enter key
    Then User should verify after the login with success message "Hello CONTAINER!"

    Examples: 
      | userName  | password   |
      | CONTAINER | 9940356983 |

  Scenario Outline: Verifying the Adactin Hotel Login page with an Invalid crdentials
    When User should perform login "<userName>","<password>"
    Then User should verify after the login with invalid crdential message "Invalid Login details or Your Password might have expired. "

    Examples: 
      | userName  | password   |
      | CONTAINER | 9840356983 |
