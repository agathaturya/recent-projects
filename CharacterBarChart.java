/*Agatha Turyahikayo
 * 11/14/2016
 * CharacterBarChart.java
 * recieves a int array that represents the frequency of each letter in a document
 * makes a bar chart of the frequency of each letter
 */
import javax.swing.JComponent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class CharacterBarChart extends JComponent {

	// instance variables
	private int[] chars;
	private final String ALPHABET = "A      B      C      D      "
			+ "E      F     G      H      I     J      K     L   "
			+ "  M    N     O      P      Q     R     S      T     U  "
			+ "   V      W     X      Y     Z";

	// constructor
	// recieves an int array
	public CharacterBarChart(int[] charCount) {
		chars = charCount;
		setBackground(Color.white);
	}// end constructor

	// preconditions:none
	// postconditions: displays a bar chary
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// color in background
		g2.setColor(this.getBackground());
		g2.fillRect(0, 0, getWidth(), getHeight());

		// displays the alphabet
		setFont(new Font(("Times New Roman"), Font.BOLD, 15));
		g2.setColor(Color.black);
		g2.drawString(ALPHABET, 0, getHeight() - 10);

		// displays the bar chart and frequencies of each letter
		for (int x = 0; x < chars.length; x++) {
			
			//generates a random color
			Color randomColor = new Color((int) (Math.random() * 255),
					(int) (Math.random() * 255), (int) (Math.random() * 255));
			g2.setColor(randomColor);
			//rectangles for the bar chart
			Rectangle2D.Double r = new Rectangle2D.Double(32 * x, getHeight()
					- chars[x] - 40, 32, chars[x]);
			
			//displays the count of letters
			g2.drawString("" + chars[x], 32 * x, getHeight() - chars[x] - 100);
			
			//displays the rectangle
			g2.fill(r);
			g2.draw(r);

		}// end loop

	}// end paintComponent
}// end CharacterBarChart

