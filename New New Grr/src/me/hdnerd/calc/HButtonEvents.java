package me.hdnerd.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;

public class HButtonEvents extends HButtons {


	static void Buttonevents() {
		
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				int Userinp = Integer.parseInt(HMenu.UserInp.getText());
				String Holder = "";
				String INPTXT = Input.getText().replace(',', '.');
				
				
				
				for(int i = 0; i < Userinp; i++){
					Holder = Holder+"#";
				}
				
				
				
				DecimalFormat df = new DecimalFormat("#."+Holder);
				String answeri = df.format(((Eval.eval(INPTXT))));
				Answer.setText(answeri);
				if(Answer.getText().equalsIgnoreCase("NaN")){
					Answer.setText("Undifined");
				}
			

			}
		});
		btn18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Answer.setText("");
				Input.setText("");
			}
		});
		for (JButton btn : Arrays.asList(btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn11,btn12,btn13,btn14,btn15,btn1)) {
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Input.setText(Input.getText() + btn.getText());
				}
			});
		}
	}
}
