package com.jpmorgan.example.assignments.sssmarket;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.jpmorgan.example.assignments.sssmarket.enums.StockType;
/**
 *
 * @author Navami Ramamurthy
 */
public class GBCETest {

	@Test
	public void testAllShareIndex() {
        HashMap<String, Stock> db = new HashMap<String, Stock>();
        db.put("TEA", new Stock("TEA", StockType.COMMON, 100.0, 0.0, 100.0));
        db.put("POP", new Stock("POP", StockType.COMMON, 0.0, 1.0, 100.0));
        db.put("ALE", new Stock("ALE", StockType.COMMON, 25.0, 0.0, 40.0));
        db.put("GIN", new Stock("GIN", StockType.PREFERRED, 5.0, 0.2, 10.0));
        db.put("JOE", new Stock("JOE", StockType.COMMON, 11.0, 0.0, 20.0));
        for (Stock stock: db.values()) {
            // Record some trades
        	for (int i=1; i <= 10; i++) {
        		stock.buy(1, 1.0);
        		stock.sell(1, 1.0);
        	}
        }
        Double GBCEallShareIndex = GBCE.allShareIndex(db);
        assertEquals(1.379729661461215, GBCEallShareIndex, 0.0);
	}

}
