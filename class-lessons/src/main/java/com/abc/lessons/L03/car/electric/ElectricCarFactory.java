/**
 * 
 */
package com.abc.lessons.L03.car.electric;

import org.springframework.stereotype.Component;

import com.abc.lessons.L03.car.AbstractCar;
import com.abc.lessons.L03.car.AbstractCarFactory;

/**
 * @author Soham.Chakravarti
 *
 */
@Component
public class ElectricCarFactory extends AbstractCarFactory {

	@Override
	protected AbstractCar create(boolean isSedan) {
		return isSedan ? new TeslaSedan() : new TeslaSuv();
	}
}
