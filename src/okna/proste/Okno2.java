package okna.proste;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Okno2 {

	public static void main(String[] args) {
		JFrame okno  = new JFrame();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel tekst = new JLabel("Hello World");
		okno.add(tekst);
		
		okno.setSize(180, 90);
		okno.setVisible(true);

	}

}
