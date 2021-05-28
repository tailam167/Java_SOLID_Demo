package com.solid.entities;

import com.solid.config.BalanceTree;
import com.solid.logging.ConsoleLogger;

/**
 * Apply ISP - Interface Segregation Principle
 * 
 * @author taila
 *
 */
public class QuickSearchTree implements BalanceTree {

	// Create Logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();
	
	@Override
	public void rightRotation() {
		consoleLogger.writeInfor("Rotating to Right...");
		consoleLogger.writeNotify("Rotated !!");
	}

	@Override
	public void leftRotation() {
		consoleLogger.writeNotify("Rotating to Left...");
		consoleLogger.writeNotify("Rotated !!");
	}

}
