package com.solid.entities;

import com.solid.config.Sorter;
import com.solid.logging.ConsoleLogger;

/**
 * Apply OCP - Open / Closed Principle
 * 
 * @author taila
 *
 */
public class BinarySort implements Sorter {

	/*
	 * Apply Strategy Pattern
	 */
	@Override
	public void sort() {
		
		//Create Logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		
		consoleLogger.writeInfor("Binary Sort is chosen. Sorting...");
	}

}
