package me.hdnerd.calc;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

public class KEYL extends Hinputoutput implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			int DecimalPrecise = Integer.parseInt(HMenu.UserInp.getText());
			String Holder = "";
			String INPTXT = Input.getText().replace(',', '.');
			
			
			
			for(int i = 0; i < DecimalPrecise; i++){
				Holder = Holder+"#";
			}
			DecimalFormat df = new DecimalFormat("#."+Holder);
			String answeri = df.format(((Eval.eval(INPTXT))));
			Answer.setText(answeri);
			if(Answer.getText().equalsIgnoreCase("NaN")){
				Answer.setText("Undifined");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
