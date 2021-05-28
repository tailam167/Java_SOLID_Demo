package com.solid.entities;

import com.solid.config.DatabaseManager;
import com.solid.logging.ConsoleLogger;

/**
 * Apply DIP - Dependency Inversion Principle
 * 
 * @author taila
 *
 */
public class MySQLDatabase implements DatabaseManager {

	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void connect() {
		consoleLogger.writeInfor("Conecting to MySQL database...");
	}

	@Override
	public void disconnect() {
		consoleLogger.writeInfor("Disconnecting to MySQL Database...");
	}
}
