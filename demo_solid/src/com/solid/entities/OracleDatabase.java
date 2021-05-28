package com.solid.entities;

import com.solid.config.DatabaseManager;
import com.solid.logging.ConsoleLogger;

/**
 * Apply DIP - Dependency Inversion Principle
 * 
 * @author taila
 *
 */
public class OracleDatabase implements DatabaseManager {

	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void connect() {
		consoleLogger.writeInfor("Coonecting to Oracle database...");
	}

	@Override
	public void disconnect() {
		consoleLogger.writeInfor("Disconnecting to Oracle Database...");
	}
}
