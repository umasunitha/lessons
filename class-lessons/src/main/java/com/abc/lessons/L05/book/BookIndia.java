/**
 * 
 */
package com.abc.lessons.L05.book;

/**
 * @author Soham.Chakravarti
 *
 */
public class BookIndia extends AbstractBookDecorator {

	public BookIndia(Book target, BookViewedCounter counter) {
		super(target, counter);
	}
	
	@Override
	public int getCost() {
		return target.getCost() * 20;
	}

}
