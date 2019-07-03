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
public class TeslaSedan extends AbstractCar {

	public TeslaSedan() {
		super("Tesla Sedan", new Price(35000, Price.Currency.USD));
	}

}
