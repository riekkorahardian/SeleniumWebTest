
Feature: Search Pokemon Name

  Scenario: Search pokemon name "Pikachu" on bulbapedia
    Given User open bulbapedia main page
    When User type "Pikachu" on search field and press enter
    Then User see article with title "Pikachu" on article page
    Then User see article with number "#025" on article page

  Scenario: Search pokemon name "Abipom" on bulbapedia
    Given User open bulbapedia main page
    When User type "Ambipom" on search field and press enter
    Then User see article with title "Ambipom" on article page
    Then User see article with number "#424" on article page

  Scenario: Search pokemon name "Amaura" on bulbapedia
    Given User open bulbapedia main page
    When User type "Amaura" on search field and press enter
    Then User see article with title "Amaura" on article page
    Then User see article with number "#698" on article page


