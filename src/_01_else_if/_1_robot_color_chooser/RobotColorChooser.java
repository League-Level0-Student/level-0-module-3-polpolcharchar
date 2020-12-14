
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		rob.setSpeed(100);
		rob.penDown();
		for(int x = 0; x<10;x++) {
		for(int i = 0; i<4;i++) {
			rob.move(200);
			rob.turn(90);
		}
		
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.RED);
		}
		else if(color.equalsIgnoreCase("blue")){
				rob.setPenColor(Color.BLUE);
		}
		else {
			rob.setRandomPenColor();
		}
	
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		
		


	}

	}
}
