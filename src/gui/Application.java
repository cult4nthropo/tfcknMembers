package gui;

import java.awt.EventQueue;

public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				Gui gui = new Gui();
				gui.setVisible(true);
				
			}
			
		});

	}

}
