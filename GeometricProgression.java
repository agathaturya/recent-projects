/*
 * Agatha Turyahikayo
 * 11/21/16
 * GeometricProgression.java
 * each value is the current*b of the previous value, represented as a
 *long
 *includes a default constructor that has 1 as the first value, and a b value as 2
 */
public class GeometricProgression extends AbstractProgression<Long> {

	// instances
	protected long increment;

	// default constuctor
	public GeometricProgression() {
		this(2, 1);
	}// end constructor

	public GeometricProgression(long b) {
		this(b, 1);
	}// end constructor

	public GeometricProgression(long b, long start) {
		super(start);
		increment = b;
	}// end constructor

	// preconditions:none
	// postconditions:returns the next value
	protected void advance() {
		Long c = new Long((Long) current);
		Long i = new Long((Long) increment);

		c *= i;
		current = c;

	}// end advance

}// end GeometricProgression
