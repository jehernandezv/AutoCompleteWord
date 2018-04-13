package view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPRecomendation extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel jLabelRecomendation;
	
	public JPRecomendation() {
		jLabelRecomendation = new JLabel("Recomendations");
		init();
	}

	private void init() {
		
		jLabelRecomendation.setFont(new Font("Arial", Font.BOLD, 60));
		this.add(jLabelRecomendation);
	}
	
	

}
