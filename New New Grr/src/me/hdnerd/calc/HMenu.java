package me.hdnerd.calc;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class HMenu {

	public static JMenuBar menubar = new JMenuBar();
	static JMenu menu = new JMenu("Menu");
	static JMenu Precision = new JMenu("Precision");
	static JMenuItem Exit = new JMenuItem("Exit");
	static Color standard = new Color(200, 30, 40);
	static JTextField UserInp = new JTextField();
	static JLabel text = new JLabel("Decimal Precision");
	
	
	static void Menu() {
		  Exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		}); 

		  
		  
		  for(JMenu men : Arrays.asList(menu,Precision)){
			 men.setForeground(Color.white);
		  }
		  
		menubar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		UserInp.setText("6");
		UserInp.setHorizontalAlignment(JTextField.CENTER);
		Precision.add(text);
		Precision.addSeparator();
		Precision.add(UserInp);
		
		menu.add(Exit);
		
		
		menubar.add(menu);
		menubar.add(Precision);
		menubar.setBorder(null);
		menubar.setBackground(standard);
	}
	
}
