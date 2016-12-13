package br.com.alunosproject.dao;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import br.com.alunosproject.cadastro.cadastros.Aluno;
import br.com.alunosproject.cadastro.cadastros.Pessoa;

public class testador extends Pessoa {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Aluno a = new Aluno();
				atualizar(a);
				}
			});
	}
	private final static String UPDATE_ALUNO = 
			"UPDATE aluno as aluno,"
			+ " enderecoAluno as enderecoAluno, "
			+ " telefoneAluno as telefoneAluno, "
			+ " emailAluno as emailAluno"
		+ "SET " 
			+" aluno.nomeAluno =  ?"


		+" WHERE aluno.idAluno = ? and enderecoAluno.idAluno=? and telefoneAluno.idAluno=? and emailAluno.idALuno=?;";

	
	
	public static void atualizar(Aluno aluno){
		if (aluno != null) {
			 
			 try {
					Connection conn = ConnectionFactory.getConnection();  
					PreparedStatement pstm;
					pstm = conn.prepareStatement(UPDATE_ALUNO );
					pstm.setString(1, aluno.getNome());
					pstm.setString(2, aluno.getApelido());	
					pstm.execute();	
					JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
					ConnectionFactory.fechaConexao(conn, pstm); 
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao alterar Aluno no banco de "
							+ "dados " + e.getMessage());
				}
			} else {
				System.out.println("As informações enviadas estão vazias, verifique sua inserção!");
			}
	}
	

}
