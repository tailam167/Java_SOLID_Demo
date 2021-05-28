package com.solid.handlers;

import com.solid.config.DatabaseManager;

/**
 * Apply DIP - Dependency Inversion Principle
 * 
 * @author taila
 *
 */
public class DatabaseHandler {
	
	private DatabaseManager databaseManager;

	public DatabaseHandler(DatabaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}
	
	public void connect() {
		this.databaseManager.connect();
	}
	
	public void disconnect() {
		this.databaseManager.disconnect();
	}
	
}
