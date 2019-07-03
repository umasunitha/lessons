/**
 * 
 */
package com.abc.lessons.L02.cycle.types;

import com.abc.lessons.L02.cycle.Cycle;

/**
 * @author Soham.Chakravarti
 *
 */
public class Bicycle implements Cycle {
	
	@Override
	public int calculateTimeTaken(int distanceInMiles) {
		return distanceInMiles * 2;
	}
	
	@Override
	public int costInLocalCurrency() {
		return 2;
	}
}
