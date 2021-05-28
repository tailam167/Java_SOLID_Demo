package com.solid.entities;

import com.solid.config.Tree;
import com.solid.logging.ConsoleLogger;

/**
 * Apply ISP - Interface Segregation Principle
 * 
 * @author taila
 *
 */
public class BinarySearchTree implements Tree {
	
	// Create Logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public int findMax() {
		consoleLogger.writeInfor("Searching maximum number...");
		consoleLogger.writeNotify("Searched successfully");
		return 167;
	}

	@Override
	public int findMin() {
		consoleLogger.writeInfor("Searching minimum number...");
		consoleLogger.writeNotify("Searched successfully");
		return -909;
	}

	@Override
	public int traverse() {
		consoleLogger.writeInfor("Tranversing...");
		consoleLogger.writeNotify("Searched successfully");
		return 123;
	}
}
