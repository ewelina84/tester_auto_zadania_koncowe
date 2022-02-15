Feature: Change user information after login

  Scenario Outline: Change user adress
    Given User is logged in to CodersLab shop
    When User goes to UserAdressPage
    And User clicks CreaNewAdress
    When user fills "<alias>","<adress>","<city>","<postal_code>","<country>","<phone>", and User click save
    Then User sees "Address successfully added!"

    Examples:
      |alias  |adress |city  |postal_code|country       |phone|
      |Ewa    |Kurnik |Wawa  |18-000     |United Kingdom|515478963|