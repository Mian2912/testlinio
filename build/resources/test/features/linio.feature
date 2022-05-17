Feature: Purchase of products in the online application
  I as a user of the linio application
  I need to add products to the shopping cart

  @ScenarioOne
  Scenario: enter the application
    Given the user is in the application https://www.linio.com.co/
    When the user search in categories in the section of "Colchones , base cama y almohadas"
    And the user select product and add shooping car
    Then the user go "Ir al carrito"
    And  the use delete Product


