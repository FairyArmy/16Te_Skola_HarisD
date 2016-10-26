package me.hdnerd.calc;

import java.util.Arrays;

import javax.swing.JButton;

public class AddButtonsToPanel extends HButtons {

	static void addbuttons() {
		for (JButton btn : Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn11, btn12,
				btn13, btn14, btn15, btn16, btn17, btn18)) {
			HPanel.pnl.add(btn);
		}
	}
}
