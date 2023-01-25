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

  
