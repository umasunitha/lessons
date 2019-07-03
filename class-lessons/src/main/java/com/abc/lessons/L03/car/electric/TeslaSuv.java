/**
 * 
 */
package com.abc.lessons.L03.car.electric;

import com.abc.lessons.L03.car.AbstractCar;
import com.abc.lessons.L03.car.Price;

/**
 * @author Soham.Chakravarti
 *
 */
public class TeslaSuv extends AbstractCar {

	public TeslaSuv() {
		super("Tesla SUV", new Price(75000, Price.Currency.USD));
	}

}
