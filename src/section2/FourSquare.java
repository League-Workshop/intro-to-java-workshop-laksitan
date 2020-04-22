package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
    Robot sam = new Robot();
    		
	void go() {
		// 4. Make the robot move as fast as possible
         sam.setSpeed(100);
		// 5. Set the pen width to 5
         sam.penDown();
         sam.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
            //for loop 
         	
         for(int repeat = 0; repeat < 4;repeat++) {
			// 7. Set the pen color to random
        	 sam.setRandomPenColor();
         
			// 1. Call the drawSquare() method
                drawSquare();
            // 8. Turn the robot 90 degrees to the right
              sam.turn(90);
         }
	}
	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		      sam.move(100);
		      sam.turn(90);
		      sam.move(100);
		      sam.turn(90);
		      sam.move(100);
		      sam.turn(90);
		      sam.move(100);
		      
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



