package org.bestbuy.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BBService implements BBServiceI {

	Map<Character, Double> PricePerUnit = new LinkedHashMap<Character, Double>();
	Map<Character, Double> VolumePrice = new LinkedHashMap<Character, Double>();
	Map<Character, Integer> count = new TreeMap<Character, Integer>();
	
//	BBModel sample = new BBModel();
	
	@Override
	public Map<Character, Double> SetUnitPrice() {
		PricePerUnit.put('A', 1.25);
		PricePerUnit.put('B', 4.25);
		PricePerUnit.put('C', 1.00);
		PricePerUnit.put('D', 0.75);
		return PricePerUnit;
	}

	@Override
	public Map<Character, Double> SetVolumePrice() {
		VolumePrice.put('A', 3.00);
		VolumePrice.put('B', 0.00);
		VolumePrice.put('C', 5.00);
		VolumePrice.put('D', 0.00);
		return VolumePrice;
	}
	
	@Override
	public void ResetCart() {
		count.put('A', 0);
		count.put('B', 0);
		count.put('C', 0);
		count.put('D', 0);
	}

	@Override
	public Map<Character, Integer> CountCart(String code) {
		int Index = 0;
		String Text = code.toUpperCase();
		char ProductId = '\0';
		do {
			ProductId = Text.charAt(Index);
			count.put(ProductId, count.get(ProductId) + 1);
			Index += 1;
		} while (Index != (Text.length()));
		return count;
	}

	@Override
	public Double CalculatePrice(Map<Character, Integer> countmap) {
		int remainder, quotient = 0;
		Double result = 0.0;

		for (Map.Entry<Character, Integer> MapIterator : countmap.entrySet()) {
			if (MapIterator.getKey() == 'A' || MapIterator.getKey() == 'C') {
				int divisor = (MapIterator.getKey() == 'A') ? 3 : 6;

				quotient = MapIterator.getValue() / divisor; // Use this value for VolumePrice
				remainder = MapIterator.getValue() % divisor; // use this value for PPU

				for (int i = 0; i < quotient; i++)
					result += VolumePrice.get(MapIterator.getKey());

				for (int i = 0; i < remainder; i++)
					result += PricePerUnit.get(MapIterator.getKey());}
			
			else {
				for (int i = 0; i < MapIterator.getValue(); i++)
					result += PricePerUnit.get(MapIterator.getKey());}
		}
		return result;
	}


}
