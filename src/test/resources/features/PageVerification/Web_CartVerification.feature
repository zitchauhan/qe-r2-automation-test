Feature: Debug


	Scenario: Verify MyAccount
	Then Verify below Sub/Main Module of Cart Page
		|# Verify following elements in Cart page "Your Cart "|
		|ContinueShopping_Link|
		|YourCart_Header|
		|Items_txt|
		|TotalYourCart_txt|
		|checkOutYourCart_Btn|
			
		
		|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link   |
		|color_input_txt       |
		|Size_input_txt|
		|ShipToMe_radioBtn|
		|InStorePickup_FREE_radioBtn |
		|Quantity_input_txt|
		|Quantity_txt|
		|toolTip_icon|
		|AddToWishList_btn|
		|RemoveFromCart_Btn|
		|CartItemAmount_txt|	
		|Color_txt|
		|Size_txt|
		|EstArrival_txt|
	    |ErrorMsgLimitedStack|
	
		|# Verify following elements in Cart page"We Accept"|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|GooglePay_img|
		|ApplePay_img|
		|AmericanExpress_img|
		|Discover_img|
		
		
		|# Verify following elements in Cart page"Free In Store Return"|
		|FreeInStoreReturns_txt|
		|ShippingPolicy_link|
		|ReturnPolicy_link|
	
	
		|# Verify following elements in Cart page"Shop With Confidance"|
		|ShopWithConfidance_txt|
	
	
		|# Verify following elements in Cart page"Calculate Shipping"|
		|ZipCode_input_txt|
		|Submit_CalculateShipping_btn|
		|CalculateShipping_txt|
		|EnterYourZIPcodeforShippingCost_txt|
		|X_btn|
	
	
		|# Verify following elements in Cart page"Order Summary"|
		|OrderSummary_Header|
		|Plus_AddPromoCode_btn|
		|Minus_HidePromo_btn|
		|EnterPromoCode_input|
		|Submit_PromoCode_btn|
		|checkOut_OrderSummary_btn|	
		|Total_txt|
		|SubTotal_txt|
		|EstimatedShipping_txt|
		|EstimatedTaxes_txt|
		|ZipCode_txt|
		|EstimatedShippingPrice_Txt|
		
		
		
		|# Verify following elements in Cart page"PromoCode"|
		|Promocode_Price_txt|
		|InvalidPromocode_txt|
		|Promocode_Txt|
		
		
		
		|# Verify following elements in Cart page"When cart is empty"|
		|YourCartIsEmpty_Txt|
		|SignIn_btn|
		|ContinueShopping_btn|
		|ContinueShopping_forEmptyCart_Link|

		
		|# Verify following elements in Cart page"After clicking on  Shiping Policy"|
		|ShippingCharges_header|