package qL_NhanKhau;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoKhauManagement {

	HoKhau[] hoKhaus = new HoKhau[100];
	
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
	
	public void getListOfHoKhau(HoKhau[] hoKhaus) {
		connectSQLServer();
		try {
			PreparedStatement pstm = conn.prepareStatement("select * FROM HoKhau");
			ResultSet rs = pstm.executeQuery();
			int numOfHoKhau = 0;
			while(rs.next()) {
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
