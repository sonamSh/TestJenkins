@billingScenario

Feature: search Wikipedia

  Scenario: direct search article one
    Given Enter search term 'Cucumber' one
    When Do search one
    Then Single result is shown for 'Cucumber' one

  Scenario: direct search article two
    Given Enter search term 'Cucumber' two
    When Do search two
    Then Single result is shown for 'Cucumber' two

  Scenario: direct search article three
    Given Enter search term 'Cucumber' three
    When Do search three
    Then Single result is shown for 'Cucumber' three

  Scenario: direct search article four
    Given Enter search term 'Cucumber' four
    When Do search four
    Then Single result is shown for 'Cucumber' four

  Scenario: direct search article five
    Given Enter search term 'Cucumber' five
    When Do search five
    Then Single result is shown for 'Cucumber' five