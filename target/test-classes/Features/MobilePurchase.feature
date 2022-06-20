#Author: your.email@your.domain.com
Feature: Mobile Purchase

  Background: 
    Given User launch flipkart application
    And user abel to login flipkart credentials
@Sanity @Smoke
  Scenario: Mobile
    When user search mobile and choose
    And user add mobile to add to cart
    Then user validates confirmation message

  Scenario: Mobile list
    When user search mobile and choose by one dim list
      | iPhone | SAMSUNG | realme |
    And user add mobile to add to cart
    Then user validates confirmation message

  Scenario: Mobile map
    When user search mobile and choose by one dim map
      | phone1 | iPhone  |
      | phone2 | SAMSUNG |
      | phone3 | realme  |
    And user add mobile to add to cart
    Then user validates confirmation message

  Scenario Outline: 
    When user search mobile and choose by "<phone>"
    And user add mobile to add to cart
    Then user validates confirmation message

    Examples: 
      | phone   |
      | iPhone  |
      | SAMSUNG |
      | realme  |
