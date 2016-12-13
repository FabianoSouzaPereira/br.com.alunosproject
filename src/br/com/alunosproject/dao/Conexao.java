package br.com.alunosproject.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.alunosproject.cadastro.GUI.Tela_de_Consulta;
import br.com.alunosproject.cadastro.GUI.Telalogin;
import br.com.alunosproject.cadastro.cadastros.Aluno;
import br.com.alunosproject.cadastro.cadastros.Mae;
import br.com.alunosproject.cadastro.cadastros.OutroResponsavel;
import br.com.alunosproject.cadastro.cadastros.Pai;
import br.com.alunosproject.cadastro.cadastros.Pessoa;
import br.com.alunosproject.cadastro.cadastros.Responsaveis;


public class Conexao {
	
	@SuppressWarnings("unused")
	private Connection Connection = null;
	
	private final String INSERT_RESPONSAVEIS = 
			" INSERT INTO Responsaveis "
			+ " (idResp)"
			+ " value(?);";
			
	private final String INSERT_ALUNO = 
			" INSERT INTO aluno "  
			+ "  (matriculaAluno,"
			+ "  nomeAluno,"
			+ "  apelidoAluno,"
			+ "  sexoAluno,"
			+ "  idadeAluno,"
			+ "  periodoAluno,"
			+ "  nacionalidadeAluno,"
			+ "  naturalidadeAluno,"
			+ "  dataNascimentoAluno,"
			+ "  dataCadastroAluno,"   
			+ "  dataAtualizacaoAluno,"
			+ "  infoMedicaAluno,"
			+ "  infoAdicionalAluno,"
			+ "  relAfetivoAluno) "
		    + "  VALUES (?,?,?,?,?, ?,?,?,?,?, ?,?,?,?);" ;

	private final String INSERT_ENDERECO_ALUNO = " INSERT INTO enderecoAluno"
			+ "  ( enderecoAluno,"
			+ "  bairroAluno,"
			+ "  cidadeAluno,"
			+ "  estadoAluno,"
			+ "  cepAluno)"
			+ "  VALUES (?,?,?,?,?);";


	private final String INSERT_TELEFONE_ALUNO = " INSERT INTO telefoneAluno"
			+ "  (celularAluno,"
			+ "  casaAluno,"
			+ "  trabalhoAluno)"
			+ "  VALUES (?,?,?);";

	private final String INSERT_EMAIL_ALUNO = " INSERT INTO emailAluno"
			+ "  (emailAluno,"
			+ "  email2Aluno,"
			+ "  emailTrabalhoAluno)"
			+ "  VALUES (?,?,?);";

																
	private final String INSERT_PAI =  "INSERT INTO pai "
			+ " (cpfPai,"
			+ " rgPai,"
			+ " nomePai,"
			+ " dataNascimentoPai,"
			+ " profissaoPai,"
			+ " localTrabalhoPai,"
			+ " nacionalidadePai,"
			+ " naturalidadePai)"
		 	+ " VALUES (?,?,?,?,?,?,?,?);";

	public final String INSERT_ENDERECO_PAI = "INSERT INTO enderecopai "
			 + " (enderecoPai,"
			 + " bairroPai,"
		     + " cidadePai,"
		     + " estadoPai,"
			 + " cepPai)"
		 	 + " VALUES (?,?,?,?,?);";

		       
	public final String INSERT_TELEFONE_PAI = " INSERT INTO telefonepai"
			 + "  (CelularPai,"
		 	 + "  CasaPai,"
		 	 + "  TrabalhoPai)"
		 	 + "  VALUES (?,?,?);";

	public final String INSERT_EMAIL_PAI = " INSERT INTO emailPai"
			+ " (emailPai,"
		 	+ " email2Pai,"
		 	+ " emailTrabalhoPai)"
		 	+ " VALUES (?,?,?);";
			
		
	
	private final String INSERT_MAE = "INSERT INTO mae "
		+ "  (cpfMae,"
		+ "  rgMae,"
		+ "  nomeMae,"
		+ "  dataNascimentoMae,"
		+ "  profissaoMae,"
		+ "  localTrabalhoMae,"
		+ "  nacionalidadeMae,"
		+ "  naturalidadeMae)"
		+ "  VALUES (?,?,?,?,?,?,?,?);";
	
	private final String INSERT_ENDERECO_MAE = 	" INSERT INTO enderecomae"
		+ " (EnderecoMae,"
		+ "  bairroMae,"
		+ "  cidadeMae,"
		+ "  estadoMae,"
		+ "  cepMae)"
		+ "  VALUES (?,?,?,?,?);";
	
	private final String INSERT_TELEFONE_MAE =  " INSERT INTO telefonemae"
		+ "  (CelularMae,"
		+ "  CasaMae,"
		+ "  TrabalhoMae)"
		+ "  VALUES (?,?,?);";
	
	private final String INSERT_EMAIL_MAE =  " INSERT INTO emailmae"
		+ "  (emailMae,"
		+ "  email2Mae,"
		+ "  emailTrabalhoMae)"
		+ "  VALUES (?,?,?);";
	
	
	private final String INSERT_OUTRO = "INSERT INTO outroresponsavel "
			+ "  (cpfOutroResp,"
 			+ "  rgOutroResp,"
 			+ "  nomeOutroResp,"
 			+ "  dataNascimentoOutroResp,"
 			+ "  profissaoOutroresp,"
 			+ "  localTrabalhoOutroResp,"
 			+ "  nacionalidadeOutroResp,"
 			+ "  naturalidadeOutroResp)"
  			+ "  VALUES (?,?,?,?,?,?,?,?);";

	private final String INSERT_ENDERECO_OUTRO = "  INSERT INTO enderecoOutroresp"
			+ "   (EnderecoOutroResp,"
			+ "   bairroOutroResp,"
			+ "   cidadeOutroResp,"
			+ "   estadoOutroResp,"
			+ "   cepOutroResp)"
			+ "   VALUES (?,?,?,?,?);";

	private final String INSERT_TELEFONE_OUTRO =  "  INSERT INTO telefoneoutroresp"
			+ "  (celularOutroResp,"
			+ "  casaOutroResp,"
			+ "  trabalhoOutroresp)"
			+ "  VALUES (?,?,?);";

	private final String INSERT_EMAIL_OUTRO =  "  INSERT INTO emailoutroresp"
			+ "  (emailOutroresp,"
			+ "   email2Outroresp,"
			+ "   emailTrabalhoOutroresp)"
			+ "   VALUES (?,?,?)";
	
	
	private final String INSERT_PROFESSOR = "INSERT INTO professor"
			+ " (cpfProfessor,"
			+ " rgProfessor,"
			+ " nomeProfessor,"
			+ " disciplina,"
			+ " qualificacao,"
			+ " dataCadastro,"
			+ " dataNascimento,"
			+ " flagProfessor)"
			+ " VALUES (?,?,?,?,?,?,?,?);";

	private final String INSERT_ENDERECO_PROFESSOR = " INSERT INTO enderecoprofessor"
			+ " (idProfessor,"
			+ " endereco,"
			+ " bairro,"
			+ " cidade,"
			+ " cep)"
			+ " VALUES (?,?,?,?,?);";

	private final String INSERT_TELEFONE_PROFESSOR =  " INSERT INTO telefoneprofessor"
			+ "  (idProfessor,"
			+ "  celularprofessor,"
			+ "  casaProfessor,"
			+ "  TrabalhoProfessor)"
			+ "  VALUES (?,?,?,?);";

	private final String INSERT_EMAIL_PROFESSOR = " INSERT INTO emailprofessor"
			+ "  (idProfessor,"
			+ "  emailprofessor,"
			+ "  email2professor,"
			+ "  emailTrabalhoprofessor)"
			+ "  VALUES (?,?,?,?);";

			
	private final String INSERT_TURMA = "INSERT INTO turma"
			+ " (idProfessor,"
			+ " qtdAlunos,"
			+ " serieturma,"
			+ " nometurma)"
			+ " VALUES (?,?,?,?);";
	
										
//	private int idaluno =  Aluno.getId();
	private final String UPDATE_ALUNO = 
		"UPDATE aluno a,"
			+ " enderecoAluno b, "
			+ " telefoneAluno c, "
			+ " emailAluno d "
		+ "SET " 
			+" a.nomeAluno =  ?,"
			+" a.apelidoAluno =  ?,"
			+" a.sexoAluno =  ?,"
			+" a.idadeAluno =  ?,"
			+" a.periodoAluno =  ?,"
			+" a.nacionalidadeAluno = ?,"
			+" a.naturalidadeAluno =  ?,"
			+" a.dataNascimentoAluno =  ?,"
			+" a.dataAtualizacaoAluno = ?,"
			+" a.infoMedicaAluno =  ?,"
			+" a.infoAdicionalAluno =  ?,"
			+" a.relAfetivoAluno =  ?,"
			+" a.status = ?, "
			+" b.enderecoAluno =  ?,"
			+" b.bairroAluno =  ?,"
			+" b.cidadeAluno =  ?,"
			+" b.estadoAluno =  ?,"
			+" b.cepAluno =  ?,"
			+" c.celularAluno =  ?,"
			+" c.casaAluno =  ?,"
			+" c.trabalhoAluno =  ?,"
			+" d.emailAluno =  ?,"
			+" d.email2Aluno =  ?,"
			+" d.emailTrabalhoAluno = ?"
		+" WHERE a.idAluno = ? and b.idEnderecoAluno=? and c.idtelefoneALuno=? and d.idEmailAluno=?;";

	private final String UPDATE_PAI = 
			"UPDATE pai a, "
				+ " enderecoPai b,"
				+ " telefonePai c,"
				+ " emailPai d "
			+ " SET "
				+ " a.cpfPai = ?,"
				+ " a.rgPai = ?,"
				+ " a.nomePai = ?,"
				+ " a.dataNascimentoPai = ?,"
				+ " a.nacionalidadePai = ?,"
				+ " a.naturalidadePai = ?,"
				+ " a.profissaoPai = ?,"
				+ " a.localTrabalhoPai = ?,"
				+ " b.enderecoPai = ?,"
				+ " b.bairroPai = ?,"
				+ " b.cidadePai = ?,"
				+ " b.estadoPai = ?,"
				+ " b.cepPai = ?,"
				+ " c.casaPai = ?,"
				+ " c.celularPai = ?,"
				+ " c.TrabalhoPai = ?,"
				+ " d.emailPai = ?,"
				+ " d.email2Pai = ?,"
				+ " d.emailTrabalhoPai = ?"
			+ " WHERE a.idPai = ? and b.idEnderecoPai = ? and c.idTelefonePai = ? and d.idEmailPai = ?;";
	
	
	private final String UPDATE_MAE = 
		  "UPDATE mae a, "
			+ " enderecoMae b, "
			+ " telefoneMae c, "
			+ " emailMae d "
		   + "SET "
			+ "  a.cpfMae = ?,"
			+ "  a.rgMae = ?,"
			+ "  a.nomeMae = ?,"
			+ "  a.dataNascimentoMae = ?,"
			+ "  a.nacionalidadeMae = ?,"
			+ "  a.naturalidadeMae = ?,"
			+ "  a.profissaoMae = ?,"
			+ "  a.localTrabalhoMae = ?,"
			+ "  b.enderecoMae = ?,"
			+ "  b.bairroMae = ?,"
			+ "  b.cidadeMae = ?,"
			+ "  b.estadoMae = ?,"
			+ "  b.cepMae = ?,"
			+ "  c.CelularMae = ?,"
			+ "  c.CasaMae = ?,"
			+ "  c.TrabalhoMae = ?,"
			+ "  d.emailMae = ?,"
			+ "  d.email2Mae = ?,"
			+ "  d.emailTrabalhoMae = ? "
		+" WHERE a.idMae = ? AND b.idEnderecoMae = ? AND c.idTelefoneMae = ? AND d.idEmailMae = ?;";
	
	private final String UPDATE_OUTRORESPONSAVEL =
			"UPDATE outroresponsavel a,"
            + " enderecooutroresp b,"
            + " telefoneoutroresp c,"
            + " emailoutroresp d "
           +" SET "
            +" a.cpfOutroResp = ?, "
			+" a.rgOutroResp = ?, "
			+" a.nomeOutroResp = ?, "
			+" a.dataNascimentoOutroResp = ?, "
			+" a.profissaoOutroresp = ?, "
			+" a.localTrabalhoOutroResp = ?, "
			+" a.nacionalidadeOutroResp = ?, "
			+" a.naturalidadeOutroResp = ?, "
			+" b.enderecoOutroResp = ?, "
			+" b.bairroOutroResp = ?, "
			+" b.cidadeOutroResp = ?, "
			+" b.estadoOutroResp = ?, "
			+" b.cepOutroResp = ?, "
			+" c.Celularoutroresp = ?, "
			+" c.Casaoutroresp = ?, "
			+" c.Trabalhooutroresp = ?, "
			+" d.emailOutroresp = ?, "
			+" d.email2Outroresp = ?, "
			+" d.emailTrabalhoOutroresp = ? "
		  +" WHERE a.idOutroResp = ? "
			+" and "
			+" b.idEnderecoOutroResp = ? "
			+" AND "
			+" c.idTelefoneOutroResp =  ? "
			+" AND "
			+" d.idEmailOutroResp = ?; ";
	
	private final String UPDATE_PROFESSOR = "UPDATE professor SET "
			+ " cpfProfessor,"
			+ " rgProfessor,"
			+ " nomeProfessor,"
			+ " disciplina,"
			+ " qualificacao,"
			+ " dataCadastro,"
			+ " dataNascimento,"
			+ " flagProfessor)"
			+ " VALUES (?,?,?,?,?,?,?,?)"
			+ " WHERE idAluno = ?;"

			+ " UPDATE enderecoprofessor SET "
			+ " rua,"
			+ " bairro,"
			+ " cidade,"
			+ " cep)"
			+ " VALUES (?,?,?,?)"
			+ " WHERE idAluno = ?;"

			+ " UPDATE telefoneprofessor SET "
			+ "  celularprofessor,"
			+ "  casaProfessor,"
			+ "  TrabalhoProfessor)"
			+ "  VALUES (?,?,?)"
			+ " WHERE idAluno = ?;"

			+ " UPDATE emailprofessor SET "
			+ "  emailprofessor,"
			+ "  email2professor,"
			+ "  emailTrabalhoprofessor)"
			+ "  VALUES (?,?,?)"
			+ " WHERE idAluno = ?;";
			
	private final String UPDATE_TURMA = "INSERT INTO turma"
			+ " (qtdAlunos,"
			+ " serieturma,"
			+ " nometurma)"
			+ " VALUES (?,?,?);";
	
	private final String DELETE_PARCIAL_ALUNO = 
			"UPDATE "
			+"  aluno a,"
			+"  enderecoaluno b,"
			+"  telefonealuno c,"
			+"  emailaluno d "
			+"SET "
			+"  a.status = ?,"
			+"  b.status = ?,"
			+"  c.status = ?,"
			+"  d.status = ? "
			+"WHERE "
			+"  a.idAluno = ? "
			+"  AND "
			+"  b.idEnderecoAluno = ? "
			+"  AND "
			+"  c.idTelefoneAluno = ? "
			+"  AND "
			+"  d.idEmailAluno = ?;";
	
	private final String DELETE_PARCIAL_PAI = 
			"UPDATE "
			+ "pai a, "
			+ "enderecoPai b, "
			+ "telefonePai c, "
			+ "emailPai d "
			+ "SET "
			+ "a.status = ?, "
			+ "b.status = ?, "
			+ "c.status = ?, "
			+ "d.status = ? "
			+ "WHERE a.idPai = ? "
			+ "and "
			+ "b.idEnderecoPai = ? "
			+ "and "
			+ "c.idTelefonePai = ? "
			+ "and "
			+ "d.idEmailPai = ?;";
	
	private final String DELETE_PARCIAL_MAE = 
			"UPDATE "
			+ "mae a, "
			+ "enderecoMae b, "
			+ "telefoneMae c, "
			+ "emailMae d "
			+ "SET "
			+ "a.status = ?, "
			+ "b.status = ?, "
			+ "c.status = ?, "
			+ "d.status = ? "
			+ "WHERE a.idMae = ? "
			+ "and "
			+ "idEnderecoMae = ? "
			+ "and "
			+ "idTelefoneMae = ? "
			+ "and "
			+ "idEmailMae = ?;";
	
	
	private final String DELETE_PARCIAL_OUTRORESPONSAVEL = 
			"UPDATE "
			+ "outroresponsavel a, "
			+ "enderecoOutroResp b, "
			+ "telefoneOutroResp c,"
			+ "emailOutroResp d "
			+ "SET "
			+ "a.status = ?, "
			+ "b.status = ?, "
			+ "c.status = ?, "
			+ "d.status = ? "
			+ "WHERE a.idOutroResp = ? "
			+ "and "
			+ "b.idEnderecoOutroresp = ? "
			+ "and "
			+ "c.idTelefoneOutroResp = ? "
			+ "and "
			+ "d.idemailOutroResp = ?";
	
			
	
	private final String DELETE_PARCIAL_PROFESSOR = 
			"";
	
	private final String DELETE_PARCIAL_TURMA = 
			"";
	
 	private final String DELETE_REGISTRO = 
	
			"DELETE FROM ALUNO WHERE idAluno = ?;"

			+ "DELETE FROM EMAILALUNO WHERE idEmailAluno = ?;"

			+ "DELETE FROM EMAILMAE WHERE idEmailMae = ?;"

			+ "DELETE FROM EMAILOUTRORESP WHERE idEmailOutroresp = ?;"

			+ "DELETE FROM EMAILPAI WHERE idEmailPai = ?;"

			+ "DELETE FROM EMAILPROFESSOR WHERE idEmailProfessor = ?;"

			+ "DELETE FROM ENDERECOALUNO WHERE idEnderecoAluno = ?;"

			+ "DELETE FROM ENDERECOMAE WHERE idEnderco = ?;"

			+ "DELETE FROM ENDERECOOUTRORESP WHERE idEnderecooutroresp = ?;"

			+ "DELETE FROM ENDERECOPAI WHERE idEnderecoPai = ?;"

			+ "DELETE FROM ENDERECOPROFESSOR WHERE idEnderecoProfessor = ?;"

			+ "DELETE FROM MAE WHERE idMae = ?;"

			+ "DELETE FROM PAI WHERE idPai = ?;"

			+ "DELETE FROM OUTRORESPONSAVEL WHERE idOutroresp = ?;"

			+ "DELETE FROM TELEFONEPAI WHERE idTelefonePai = ?;"

			+ "DELETE FROM TELEFONEALUNO WHERE idTelefone = ?;"

			+ "DELETE FROM TELEFONEMAE WHERE idTelefone = ?;"

			+ "DELETE FROM TELEFONEOUTRORESP WHERE idTelefoneOutroresp = ?;"

			+ "DELETE FROM PROFESSOR WHERE idTelefoneProfessor = ?;"

			+ "DELETE FROM TURMA WHERE idTurma = ?;";

	private final String LIST_ALUNO = 
			"SELECT DISTINCT a.*,b.*,c.*, d.* , e.* "
		+	"FROM aluno a "
		+	"join enderecoaluno b "
		+	"ON  a.idAluno= b.idEnderecoAluno "
		+	"JOIN telefonealuno c "
		+	"on c.idTelefoneAluno = b.idEnderecoAluno "
		+	"join emailaluno d " 
		+	"on d.idEmailAluno = c.idTelefoneAluno "
		+   "join pai e "
		+   "on e.idPai = d.idEmailAluno "
		+	"WHERE A.idAluno= ? "
		+ "  or "
		+ "  b.idEnderecoAluno = ? "
		+ "  or "
		+ "  c.idTelefoneAluno = ? "
		+ "  or "
		+ "  d.idEmailAluno = ? "
		+ "  Group by a.idAluno "
		+ "  Having a.status = 1;";
		

	private final String LIST_PAI = 
			"SELECT  DISTINCT a.* , b.* , c.* , d.* "
			+ " FROM pai a "
			+ " join enderecoPai b "
			+ " on a.idPai = b.idEnderecoPai "
			+ " join telefonePai c "
			+ " on b.idEnderecoPai = c.idTelefonePai "
			+ " join emailPai d "
			+ " on c.idTelefonePai = d.idEmailPai "
			+ " where a.idPai = ? "
			+ " or "
			+ " b.idEnderecoPai = ? "
			+ " or "
			+ " c.idTelefonePai = ? "
			+ " or "
			+ " d.idEmailPai = ? "
			+ " Group by a.idPai "
			+ " having a.status = 1;";

	private final String LIST_MAE = 
			"SELECT DISTINCT a.* , b.* , c.* , d.* "
			+"FROM mae a "
			+"JOIN enderecomae b "
			+"on a.idMae = b.idEnderecoMae "
			+"JOIN telefonemae c "
			+"on b.idEnderecoMae = c.idTelefoneMae "
			+"JOIN emailmae d "
			+"ON c.idTelefoneMae = d.idEmailMae "
			+"where a.idMae = ? "
			+" or "
			+" b.idEnderecoMae = ? "
			+" or "
			+ "c.idTelefoneMae = ? "
			+ "or "
			+ "d.idEmailMae = ? "
			+ "group by a.idMae "
			+ "having a.Status = 1;";

	private final String LIST_OUTRO = 
			"SELECT  DISTINCT a.* , b.* , c.* , d.* "
			+" FROM outroresponsavel a "
			+" JOIN enderecooutroresp b "
			+" ON a.idOutroResp = b.idEnderecoOutroResp "
			+" JOIN telefoneoutroresp c "
			+" ON b.idEnderecoOutroResp = c.idTelefoneOutroResp "
			+" JOIN emailoutroresp d "
			+" on c.idTelefoneOutroResp = d.idEmailOutroResp "
			+" WHERE a.idOutroResp = ? "
			+" or "
			+" b.idEnderecoOutroResp = ? "
			+" or "
			+" c.idTelefoneOutroResp = ? "
			+" or "
			+" d.idEmailOutroResp = ? "
			+ " group by a.idOutroResp "
			+ " having a.status = 1;";

	private final String LISTBYID = 
			"SELECT DISTINCT a.*,b.*,c.*, d.* , e.* "
		+	"FROM aluno a "
		+	"join enderecoaluno b "
		+	"ON  a.idAluno= b.idEnderecoAluno "
		+	"JOIN telefonealuno c "
		+	"on c.idTelefoneAluno = b.idEnderecoAluno "
		+	"join emailaluno d " 
		+	"on d.idEmailAluno = c.idTelefoneAluno "
		+   "join pai e "
		+   "on e.idPai = d.idEmailAluno "
		+	"WHERE A.idAluno=?;";
	
	
	private final String LISTALUNO = 
			"SELECT idAluno as IdAluno,"
			+ " nomeAluno as NomeAluno,"
			+ " sexoAluno as SexoAluno,"
			+ " idadeAluno as IdadeAluno, "
			+ " dataCadastroAluno as DataCadastro,"
			+ " dataNascimentoAluno as DataNascimento,"
			+ " dataAtualizacaoAluno as DataAtualizacao,"
			+ " infoMedicaAluno as InfoMedica,"
			+ " infoAdicionalAluno as InfoAdicional,"
			+ " relAfetivoAluno as RelAfetivo,"
			+ " matriculaAluno as MatriculaAluno,"
			+ " enderecoAluno as Endereco,"
			+ " bairroAluno as Bairro, "
			+ " cidadeAluno as Cidade,"
			+ " cepAluno as Cep,"
			+ " idTurma as IdTurma"
			+ " FROM aluno as a "
			+ " INNER JOIN telefonealuno as b "
			+ " ON b.IdTelefoneAluno = a.IdAluno"
			+ " INNER JOIN enderecoaluno as c"
			+ " ON c.IdEnderecoAluno = b.IdTelefoneAluno "
			+ " INNER JOIN emailaluno as d"
			+ " ON d.IdEmailAluno = c.IdEnderecoAluno; ";
		//	+ "WHERE a.status = ?;";
	
 	private final String LISTSELECTED = "SELECT * " 
								+"	FROM aluno  a , telefonealuno t , enderecoaluno e , emailaluno em "
								+"	WHERE a.idAluno = t.idTelefoneAluno = e.idEnderecoAluno = em.idEmailAluno = ?;";
	
	
	private final String MAXVALOR = "SELECT MAX(matriculaAluno) as matriculaAluno "
			+ " FROM aluno "
			+ " Where status = 1;";
	
	private final String FINDCPF = //"SELECT idPai from pai where cpfPai = ?;";
			
			"SELECT	DISTINCT "
			+ " a.idPai,"
			+ " a.status, "
			+ " b.idmae, "
			+ " c.idOutroResp "
			+ " from pai a "
			+ " join mae b "
	        + " on a.idPai = b.idMae "
	        + " join outroresponsavel c "
	        + " on b.idMae = c.idOutroResp "
	      	+ " where a.cpfPai = ? "
	        + " or "
	        + " b.cpfMae = ? "
	        + " Or "
	        + " c.cpfOutroResp = ? "
	        + " group by a.idPai "
	        + " Having a.status = 1;";
	       									
	
	private final String LISTAPESQUISA = "select * from aluno where idaluno = ?";
	
private final String TESTAUSUARIO = 
		"SELECT nome, senha, bloqueio, status "
		+ "FROM usuario "
		+ "WHERE status = 1; ";
		
									
	public void inserir(Aluno aluno){
		if (aluno != null) {
			 
		 try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(INSERT_RESPONSAVEIS);
				pstm.setInt(1, aluno.getIdResp());
				pstm.execute();
				
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_ALUNO);
				pstm.setInt(1, Aluno.getMatricula());
				pstm.setString(2, aluno.getNome());
				pstm.setString(3, aluno.getApelido());
				pstm.setString(4, aluno.getSexo());
				pstm.setString(5, aluno.getIdade());
				pstm.setString(6, aluno.getCbIdade());
				pstm.setString(7, aluno.getNacionalidade());
				pstm.setString(8, aluno.getNaturalidade());
				pstm.setString(9, aluno.getDataNasc());
				pstm.setString(10, aluno.getDataCadastro());
				pstm.setString(11, aluno.getDataAtualizacao());
				pstm.setString(12, aluno.getInfoMedica());
				pstm.setString(13, aluno.getInfoAdicional());
				pstm.setString(14, aluno.getRelAfetivo());
				pstm.execute();
				
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_ENDERECO_ALUNO);
				pstm.setString(1, aluno.getEndereco());
				pstm.setString(2, aluno.getBairro());
				pstm.setString(3, aluno.getCidade());
				pstm.setString(4, aluno.getEstado());
				pstm.setString(5, aluno.getCep());
				pstm.execute();
				
				pstm.clearParameters();	
				pstm = conn.prepareStatement(INSERT_TELEFONE_ALUNO);
				pstm.setString(1, aluno.getCelular());
				pstm.setString(2, aluno.getTelefone());
				pstm.setString(3, aluno.getFonetrabalho());
				pstm.execute();
				
				pstm.clearParameters();	
				pstm = conn.prepareStatement(INSERT_EMAIL_ALUNO);
				pstm.setString(1, aluno.getEmail());
				pstm.setString(2, aluno.getEmail2());
				pstm.setString(3, aluno.getEmailtrabalhoAluno());
				
				pstm.execute();
				
		
				ConnectionFactory.fechaConexao(conn, pstm); 
		

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir Aluno no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O Aluno enviado por parâmetro está vazio");
		}
	}
	
	public void inserir(Pai pai){
		if (pai != null){
			try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(INSERT_PAI);
				
				pstm.setString(1, pai.getCpfPai());
				pstm.setString(2, pai.getRgPai());
				pstm.setString(3, pai.getNomePai());
				pstm.setString(4, pai.getDataNascimentoPai());
				pstm.setString(5, pai.getProfissaoPai());
				pstm.setString(6, pai.getLocaltrabalhoPai());
				pstm.setString(7, pai.getNacionalidadePai());
				pstm.setString(8, pai.getNaturalidadePai());
				pstm.execute();
				
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_ENDERECO_PAI);
				pstm.setString(1, pai.getEnderecoPai());
				pstm.setString(2, pai.getBairroPai());
				pstm.setString(3, pai.getCidadePai());
				pstm.setString(4, pai.getEstadoPai());
				pstm.setString(5, pai.getCepPai());
				pstm.execute();
				
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_TELEFONE_PAI);
				pstm.setString(1, pai.getCelularPai());
				pstm.setString(2, pai.getTelefonePai());
				pstm.setString(3, pai.getFoneTabalhoPai());
				pstm.execute();
				
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_EMAIL_PAI);
				pstm.setString(1, pai.getEmailPai());
				pstm.setString(2, pai.getEmail2Pai());
				pstm.setString(3, pai.getEmailTrabalhoPai());
				
				
				pstm.execute();
				
				
				ConnectionFactory.fechaConexao(conn, pstm); 
		

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir informações sobre os Pai da criança no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O campo nome da Pai enviado está vazio");
		}
	}
	
	public void inserir(Mae mae){
		if(mae != null){
			try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(INSERT_MAE);
				
				 
				pstm.setString(1, mae.getCpfMae()); 
				pstm.setString(2, mae.getRgMae());
				pstm.setString(3, mae.getNomeMae());
				pstm.setString(4, mae.getDataNascimentoMae());
				pstm.setString(5, mae.getProfissaoMae()); 
				pstm.setString(6, mae.getLocalTrabalhoMae());
				pstm.setString(7, mae.getNacionalidadeMae());
				pstm.setString(8, mae.getNaturalidadeMae());
						
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_ENDERECO_MAE);
				pstm.setString(1,  mae.getEnderecoMae());
				pstm.setString(2,  mae.getBairroMae());
				pstm.setString(3,  mae.getCidadeMae());
				pstm.setString(4, mae.getEstadoMae());
				pstm.setString(5,  mae.getCepMae());
								
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_TELEFONE_MAE);
				pstm.setString(1,  mae.getCelularMae());
				pstm.setString(2,  mae.getTelefoneMae());
				pstm.setString(3,  mae.getfoneTrabalhoMae());
				
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_EMAIL_MAE);
				pstm.setString(1,  mae.getEmailMae());
				pstm.setString(2,  mae.getEmail2Mae());
				pstm.setString(3, mae.getEmailTrabalhoMae());
				
				pstm.execute();
			
				ConnectionFactory.fechaConexao(conn, pstm); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir informações sobre a Mãe da criança no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O campo nome da Mãe enviado está vazio");
		}
	}
	
	public void inserir(OutroResponsavel outro){
		if(outro != null){
			try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(INSERT_OUTRO);
				
				pstm.setString(1, outro.getCpfOutroResp()); 
				pstm.setString(2, outro.getRgOutroResp());
				pstm.setString(3, outro.getNomeOutroResp());
				pstm.setString(4, outro.getDataNascimentoOutroResp());
				pstm.setString(5, outro.getProfissaoOutroresp()); 
				pstm.setString(6, outro.getLocalTrabalhoOutroResp()); 
				pstm.setString(7, outro.getNacionalidadeOutroResp());
				pstm.setString(8, outro.getNaturalidadeOutroResp());
						
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_ENDERECO_OUTRO);
				pstm.setString(1, outro.getEnderecoOutroResp());
				pstm.setString(2, outro.getBairroOutroResp());
				pstm.setString(3, outro.getCidadeOutroResp());
				pstm.setString(4, outro.getEstadoOutroResp());
				pstm.setString(5, outro.getCepOutroResp());
				
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_TELEFONE_OUTRO);
				pstm.setString(1, outro.getCelularOutroResp());
				pstm.setString(2, outro.getTelefoneOutroResp());
				pstm.setString(3, outro.getFoneTrabalhoOutroResp());
			
				pstm.execute();
				pstm.clearParameters();
				pstm = conn.prepareStatement(INSERT_EMAIL_OUTRO);
				pstm.setString(1, outro.getEmailOutroResp());
				pstm.setString(2, outro.getEmail2OutroResp());
				pstm.setString(3, outro.getEmailTrabalhoOutroResp());
				
				pstm.execute();
				
				ConnectionFactory.fechaConexao(conn, pstm); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir informações sobre o Outro responsável da criança no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O campo nome do Responsável enviado está vazio");
		}
	}
	
	public void atualizar(Aluno aluno){
		if (aluno != null) {
			 
			 try {
					Connection conn = ConnectionFactory.getConnection();  
					PreparedStatement pstm;
					pstm = conn.prepareStatement(UPDATE_ALUNO );
					
					pstm.setString(1, aluno.getNome());
					pstm.setString(2, aluno.getApelido());
					pstm.setString(3, aluno.getSexo());
					pstm.setString(4, aluno.getIdade());
					pstm.setString(5, aluno.getCbIdade());
					pstm.setString(6, aluno.getNacionalidade());
					pstm.setString(7, aluno.getNaturalidade());
					pstm.setString(8, aluno.getDataNasc());
					pstm.setString(9, aluno.getDataAtualizacao());
					pstm.setString(10, aluno.getInfoMedica());
					pstm.setString(11, aluno.getInfoAdicional());
					pstm.setString(12, aluno.getRelAfetivo());
					pstm.setInt(13, aluno.getStatus());
					pstm.setString(14, aluno.getEndereco());
					pstm.setString(15, aluno.getBairro());
					pstm.setString(16, aluno.getCidade());
					pstm.setString(17, aluno.getEstado());
					pstm.setString(18, aluno.getCep());
					pstm.setString(19, aluno.getCelular());
					pstm.setString(20, aluno.getTelefone());
					pstm.setString(21, aluno.getFonetrabalho());
					pstm.setString(22, aluno.getEmail());
					pstm.setString(23, aluno.getEmail2());
					pstm.setString(24, aluno.getEmailtrabalhoAluno());
					pstm.setInt(25, Aluno.getId());
					pstm.setInt(26, Aluno.getId());
					pstm.setInt(27, Aluno.getId());
					pstm.setInt(28, Aluno.getId());
					pstm.execute();
					
					ConnectionFactory.fechaConexao(conn, pstm); 
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao alterar Aluno no banco de "
							+ "dados: " + e.getMessage());
				} 
			} else {
				System.out.println("As informações enviadas estão vazias, verifique sua inserção!");
			} 
	}
	
	public void atualizar(Pai pai){
		if (pai != null){
			
			try{
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(UPDATE_PAI );
				
				pstm.setString(1, pai.getCpfPai());
				pstm.setString(2, pai.getRgPai());
				pstm.setString(3, pai.getNomePai());
				pstm.setString(4, pai.getDataNascimentoPai());
				pstm.setString(5, pai.getNacionalidadePai());
				pstm.setString(6, pai.getNaturalidadePai());
				pstm.setString(7, pai.getProfissaoPai());
				pstm.setString(8, pai.getLocaltrabalhoPai());
				pstm.setString(9, pai.getEndPai());
				pstm.setString(10, pai.getBairroPai());
				pstm.setString(11, pai.getCidadePai());
				pstm.setString(12, pai.getEstadoPai());
				pstm.setString(13, pai.getCepPai());
				pstm.setString(14, pai.getTelefonePai());
				pstm.setString(15, pai.getCelularPai());
				pstm.setString(16, pai.getFoneTabalhoPai());
				pstm.setString(17, pai.getEmailPai());
				pstm.setString(18, pai.getEmail2Pai());
				pstm.setString(19, pai.getEmailTrabalhoPai());
			    pstm.setInt(20, Pai.getIdPai());
			    pstm.setInt(21, Pai.getIdPai());
			    pstm.setInt(22, Pai.getIdPai());
			    pstm.setInt(23, Pai.getIdPai());
			    pstm.execute();
			    
			    ConnectionFactory.fechaConexao(conn, pstm);    
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao alterar Informações sobre o Pai do aluno no banco de "
						+ "dados " + e.getMessage());
			}
		}else {
			System.out.println("As informações enviadas estão vazias, verifique sua inserção!");
		}
	}
	
	public void atualizar(Mae mae){
		if (mae != null) {
			 
			 try {
					Connection conn = ConnectionFactory.getConnection();  
					PreparedStatement pstm;
					pstm = conn.prepareStatement(UPDATE_MAE);
					pstm.setString(1, mae.getCpfMae());
					pstm.setString(2, mae.getRgMae());
					pstm.setString(3, mae.getNomeMae());
					pstm.setString(4, mae.getDataNascimentoMae());
					pstm.setString(5, mae.getNacionalidadeMae());
					pstm.setString(6, mae.getNaturalidadeMae());
					pstm.setString(7, mae.getProfissaoMae());
					pstm.setString(8, mae.getLocalTrabalhoMae());
					pstm.setString(9, mae.getEnderecoMae());
					pstm.setString(10, mae.getBairroMae());
					pstm.setString(11, mae.getCidadeMae());
					pstm.setString(12, mae.getEstadoMae());
					pstm.setString(13, mae.getCepMae());
					pstm.setString(14, mae.getCelularMae());
					pstm.setString(15, mae.getTelefoneMae());
					pstm.setString(16, mae.getFonetrabalhoMae());
					pstm.setString(17, mae.getEmailMae());
					pstm.setString(18, mae.getEmail2Mae());
					pstm.setString(19, mae.getEmailTrabalhoMae());
					pstm.setInt(20, Mae.getIdMae());
					pstm.setInt(21, Mae.getIdMae());
					pstm.setInt(22, Mae.getIdMae());
					pstm.setInt(23, Mae.getIdMae());
					pstm.execute();
					

					ConnectionFactory.fechaConexao(conn, pstm); 
				
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao alterar informações sobre a mãe do Aluno no banco de "
							+ "dados " + e.getMessage());
				}
			} else {
				System.out.println("As informações enviadas estão vazias, verifique sua inserção!");
			}
	}
	
	public void atualizar(OutroResponsavel outro){
		if(outro != null){
			try {
				Connection conn = ConnectionFactory.getConnection();  
				PreparedStatement pstm;
				pstm = conn.prepareStatement(UPDATE_OUTRORESPONSAVEL);
				
				pstm.setString(1, outro.getCpfOutroResp()); 
				pstm.setString(2, outro.getRgOutroResp());
				pstm.setString(3, outro.getNomeOutroResp());
				pstm.setString(4, outro.getDataNascimentoOutroResp());
				pstm.setString(5, outro.getProfissaoOutroresp()); 
				pstm.setString(6, outro.getLocalTrabalhoOutroResp()); 
				pstm.setString(7, outro.getNacionalidadeOutroResp());
				pstm.setString(8, outro.getNaturalidadeOutroResp());
				pstm.setString(9, outro.getEnderecoOutroResp());
				pstm.setString(10, outro.getBairroOutroResp());
				pstm.setString(11, outro.getCidadeOutroResp());
				pstm.setString(12, outro.getEstadoOutroResp());
				pstm.setString(13, outro.getCepOutroResp());
				pstm.setString(14, outro.getCelularOutroResp());
				pstm.setString(15, outro.getTelefoneOutroResp());
				pstm.setString(16, outro.getFoneTrabalhoOutroResp());
				pstm.setString(17, outro.getEmailOutroResp());
				pstm.setString(18, outro.getEmail2OutroResp());
				pstm.setString(19, outro.getEmailTrabalhoOutroResp());
				pstm.setInt(20, OutroResponsavel.getIdOutroResp());
				pstm.setInt(21, OutroResponsavel.getIdOutroResp());
				pstm.setInt(22, OutroResponsavel.getIdOutroResp());
				pstm.setInt(23, OutroResponsavel.getIdOutroResp());
				pstm.execute();
				
				ConnectionFactory.fechaConexao(conn, pstm); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir informações sobre o Outro responsável da criança no banco de "
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O campo nome do Responsável enviado está vazio");
		}
	}

	public void apagar(Aluno aluno){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETE_PARCIAL_ALUNO);
			pstm.setInt(1, 0);
			pstm.setInt(2, 0);
			pstm.setInt(3, 0);
			pstm.setInt(4, 0);
			pstm.setInt(5, Aluno.getId());
			pstm.setInt(6, Aluno.getId());
			pstm.setInt(7, Aluno.getId());
			pstm.setInt(8, Aluno.getId());
			pstm.execute();
			ConnectionFactory.fechaConexao(conn, pstm);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir Aluno do banco de "
					+ "dados " + e.getMessage());
		}
	}
	
	public void apagar(Pai pai){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETE_PARCIAL_PAI);
			pstm.setInt(1, 0);
			pstm.setInt(2, 0);
			pstm.setInt(3, 0);
			pstm.setInt(4, 0);
			pstm.setInt(5, Pai.getIdPai());
			pstm.setInt(6, Pai.getIdPai());
			pstm.setInt(7, Pai.getIdPai());
			pstm.setInt(8, Pai.getIdPai());
			pstm.execute();
			
			ConnectionFactory.fechaConexao(conn, pstm);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir pai do Aluno do banco de "
					+ "dados " + e.getMessage());
		}
	}
	
	public void apagar(Mae mae){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETE_PARCIAL_MAE);
			pstm.setInt(1, 0);
			pstm.setInt(2, 0);
			pstm.setInt(3, 0);
			pstm.setInt(4, 0);
			pstm.setInt(5, Mae.getIdMae());
			pstm.setInt(6, Mae.getIdMae());
			pstm.setInt(7, Mae.getIdMae());
			pstm.setInt(8, Mae.getIdMae());
			
			pstm.execute();
			ConnectionFactory.fechaConexao(conn, pstm);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir mãe do aluno do banco de "
					+ "dados " + e.getMessage());
		}
	}
		
	public void apagar(OutroResponsavel outro){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETE_PARCIAL_OUTRORESPONSAVEL);
			pstm.setInt(1, 0);
			pstm.setInt(2, 0);
			pstm.setInt(3, 0);
			pstm.setInt(4, 0);
			pstm.setInt(5, OutroResponsavel.getIdOutroResp());
			pstm.setInt(6, OutroResponsavel.getIdOutroResp());
			pstm.setInt(7, OutroResponsavel.getIdOutroResp());
			pstm.setInt(8, OutroResponsavel.getIdOutroResp());
		
			
			pstm.execute();
			ConnectionFactory.fechaConexao(conn, pstm);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir responsavel do Aluno do banco de "
					+ "dados " + e.getMessage());
		}
	}
	
 	public void apagarComp(int id){
		
		try {
			Connection conn = ConnectionFactory.getConnection();  
			PreparedStatement pstm;
			pstm = conn.prepareStatement(DELETE_REGISTRO);

			pstm.setInt(1, id);
			pstm.setInt(2, id);
			pstm.setInt(3, id);
			pstm.setInt(4, id);
			pstm.setInt(5, id);
			pstm.setInt(6, id);
			pstm.setInt(7, id);
			pstm.setInt(8, id);
			pstm.setInt(9, id);
			pstm.setInt(10, id);
			pstm.setInt(11, id);
			pstm.setInt(12, id);
			pstm.setInt(13, id);
			pstm.setInt(14, id);
			pstm.setInt(15, id);
			pstm.setInt(16, id);
			pstm.setInt(17, id);
			pstm.setInt(18, id);
			pstm.setInt(19, id);
			pstm.setInt(20, id);

			pstm.execute();
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
			pstm = conn.prepareStatement(LISTALUNO);
			rs = pstm.executeQuery();
	
						
			while (rs.next()) {
				Aluno aluno = new Aluno();
				
				Aluno.setId(rs.getInt("idAluno"));
				Aluno.setMatricula(rs.getInt("matriculaAluno"));
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
				aluno.setDataCadastro(rs.getString("dataCadastroAluno"));
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
				pstm = conn.prepareStatement(LIST_ALUNO);
				pstm.setInt(1, id);
				pstm.setInt(2, id);
				pstm.setInt(3, id);
				pstm.setInt(4, id);
				rs = pstm.executeQuery();
				
				while (rs.next()) {
					
					Aluno.setId(rs.getInt("idAluno"));
					Aluno.setMatricula(rs.getInt("matriculaAluno"));
					aluno.setNome(rs.getString("nomeAluno"));
					aluno.setApelido(rs.getString("apelidoAluno"));
					aluno.setIdade(rs.getString("idadeAluno"));
					aluno.setCbIdade(rs.getString("periodoAluno"));
					aluno.setSexo(rs.getString("sexoAluno"));
					aluno.setDataNasc(Pessoa.splitDate(rs.getString("dataNascimentoAluno")));
					
					aluno.setNacionalidade(rs.getString("nacionalidadeAluno"));
					aluno.setNaturalidade(rs.getString("naturalidadeAluno"));
					aluno.setEndereco(rs.getString("enderecoAluno"));
					aluno.setBairro(rs.getString("bairroAluno"));
					aluno.setCidade(rs.getString("cidadeAluno"));
					
					aluno.setCep(rs.getString("cepAluno"));
					aluno.setRelAfetivo(rs.getString("relAfetivoAluno"));
					aluno.setInfoAdicional(rs.getString("infoAdicionalAluno"));
					aluno.setDataCadastro(Pessoa.splitDate(rs.getString("dataCadastroAluno")));
					aluno.setDataAtualizacao(Pessoa.splitDate(rs.getString("dataAtualizacaoAluno")));
								
					aluno.setTelefone(rs.getString("casaAluno"));
					aluno.setCelular(rs.getString("celularAluno"));
					aluno.setFonetrabalho("trabalhoAluno");
					aluno.setEmail(rs.getString("emailAluno"));
					aluno.setEmail2(rs.getString("email2Aluno"));
					aluno.setEmailtrabalhoAluno("emailtrabalhoAluno");
					
					
									
				}
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao listar alunos " + e.getMessage());
			}
			return aluno;
		}
		
		public Pai getPaiById(int id){
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Pai p = new Pai();
					
			try {
				Connection conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LIST_PAI);
				pstm.setInt(1, id);
				pstm.setInt(2, id);
				pstm.setInt(3, id);
				pstm.setInt(4, id);
		//		pstm.setInt(5, id);
		//		pstm.setInt(6, id);
		//		pstm.setInt(7, id);
		//		pstm.setInt(8, id); 
				rs = pstm.executeQuery();
			
				while (rs.next()) {
					
			Pai.setIdPai(rs.getInt("idPai"));
			p.setCpfPai(rs.getString("cpfPai"));
			p.setRgPai(rs.getString("rgPai"));
			p.setNomePai(rs.getString("nomePai"));
			p.setEnderecoPai(rs.getString("enderecoPai"));
			p.setBairroPai(rs.getString("bairroPai"));
			p.setCidadePai(rs.getString("cidadePai"));
			p.setCepPai(rs.getString("cepPai"));
			p.setLocaltrabalhaoPai(rs.getString("LocalTrabalhoPai"));
			p.setProfissaoPai(rs.getString("profissaoPai"));
			p.setCelularPai(rs.getString("celularPai")); 
			p.setTelefonePai(rs.getString("casaPai")); 
			p.setFoneTabalhoPai(rs.getString("TrabalhoPai"));
			p.setEmailPai(rs.getString("emailPai"));
			p.setEmail2Pai(rs.getString("email2Pai"));
			p.setEmailTrabalhoPai(rs.getString("emailTrabalhoPai"));
			p.setDataNascimentoPai(Pessoa.splitDate(rs.getString("dataNascimentoPai")));
			p.setNacionalidadePai(rs.getString("nacionalidadePai"));
			p.setNaturalidadePai(rs.getString("naturalidadePai"));
		
			
			}
			ConnectionFactory.fechaConexao(conn, pstm, rs); 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar informações sobre os pais " + e.getMessage());
		}
		return p;

		}
		
		public Mae getMaeById(int id){
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Mae m = new Mae();
			
			try {
				Connection conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LIST_MAE);
				pstm.setInt(1, id);
				pstm.setInt(2, id);
				pstm.setInt(3, id);
				pstm.setInt(4, id);
		//		pstm.setInt(5, id);
		//		pstm.setInt(6, id);
		//		pstm.setInt(7, id);
		//		pstm.setInt(8, id); 
				rs = pstm.executeQuery();
				
				while (rs.next()) {
						
			 
			Mae.setIdMae(rs.getInt("idMae"));
			m.setCpfMae(rs.getString("cpfMae"));
			m.setRgMae(rs.getString("rgMae"));
			m.setNomeMae(rs.getString("nomeMae"));
			m.setEnderecoMae(rs.getString("enderecoMae"));
			m.setBairroMae(rs.getString("bairroMae"));
			m.setCidadeMae(rs.getString("cidadeMae"));
			m.setEstadoMae(rs.getString("estadoMae"));
			m.setCepMae(rs.getString("cepMae"));
			m.setDataNascimentoMae(Pessoa.splitDate(rs.getString("dataNascimentoMae")));
			m.setProfissaoMae(rs.getString("profissaoMae"));
			m.setLocalTrabalhoMae(rs.getString("localTrabalhoMae"));
			m.setCelularMae(rs.getString("celularMae"));
			m.setTelefoneMae(rs.getString("casaMae"));
			m.setFoneTrabalhoMae(rs.getString("TrabalhoMae"));
			m.setEmailMae(rs.getString("emailMae"));
			m.setEmail2Mae(rs.getString("email2Mae"));
			m.setEmailTrabalhoMae(rs.getString("emailtrabalhoMae"));
			m.setNacionalidadeMae(rs.getString("nacionalidadeMae"));
			m.setNaturalidadeMae(rs.getString("naturalidadeMae"));
					
				}
				
				ConnectionFactory.fechaConexao(conn, pstm, rs);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao listar informações sobre as mae do aluno " + e.getMessage());
			}
			return m;
			
		}
		
		public OutroResponsavel getOutroResponsavelByID(int id){
			PreparedStatement pstm = null;
			ResultSet rs = null;
			OutroResponsavel o = new OutroResponsavel();
			
			try {
				Connection conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LIST_OUTRO);
				pstm.setInt(1, id);
				pstm.setInt(2, id);
				pstm.setInt(3, id);
				pstm.setInt(4, id);
		//		pstm.setInt(5, id);
		//		pstm.setInt(6, id);
		//		pstm.setInt(7, id);
		//		pstm.setInt(8, id);  
				rs = pstm.executeQuery();
				
				while (rs.next()) {
					
					OutroResponsavel.setIdOutroResp(rs.getInt("idOutroResp"));
					o.setCpfOutroResp(rs.getString("cpfOutroResp")); 
					o.setRgOutroResp(rs.getString("rgOutroResp"));
					o.setNomeOutroResp(rs.getString("nomeOutroResp")); 
					o.setDataNascimentoOutroResp(Pessoa.splitDate(rs.getString("dataNascimentoOutroResp")));
					o.setEnderecoOutroResp(rs.getString("enderecoOutroResp"));
					o.setBairroOutroResp(rs.getString("bairroOutroResp"));
					o.setCidadeOutroResp(rs.getString("cidadeOutroResp"));
					o.setCepOutroResp(rs.getString("cepOutroResp"));
					o.setProfissaoOutroresp(rs.getString("profissaoOutroResp")); 
					o.setLocalTrabalhoOutroResp(rs.getString("localTrabalhoOutroResp"));
					o.setCelularOutroResp(rs.getString("celularOutroResp"));
					o.setTelefoneOutroResp(rs.getString("casaOutroResp")); 
					o.setFoneTrabalhoOutroResp(rs.getString("TrabalhoOutroResp")); 
					o.setEmailOutroResp(rs.getString("emailOutroResp"));
					o.setEmail2OutroResp(rs.getString("email2OutroResp"));
					o.setEmailTrabalhoOutroResp(rs.getString("emailTrabalhoOutroResp"));
					o.setNacionalidadeOutroResp(rs.getString("nacionalidadeOutroResp"));
					o.setNaturalidadeOutroResp(rs.getString("nacionalidadeOutroResp"));
					
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao listar outros responsáveis do aluno " + e.getMessage());
				
			}
			return o;
		}
		
		
		
		public Aluno getAlunoByMatricula(int i) {
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Aluno aluno = new Aluno();
	
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LISTAPESQUISA);
				pstm.setInt(1, i);
				rs = pstm.executeQuery();
				
				
				Aluno.setId(rs.getInt("idAluno"));
				Aluno.setMatricula(rs.getInt("matriculaAluno"));
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
				aluno.setDataCadastro(rs.getString("dataCadastroAluno"));
				aluno.setDataAtualizacao(rs.getString("dataAtualizacaoAluno"));
				aluno.setFoto(rs.getString("fotoAluno"));
				
				aluno.setTelefone(rs.getString("telefonesAluno"));
				aluno.setCelular(rs.getString("celularAluno"));
						
				
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			return aluno;
		}
		
		
		public Aluno listaPesquisa(int i){
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Aluno aluno = new Aluno();
			
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LISTSELECTED);
				pstm.setInt(1, i);
				pstm.setInt(2, i);
				pstm.setInt(3, i);
			
				rs = pstm.executeQuery();
				
				while(rs.next()){
				Aluno.setId(rs.getInt("idAluno"));
			
							
				}
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			return aluno;
		}
		
	/*	public Telalogin userLogin(String nome, String senha){
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			Telalogin tela = new Telalogin();
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(LISTSELECTED);
				pstm.setString(1, nome);
				pstm.setString(2, senha);
			
			
				rs = pstm.executeQuery();
				
				while(rs.next()){
				tela.setUsuario(rs.getString("nome"));
				tela.setSenha(rs.getString("senha"));
				tela.setBloqueio(rs.getString("bloqueio"));
				tela.setStatus(rs.getString("status"));
			
							
				}
				ConnectionFactory.fechaConexao(conn, pstm, rs); 
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			return Telalogin;
			
		}
	*/	
		public String getLISTSELECTED() {
			return LISTSELECTED;
		}
		
		public void getMaximaMatricula(){
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;
			int matricula = 0;
	
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(MAXVALOR);
				rs = pstm.executeQuery();
				while (rs.next()) {
					
				
				matricula = (rs.getInt("matriculaAluno"));
				matricula++;
				Aluno.setMatricula(matricula);			
				}
				ConnectionFactory.fechaConexao(conn, pstm, rs); 	
				
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Erro ao buscar o ultimo registro no banco de dados " + e.getMessage());
			}
			
		}
		
		
		public String getMAXVALOR(){
			return MAXVALOR;
		}
		
		public  int  getIdFromTables(String cpf){
			Connection conn = null; 
			PreparedStatement pstm = null;
			ResultSet rs = null;

	//	int id = 0;
			try {
				conn = ConnectionFactory.getConnection(); 
				pstm = conn.prepareStatement(FINDCPF);
				pstm.setString(1, cpf);
				pstm.setString(2, cpf);
				pstm.setString(3, cpf);
				rs = pstm.executeQuery();
				while(rs.next()){
				
				Aluno.setId(Integer.parseInt(rs.getString("idPai")));

				} 
							
			//	 id= Aluno.getId(); 
				ConnectionFactory.fechaConexao(conn, pstm, rs); 	
				
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Erro ao buscar registro " + e.getMessage());
			}
			return Aluno.getId();
		
			
		}
}	



