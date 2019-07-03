/**
 * 
 */
package com.abc.lessons.L03.car;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.lessons.L04.PrintStrategy;

import lombok.Getter;

/**
 * @author Soham.Chakravarti
 *
 */
@Getter
public abstract class AbstractCarFactory implements CarFactory {

	@Autowired
	private PrintStrategy printStrategy;
	
	@Override
	public final Car build(boolean isSedan) {
		AbstractCar car = create(isSedan);
		decorateCar(car);
		return car;
	}
	
	protected abstract AbstractCar create(boolean isSedan);
	
	protected void decorateCar(AbstractCar car) {
		if(getPrintStrategy() != null)
			car.setPrintStrategy(getPrintStrategy());
	}
}
