package okna.proste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Okno3 {

	public static void main(String[] args) {
		JFrame okno  = new JFrame();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel tekst = new JLabel("Hello World");
		tekst.setHorizontalAlignment(SwingConstants.CENTER);
		tekst.setForeground(Color.darkGray);
		tekst.setFont(new Font("Arial", Font.BOLD, 45));
		
		
		okno.add(tekst);
		
		okno.setSize(360, 180);
		okno.setVisible(true);

	}

}
