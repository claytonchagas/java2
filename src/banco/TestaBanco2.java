package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaBanco2 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = getConnections();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Ok, conectado ao banco!!!");
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnections() throws SQLException {
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","123456");
		return con;
	}
}