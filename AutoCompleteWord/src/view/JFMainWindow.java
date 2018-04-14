package view;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import model.Node;
import controller.Controller;

public class JFMainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPEnterDate jpEnterDate;
	private JPRecomendation jpRecomendation;
	private JPTreeShow jpTreeShow;
	
	
	public JFMainWindow(Controller controller) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		jpTreeShow = new JPTreeShow();
		jpEnterDate = new JPEnterDate(controller);
		jpRecomendation = new JPRecomendation();
		this.setVisible(true);
		init();
		
	}

	private void init() {
		this.add(jpTreeShow, BorderLayout.WEST);
		this.add(jpEnterDate,BorderLayout.CENTER);
		this.add(jpRecomendation, BorderLayout.SOUTH);
		
	}
	
	public void showTree(Node root){
		this.jpTreeShow.printJTree(root);
	}
	
	public String getValueJTextField(){
		 return this.jpEnterDate.getValueJTextField();
	}
	
	
	

}
