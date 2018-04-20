package okna.zdarzenia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class MojListener implements ActionListener{
int i = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Teraz jest: "+ LocalTime.now());
		System.out.println(i++);
	}

}
