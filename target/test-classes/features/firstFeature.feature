@login
Feature: First Feature Tests
@smoke
  Scenario: First Feature SMOKE Test 1
    Given Elimizde 5 sayısı mevcut
    And Elimizde 3 sayısı mevcut
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir
@regression
  Scenario: First Feature Test 2
    Given Elimizde 5 sayısı mevcut
    And Elimizde 3 sayısı mevcut
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir


