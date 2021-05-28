package com.solid.entities;

import com.solid.config.BookHandler;
import com.solid.handlers.BookPersistence;

/**
 * Apply SRP - Simple Responsibility Principle
 * 
 * @author taila
 *
 */
public class Book implements BookHandler{
	
	private int numberOfPage;
	private String authorName;
	private BookPersistence bookPersistence;
	
	public Book(String authorName, int numberOfPage) {
		this.numberOfPage = numberOfPage;
		this.authorName = authorName;
		this.bookPersistence = new BookPersistence();
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return authorName + " - " + numberOfPage;
	}

	@Override
	public void save() {
		this.bookPersistence.save(this);
	}
	
}
