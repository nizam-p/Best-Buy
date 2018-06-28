package org.bestbuy.controller;

import java.util.Map;

import org.bestbuy.service.BBService;

public class BBController {
	BBService service = new BBService();
	
	//Service call for displaying the price of the product respectively
	public Map<Character, Double> GetUnitPrice(){
		return service.SetUnitPrice();
	}
	
	
	//Service call for displaying the price of the bundle product deal respectively
	public Map<Character, Double> GetVolumePrice(){
		return service.SetVolumePrice();
	}
	
	
	//Service call for resetting the cart to empty
	public void NewCart() {
		service.ResetCart();
	}
		
	
	//Service call to generate the final price for the cart
	public Double CartPrice(String code) {
		service.ResetCart();
		service.SetUnitPrice();
		service.SetVolumePrice();
		return service.CalculatePrice(service.CountCart(code));
	}


}
