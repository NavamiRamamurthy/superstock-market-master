package com.jpmorgan.example.assignments.sssmarket;

import java.util.Map;
/**
 *
 * @Navami Ramamurthy
 * Calculate the GBCE All Share Index for all stocks
 */
public class GBCE {


	public static Double allShareIndex(Map<String, Stock> stocks) {
		Double allShareIndex = 0.0;
		for(Stock stock: stocks.values()) {
			allShareIndex+=stock.getPrice();
		}
		return Math.pow(allShareIndex, 1.0 / stocks.size());
	}
	
}
