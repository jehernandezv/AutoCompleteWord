package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controller;
import controller.EAction;

public class JPEnterDate extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField jTextFieldWord;
	private JButton jButtonAccept;
	
	public JPEnterDate(Controller controller) {
		this.setLayout(new BorderLayout());
		jTextFieldWord = new JTextField("");
		jButtonAccept = new JButton("Accept");
		jButtonAccept.setActionCommand(EAction.ACCEPT_WORD.name());
		jButtonAccept.addActionListener(controller);
		init();
		
	}

	private void init() {
		jTextFieldWord.setFont(new Font("Arial", Font.BOLD, 60));
		 
		this.add(jTextFieldWord, BorderLayout.CENTER);
		this.add(jButtonAccept, BorderLayout.EAST);
	}
	
	public String getValueJTextField(){
		return this.jTextFieldWord.getText();
	}
	
	
	

}
