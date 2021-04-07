Feature: Validate the  available Pick Up & Delivery options

Scenario Outline: validate the Pick Up & delivery for BOPIS(In Stock) or BOPIS/STS(In Stock)
 Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<PRODUCT>"
    And user click on Product
    Then user enabled the radio button
    And user Select the Store "<Store>"
    And User sees the label "<label>"
    And User sees the Sub label "<Sub_Label>"
    And User sees the "<Message>"
    And User sees the Store details
    
    Examples:
    
 | Store  | PRODUCT | label | Sub Label | Message |
 | west Oakes | InStock(pickupToday)  | Free Store Pick Up   | Pick Up Available | Pick Up Today |
 | | Instock(pickupTomorrow) | Free Store Pick Up   | Pick Up Available | Pick Up Tomorrow |
 |Grand Parkway | LimitedStock(pickupToday)  | 	Free Store Pick Up   | Limited Stock | Pick Up Today |
| Rosenberg  | LimiteStock(pickupTomorrow) | 	Free Store Pick Up   | Limited Stock | Pick Up Tomorrow |
| Grand Parkway | OutOfStock | Free Store Pick Up   | Out of Stock | Find availability by changing store |
|cinco rancha | AssemblyRequired | Free Store Pick Up   | Pick Up Available | Some items require up to 72 hrs for assembly at: |
| NoStoreSelected | Free Store Pick Up   | Find availability by selecting a store |  |
| | Clearence | In Store Only   | Store inventory lookup not available |  |