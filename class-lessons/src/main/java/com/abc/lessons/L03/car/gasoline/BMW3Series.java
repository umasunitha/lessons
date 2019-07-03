/**
 * 
 */
package com.abc.lessons.L03.car.gasoline;

import com.abc.lessons.L03.car.AbstractCar;
import com.abc.lessons.L03.car.Price;

/**
 * @author Soham.Chakravarti
 *
 */
public class BMW3Series extends AbstractCar {
	
	public BMW3Series() {
		super("BMW 3 Series", new Price(33000, Price.Currency.USD));
	}
}
