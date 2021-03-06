*
 * Agatha Turyahikayo
 * 11/21/16
 * ArithmeticProgression.java
 * each value is current + stepsize, represented as a
 *long
 *
 */

public class ArithmeticProgression extends AbstractProgression<Long> {
	//instances
	protected long increment;
	
	//default constructor
	public ArithmeticProgression() {
		this(1, 0);
	}// end constructor


	public ArithmeticProgression(long stepsize) {
		this(stepsize, 0);
	}// end constructor

	public ArithmeticProgression(long stepsize, long start) {
		super(start);
		increment = stepsize;
	}// end constructor

	// preconditions:none
	// postconditions:returns the next value
	protected void advance() {
		Long i = new Long(increment);
		Long c = new Long((long) current);

		c += i;
		current = c;

	}// end advance

}// end ArithmeticProgression
