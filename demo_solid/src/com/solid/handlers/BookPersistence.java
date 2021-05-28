package com.solid.handlers;

import com.solid.entities.Book;
import com.solid.logging.ConsoleLogger;

/**
 * Apply SRP - Simple Responsibility Principle
 * 
 * @author taila
 *
 */
public class BookPersistence {
	
	public void save(Book book) {
		
		//Create logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		
		consoleLogger.writeInfor("Saving the book... " + book);
	}

}
