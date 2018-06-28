package org.bestbuy.service;

import java.util.Map;

public interface BBServiceI {
	public Map<Character, Double> SetUnitPrice();
	public Map<Character, Double> SetVolumePrice();
	public void ResetCart();
	
	public Map<Character, Integer> CountCart(String code);
	public Double CalculatePrice(Map<Character, Integer> countmap);


}
