#Author: your.email@your.domain.com
@Sanity
Feature: Tv Purchase

  Background: 
    Given User launch flipkart application
    And user abel to login flipkart credentials

  Scenario: Tv
    When user search Tv and choose
    And user add Tv to add to cart
    Then user validates confirmation message
@Sanity @Haroan
  Scenario: Tv list
    When user search Tv and choose by one dim list
      | LG TV | SAMSUNG TV | SONY TV |
    And user add Tv to add to cart
    Then user validates confirmation message
@Sanity @Haroan
  Scenario: Tv map
    When user search Tv and choose by one dim map
      | phone1 | LG TV      |
      | phone2 | SAMSUNG TV |
      | phone3 | SONY TV    |
    And user add Tv to add to cart
    Then user validates confirmation message

  Scenario Outline: 
    When user search Tv and choose by "<tv>"
    And user add mobile to add to cart
    Then user validates confirmation message

    Examples: 
      | tv         |
      | LG TV      |
      | SAMSUNG TV |
      | SONY TV    |
