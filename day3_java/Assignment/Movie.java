package com.coforge.day3_java.Assignment;

public class Movie {
	private String name;
	private String director;
	private String rating;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {s
		this.director = director;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + ", rating=" + rating + "]";
	}
}
