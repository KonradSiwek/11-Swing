package okna.zdarzenia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Okno9 {

    public static void main(String[] args) {
   	 final Font FONT = new Font("Arial", Font.BOLD, 32);
   	 final Dimension odstep = new Dimension(0, 10);
   	 
   	 JFrame okno = new JFrame("Rozmowa");
   	 okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 
   	 JPanel panel = new JPanel();
   	 okno.setContentPane(panel);
   	 
   	 // panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4));
   	 panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

   	 LayoutManager layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
   	 panel.setLayout(layout);
   	 
   	 JLabel pytanie = new JLabel("Jak masz na imię?");
   	 pytanie.setFont(FONT);
   	 panel.add(pytanie);
   	 
   	 panel.add(Box.createRigidArea(odstep));
   	 
   	 JTextField pole = new JTextField();
   	 pole.setFont(FONT);
   	 pole.setForeground(Color.RED);
   	 panel.add(pole);

   	 panel.add(Box.createRigidArea(odstep));
   	 
   	 JButton guzik = new JButton("OK");
   	 guzik.setFont(FONT);
   	 guzik.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
   	 panel.add(guzik);
   	 
   	 panel.add(Box.createRigidArea(odstep));

   	 JLabel powitanie = new JLabel("Witaj");
   	 powitanie.setFont(FONT);
   	 powitanie.setForeground(Color.BLUE);
   	 panel.add(powitanie);
   	 
   	 // obsługa zdarzeń

   	 ActionListener listener = ev -> {
   		 String imie = pole.getText();
   		 powitanie.setText("Witaj " + imie);
   	 };
   	 
   	 pole.addActionListener(listener);
   	 guzik.addActionListener(listener);
   	 
   	 okno.pack();
   	 okno.setVisible(true);
    }
}



