package okna.zdarzenia;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Okno6 {

    public static void main(String[] args) {
   	 Font FONT = new Font("Arial", Font.BOLD, 32);
   	 
   	 JFrame okno = new JFrame("Rozmowa");
   	 okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 
   	 LayoutManager layout = new BoxLayout(okno.getContentPane(), BoxLayout.Y_AXIS);
   	 okno.setLayout(layout);
   	 
   	 JLabel pytanie = new JLabel("Jak masz na imię?");
   	 pytanie.setFont(FONT);
   	 okno.add(pytanie);
   	 
   	 JTextField pole = new JTextField();
   	 pole.setFont(FONT);
   	 okno.add(pole);
   	 
   	 JButton guzik = new JButton("OK");
   	 guzik.setFont(FONT);
   	 okno.add(guzik);
   	 
   	 JLabel powitanie = new JLabel("Witaj");
   	 powitanie.setFont(FONT);
   	 okno.add(powitanie);
  
   	 MojListener listener = new MojListener();
   	 guzik.addActionListener(listener);
   	 
   	 okno.pack();
   	 okno.setVisible(true);
    }

}



