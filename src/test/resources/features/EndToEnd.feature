Feature: E-Commerce Platform Functionality
  @e2e1
  Scenario: Viewing products in a specific category
    Given The user is on the homepage
    When The user navigates to the "Elektronik" category
    Then The user should see a list of products in the "Elektronik" category
  @e2e2
  Scenario: Searching for products and filtering results
    Given The user is on the homepage
    When The user enter the "Laptop" in the search button
    #Then The user should see a list of products related to "Laptop"
    #And The user applies the filter brand "Apple"
    #Then The user should see a list of Apple branded laptops
  @e2e3
  Scenario: Viewing product details
    Given The user is on the homepage
    When The user navigates to the "Electronics" category
    And The user selects a product "Cep Telefonu"
    Then The user should see the product details page for "Cep Telefonu"
    And The user should see the product name, description, and price
  @e2e4
  Scenario: Adding a product to the cart
    Given The user is on the product details page for "Smartphone"
    When The user clicks on "Add to Cart"
    Then The user should see the product added to the cart
    And The cart should show 1 item
  @e2e5
  Scenario: Viewing and updating the cart
    Given The user has added a product to the cart
    When The user navigates to the cart
    Then The user should see the product in the cart
    When The user updates the quantity of "Smartphone" to 2
    Then The cart should reflect 2 items
    When The user removes "Smartphone" from the cart
    Then The cart should be empty
  @e2e6
  Scenario: Completing a purchase
    Given The user has added a product to the cart
    When The user navigates to the cart
    And The user clicks on "Proceed to Checkout"
    #And The user enters shipping information "John" "Doe" "123 Main St" "New York" "NY" "10001"
    #And The user selects "Credit Card" as the payment method
    #And The user enters payment information "4111111111111111" "12/25" "123"
    #And The user confirms the order
    #Then The user should see an order confirmation page
    #And The user should see the message "Thank you for your order!"