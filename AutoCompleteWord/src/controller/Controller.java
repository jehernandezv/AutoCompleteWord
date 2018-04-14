package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Tree;
import view.JFMainWindow;

public class Controller implements ActionListener{
	JFMainWindow jfMainWindow;
	Tree tree;
	
	public Controller() {
		jfMainWindow = new JFMainWindow(this);
		tree = new Tree();
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (EAction.valueOf(e.getActionCommand())) {
		case ACCEPT_WORD:
			tree.addString(jfMainWindow.getValueJTextField(), tree.getRoot());
			jfMainWindow.showTree(tree.getRoot());
			
			break;

		default:
			break;
		}
		
	}

}
