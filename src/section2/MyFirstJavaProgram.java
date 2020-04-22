package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot jupiter = new Robot ();
		
	    jupiter.setSpeed(100);
		jupiter.penDown();
		jupiter.setPenColor(Color.cyan)
		
		
		//for loop to create a square
		for(int sides = 0;sides < 4; sides++ ) { 
		jupiter.move(100);	
		jupiter.turn(90);
			
