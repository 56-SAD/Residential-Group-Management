package main;

import Account.AccountManagement;
import qL_NhanKhau.HoKhauManagement;

public class Main {

	public static void main(String[] args) {
		
		AccountManagement accountM = new AccountManagement();
		accountM.getListOfAccounts(accountM.accounts);
		for(int i = 0; i< accountM.accounts.length; i++) {
			if(accountM.accounts[i] != null)
				System.out.println(accountM.accounts[i].getUsername() + " " + accountM.accounts[i].getPasswords());
		}
		
		HoKhauManagement hoKhauM = new HoKhauManagement();
	}
}
