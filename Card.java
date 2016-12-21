/*
 * Agatha Turyahikayo
 * 11/20/15
 * Card.java
 * represents a playing card 
 * instances represent the face, and the suit
 * 
 */

public class Card {

	// constants
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	public static final int CLUB = 1;
	public static final int DIAMOND = 2;
	public static final int HEART = 3;
	public static final int SPADE = 4;

	// instance variables
	private int face;
	private int suit;

	private String suitName;
	private String faceName;

	// constructors
	public Card() {
		face = (int) (Math.random() * 13 + 1);
		suit = (int) (Math.random() * 4 + 1);
		setFaceName();
		setSuitName();
	}

	public Card(int faceValue, int suitValue) {
		face = faceValue;
		suit = suitValue;
		setFaceName();
		setSuitName();
	}

	// preconditions: none
	// postconditions: sets a string representing the face name
	private void setFaceName() {
		if (face == ACE)
			faceName = "Ace";
		if (face == TWO)
			faceName = "Two";
		if (face == THREE)
			faceName = "Three";
		if (face == FOUR)
			faceName = "Four";
		if (face == FIVE)
			faceName = "Five";
		if (face == SIX)
			faceName = "Six";
		if (face == SEVEN)
			faceName = "Seven";
		if (face == EIGHT)
			faceName = "Eight";
		if (face == NINE)
			faceName = "Nine";
		if (face == TEN)
			faceName = "Ten";
		if (face == JACK)
			faceName = "Jack";
		if (face == QUEEN)
			faceName = "Queen";
		if (face == KING)
			faceName = "King";

	}

	// preconditions: none
	// postconditions:set a string representation of the suit name
	private void setSuitName() {
		if (suit == 1)
			suitName = "Clubs";
		if (suit == 2)
			suitName = "Diamonds";
		if (suit == 3)
			suitName = "Hearts";
		if (suit == 4)
			suitName = "Spades";
	}

	// preconditions: none
	// postconditions:detrimines if this card is higher than the passed card
	public boolean isHigherThan(Card c1) {
		if (c1.getFace() < face)
			return true;
		else if (face == ACE)
			return true;

		if (c1.getFace() == face && c1.getSuit() < suit)
			return true;
		return false;
	}

	// preconditions: none
	// postconditions:detrimines if this card is higher than the passed card,
	// aceHigh determines if there is an ace
	public boolean isHigherThan(Card c2, boolean aceHigh) {
		if (aceHigh == true)
			return isHigherThan(c2);
		else if (c2.getFace() < face)
			return true;
		else if (c2.getFace() == face && c2.getSuit() < suit)
			return true;
		return false;
	}

	// preconditions: none
	// postconditions:returns the face value
	public int getFace() {
		return face;
	}

	// preconditions: none
	// postconditions: returns the suit value
	public int getSuit() {
		return suit;
	}

	// preconditions: none
	// postconditions:returns the face name represented as a string
	public String getFaceName() {
		return faceName;
	}

	// preconditions: none
	// postconditions:returns the suit name represented as a string
	public String getSuitName() {
		return suitName;
	}

	// preconditions: none
	// postconditions:returns a string representation of this card
	public String toString() {
		return faceName + " of " + suitName;
	}

}// end Card
