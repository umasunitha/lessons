/**
 * 
 */
package com.abc.lessons.L03.car.gasoline;

import org.springframework.stereotype.Component;

import com.abc.lessons.L03.car.AbstractCar;
import com.abc.lessons.L03.car.AbstractCarFactory;

/**
 * @author Soham.Chakravarti
 *
 */
@Component
public class GasolineCarFactory extends AbstractCarFactory {

	@Override
	protected AbstractCar create(boolean isSedan) {
		return isSedan ? new BMW3Series() : new BMWX5();
	}
}
