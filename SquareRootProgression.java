/*
 * Agatha Turyahikayo
 * 11/21/16
 * SquareRootProgression.java
 *  each value is the square root of the previous value, represented as a
 *Double
 *includes a default constructor that has 65,536 as the first value and a
 *parametric constructor that starts with a specified number as the first value.
 */
public class SquareRootProgression extends AbstractProgression<Double> {

	// default constructor
	public SquareRootProgression() {
		current = 65536.0;
	}// end constructor

	public SquareRootProgression(Double start) {
		current = start;
	}// end constructor

	// preconditions:none
	// postconditions:sets current to current's square root
	protected void advance() {
		current = Math.sqrt((Double) current);
	}// end advance

}// end SquareRootProgression
