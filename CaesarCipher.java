/*
 * Agatha Turyahikayo
 * 1/11/2017
 * CaesarCipher.java
 * class that represents a CaesarCipher
 * constructor accepts one variable
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Class for doing encryption and decryption using the Caesar Cipher. */
public class CaesarCipher {
	protected char[] upperCaseEncoder = new char[26]; // Encryption array
	protected char[] upperCaseDecoder = new char[26]; // Decryption array
	protected char[] lowerCaseEncoder = new char[26]; // Encryption array
	protected char[] lowerCaseDecoder = new char[26]; // Decryption array

	/** Constructor that initializes the encryption and decryption arrays */
	public CaesarCipher(int rotation) {
		for (int k = 0; k < 26; k++) {

			upperCaseEncoder[k] = (char) ('A' + (k + rotation) % 26);
			upperCaseDecoder[k] = (char) ('A' + (k - rotation + 26) % 26);

			lowerCaseEncoder[k] = (char) ('a' + (k + rotation) % 26);
			lowerCaseDecoder[k] = (char) ('a' + (k - rotation + 26) % 26);
		}// end loop
	}// end constructor

	/** Returns String representing encrypted message. */
	public String encrypt(String message) {
		return transform(message, upperCaseEncoder, lowerCaseEncoder); // use
																		// encoder
																		// array
	}// end encrypt

	/** Returns decrypted message given encrypted secret. */
	public String decrypt(String secret) {
		return transform(secret, upperCaseDecoder, lowerCaseDecoder);
	}// end decrypt

	// preconditions:none
	// postconditions: a menu with options to ask the person if they wish to
	// encrypt a file, decrypt a file, view a file
	// (display the contents of the file to
	// the screen),
	// or exit the program
	public String menu() {

		return ("--------------------Menu--------------------\n"
				+ "Enter 1 if you want to encrypt a file\n"
				+ "Enter 2 if you want to decrypt a file\n"
				+ "Enter 3 if you want to view a file\n" + "Enter 4 to exit\n"
				+ "--------------------------------------------");

	}// end menu

	/** Returns transformation of original String using given code. */
	private String transform(String original, char[] upperCase, char[] lowerCase) {

		char[] msg = original.toCharArray();

		for (int k = 0; k < msg.length; k++) {

			// the current character
			char c = original.charAt(k);

			// changes the character if the character is uppercase
			if (Character.isUpperCase(c)) {
				int j = msg[k] - 'A';
				msg[k] = upperCase[j];
			}
			// changes the character if the character is lowercase
			else if (Character.isLowerCase(c)) {
				int j = msg[k] - 'a';
				msg[k] = lowerCase[j];
			}
		}
		return new String(msg);
	}// end transform

	// preconditions:none
	// postconditions: returns the file as a String
	public String readInFile(String fileName) {
		Scanner inFile;
		try {
			inFile = new Scanner(new File(fileName));
			String line = "";
			while (inFile.hasNext()) {
				line += inFile.nextLine();
			}
			inFile.close();
			return line;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}// end readInFile

}// end CaesarCipher