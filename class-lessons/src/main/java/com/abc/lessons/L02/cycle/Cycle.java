/**
 * 
 */
package com.abc.lessons.L02.cycle;

/**
 * @author Soham.Chakravarti
 *
 */
public interface Cycle {

	/**
	 * Calculates time taken in seconds to race given distance
	 * 
	 * @param distanceInMiles
	 * @return time in seconds
	 */
	int calculateTimeTaken(int distanceInMiles);
	
	
	int costInLocalCurrency();
}
