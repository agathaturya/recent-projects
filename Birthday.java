/*
 * Agatha Turyahikayo
 * 9/28/16
 * Birthday.java
 * represents a birthday
 */

public class Birthday implements Comparable {
	// instance variables
	private int month;
	private int day;

	// constructor
	// makes a random birthday
	public Birthday() {
		month = (int) ((12) * (Math.random()) + 1);

		if (month == 9 || month == 4 || month == 6 || month == 11)
			day = (int) ((30) * (Math.random()) + 1);
		else if (month == 2)
			day = (int) ((28) * (Math.random()) + 1);
		else
			day = (int) ((31) * (Math.random()) + 1);

	}// end Birthday

	// constructor
	// parameters are the month and the day
	// if the parameters arent valid, the Birthday constructed is 4/20
	public Birthday(int m, int d) {
		if (!isValid(m, d)) {
			month = 4;
			day = 20;
		}
		if (isValid(m, d)) {
			month = m;
			day = d;

		}

	}// end Birthday

	// preconditions:none
	// postconditions:returns month
	public int getMonth() {
		return month;
	}// end getMonth

	// preconditions:none
	// postconditions:returns day
	public int getDay() {
		return day;
	}// end getDay

	// preconditions:none
	// postconditions: returns if two Birthdays are equal
	public boolean equals(Object obj) {
		Birthday b = (Birthday) (obj);
		return (this.day == b.day && this.month == b.month);
	}// end equals

	// helper method
	// preconditions:none
	// postcondtions:if the birthday is valid, returns true
	private boolean isValid(int m, int d) {

		if ((m < 1 || m > 12)
				|| ((m == 9 || m == 4 || m == 6 || m == 11) && (d > 30))
				|| (m == 2 && d > 28)
				|| (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				&& (d > 31))
			return false;
		return true;

	}// end isValid

	// preconditions:none
	// postcondtions: returns 0 if both Birthdays are equal
	// returns 1 if this Birthday is greater than obj
	// returns -1 if this Birthday is less than obj
	public int compareTo(Object obj) {
		int m = this.getMonth();
		int d = this.getDay();
		Birthday a = new Birthday(m, d);
		Birthday b = (Birthday) (obj);
		if ((a.getMonth() > b.getMonth() && a.getDay() > b.getDay())
				|| (a.getMonth() > b.getMonth()))
			return 1;
		if (a.equals(b))
			return 0;
		return -1;

	}// end compareTo

	// preconditions:none
	// postconditions:outputs the birthday
	public String toString() {
		return month + "/" + day;
	}//end toString

}//end Birthday
