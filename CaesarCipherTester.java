/*
 * Agatha Turyahikayo
 * 1/11/2017
 * CaesarCipherTester.java
 * tests out the CaesarCipher class
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipherTester {
	public static void main(String[] args) throws FileNotFoundException {

		// variables
		int shift;
		CaesarCipher cipher;
		int option = 0;
		String fileName;
		String writeFile;
		Scanner kb = new Scanner(System.in);

		// uses enters the rortation, inistansiated the CaesarCipher
		System.out.println("Enter the rotation");
		shift = kb.nextInt();
		cipher = new CaesarCipher(shift);

		// displays the menu
		System.out.print(cipher.menu());
		option = kb.nextInt();
		kb.nextLine();

		if (option == 4)
			System.out.println("Goodbye");

		while (option != 4) {

			if (option == 3) {

				// user enters the file name
				System.out.println("Enter the file name");
				fileName = kb.nextLine();
				// file is displayed
				System.out.println(cipher.readInFile(fileName));

			}

			else if (option == 1) {

				// user enters in the file name
				System.out.println("Enter the file name to be encrypted");
				fileName = kb.nextLine();

				// stores in the decrypted file in a message
				String file = cipher.readInFile(fileName);
				String message = cipher.encrypt(file);

				// user enters wheere they want the encrypted message to be put
				// in
				System.out
						.println("Enter the file name you want to store the encrypted message in");
				writeFile = kb.nextLine();
				kb.nextLine();

				//the message is stored in writeFile
				PrintWriter fOut = new PrintWriter(writeFile);
				fOut.println(message);
				fOut.close();

			}

			else if (option == 2) {

				// user enters the file name
				System.out.println("Enter the file name");
				fileName = kb.nextLine();
				
				//stores in the decrypted file in message
				String file = cipher.readInFile(fileName);
				String message = cipher.decrypt(file);

				// inputs the file name, clears out the scanner
				System.out
						.println("Enter the file name you want to write it to");
				writeFile = kb.nextLine();
				kb.nextLine();

				// writes out the message to a file, displays the menu
				PrintWriter fOut = new PrintWriter(writeFile);
				fOut.println(message);
				fOut.close();
				System.out.print(cipher.menu());

			}

			else if (option == 4)
				System.out.println("Goodbye!");

			// displays the menu, inputs the option, and clears out the scanner
			System.out.print(cipher.menu());
			option = kb.nextInt();
			kb.nextLine();

		}// end loop
	}// end main
}// end CaesarCipherTester
