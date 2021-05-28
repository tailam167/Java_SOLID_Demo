package com.solid.handlers;

import com.solid.config.SortBookType;
import com.solid.config.Sorter;
import com.solid.config.SorterBook;
import com.solid.logging.ConsoleLogger;

/**
 * Apply OCP - Open / Closed Principle
 * 
 * @author taila
 *
 */
public class SorterManager {

	private ConsoleLogger consoleLogger = new ConsoleLogger();

	/**
	 * Before applying Strategy Pattern
	 * 
	 * @param sorterBook
	 * @author taila
	 */
	public void sort(SorterBook sorterBook) {

		// Create logging
		consoleLogger.writeInfor("Choosing sort type...");

		if (sorterBook.sortType == SortBookType.INSERTIONSORT) {
			doInsertionSort(sorterBook);
		} else if (sorterBook.sortType == SortBookType.MERGESORT) {
			doMergeSort(sorterBook);
		} else if (sorterBook.sortType == SortBookType.BINARYSORT) {
			doBinarySort(sorterBook);
		} else {
			consoleLogger.writeError("Sort Type is invalid", new IllegalArgumentException());
		}
	}

	/**
	 * After applying Strategy Pattern
	 * 
	 * @param sorterBook
	 * @author taila
	 */
	public void sort(Sorter sorter) {
		// Create logging
		consoleLogger.writeInfor("Choosing sort type...");
		
		sorter.sort();
	}

	private void doBinarySort(SorterBook sorterBook) {
		sorterBook.sort();
	}

	private void doMergeSort(SorterBook sorterBook) {
		sorterBook.sort();
	}

	private void doInsertionSort(SorterBook sorterBook) {
		sorterBook.sort();
	}
}
