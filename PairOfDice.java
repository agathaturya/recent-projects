	/*
	 * Agatha Turyahikayo 
	 * 11/6/15 
	 * PairOfDice.java Uses the Die class the create
	 * a pair of dice The PairOfDice class can roll both die, and return the
	 * face value of both die
	 */
public class PairOfDice {

	// instance fields
	private Die d1;
	private Die d2;

	// constructors

	// precondtion:none
	// postcondition: defaults both die to 6 sides
	public PairOfDice() {
		d1 = new Die();
		d2 = new Die();
	}

	// precondtion:none
	// postcondition: receives an int which will be the face value of both Die
	public PairOfDice(int num) {
		d1 = new Die(num);
		d2 = new Die(num);
	}

	// precondtion:none
	// postcondition: receives two arguments, which will be the face values
	public PairOfDice(int x, int y) {
		d1 = new Die(x);
		d2 = new Die(y);
	}

	// methods

	// precondtion:none
	// postcondition: both die will be rolled
	public void roll() {
		d1.roll();
		d2.roll();
	}

	// precondition:none
	// postcondition: returns the sum of the faceValues of both Die objects
	public int getTotalValue() {
		return d1.getFaceValue() + d2.getFaceValue();
	}

	// precondition:none
	// postcondition:returns the face value of the first Die
	public int getFaceValue1() {
		return d1.getFaceValue();
	}

	// precondition:none
	// postcondition: returns the face value of the second Die
	public int getFaceValue2() {
		return d2.getFaceValue();
	}

	// precondition:none
	// postconditions: returns a String representing the state of this pair of
	// dice in the format [#, #]

	public String toString() {
		String str = "[" + d1.getFaceValue() + "," + d2.getFaceValue() + "]";
		return str;
	}

}// end PairOfDice
