package com.solid.entities;

import com.solid.config.Sorter;
import com.solid.logging.ConsoleLogger;

/**
 * Apply OCP - Open / Closed Principle
 * 
 * @author taila
 *
 */
public class MergeSort implements Sorter{
	
	/*
	 * Apply Strategy Pattern
	 */
	@Override
	public void sort() {
		
		// Create logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		
		consoleLogger.writeInfor("Merge Sort is chosen. Sorting... "); 
	}
	
}
