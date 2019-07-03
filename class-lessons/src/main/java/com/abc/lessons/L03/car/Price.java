/**
 * 
 */
package com.abc.lessons.L03.car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Soham.Chakravarti
 *
 */
@Getter @RequiredArgsConstructor
public class Price {

	@Getter @RequiredArgsConstructor
	public enum Currency {
		USD("$"),
		INR("Rs.");
		
		private final String symbol;
	}
	
	private final double value;
	
	private final Currency currency;
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(currency.getSymbol())
				.append(getValue())
				.toString();
	}
}
