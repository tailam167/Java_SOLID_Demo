package com.solid.entities;

import com.solid.config.Sorter;
import com.solid.logging.ConsoleLogger;

/**
 * Apply OCP - Open / Closed Principle
 * Apply Strategy Pattern
 * 
 * @author taila
 *
 */
public class InsertionSort implements Sorter {

	/*
	 * Apply Strategy Pattern
	 */
	@Override
	public void sort() {
	
		// Create logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		
		consoleLogger.writeInfor("Insertion Sort is chosen. Sorting...");
	}

}
