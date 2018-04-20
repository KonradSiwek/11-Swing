package okna.proste;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Okno4 {
    public static void main(String[] args) {
   	 JFrame okno = new JFrame();
   	 okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 
   	 LayoutManager layout = new FlowLayout();
   	 okno.setLayout(layout);
   	 
   	 JLabel tekst = new JLabel("Cześć, tu Kraków");
   	 tekst.setHorizontalAlignment(SwingConstants.CENTER);
   	 tekst.setForeground(Color.RED);
   	 tekst.setFont(new Font("Arial", Font.BOLD, 32));
   	 // tekst.setText("Inny tekst");
   	 okno.add(tekst);
   	 
   	 JButton guzik = new JButton("Klik");
   	 guzik.setFont(new Font("Arial", Font.BOLD, 36));
   	 okno.add(guzik);

   	 JButton guzik2 = new JButton("Drugi guzik");
   	 guzik2.setFont(new Font("Arial", Font.ITALIC, 36));
   	 guzik2.setForeground(Color.BLUE);
   	 okno.add(guzik2);

   	 okno.setSize(600, 400);
   	 // okno.pack();
   	 okno.setVisible(true);
    }
}

