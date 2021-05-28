package com.solid.entities;

import com.solid.config.ElectricVehicle;
import com.solid.logging.ConsoleLogger;

/**
 * Apply LSP - Liskov Substitution Principle
 * 
 * @author taila
 *
 */
public class ElectricCar implements ElectricVehicle {

	// Create Logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void speed() {
		consoleLogger.writeInfor("Speed up electric car...");
	}

	@Override
	public void chargeBattery() {
		consoleLogger.writeInfor("Charging battery for electric car...");
	}
}
