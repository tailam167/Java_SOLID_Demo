package com.solid;

import com.solid.config.BalanceTree;
import com.solid.config.Tree;
import com.solid.entities.BinarySearchTree;
import com.solid.entities.Book;
import com.solid.entities.ElectricCar;
import com.solid.entities.InsertionSort;
import com.solid.entities.MySQLDatabase;
import com.solid.entities.OracleDatabase;
import com.solid.entities.QuickSearchTree;
import com.solid.handlers.DatabaseHandler;
import com.solid.handlers.SorterManager;
import com.solid.logging.ConsoleLogger;

/**
 * Apply SOLID Principle
 * 
 * 
 * @author taila
 *
 */
public class App {

	public static void main(String[] args) {

		// Create logging
		ConsoleLogger consoleLogger = new ConsoleLogger();

		/*
		 * Apply Simple Responsibility Principle (SRP): A software entity (class,
		 * method) should have only one reason to change. Should separate classes or
		 * methods, which do more than one procedure, into two distinct class/method
		 * Should implement interface into your project. Should split the functionality
		 * into smaller separate classes. Each Class/Method should handle a single
		 * responsibility. It can make a low coupled design with less and lighter
		 * dependencies
		 */
		Book bookEnglish = new Book("Tai Lam", 167);
		bookEnglish.save();
		consoleLogger.writeNotify("Saved book !");

		/*
		 * Apply Open / Closed Principle (OCP): The design and writing of the code
		 * should be done in a way that new functionality should be added with minimum
		 * change in the existing code. Should keep as much existing code unchanged as
		 * possible Software entities should be opened for extension, but closed for
		 * modification Closely will be related with SRP - Simple Responsibility
		 * Principle. A class should not extend a other class explicitly. Use strategy
		 * pattern and template pattern to make sure this principle is not violated
		 */
		SorterManager sorterManager = new SorterManager();
		sorterManager.sort(new InsertionSort());
		consoleLogger.writeNotify("Sorted completely !");

		/*
		 * Apply Liskov Substitution Principle (LSP): Child classes should never break
		 * the parent type definition Sub-types must be substitutable for their base
		 * types (derived types must be completely substitutable for their type). Should
		 * not break functionality --> call methods anyway. Use Template Pattern to
		 * implement LSP - Liskov Substitution Principle. It's not independent from
		 * Open/Closed Principle + Interface Segregation Principle. The violation of LSP
		 * - Liskov Substitution Principle is a latent violation of OCP - Open/Closed
		 * Principle
		 */
		ElectricCar electricCar1 = new ElectricCar();
		electricCar1.speed();
		electricCar1.chargeBattery();
		consoleLogger.writeNotify("Charged Fully Battery !");

		/*
		 * Apply Interface Segregation Principle (ISP): It's about business logic to
		 * clients communication. It's not a good if an interface contains lots of
		 * methods --> Should separate them accordingly The interface segregation
		 * principle (ISP) states that no client should be forced to depend on methods
		 * doesn't use. Should break our interfaces in many smaller ones, so they better
		 * satisfy the exact needs of our clients
		 */
		Tree binarySearchTree = new BinarySearchTree();
		consoleLogger.writeNotify(String.valueOf(binarySearchTree.findMax()));

		BalanceTree quickSearchTree = new QuickSearchTree();
		quickSearchTree.rightRotation();

		/*
		 * Apply Dependency Inversion Principle (DIP): Very difficult to apply but it's
		 * the most important principle. High level modules should not depend on low
		 * level modules --> both should depend on abstraction. Abstraction should not
		 * depend on details, details should depend upon abstraction. Should create an
		 * abstraction between the dependency of high level modules and low level
		 * modules
		 */
		DatabaseHandler mySQLDatabase = new DatabaseHandler(new MySQLDatabase());
		mySQLDatabase.connect();
		mySQLDatabase.disconnect();

		DatabaseHandler oracleDatabase = new DatabaseHandler(new OracleDatabase());
		oracleDatabase.connect();
		oracleDatabase.disconnect();
	}
}
