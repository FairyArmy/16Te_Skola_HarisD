package me.hdnerd.calc;

import java.awt.Color;

import javax.swing.JPanel;

public class HPanel extends Hinputoutput{
	static Color goldsilver = new Color(192, 192, 192);
	static Color standard = new Color(40, 40, 40);
	 static JPanel pnl = new JPanel();
	 static void Panel(){
		pnl.setLayout(null);
		pnl.setBackground(standard);
		pnl.add(Input);
		pnl.add(Answer);
		
	}
}
