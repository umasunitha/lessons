/**
 * 
 */
package com.abc.lessons.L03.car;

import java.io.PrintStream;

import com.abc.lessons.L04.PrintStrategy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Soham.Chakravarti
 *
 */
@Getter @Setter @RequiredArgsConstructor
public abstract class AbstractCar implements Car {

	private final String name;
	
	private final Price price;
	
	private PrintStrategy printStrategy;

	@Override
	public void print(PrintStream outputStream) {
		String toString = printStrategy!=null ? printStrategy.stringify(this) : toString();
		outputStream.println(toString);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("Car ")
				.append(getName())
				.append(" has price of ")
				.append(getPrice())
				.toString();
	}
}
