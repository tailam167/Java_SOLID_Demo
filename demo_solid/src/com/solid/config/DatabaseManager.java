package com.solid.config;

/**
 * Apply DIP - Dependency Inversion Principle
 * 
 * @author taila
 *
 */
public interface DatabaseManager {
	public void connect();

	public void disconnect();
}
