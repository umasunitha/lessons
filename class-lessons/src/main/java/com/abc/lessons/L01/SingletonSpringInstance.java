/**
 * 
 */
package com.abc.lessons.L01;

import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * @author Soham.Chakravarti
 *
 */
@Getter
@Component
public class SingletonSpringInstance {

	public static final String K_VAL = "Hello Neo"; 

	private int counter;
	
	public String sayHello() {
		return K_VAL;
	}

	public int incrementCounter() {
		counter++;
		return getCounter();
	}
}
