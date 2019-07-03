/**
 * 
 */
package com.abc.lessons.L03.car;

import java.io.PrintStream;

/**
 * @author Soham.Chakravarti
 *
 */
public interface Car {
	
	String getName();

	Price getPrice();

	void print(PrintStream os);
}
