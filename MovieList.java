/*
 * Agatha Turyahikayo
 * 12/19/16
 * MovieList.java
 * uses the Movie class to make a list of movie
 */

public class MovieList {

	protected ListNode list;

	// sets the MovieList to null
	public MovieList() {
		list = null;
	}

	// preconditions: none
	// postconditions: creates a ListNode object
	// adds a movie to this list
	public void add(Movie m) {

		// create the node to be added to the list
		ListNode newNode = new ListNode(m, null);

		ListNode current;

		if (list == null) {
			list = newNode;
		} else {
			// starts at front
			current = list;

			// while we arent in the last node
			while (current.getNext() != null) {
				current = current.getNext();

			}
			current.setNext(newNode);

		}
	}// end add

	// preconditions: none
	public Object removeFirst() {

		// /returns null if its an empty list
		if (list == null)
			return null;

		// removes and returns the first Movie
		ListNode m = list;
		m = list.getNext();
		return m;
	}// end removeFirst

	// preconditions: none
	// postconditions: returns the removed object
	public Object removeLast() {
		ListNode current = list;
		ListNode previous = null;

		if (list.getNext() == null)
			return null;
		else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();

			}
		}
		previous.setNext(null);
		return current;
	}// end removeLast

	// preconditions: none
	// postconditions: removes true if o is removed
	public boolean remove(Object obj) {
		Movie m = (Movie) obj;
		ListNode current = list;
		ListNode previous;

		if (list == null || current == null)
			return false;

		else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();

			}

		}
		ListNode newCurrent = current.getNext();
		previous = current.getNext();
		current = newCurrent;
		return true;

	}// end remove

	// preconditions: none
	// postconditions: returns a string representation of this MovieList
	public String toString() {
		String movies = "";

		// sets current to the front of the list
		ListNode current = list;

		while (current != null) {
			movies += current.getValue().toString() + "\n";
			current = current.getNext();
		}
		return movies;
	}// end toString
}// end MovieList
