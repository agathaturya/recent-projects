/*
 * Agatha Turyahikayo
 * 11/21/16
 * AbstractProgression.java
 * generic progression class
 */
public abstract class AbstractProgression<T> {
	protected T current;

	public AbstractProgression(T start) {
		current = start;
	}// end constructor

	public AbstractProgression() {
		this((T) (new Long(0)));
	}// end constructor

	// preconditions:none
	// postconditions:returns the next value
	public T nextValue() {
		T answer = current;
		advance();
		return answer;
	}// end nextValue

	// preconditions:none
	// postconditions:calls nextValue in a loop the print out the next value n
	// times
	public void printProgression(int n) {
		System.out.print(nextValue());
		for (int j = 0; j < n; j++)
			System.out.print(" " + nextValue());
		System.out.println();

	}// end printProgression

	// preconditions:none
	// postconditions:used in subclasses the go up one value
	protected abstract void advance();

}// end AbstractProgression
