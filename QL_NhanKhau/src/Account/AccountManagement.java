package Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountManagement {

	public Account[] accounts = new Account[100];
	
	Connection conn = null;
	public void connectSQLServer() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				conn = DriverManager.getConnection(
						"jdbc:sqlserver://localhost:1433;"
						+ "databaseName=QL_NhanKhau;"
						+ "user=sa;"
						+ "password=Tranhuy19917"
				);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getListOfAccounts(Account[] accounts) {
		int numOfAccounts = 0;
		connectSQLServer();
		try {
			PreparedStatement pstm = conn.prepareStatement("select * FROM users");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				accounts[numOfAccounts] = new Account(rs.getString("usename"), rs.getString("passwords"));
				numOfAccounts++;
			}
			numOfAccounts -= 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
