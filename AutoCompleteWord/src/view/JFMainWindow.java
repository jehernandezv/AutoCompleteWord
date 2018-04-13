package view;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import controller.Controller;

public class JFMainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPEnterDate jpEnterDate;
	private JPRecomendation jpRecomendation;
	
	
	public JFMainWindow(Controller controller) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		jpEnterDate = new JPEnterDate(controller);
		jpRecomendation = new JPRecomendation();
		this.setVisible(true);
		init();
		
	}

	private void init() {
		this.add(jpEnterDate,BorderLayout.CENTER);
		this.add(jpRecomendation, BorderLayout.SOUTH);
		
	}
	
	
	

}
