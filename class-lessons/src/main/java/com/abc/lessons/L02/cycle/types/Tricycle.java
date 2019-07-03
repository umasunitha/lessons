/**
 * 
 */
package com.abc.lessons.L02.cycle.types;

import com.abc.lessons.L02.cycle.Cycle;

/**
 * @author Soham.Chakravarti
 *
 */
public class Tricycle implements Cycle {

	@Override
	public int calculateTimeTaken(int distanceInMiles) {
		return distanceInMiles * 3;
	}

	@Override
	public int costInLocalCurrency() {
		return 3;
	}
}
