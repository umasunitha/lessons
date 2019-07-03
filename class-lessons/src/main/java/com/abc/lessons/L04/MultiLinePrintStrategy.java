/**
 * 
 */
package com.abc.lessons.L04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.abc.lessons.L03.car.Car;

/**
 * @author Soham.Chakravarti
 *
 */
@Primary
@Component
public class MultiLinePrintStrategy implements PrintStrategy {

	@Override
	public String stringify(Car car) {
		return new StringBuilder()
				.append("Car ")
				.append("\n\t")
				.append(car.getName())
				.append("\n\t\t")
				.append(" has price of ")
				.append(car.getPrice())
				.toString();
	}
}
