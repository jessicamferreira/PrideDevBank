package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dominio.Conta;
import factory.ConnectionFactory;

public class ContaDao {
	Connection con;
	
	public ContaDao() throws SQLException {
		con = ConnectionFactory.getConnection();
	}
	
	public void save(Conta conta) throws SQLException {
		java.sql.Statement comando = con.createStatement();
		comando.execute("insert into conta (numeroConta, numeroAgencia) values('"
				+ conta.getNumeroConta() + "','" + conta.getNumeroAgencia() + "');");
	}
}
