package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_Adventure {
public static void main(String[] args) {
	
	String firstChoice = JOptionPane.showInputDialog("You are walking home from school and can walk through the woods, or you can go around the lake. Which way do you want to go?");
	if(firstChoice.equalsIgnoreCase("Woods")) {
		String secondChoice = JOptionPane.showInputDialog("As you are walking, you come across a large boulder. To the left is a very dence forest with lots of plants, and to the right is a very muddy area. Which way do you go?");
		if(secondChoice.equalsIgnoreCase("right")) {
			JOptionPane.showMessageDialog(null, "As you walk through the muddy ground, you fall into a pit of mud, and have to walk all the way home covered in mud.");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "As you walk through the dense foliage, you suddenly start getting very itchy. You realise you had walked through a bush of poison ivy, and walk home very itchy.");
			
		}
	}
	else {
		String secondChoice = JOptionPane.showInputDialog("As you are walking, you come across an angry bear. You can either try to pass the bear unseen, or swim away through the lake. Which way do you go?");
		if(secondChoice.equalsIgnoreCase("bear")) {
			JOptionPane.showMessageDialog(null, "You stealithy sneak through the bushes and get past the bear unseen, and get home perfectly fine.");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "You jump in the lake, and swim past the bear to the other side. You have to walk home drenched and freezing cold.");
			
		}
	}
	
	
	
	
}
}
