package br.com.alunosproject.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.alunosproject.cadastro.cadastros.Aluno;


public class Conexao {

	@SuppressWarnings("unused")
	private Connection Connection = null;
	
	private final String INSERT = " INSERT INTO alunos"
										+ "(matriculaAluno,"
										+ "nomeAluno,"
										+ " apelidoAluno,"
										+ " idadeAluno,"
										+ " cbIdadeAluno,"
										+ " sexoAluno,"
										+ " paiAluno,"
										+ " maeAluno,"
										+ " outRespAluno,"
										+ " dataNascALuno,"
										+ " nacionalidadeAluno,"
										+ " naturalidadeAluno,"
										+ " endAluno,"
										+ " bairAluno,"
										+ " cidAluno,"
										+ " cepAluno,"
										+ " relAfetivoAluno,"
										+ " infoAdicionalAluno,"
										+ " dataCadastroAluno,"
										+ " dataAtualizacaoAluno,"
										+ " fotoAluno)"
										+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
																				
	private final String INSERT2 =	"INSERT INTO telefones (telefonesAluno, celularAluno) VALUES(?,?);";
										
									
	
	private final String UPDATE = "UPDATE alunos , telefones SET " 
			+ " alunos.nomeAluno=?,"
		    + " alunos.apelidoAluno=?, "
		    + " alunos.idadeAluno=?,"
		    + " alunos.cbIdadeAluno=?,"
		    + " alunos.sexoAluno=?,"
		    + " alunos.paiAluno=?,"
		    + " alunos.maeAluno=?,"
		    + " alunos.outRespAluno=?,"
		    + " alunos.dataNascAluno=?,"				
		    + " alunos.nacionalidadeAluno=?,"
		    + " alunos.naturalidadeAluno=?," 
		    + " alunos.endAluno=?,"
		    + " alunos.bairAluno=?,"
		    + " alunos.cidAluno=?,"
			+ " alunos.cepAluno=?,"
		    + " alunos.relAfetivoAluno=?, "
		    + " alunos.infoAdicionalAluno=?, "
		    + " alunos.dataAtualizacaoAluno=?," 
		    + " alunos.fotoAluno=?,"
			+ " telefones.telefonesAluno=?,"
		    + " telefones.celularAluno=?"
			+ " WHERE alunos.idAluno= telefones.idTelefones"
		    + " AND alunos.idAluno = ?;";
	
	@SuppressWarnings("unused")
	private final String DELETE = "DELETE FROM alunos a, telefones b"
									+ " where  (a.idAluno AND b.idTelefones = ?)"
									+ " AND(a.status=0 AND b.status=0);";
	
	private final String DELETEPARTIAL = " UPDATE alunos a , telefones b"
												+ " SET a.status= 0, b.status=0 "
												+ " where (a.idAluno=?)"
												+ " AND "
												+ "(b.IdTelefones=?);";

	
	private final String LIST = "SELECT *"
									+ " from"
									+ " alunos a, telefones b"
									+ " where (a.idAluno = b.IdTelefones) "
									+ "AND"
									+ " (a.status= 1 AND b.status=1); ";

	private final String LISTBYID =  "SELECT *  FROM alunos a, telefones b  "
										+ " WHERE (a.idAluno = ?)" 
										+ " AND  (a.idAluno = b.IdTelefones)"
										+ " AND (a.status= 1 AND b.status= 1);";
																	
	
	private final String LISTSELECTED = "SELECT * "
											+ "FROM alunos  "
											+ "WHERE idAluno= ? ;";
	
	
	private final String MAXVALOR = "SELECT MAX(matriculaAluno) FROM alunos;";
	

									
	public void inserir(Aluno aluno){
		if (aluno != null) {
			 
		 try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(INSERT);
				
				pstm.setInt(1, aluno.getMatricula());
				pstm.setString(2, aluno.getNome());
				pstm.setString(3, aluno.getApelido());
				pstm.setString(4, aluno.getIdade());
				pstm.setString(5, aluno.getCbIdade());
				pstm.setString(6, aluno.getSexo());
				pstm.setString(7, aluno.getPai());
				
				pstm.setString(8, aluno.getMae());
				pstm.setString(9, aluno.getOutResp());
				pstm.setString(10, aluno.joinDate(aluno.getDataNasc()));
				pstm.setString(11, aluno.getNacionalidade());
				pstm.setString(12, aluno.getNaturalidade());
				
				pstm.setString(13, aluno.getEndereco());
				pstm.setString(14, aluno.getBairro());
				pstm.setString(15, aluno.getCidade());
				pstm.setString(16, aluno.getCep());
				pstm.setString(17, aluno.getRelAfetivo());
			
				pstm.setString(18, aluno.getInfoAdicional());
				pstm.setString(19, aluno.joinDate(aluno.getDataCadastro()));
				pstm.setString(20, aluno.joinDate(aluno.getDataAtualizacao()));
				pstm.setString(21, aluno.getFoto());
				
						
				pstm.execute();
				pstm.clearParameters();
				//Cadastro tabela telefones
				pstm = conn.prepareStatement(INSERT2);
				
				pstm.setString(1, aluno.getTelefone());
				pstm.setString(2, aluno.getCelular());
				pstm.execute();
				
				
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
				getAlunos();
				ConnectionFactory.fechaConexao(conn, pstm); 
		

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir Aluno no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O Aluno enviado por parâmetro está vazio");
		}
	}
	
	public void atualizar(Aluno aluno){
		if (aluno != null) {
			 
			 try {
					Connection conn = ConnectionFactory.getConnection();  
					PreparedStatement pstm;
					pstm = conn.prepareStatement(UPDATE);
					pstm.setString(1, aluno.getNome());
					pstm.setString(2, aluno.getApelido());
					pstm.setString(3, aluno.getIdade());
					pstm.setString(4, aluno.getCbIdade());
					pstm.setString(5, aluno.getSexo());
					pstm.setString(6, aluno.getPai());
					
					pstm.setString(7, aluno.getMae());
					pstm.setString(8, aluno.getOutResp());
					pstm.setString(9, aluno.getDataNasc());
					pstm.setString(10, aluno.getNacionalidade());
					pstm.setString(11, aluno.getNaturalidade());
					
					pstm.setString(12, aluno.getEndereco());
					pstm.setString(13, aluno.getBairro());
					pstm.setString(14, aluno.getCidade());
					pstm.setString(15, aluno.getCep());
					pstm.setString(16, aluno.getRelAfetivo());
					
					pstm.setString(17, aluno.getInfoAdicional());
					pstm.setString(18, aluno.getDataAtualizacao());
					pstm.setString(19, aluno.getFoto());
							
					pstm.setString(20, aluno.getTelefone());
					pstm.setString(21, aluno.getCelular());
					pstm.setInt(22, aluno.getId());
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
	
	public void apagar(int id){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETEPARTIAL);

			pstm.setInt(1, id);
			pstm.setInt(2, id);

			pstm.execute();
			JOptionPane.showMessageDialog(null, "Excluido Aluno com sucesso");
			ConnectionFactory.fechaConexao(conn, pstm);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir Aluno do banco de "
					+ "dados " + e.getMessage());
		}
		
	}
	
	public List<Aluno> getAlunos() {
		Connection conn = null; 
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			conn = ConnectionFactory.getConnection(); 
			pstm = conn.prepareStatement(LIST);
			rs = pstm.executeQuery();
	
						
			while (rs.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setId(rs.getInt("idAluno"));
				aluno.setMatricula(rs.getInt("matriculaAluno"));
				aluno.setNome(rs.getString("nomeAluno"));
				aluno.setApelido(rs.getString("apelidoAluno"));
				aluno.setIdade(rs.getString("idadeAluno"));
				aluno.setCbIdade(rs.getString("cbIdadeAluno"));
				
				aluno.setSexo(rs.getString("sexoAluno"));
				aluno.setPai(rs.getString("paiAluno"));
				aluno.setMae(rs.getString("maeAluno"));
				aluno.setOutResp(rs.getString("outRespAluno"));
				aluno.setDataNasc(rs.getString("dataNascAluno"));
				
				aluno.setNacionalidade(rs.getString("nacionalidadeAluno"));
				aluno.setNaturalidade(rs.getString("naturalidadeAluno"));
				aluno.setEndereco(rs.getString("endAluno"));
				aluno.setBairro(rs.getString("bairAluno"));
				aluno.setCidade(rs.getString("cidAluno"));
				
				aluno.setCep(rs.getString("cepAluno"));
				aluno.setRelAfetivo(rs.getString("relAfetivoAluno"));
				aluno.setInfoAdicional(rs.getString("infoAdicionalAluno"));
				aluno.SetDataCadastro(rs.getString("dataCadastroAluno"));
				aluno.setDataAtualizacao(rs.getString("dataAtualizacaoAluno"));
				
				aluno.setTelefone(rs.getString("telefonesAluno"));
				aluno.setCelular(rs.getString("celularAluno"));
				aluno.setStatus(rs.getInt("status"));	
				alunos.add(aluno);
				
				
			}
			ConnectionFactory.fechaConexao(conn, pstm, rs); 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar alunos " + e.getMessage());
		}
		return alunos;
	}
	
	
		public Aluno getAlunoById(int id) {
			
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Aluno aluno = new Aluno();
			
			try {
				Connection conn = ConnectionFactory.getConnection();
				pstm = conn.prepareStatement(LISTBYID );
				pstm.setInt(1, id);
				rs = pstm.executeQuery();
				
				while (rs.next()) {
					
					
					aluno.setId(rs.getInt("idAluno"));
					aluno.setMatricula(rs.getInt("matriculaAluno"));
					aluno.setNome(rs.getString("nomeAluno"));
					aluno.setApelido(rs.getString("apelidoAluno"));
					aluno.setIdade(rs.getString("idadeAluno"));
					aluno.setCbIdade(rs.getString("cbIdadeAluno"));
					aluno.setSexo(rs.getString("sexoAluno"));
					
					aluno.setPai(rs.getString("paiAluno"));
					aluno.setMae(rs.getString("maeAluno"));
					aluno.setOutResp(rs.getString("outRespAluno"));
					aluno.setDataNasc(rs.getString("dataNascAluno"));
					
					aluno.setNacionalidade(rs.getString("nacionalidadeAluno"));
					aluno.setNaturalidade(rs.getString("naturalidadeAluno"));
					aluno.setEndereco(rs.getString("endAluno"));
					aluno.setBairro(rs.getString("bairAluno"));
					aluno.setCidade(rs.getString("cidAluno"));
					
					aluno.setCep(rs.getString("cepAluno"));
					aluno.setRelAfetivo(rs.getString("relAfetivoAluno"));
					aluno.setInfoAdicional(rs.getString("infoAdicionalAluno"));
					aluno.SetDataCadastro(rs.getString("dataCadastroAluno"));
					aluno.setDataAtualizacao(rs.getString("dataAtualizacaoAluno"));
					aluno.setFoto(rs.getString("fotoAluno"));
					
					aluno.setTelefone(rs.getString("telefonesAluno"));
					aluno.setCelular(rs.getString("celularAluno"));
				
				}
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao listar alunos " + e.getMessage());
			}
			return aluno;
		}
		
		
		public Aluno getAlunoByMatricula() {
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Aluno aluno = new Aluno();
	
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(MAXVALOR);
				rs = pstm.executeQuery();
				
				
				aluno.setMatricula(rs.getInt("matriculaAluno"));			
				
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			return aluno;
		}
		
		
		public String getLISTSELECTED() {
			return LISTSELECTED;
		}
		
		public void getmaximaMatricula(){
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Aluno aluno = new Aluno();
	
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(MAXVALOR);
				rs = pstm.executeQuery();
				
				
				aluno.setMatricula(rs.getInt("matriculaAluno"));			
				
				ConnectionFactory.fechaConexao(conn, pstm, rs); 	
				
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			
		}
		
		
		public String getMAXVALOR(){
			return MAXVALOR;
		}
		
	
}	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	
	
	 
	public static ResultSet connectarAlunos(ResultSet rs) {
	
	try {
		Connection conexao = new  ConnectionFactory().getConnection(); 
			Statement stm = conexao.createStatement();
			String sql = "Select * from alunos";
		   	rs = stm.executeQuery(sql);
		   /*	
        	while (rs.next()){
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" +  rs.getString(3) + "\t" +  rs.getString(4) + "\t" +  rs.getString(5) + "\t" +  rs.getString(6) + "\t" +  rs.getString(7) + "\t" +  rs.getString(8));
				
				}
        	
		} catch (Exception e) {
			System.out.println("Houve erro no processo");
			e.printStackTrace();
		
		} finally {
			try{
				@SuppressWarnings("unused")
				Connection conexao = null;
				System.out.println("Desconectado.");
			} catch (Exception e) {
				 System.out.println("Houve erro no fechamento da conexão");  
		          e.printStackTrace();
			}
		}
	
	return rs;

	}

		
		public static boolean estaconectado(){
			return true;
		}
		
	
}*/
	