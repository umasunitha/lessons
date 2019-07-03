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
public class BMWX5 extends AbstractCar {
	
	public BMWX5() {
		super("BMW 5x", new Price(3850000, Price.Currency.INR));
	}
}	
