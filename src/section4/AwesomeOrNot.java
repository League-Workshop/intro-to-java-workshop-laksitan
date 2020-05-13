package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4);

		Random r = new Random();
		int number = r.nextInt(4); // 0 ---> 3

		// 3. Print out this variable
		System.out.println(number);
		// 4. Get the user to enter something that they think is awesome
		JOptionPane.showMessageDialog(null, "Enter something that you think is awesome");
		// 5. If the random number is 0

		if (number == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "That is awesome");

		}

		// 6. If the random number is 1
		if (number == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "This is ok");

		}

		// 7. If the random number is 2
		if (number == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "This is boring");
		}

		// 8. If the random number is 3
		if (number == 3) {
			JOptionPane.showMessageDialog(null, "This is extraordinary");
			// -- tell user whatever the entered is extraordinary.
		}
	}

}

