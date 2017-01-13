/*
 * Agatha Turyahikayo
 * 9/28/16
 * BirthdayParadox.java
 * User inputs how many birthdays they want to test
 * this class tests to see if the birthday paradox is true
 * the birthday paradox states that there is a 50% chance 2 people share a birthday in a group of 23 people
 * Uses the Birthday Object
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class BirthdayParadox {

	public static void main(String[] args) {

		// variables
		ArrayList<Birthday> b = new ArrayList();
		ArrayList<Birthday> c = new ArrayList();
		ArrayList<Birthday> e = new ArrayList();
		Scanner kb = new Scanner(System.in);
		int s;
		int m = 0;
		int d = 0;
		double n;

		// input
		System.out.println("Enter how many birthdays you want to test");
		s = kb.nextInt();

		for (int a = 0; a < s; a++) {
		
		
			b.add(new Birthday());

		}
		// sorts and checks if there are multiples of the same birthday
		Collections.sort(b);
		for (int x = 0; x < b.size() - 1; x++) {

			// if the next birthday is equal, it adds it to an arraylist
			if (b.get(x).equals(b.get(x + 1)) && (!c.contains(b.get(x)))) {
				c.add(b.get(x));
				// if the next birthday is not equal, it adds it to another
				// arraylist
			} else if (!(b.get(x).equals(b.get(x + 1))))
				e.add(b.get(x));

		}//end loop
		// if the there are multiple birthdays, it prints the arraylist
		if (c.size() > 0) {
			System.out.println("These birthdays occured more than once");
			System.out.println(c);
		}
		// prints the arraylist if there arent multiple birthdays
		if (e.size() > 0) {
			System.out
					.println("These birthdays have not occured more than once");
			System.out.println(e);
		}

	}//end main
}//end BirthdayParadox
