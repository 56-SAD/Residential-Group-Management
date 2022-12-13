package panels;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Account.Account;
import Account.AccountManagement;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAccount;
	private JPasswordField txtPassword;
	
	public boolean isLogin;

	/**
	 * Create the frame.
	 */
	public LoginPanel() {
		
	// Decorating Frame
		getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("otherResource/Background.jpg"));
		lblNewLabel.setBounds(0, 0, 100, 400);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("otherResource/Background.jpg"));
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
		
		txtAccount = new JTextField();
		txtAccount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtAccount.setBounds(226, 104, 261, 25);
		getContentPane().add(txtAccount);
		txtAccount.setColumns(10);
		
	// Password and text for Password
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(143, 143, 61, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(226, 141, 261, 25);
		getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.MAGENTA);
		separator_1.setBounds(129, 189, 386, 2);
		getContentPane().add(separator_1);
		
	// Login Button
		JButton btnLoginButton = new JButton("Login");
		
		btnLoginButton.setForeground(Color.MAGENTA);
		btnLoginButton.setBackground(Color.PINK);
		btnLoginButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLoginButton.setBounds(143, 214, 118, 68);
		getContentPane().add(btnLoginButton);
		
		// Utilities
		btnLoginButton.setMnemonic(KeyEvent.VK_L);
		btnLoginButton.setToolTipText("Alt + L");
		
		// Event
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		
		
	// Reset Button
		JButton btnResetButton = new JButton("Reset");
		
		btnResetButton.setForeground(Color.MAGENTA);
		btnResetButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnResetButton.setBackground(Color.PINK);
		btnResetButton.setBounds(271, 214, 124, 69);
		getContentPane().add(btnResetButton);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		// Utilities
		btnResetButton.setMnemonic(KeyEvent.VK_R);
		btnResetButton.setToolTipText("Alt + R");
		
		// Event
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset();
			}
		});
		
	// Exit Button
		JButton btnExitButton = new JButton("Exit");
		
		btnExitButton.setForeground(Color.MAGENTA);
		btnExitButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnExitButton.setBackground(Color.PINK);
		btnExitButton.setBounds(406, 214, 124, 69);
		getContentPane().add(btnExitButton);
		
		// Utilities
		btnExitButton.setMnemonic(KeyEvent.VK_E);
		btnExitButton.setToolTipText("Alt + E");
		
		// Event
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	void Login() {
		String username = txtAccount.getText();
		String password = new String(txtPassword.getPassword());
		Account account = new Account(username, password);
		
		AccountManagement accountM = new AccountManagement();
		accountM.getListOfAccounts(accountM.accounts);
		
		if(txtAccount.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Tài khoản trống!");
			return;
		}
		else if(new String(txtPassword.getPassword()).equals("")) {
			JOptionPane.showMessageDialog(this, "Mật khẩu trống!");
			return;
		}
		else {
			boolean foundAccount = false, foundPassword = false;
			for(int i = 0; i< accountM.accounts.length; i++) {
				Account acc = accountM.accounts[i];
				if(acc != null && account.getUsername().equals(acc.getUsername())) {
					foundAccount = true;
					if(account.getPasswords().equals(acc.getPasswords())) {
						foundPassword = true;
						isLogin = true;
						MainPanel menu = new MainPanel(this);
						menu.setVisible(isLogin);
						txtAccount.setText("");
						txtPassword.setText("");
						this.dispose();
						break;
					}
				}
			}
			if(foundAccount == false)	JOptionPane.showMessageDialog(this, "Tài khoản không hợp lệ!");
			else {
				if(foundPassword == false) JOptionPane.showMessageDialog(this, "Mật khẩu không hợp lệ!");
			}
		}
	}
	
	void Reset() {
		txtAccount.setText("");
		txtPassword.setText("");
	}
	
	void Exit() {
		System.exit(0);
	}
	
}
