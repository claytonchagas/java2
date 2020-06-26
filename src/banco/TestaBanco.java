package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaBanco {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","123456");
		System.out.println("Ok, conectado ao banco!!!");
		con.close();
	}
}