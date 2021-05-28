package com.solid.config;

/**
 * Apply OCP - Open / Closed Principle
 * 
 * @author taila
 *
 */
public abstract class SorterBook {
	public SortBookType sortType;
	public abstract void sort();
}
