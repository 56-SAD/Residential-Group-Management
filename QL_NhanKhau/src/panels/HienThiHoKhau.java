package panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class HienThiHoKhau extends JPanel {
	private static final long serialVersionUID = 2645128917383602723L;

	/**
	 * Create the panel.
	 */
	public HienThiHoKhau() {
		setLayout(null);
		setBounds(100, 100, 700, 500);
		
		JLabel lblNewLabel = new JLabel("Qu\u1EA3n L\u00FD H\u1ED9 Kh\u1EA9u");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 700, 35);
		add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(150, 45, 400, 10);
		add(separator);
		
	}

}
