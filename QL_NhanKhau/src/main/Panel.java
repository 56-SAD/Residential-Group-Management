package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel() {
		getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 400);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Documents\\Subject\\TechnicalWriting&Presentation\\Cool-Milky-Way-Galaxy-Background.jpg"));
		lblNewLabel.setBounds(0, 0, 100, 400);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Documents\\Subject\\TechnicalWriting&Presentation\\Cool-Milky-Way-Galaxy-Background.jpg"));
		lblNewLabel_1.setBounds(540, 0, 100, 400);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN TO SYSTEM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(250, 40, 166, 21);
		getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.MAGENTA);
		separator.setBounds(129, 77, 386, 2);
		getContentPane().add(separator);
		
	// Account and text for Account
		JLabel lblNewLabel_3 = new JLabel("Account");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(143, 107, 61, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(226, 104, 261, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
	// Password and text for Password
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(143, 143, 61, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 141, 261, 25);
		getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.MAGENTA);
		separator_1.setBounds(129, 189, 386, 2);
		getContentPane().add(separator_1);
		
	// Event for Login
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String (passwordField.getPassword());
				
				StringBuilder sBuilder = new StringBuilder();
				
				if(username.equals("")) {
					sBuilder.append("Username is empty\n");
				}
				if(password.equals("")) {
					sBuilder.append("Password is empty\n");
				}
				
//				if(sBuilder.length() > 0) {
//					JOptionPane.showMessageDialog(this, sBuilder.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
//					return;
//				}
				
			}
		});
		
		
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(226, 214, 118, 68);
		getContentPane().add(btnNewButton);
		
		JButton btnForgotPassword = new JButton("Reset");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnForgotPassword.setForeground(Color.MAGENTA);
		btnForgotPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnForgotPassword.setBackground(Color.PINK);
		btnForgotPassword.setBounds(363, 214, 124, 69);
		getContentPane().add(btnForgotPassword);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	}
}
