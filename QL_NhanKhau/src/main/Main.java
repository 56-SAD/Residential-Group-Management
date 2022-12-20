package main;

import java.awt.EventQueue;

import panels.LoginPanel;
import panels.MainPanel;

public class Main {
	public static int statusPanel = 1;
	public final int loginStatus = 1;
	public final int hienThiNhanKhauStatus = 2;
	public final int themNhanKhauStatus = 3;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel login = new LoginPanel();
					MainPanel main = new MainPanel(login);
					
					main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
