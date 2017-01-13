/*
 * Agatha Turyahikayo
 * 12/19/16
 * Movie.java
 * represents a single movie
 */

public class Movie implements Comparable {

	private String title;
	private int year;

	// constructor
	public Movie(String t, int y) {
		title = t;
		year = y;
	}

	// preconditions: none
	// postconditions: returns a String representation of the movie
	public String toString() {
		return "Title: " + title + "	Year: " + year;
	}// end toString

	// preconditions: none
	// postconditions: returns the title
	public String getTitle() {
		return title;
	}// end getTitle

	// preconditions: none
	// postconditions: returns if this movie equals m
	public boolean equals(Movie m) {
		return (this.getTitle().equals(title) && this.year == m.year);
	}// end equals

	// preconditions: none
	// postconditions: compares this movie to m and returns -1, 0, or 1
	public int compareTo(Object o) {

		// casting o to a movie
		Movie m = (Movie) (o);

		if (this.getTitle().compareTo(m.getTitle()) >= 0 && this.year > m.year) {

			return 1;
		}

		else if ((this.getTitle().compareTo(m.getTitle()) < 0)
				|| (this.getTitle().equals(m.getTitle())) && this.year < m.year)
			return -1;

		return 0;

	}// end compareTo
}// end Movie
