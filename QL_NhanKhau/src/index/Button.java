package index;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Button(String label) {
		super(label);
		setForeground(Color.MAGENTA);
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setBackground(Color.PINK);
	}
}
