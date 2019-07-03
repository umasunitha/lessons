/**
 * 
 */
package com.abc.lessons.L05.book;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Getter;

/**
 * @author Soham.Chakravarti
 *
 */
@Getter
public class BookViewedCounter {

	private final AtomicInteger counter = new AtomicInteger();
}
