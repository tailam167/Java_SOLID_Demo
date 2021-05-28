package com.solid.entities;

import com.solid.config.NormalVehicle;
import com.solid.logging.ConsoleLogger;

/**
 * Apply LSP - Liskov Substitution Principle
 * 
 * @author taila
 *
 */
public class Car implements NormalVehicle {
	
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void speed() {
		consoleLogger.writeInfor("Speed up the car...");
	}

	@Override
	public void addFuel() {
		consoleLogger.writeInfor("Adding fuel to car...");
	}

}
