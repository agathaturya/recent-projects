/*
 * Agatha Turyahikayo
 * 12/19/16
 * OrderedMovieList.java
 * uses the Movie class to make a ordered list of movies
 */

public class OrderedMovieList extends MovieList {

	public OrderedMovieList() {
		super.list = null;
	}

	public void add(Movie m) {
		// create the node to be added to the list
		ListNode newNode = new ListNode(m, null);
		ListNode current = list;
		ListNode previous;

		// adds the node if the list is empty
		if (list == null) {
			list = newNode;
		}

		// checks if should be in the front
		else if (m.compareTo((Movie) (current.getValue())) < 0) {
			list = newNode;
			newNode.setNext(current);
		}

		// loops through and puts m
		else {
			current = list;
			previous = null;

			while (current != null
					&& ((Movie) current.getValue()).compareTo(m) < 0) {
				previous = current;
				current = current.getNext();
			}

			previous.setNext(newNode);
			newNode.setNext(current);

		}
	}// end add
}// end OrderedMovieList
