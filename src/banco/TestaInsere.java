package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsere {
	public static void main(String[] args) {
		try {
			String insrt = "insert into contatos (nome,email,endereco) values (?,?,?)";
			Connection con = FabricaDeConexoes.getConnection();
			PreparedStatement stmt = con.prepareStatement(insrt);
			stmt.setString(1, "Clayton");
			stmt.setString(2, "clayton@clayton.com");
			stmt.setString(3, "Av. Brasil, nr 10000");
			stmt.execute();
			stmt.close();
			System.out.println("Gravação feita com sucesso!");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}