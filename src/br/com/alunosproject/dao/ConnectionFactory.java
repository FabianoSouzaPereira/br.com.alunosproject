package br.com.alunosproject.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String DATABASE = "projetoalunos";
	@SuppressWarnings("unused")
	private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
	private static final String STR_CONEXAO = "jdbc:mysql://localhost/";
	private static String tipoBanco; //uso para futuro para identificar tipo de banco
	
   public static Connection getConnection() {  
	         
        	if (tipoBanco == ("mysql")) {
        	} try{	
        		return DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA); 	
        	} catch (SQLException e) {
        		System.out.println("Tipo de Banco errado.");
        		throw new RuntimeException(e);  
        }  
		finally{
    	
        }
      }
   
	public static void fechaConexao(Connection conn) {

		try {
			if (conn != null) {
				conn.close();
			//	System.out.println("Fechada a conexão com o banco de dados");
			}

		} catch (Exception e) {
			System.out.println("Não foi possível fechar a conexão com o banco de dados " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt) {

		try {
			if (conn != null) {
				fechaConexao(conn);
			}
			if (stmt != null) {
				stmt.close();
			//	System.out.println("Statement fechado com sucesso");
			}


		} catch (Exception e) {
			System.out.println("Não foi possível fechar o statement " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {

		try {
			if (conn != null || stmt != null) {
				fechaConexao(conn, stmt);
			}
			if (rs != null) {
				rs.close();
			//	System.out.println("ResultSet fechado com sucesso");
			}


		} catch (Exception e) {
			System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
		}
  
	}

	public static void fechaConexao(Connection conn, Statement stmt, ResultSet rs){
		try{
			if (conn != null) {
				conn.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			//	System.out.println("ResultSet fechado com sucesso");
			}
		}catch(Exception e){
			System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
		}
	}
}
  






