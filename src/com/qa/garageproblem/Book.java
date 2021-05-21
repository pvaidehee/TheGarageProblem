package com.qa.garageproblem;

public class Book {
	public String title;
	public String genre;
	
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	// Setters n Getters
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
