package layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Account.Account;
import Account.AccountManagement;
import index.Button;
import index.InputField;
import index.Label;
import index.PasswordField;

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

public class Login_Panel extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAccount;
	private JPasswordField txtPassword;
	
	public boolean isLogin;

	/**
	 * Create the frame.
	 */
	public Login_Panel() {
		
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
		
		Label lblNewLabel_2 = new Label("LOGIN TO SYSTEM");
		lblNewLabel_2.setBounds(250, 40, 166, 21);
		getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.MAGENTA);
		separator.setBounds(129, 77, 386, 2);
		getContentPane().add(separator);
		
	// Account and text for Account
		txtAccount = new InputField("Username");
		txtAccount.setBounds(129, 95, 386, 53);
		getContentPane().add(txtAccount);
		txtAccount.setColumns(10);
		
	// Password and text for Password
		txtPassword = new PasswordField("Password");
		txtPassword.setBounds(129, 166, 386, 53);
		getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.MAGENTA);
		separator_1.setBounds(129, 239, 386, 2);
		getContentPane().add(separator_1);
		
	/*
	 * BUTTON
	 * */
		Button btnLoginButton = new Button("Login");
		btnLoginButton.setBounds(143, 252, 118, 68);
		getContentPane().add(btnLoginButton);
		btnLoginButton.setMnemonic(KeyEvent.VK_L);
		btnLoginButton.setToolTipText("Alt + L");
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
			}
		});
		
		Button btnResetButton = new Button("Reset");
		btnResetButton.setBounds(272, 252, 124, 69);
		getContentPane().add(btnResetButton);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnResetButton.setMnemonic(KeyEvent.VK_R);
		btnResetButton.setToolTipText("Alt + R");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reset();
			}
		});
		
		Button btnExitButton = new Button("Exit");
		btnExitButton.setBounds(406, 252, 124, 69);
		getContentPane().add(btnExitButton);
		btnExitButton.setMnemonic(KeyEvent.VK_E);
		btnExitButton.setToolTipText("Alt + E");
		btnExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exit();
			}
		});

	}
	
	/*
	 * Events
	 * */
	
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
						Main_Panel menu = new Main_Panel(this);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
