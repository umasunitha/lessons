/**
 * 
 */
package com.abc.lessons.L04;

import org.springframework.stereotype.Component;

import com.abc.lessons.L03.car.Car;

/**
 * @author Soham.Chakravarti
 *
 */

@Component
public class SingleLinePrintStrategy implements PrintStrategy {

	@Override
	public String stringify(Car car) {
		return new StringBuilder()
				.append("Car ")
				.append(car.getName())
				.append(" has price of ")
				.append(car.getPrice())
				.toString();
	}
}
