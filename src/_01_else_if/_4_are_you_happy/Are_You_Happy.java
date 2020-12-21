package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
	String isHappy = JOptionPane.showInputDialog("Are you happy?");


if(isHappy.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");

}
else {
	String wantHappy = JOptionPane.showInputDialog("Do you want to be happy?");
	if(wantHappy.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
}
}
}