package me.hdnerd.calc;

import java.util.Arrays;

import javax.swing.JButton;


public class HButtons extends Hinputoutput {
	static JButton btn1 = new JButton();
	static JButton btn2 = new JButton();
	static JButton btn3 = new JButton();
	static JButton btn4 = new JButton();
	static JButton btn5 = new JButton();
	static JButton btn6 = new JButton();
	static JButton btn7 = new JButton();
	static JButton btn8 = new JButton();
	static JButton btn9 = new JButton();
	static JButton btn0 = new JButton();

	static JButton btn11 = new JButton("+");
	static JButton btn12 = new JButton("-");
	static JButton btn13 = new JButton("*");
	static JButton btn14 = new JButton("/");
	static JButton btn15 = new JButton("^");
	static JButton btn16 = new JButton("%");
	static JButton btn17 = new JButton("=");
	
	static JButton btn18 = new JButton("C");
	
	
	
	static void Buttonbounds(){
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int number = 0;

		for (JButton btn : Arrays.asList(btn1, btn2, btn3)) {
			btn.setBounds(10 + (x1), 340, 90, 30);
			x1 = x1 + 100;
		}

		for (JButton btn : Arrays.asList(btn4, btn5, btn6)) {
			btn.setBounds(10 + (x2), 380, 90, 30);
			x2 = x2 + 100;
		}
		for (JButton btn : Arrays.asList(btn7, btn8, btn9)) {
			btn.setBounds(10 + (x3), 420, 90, 30);
			x3 = x3 + 100;
		}
		btn0.setBounds(10, 460, 290, 30);
		
		for (JButton btn : Arrays.asList(btn0, btn1, btn2, btn3,btn4, btn5, btn6, btn7, btn8, btn9)){
			btn.setText(Integer.toString(number));
			number++;
		}
		
	}
	
	
	static void SpecialButtonbounds(){
		btn11.setBounds(10, 220, 90, 30);
		btn12.setBounds(10, 260, 90, 30);
		btn13.setBounds(110, 220, 90, 30);
		btn14.setBounds(210, 220, 90, 30);
		btn15.setBounds(110, 260, 90, 30);
		btn16.setBounds(210, 260, 90, 30);
		btn17.setBounds(10, 180, 290, 30);
		btn18.setBounds(10, 300, 290, 30);
	}
}
