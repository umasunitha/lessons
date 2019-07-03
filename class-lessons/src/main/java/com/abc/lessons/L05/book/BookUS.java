/**
 * 
 */
package com.abc.lessons.L05.book;

/**
 * @author Soham.Chakravarti
 *
 */
public class BookUS extends AbstractBookDecorator {

	public BookUS(Book target, BookViewedCounter counter) {
		super(target, counter);
	}
	
	@Override
	public int getCost() {
		return target.getCost() * 100;
	}

}
