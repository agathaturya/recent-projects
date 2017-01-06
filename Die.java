/*
 * Agatha Turyahikayo
 * 11/16/15
 * Die.java
 * represents a single die object
*/
public class Die {

	// constants
	public static final int MIN_SIDES = 4;

	// instance fields
	private int face;
	private int sides;

	// constructors

	public Die() {
		face = 1;
		sides = 6;
	}

	// overloading
	public Die(int s) {
		if (s >= MIN_SIDES)
			sides = s;
		else
			sides = 6;
		face = 1;
	}

	// modifier
	// precondition:none
	// postcondition: sets face to random value from 1 to sides

	public void roll() {
		face = (int) (Math.random() * sides + 1);
	}

	// accescors

	// returns face
	public int getFaceValue() {
		return face;
	}

	public String toString() {
		return "" + face;
	}
	//static method example, you dont need an object to print the message
	
	public static void message(){
		System.out.println("this file helps you make a Die object");
	}
}//end Die
