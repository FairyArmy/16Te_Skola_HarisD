package me.hdnerd.calc;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.JButton;

public class ButtonBackground extends HButtons {
	static Color pin = new Color(40, 40, 40);
	static Color standard = new Color(200, 30, 40);
	
	static void SetBackgrounds(){
		for (JButton btn : Arrays.asList(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0)) {
			btn.setForeground(Color.white);
			btn.setBackground(pin);
		}
		for (JButton btn : Arrays.asList(btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18)){
			btn.setForeground(Color.white);
			btn.setBackground(standard);
		}
	}
}
