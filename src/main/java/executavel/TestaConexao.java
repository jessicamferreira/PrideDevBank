package executavel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ContaDao;
import dominio.Conta;
import factory.ConnectionFactory;


public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Conta conta = new Conta("002", "12356");
		ContaDao contaDao = new ContaDao(); 
		contaDao.save(conta);
	}
/*	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			
			java.sql.Statement comando = con.createStatement();
			
			comando.execute("select * from Conta");
			ResultSet resultSet = comando.getResultSet();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString("numeroConta"));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/ 
}
