/**
 * 
 */
package com.abc.lessons.L05.book;

/**
 * @author Soham.Chakravarti
 *
 */
public abstract class AbstractBookDecorator implements Book {

	protected final Book target; 
	private final BookViewedCounter counter;
	
	public AbstractBookDecorator(Book target, BookViewedCounter counter) {
		this.target = target;
		this.counter = counter;
	}
	
	@Override
	public String getTitle() {
		counter.getCounter().incrementAndGet();
		return target.getTitle();
	}

}
