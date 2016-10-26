package me.hdnerd.calc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class Hinputoutput{
	static JTextField Input = new JTextField();
	static JTextField Answer = new JTextField();
	
	public static void InputOutput(){
		
		
		Answer.setEditable(false);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		Answer.setBounds(15, 15, 290, 80);
		Input.setBounds(15, 110, 290, 30);
		
		Answer.setHorizontalAlignment(JTextField.CENTER);
		Input.setHorizontalAlignment(JTextField.CENTER);
		Answer.setFont(font1);
		
		
		Input.setForeground(Color.white);
		Input.setBackground(Color.black);
		Answer.setForeground(Color.white);
		Answer.setBackground(Color.black);
		Input.addKeyListener(new KEYL());
	}
}
