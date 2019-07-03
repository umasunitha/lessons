/**
 * 
 */
package com.abc.lessons.L02.cycle;

import org.springframework.stereotype.Component;

import com.abc.lessons.L02.cycle.types.Bicycle;
import com.abc.lessons.L02.cycle.types.Tricycle;

/**
 * @author Soham.Chakravarti
 *
 */
@Component
public class CycleFactory {

	public Cycle create(int numWheels) {
		return numWheels == 2 ? new Bicycle() : 
				numWheels == 3 ? new Tricycle() : null;
	}
}
