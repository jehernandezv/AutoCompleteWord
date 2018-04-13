package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JFMainWindow;

public class Controller implements ActionListener{
	JFMainWindow jfMainWindow;
	
	public Controller() {
		jfMainWindow = new JFMainWindow(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (EAction.valueOf(e.getActionCommand())) {
		case ACCEPT_WORD:
			System.out.println("entro");
			break;

		default:
			break;
		}
		
	}

}
