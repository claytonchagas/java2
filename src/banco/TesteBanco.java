package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteBanco	{
	public	static	void	main(String[]	args)	throws	SQLException	{
		Connection	conexao	=	DriverManager.getConnection("jdbc:mysql://localhost/test","root","123456");
		System.out.println("Conectado!");
		conexao.close();
	}
}