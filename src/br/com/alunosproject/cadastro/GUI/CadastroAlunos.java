package br.com.alunosproject.cadastro.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;

import br.com.alunosproject.cadastro.cadastros.Aluno;
import br.com.alunosproject.cadastro.cadastros.Mae;
import br.com.alunosproject.cadastro.cadastros.OutroResponsavel;
import br.com.alunosproject.cadastro.cadastros.Pai;
import br.com.alunosproject.cadastro.cadastros.Pessoa;
import br.com.alunosproject.dao.Conexao;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

@SuppressWarnings("rawtypes")
public class CadastroAlunos extends JFrame {
	/**
	 *  Fabiano de Souza Pereira
	 *  
	 */
	
	private static final long serialVersionUID = 1L;
	private String frameState;
	static DefaultTableModel modelo = new DefaultTableModel();
	private static String statusTelacadastro; 
	protected static Object requestFocusController;
	private final JButton btnCadastrar;
	private final JButton btnEditar;
	private final JButton btnApagar;
	private JButton btnCancelar;
	private JButton btnSair;
	private JTable table;
	private JTextField tfcep;
	private JTextField tfdatanascimento;
	private JTextField tfmatricula;
	private JTextField tfendereco;
	private JTextField tfbairro;
	private JTextField tfcidade;
	private JComboBox  cBoxSexo;
	private JComboBox  cbIdade;
	private JTextField tfnome;
	private JTextField tfidade;
	private JTextField tfdataCadastro;
	private JTextField tfapelido;
	private JTextField tfdataAtualizacao;
	private JTextField tfnacionalidade;
	private JTextField tfnaturalidade;
	private JTextField tfPai;
	private JTextArea  txRelAfetivo;
	private JTextArea  txInfoAdicional;
	private JTextField tfcelular;
	private JTextField tfEmailAluno;
	private JTextField tfEmail2Aluno;
	private JTextField tfTrabalhoAluno;
	private JTextField tfEmailTrabalhoAluno;
	private JTextField tfNomePai;
	private JTextField tfEnderecoPai;
	private JTextField tfBairroPai;
	private JTextField tfCidadePai;
	private JTextField tfCepPai;
	private JTextField tfTelefonePai;
	private JTextField tfCelularPai;
	private JTextField tfFoneTrabalhoPai;
	private JTextField tfEmailPai;
	private JTextField tfNomeMae;
	private JTextField tfEnderecoMae;
	private JTextField tfBairroMae;
	private JTextField tfCidadeMae;
	private JTextField tfCepMae;
	private JTextField tfTelefoneMae;
	private JTextField tfTrabalhoMae;
	private JTextField tfEmailMae;
	private JTextField tfCelularMae;
	private JTextField tfCidadeOutro;
	private JTextField tfNomeOutro;
	private JTextField tfEnderecoOutro;
	private JTextField tfBairroOutro;
	private JTextField tfCepOutro;
	private JTextField tfTelefoneOutro;
	private JTextField tfCelularOutro;
	private JTextField tfTrabalhoOutro;
	private JTextField tfEmailOutro;
	private JTextField tfCpfOutro;
	private JTextField tfCpfMae;
	private JTextField tfCpfpai;
	private MaskFormatter ftmtfdatanascimento;
	private MaskFormatter ftmtfdataCadastro;
	private MaskFormatter ftmttfdataAtualizacao;
	private MaskFormatter ftmtfcelular;
	private MaskFormatter ftmttfcep;
	private MaskFormatter ftmtCepPai;
	private MaskFormatter ftmttfTelefonePai;
	private MaskFormatter ftmttfCpfpai;
	private MaskFormatter ftmttfCepMae;
	private MaskFormatter ftmttfTelefone;
	private MaskFormatter ftmtCelularMae;
	private MaskFormatter ftmttfTtrabalho;
	private MaskFormatter ftmttfCpfMae;
	private MaskFormatter ftmttfCepOutro;
	private MaskFormatter ftmttfTelefoneOutro;
	private MaskFormatter ftmttfCelularOutro;
	private MaskFormatter ftmttfTrabalhoOutro;
	private MaskFormatter ftmttfTrabalho;
	private JTextField tfestadoAluno;
	private MaskFormatter ftmttfCpfOutro;
	private JTextField tfProfissaoPai;
	private JTextField tfLocalTrabalhoPai;
	private JTextField tfRgPai;
	private JTextField tfEmail2Pai;
	private JTextField tfEmailTrabalhoPai;
	private JTextField tfRgMae;
	private JTextField tfRgOutroResp;
	private JTextField tfProfissaoMae;
	private JTextField tfEmail2Mae;
	private JTextField tfEmailtrabalhoMae;
	private JTextField tfEmail2OutroResp;
	private JTextField tfProfissaoOutroResp;
	private JTextField tfEmailTrabalhoOutroResp;
	private JTextField tfLocalTrabalhoMae;
	private JTextField tfLocalTrabalhoOutroResp;
	private JTextField tftelefoneAluno;
	private MaskFormatter ftmttftelefoneAluno;
	private JTextField tfDataNascimentoPai;
	private JTextField tfNacionalidadePai;
	private JTextField tfNaturalidadePai;
	private JTextField tfDataNascimentoOutroResp;
	private JTextField tfNacionalidadeOutroResp;
	private JTextField tfNaturalidadeOutroResp;
	private JTextField tfDataNascimentoMae;
	private JTextField tfNacionalidadeMae;
	private JTextField tfNaturalidadeMae;
	private MaskFormatter ftmttfDataNascimentoOutroResp;
	private MaskFormatter ftmttfDataNascimentoMae;
	private MaskFormatter ftmttfRgOutroResp;
	private MaskFormatter ftmttfRgMae;
	private MaskFormatter ftmttfRgPai;
//	private MaskFormatter ftmttfmatricula;
	private MaskFormatter ftmttfDataNascimentoPai;
	private MaskFormatter ftmttfCelularPai;
	private MaskFormatter ftmttfFoneTrabalhoPai;
	private JTextField tfMae;
	private JButton btnNovo;
	private MaskFormatter ftmttfidade;
	


/**
 * Create frame without writing anything.
 * @throws ParseException 
 */

	@SuppressWarnings({ "unchecked" })
	public CadastroAlunos() throws ParseException {
	addWindowFocusListener(new WindowFocusListener() {
		@Override
		public void windowGainedFocus(WindowEvent e) {
			refresh() ;
			if(Aluno.getStatusTelacadastro() == "Cadastrar"){
				tfdataAtualizacao.setText(Pessoa.Tempo());
				tfdataCadastro.setText(Pessoa.Tempo());
			}
			mudaBotao();
		}
		@Override
		public void windowLostFocus(WindowEvent e) {
		}
	});
	Aluno a = new Aluno();
	setMinimumSize(new Dimension(0, 500));
	setPreferredSize(new Dimension(0, 500));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Cadastro de alunos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1169, 834);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setPreferredSize(new Dimension(10, 80));
		panel_1.setSize(new Dimension(0, 80));
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setPreferredSize(new Dimension(112, 45));
		btnCadastrar.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			private AbstractButton tfestado; 

			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno a = new Aluno();
				Aluno.setMatricula(Integer.valueOf(tfmatricula.getText().trim()));
				a.setNome(tfnome.getText());
				a.setApelido(tfapelido.getText());
				a.setIdade(tfidade.getText().trim());
				a.setCbIdade((String)cbIdade.getSelectedItem());
				a.setSexo((String) cBoxSexo.getSelectedItem());
				a.setDataNasc(Pessoa.joinDate(tfdatanascimento.getText()));
				a.setDataAtualizacao(Pessoa.joinDate(Pessoa.Tempo()));
				a.setNacionalidade(tfnacionalidade.getText());
				a.setNaturalidade(tfnaturalidade.getText());
				a.setPai(tfMae.getText());
				a.setMae(tfPai.getText());
				a.setOutResp(tfNomeOutro.getText());
				a.setEndereco(tfendereco.getText());
				a.setBairro(tfbairro.getText());
				a.setCidade(tfcidade.getText());
				a.setEstado(tfestadoAluno.getText());
				a.setCep(Pessoa.MaskFormatterPull(tfcep.getText()));
			//	a.setInfoMedica();
				a.setRelAfetivo(txRelAfetivo.getText());
				a.setInfoAdicional(txInfoAdicional.getText());
				a.setDataCadastro(Pessoa.joinDate(tfdataCadastro.getText()));
				a.setDataAtualizacao(Pessoa.joinDate(tfdataAtualizacao.getText()));
				a.setFoto(Aluno.getCaminhofoto());
				a.setTelefone(Pessoa.MaskFormatterPull(tftelefoneAluno.getText().trim()));
				a.setCelular(Pessoa.MaskFormatterPull(tfcelular.getText().trim()));
				a.setFonetrabalho(Pessoa.MaskFormatterPull(tfTrabalhoAluno.getText()));
				a.setEmail(tfEmailAluno.getText());
				a.setEmail2(tfEmail2Aluno.getText());
				a.setEmailtrabalhoAluno(tfEmailTrabalhoAluno.getText());
		
				
				Pai p = new Pai();
				p.setCpfPai(Pessoa.MaskFormatterPull(tfCpfpai.getText()));
				p.setRgPai(tfRgPai.getText());
				p.setNomePai(tfNomePai.getText());
				p.setDataNascimentoPai(Pessoa.joinDate(tfDataNascimentoPai.getText()));
				p.setProfissaoPai(tfProfissaoPai.getText());
				p.setLocaltrabalhaoPai(tfLocalTrabalhoPai.getText());
				p.setNacionalidadePai(tfNacionalidadePai.getText());
				p.setNaturalidadePai(tfNaturalidadePai.getText());
				p.setEndPai(tfEnderecoPai.getText());
				p.setBaiPai(tfBairroPai.getText());
				p.setCidPai(tfCidadePai.getText());
				p.setCepPai(Pessoa.MaskFormatterPull(tfCepPai.getText()));
				p.setTelefonePai(Pessoa.MaskFormatterPull(tfTelefonePai.getText()));
				p.setCelularPai(Pessoa.MaskFormatterPull(tfCelularPai.getText()));
				p.setFoneTabalhoPai(Pessoa.MaskFormatterPull(tfFoneTrabalhoPai.getText()));
				p.setEmailPai(tfEmailPai.getText());
				p.setEmail2Pai(tfEmail2Pai.getText());
				p.setEmailTrabalhoPai(tfEmailTrabalhoPai.getText());
								
				Mae m = new Mae();
				m.setCpfMae(Pessoa.MaskFormatterPull(tfCpfMae.getText()));
				m.setRgMae(tfRgMae.getText());
				m.setNomeMae(tfNomeMae.getText());
				m.setDataNascimentoMae(Pessoa.joinDate(tfDataNascimentoMae.getText()));
				m.setProfissaoMae(tfProfissaoMae.getText());
				m.setLocalTrabalhoMae(tfLocalTrabalhoMae.getText());
				m.setNacionalidadeMae(tfNacionalidadeMae.getText());
				m.setNaturalidadeMae(tfNaturalidadeMae.getText());
				m.setEnderecoMae(tfEnderecoMae.getText());
				m.setBairroMae(tfBairroMae.getText());
				m.setCidadeMae(tfCidadeMae.getText());
				m.setCepMae(Pessoa.MaskFormatterPull(tfCepMae.getText()));
				m.setTelefoneMae(Pessoa.MaskFormatterPull(tfTelefoneMae.getText()));
				m.setCelularMae(Pessoa.MaskFormatterPull(tfCelularMae.getText()));
				m.setFoneTrabalhoMae(Pessoa.MaskFormatterPull(tfTrabalhoMae.getText()));
				m.setEmailMae(tfEmailMae.getText());
				m.setEmail2Mae(tfEmail2Mae.getText());
				m.setEmailTrabalhoMae(tfEmailtrabalhoMae.getText());
				
				OutroResponsavel o = new OutroResponsavel();
				o.setCpfOutroResp(Pessoa.MaskFormatterPull(tfCpfOutro.getText()));
				o.setRgOutroResp(tfRgOutroResp.getText());
				o.setNomeOutroResp(tfNomeOutro.getText());
				o.setDataNascimentoOutroResp(Pessoa.joinDate(tfDataNascimentoOutroResp.getText()));
				o.setProfissaoOutroresp(tfProfissaoOutroResp.getText());
				o.setLocalTrabalhoOutroResp(tfLocalTrabalhoOutroResp.getText());
				o.setNacionalidadeOutroResp(tfNacionalidadeOutroResp.getText());
				o.setNaturalidadeOutroResp(tfnaturalidade.getText());
				o.setEnderecoOutroResp(tfEnderecoOutro.getText());
				o.setBairroOutroResp(tfBairroOutro.getText());
				o.setCidadeOutroResp(tfCidadeOutro.getText());
				o.setCepOutroResp(Pessoa.MaskFormatterPull(tfCepOutro.getText()));
				o.setTelefoneOutroResp(Pessoa.MaskFormatterPull(tfTelefoneOutro.getText()));
				o.setCelularOutroResp(Pessoa.MaskFormatterPull(tfCelularOutro.getText()));
				o.setFoneTrabalhoOutroResp(Pessoa.MaskFormatterPull(tfTrabalhoOutro.getText()));
				o.setEmailOutroResp(tfEmailOutro.getText());
				o.setEmail2OutroResp(tfEmail2OutroResp.getText());
				o.setEmailTrabalhoOutroResp(tfEmailTrabalhoOutroResp.getText());
				a.setStatusTelacadastro("Editar");
				mudaBotao();
				Conexao conn = new Conexao();
				conn.inserir(a);
				conn.inserir(p);
				conn.inserir(m);
				conn.inserir(o);
			//	Tela_de_Consulta.setVar(conn.getIdFromTables(Aluno.getCpf()));
			//	refresh();
				JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso. ");
			}

	
		});
		btnCadastrar.setActionCommand("Cadastrar");
		
		btnNovo = new JButton("NOVO");
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNovo.addActionListener(new ActionListener() {
														
			@Override									
			public void actionPerformed(ActionEvent e) {		
				Tela_de_Consulta consulta = null;
				try {
					consulta = new Tela_de_Consulta();
					a.setStatusTelacadastro("Cadastrar");
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				consulta.setVisible(true);
				
			}

		});
		btnNovo.setPreferredSize(new Dimension(112, 45));
		btnNovo.setMaximumSize(new Dimension(89, 25));
		btnNovo.setMinimumSize(new Dimension(89, 25));
		panel_1.add(btnNovo);
		panel_1.add(btnCadastrar);
		
	
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditar.setPreferredSize(new Dimension(112, 45));
		btnEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Aluno a = new Aluno();
				a.setNome(tfnome.getText());
				a.setApelido(tfapelido.getText());
				a.setIdade(tfidade.getText().trim());
				a.setCbIdade((String)cbIdade.getSelectedItem());
				a.setSexo((String) cBoxSexo.getSelectedItem());
				a.setDataNasc(Pessoa.joinDate(tfdatanascimento.getText()));
				a.setDataAtualizacao(Pessoa.joinDate(Pessoa.Tempo()));
				a.setRelAfetivo(txRelAfetivo.getText());
			//	a.setInfoMedica();
				a.setInfoAdicional(txInfoAdicional.getText());
				a.setNacionalidade(tfnacionalidade.getText());
				a.setNaturalidade(tfnaturalidade.getText());
				a.setEndereco(tfendereco.getText());
				a.setBairro(tfbairro.getText());
				a.setCidade(tfcidade.getText());
				a.setEstado(tfestadoAluno.getText());
				a.setCep(Pessoa.MaskFormatterPull(tfcep.getText()));
				a.setTelefone(Pessoa.MaskFormatterPull(tfTelefonePai.getText().trim()));
				a.setCelular(Pessoa.MaskFormatterPull(tfcelular.getText().trim()));
				a.setFonetrabalho(Pessoa.MaskFormatterPull(tfTrabalhoAluno.getText()));
				a.setEmail(tfEmailAluno.getText());
				a.setEmail2(tfEmail2Aluno.getText());
				a.setEmailtrabalhoAluno(tfEmailTrabalhoAluno.getText());


				Pai p = new Pai();
				p.setCpfPai(Pessoa.MaskFormatterPull(tfCpfpai.getText()));
				p.setRgPai(tfRgPai.getText());
				p.setNomePai(tfNomePai.getText());
				p.setDataNascimentoPai(Pessoa.joinDate(tfDataNascimentoPai.getText()));
				p.setProfissaoPai(tfProfissaoPai.getText());
				p.setLocaltrabalhaoPai(tfLocalTrabalhoPai.getText());
				p.setNacionalidadePai(tfNacionalidadePai.getText());
				p.setNaturalidadePai(tfNaturalidadePai.getText());
				p.setEndPai(tfEnderecoPai.getText());
				p.setBaiPai(tfBairroPai.getText());
				p.setCidPai(tfCidadePai.getText());
				p.setCepPai(Pessoa.MaskFormatterPull(tfCepPai.getText()));
				p.setTelefonePai(Pessoa.MaskFormatterPull(tfTelefonePai.getText()));
				p.setCelularPai(Pessoa.MaskFormatterPull(tfCelularPai.getText()));
				p.setFoneTabalhoPai(Pessoa.MaskFormatterPull(tfFoneTrabalhoPai.getText()));
				p.setEmailPai(tfEmailPai.getText());
				p.setEmail2Pai(tfEmail2Pai.getText());
				p.setEmailTrabalhoPai(tfEmailTrabalhoPai.getText());
								
				Mae m = new Mae();
				m.setCpfMae(Pessoa.MaskFormatterPull(tfCpfMae.getText()));
				m.setRgMae(tfRgMae.getText());
				m.setNomeMae(tfNomeMae.getText());
				m.setDataNascimentoMae(Pessoa.joinDate(tfDataNascimentoMae.getText()));
				m.setProfissaoMae(tfProfissaoMae.getText());
				m.setLocalTrabalhoMae(tfLocalTrabalhoMae.getText());
				m.setNacionalidadeMae(tfNacionalidadeMae.getText());
				m.setNaturalidadeMae(tfNaturalidadeMae.getText());
				m.setEnderecoMae(tfEnderecoMae.getText());
				m.setBairroMae(tfBairroMae.getText());
				m.setCidadeMae(tfCidadeMae.getText());
				m.setCepMae(Pessoa.MaskFormatterPull(tfCepMae.getText()));
				m.setTelefoneMae(Pessoa.MaskFormatterPull(tfTelefoneMae.getText()));
				m.setCelularMae(Pessoa.MaskFormatterPull(tfCelularMae.getText()));
				m.setFoneTrabalhoMae(Pessoa.MaskFormatterPull(tfTrabalhoMae.getText()));
				m.setEmailMae(tfEmailMae.getText());
				m.setEmail2Mae(tfEmail2Mae.getText());
				m.setEmailTrabalhoMae(tfEmailtrabalhoMae.getText());
				
				OutroResponsavel o = new OutroResponsavel();
				o.setCpfOutroResp(Pessoa.MaskFormatterPull(tfCpfOutro.getText()));
				o.setRgOutroResp(tfRgOutroResp.getText());
				o.setNomeOutroResp(tfNomeOutro.getText());
				o.setDataNascimentoOutroResp(Pessoa.joinDate(tfDataNascimentoOutroResp.getText()));
				o.setProfissaoOutroresp(tfProfissaoOutroResp.getText());
				o.setLocalTrabalhoOutroResp(tfLocalTrabalhoOutroResp.getText());
				o.setNacionalidadeOutroResp(tfNacionalidadeOutroResp.getText());
				o.setNaturalidadeOutroResp(tfnaturalidade.getText());
				o.setEnderecoOutroResp(tfEnderecoOutro.getText());
				o.setBairroOutroResp(tfBairroOutro.getText());
				o.setCidadeOutroResp(tfCidadeOutro.getText());
				o.setCepOutroResp(Pessoa.MaskFormatterPull(tfCepOutro.getText()));
				o.setTelefoneOutroResp(Pessoa.MaskFormatterPull(tfTelefoneOutro.getText()));
				o.setCelularOutroResp(Pessoa.MaskFormatterPull(tfCelularOutro.getText()));
				o.setFoneTrabalhoOutroResp(Pessoa.MaskFormatterPull(tfTrabalhoOutro.getText()));
				o.setEmailOutroResp(tfEmailOutro.getText());
				o.setEmail2OutroResp(tfEmail2OutroResp.getText());
				o.setEmailTrabalhoOutroResp(tfEmailTrabalhoOutroResp.getText());

				
				Conexao conn = new Conexao();
				conn.atualizar(a);
				conn.atualizar(p);
				conn.atualizar(m);
				conn.atualizar(o);
				refresh();
				a.setStatusTelacadastro("Editar");
				JOptionPane.showMessageDialog(null, "Edição realizada com sucesso. ");
			}
		});
		panel_1.add(btnEditar);
		btnEditar.setActionCommand("Editar");
		
		btnApagar = new JButton("APAGAR");
		btnApagar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApagar.setPreferredSize(new Dimension(112, 45));
		btnApagar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int Option = JOptionPane.showConfirmDialog(null, "Deseja apagar o registro do Aluno mesmo? ",null,
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(Option == JOptionPane.YES_OPTION){
				
				Aluno aluno = new Aluno();
				Pai pai = new Pai();
				Mae mae = new Mae();
				OutroResponsavel outro = new OutroResponsavel();
				limparTodosCampos(rootPane);
				Conexao conn = new Conexao();
				conn.apagar(aluno);
				conn.apagar(pai);
				conn.apagar(mae);
				conn.apagar(outro);
				aluno.setStatusTelacadastro("standby");
				JOptionPane.showMessageDialog(null, "Apagado cadastro com sucesso. ");
				}
			}
		});
		panel_1.add(btnApagar);
		btnApagar.setActionCommand("Apagar");
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setPreferredSize(new Dimension(112, 45));
		btnCancelar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				a.setStatusTelacadastro("Editar");
				refresh();
							
			}
		});
		panel_1.add(btnCancelar);
		btnCancelar.setActionCommand("Cancelar");
		
		btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setPreferredSize(new Dimension(112, 45));
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	Tela_de_Consulta.setVar(0);
				dispose();
			}
		});
		panel_1.add(btnSair);
		btnSair.setActionCommand("standby");
		
		
	    JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLUE);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel Aluno = new JPanel();
		Aluno.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.addTab("Aluno", null, Aluno, null);
		Aluno.setName("painelaluno");
		GridBagLayout gbl_Aluno = new GridBagLayout();
		gbl_Aluno.columnWidths = new int[] {75, 30, 0, 215, 69, 44, 120, 140, 78, 34, 0, 0, 0};
		gbl_Aluno.rowHeights = new int[]{49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0};
		gbl_Aluno.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Aluno.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Aluno.setLayout(gbl_Aluno);
		
		
		/** Botão para teste de preencimento do cadastro */
		JButton btnPreenche = new JButton("preenche");
		btnPreenche.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	tfmatricula.setText("000001");
				tfnome.setText("PEDRO");
				tfapelido.setText("DEDÉ");
				tfidade.setText("2");
				cbIdade.setSelectedItem("ANOS");
				cBoxSexo.setSelectedItem(1);
				tfdatanascimento.setText("10102016");
				tfnacionalidade.setText("BRASILEIRA");
				tfnaturalidade.setText("BRASILIA");
				tfMae.setText("GERALDO RAMOS");
				tfPai.setText("VILMA RAMOS");
				tfNomeOutro.setText("GUILHERME");
				tfendereco.setText("ALBULQUERQUE");
				tfbairro.setText("CENTRO");
				tfcidade.setText("MONTENEGRO");
				tfestadoAluno.setText("RS");
				tfcep.setText("88032019");
				txRelAfetivo.setText("BOM.");
				txInfoAdicional.setText("NADA CONSTA");
				tftelefoneAluno.setText("4832321029");
				tfcelular.setText("48991313635");
				tfTrabalhoAluno.setText("4832327878");
				tfEmailAluno.setText("ALUNO@ALUNO");
				tfEmail2Aluno.setText("ALUNO2@ALUNO2");
				tfEmailTrabalhoAluno.setText("TRABALHO@TABELA");

				tfCpfpai.setText("12345678912");
				tfRgPai.setText("1122334455");
				tfNomePai.setText("PEDRO DALGOBA");
				tfDataNascimentoPai.setText("10101977");
				tfProfissaoPai.setText("PEDREIRO");
				tfLocalTrabalhoPai.setText("OBRA");
				tfNacionalidadePai.setText("BRASILEIRA");
				tfNaturalidadePai.setText("PORTO ALEGRE");
				tfEnderecoPai.setText("RUA PADOA");
				tfBairroPai.setText("CENTRO");
				tfCidadePai.setText("PORTO ALEGRE");
				tfCepPai.setText("05780002");
				tfTelefonePai.setText("4832322939");
				tfCelularPai.setText("48996243106");
				tfFoneTrabalhoPai.setText("4832245868");
				tfEmailPai.setText("PAI@PAI");
				tfEmail2Pai.setText("PAI2@PAI");
				tfEmailTrabalhoPai.setText("TRABALHO@PAI");
								
				tfCpfMae.setText("21987654321");
				tfRgMae.setText("3333333333");
				tfNomeMae.setText("ANA CAROLINA DIAS");
				tfDataNascimentoMae.setText("10101988");
				tfProfissaoMae.setText("DONA DE CASA");
				tfLocalTrabalhoMae.setText("CASA");
				tfNacionalidadeMae.setText("BRASILEIRA");
				tfNaturalidadeMae.setText("MONTENEGRO");
				
				tfEnderecoMae.setText("RUA DA PANDORGA");
				tfBairroMae.setText("CENTRO");
				tfCidadeMae.setText("BRASILIA");
				tfCepMae.setText("88032010");
				tfTelefoneMae.setText("4832324657");
				tfCelularMae.setText("48996253748");
				tfTrabalhoMae.setText("4832339449");
				tfEmailMae.setText("mae@mae");
				tfEmail2Mae.setText("mae2@mae");
				tfEmailtrabalhoMae.setText("trabalho@mae");
				
				tfCpfOutro.setText("12345678989");
				tfRgOutroResp.setText("4444444444");
				tfNomeOutro.setText("PEDRO BALA");
				tfDataNascimentoOutroResp.setText("12122001");
				tfProfissaoOutroResp.setText("BANDIDO");
				tfLocalTrabalhoOutroResp.setText("RUA");
				tfNacionalidadeOutroResp.setText("BRASILEIRA");
				tfNaturalidadeOutroResp.setText("MONTENEGRO");
				
				tfEnderecoOutro.setText("RUA ESPERANÇA");
				tfBairroOutro.setText("ESPERANÇA");
				tfCidadeOutro.setText("MONETENGRO");
				tfCepOutro.setText("95780000");
				tfTelefoneOutro.setText("4832323040");
				tfCelularOutro.setText("48996456543");
				tfTrabalhoOutro.setText("4836325959");
				tfEmailOutro.setText("BAND@BAND");
				tfEmail2OutroResp.setText("BAND2@BAND");
				tfEmailTrabalhoOutroResp.setText("ASSALTO@BAND");
			}
		});
		GridBagConstraints gbc_btnPreenche = new GridBagConstraints();
		gbc_btnPreenche.insets = new Insets(0, 0, 5, 5);
		gbc_btnPreenche.gridx = 6;
		gbc_btnPreenche.gridy = 0;
		Aluno.add(btnPreenche, gbc_btnPreenche);
		
		
		JLabel lblMatricula_1 = new JLabel("Matricula");
		lblMatricula_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblMatricula_1 = new GridBagConstraints();
		gbc_lblMatricula_1.anchor = GridBagConstraints.WEST;
		gbc_lblMatricula_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula_1.gridx = 2;
		gbc_lblMatricula_1.gridy = 1;
		Aluno.add(lblMatricula_1, gbc_lblMatricula_1);
		
	//	ftmttfmatricula = new MaskFormatter("#######");
	//	tfmatricula = new JFormattedTextField(ftmttfmatricula);
	//	ftmttfmatricula.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfmatricula = new JTextField();
		tfmatricula.setMinimumSize(new Dimension(6, 30));
		tfmatricula.setBackground(UIManager.getColor("CheckBox.background"));
		tfmatricula.setPreferredSize(new Dimension(6, 30));
		tfmatricula.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfmatricula = new GridBagConstraints();
		gbc_tfmatricula.insets = new Insets(0, 0, 5, 5);
		gbc_tfmatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfmatricula.gridx = 3;
		gbc_tfmatricula.gridy = 1;
		tfmatricula.setColumns(10);
		Aluno.add(tfmatricula, gbc_tfmatricula);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNome_1 = new GridBagConstraints();
		gbc_lblNome_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome_1.anchor = GridBagConstraints.WEST;
		gbc_lblNome_1.gridx = 2;
		gbc_lblNome_1.gridy = 2;
		Aluno.add(lblNome_1, gbc_lblNome_1);
		
		tfnome = new JTextField();
		tfnome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfnome.setMinimumSize(new Dimension(6, 30));
		tfnome.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfnome = new GridBagConstraints();
		gbc_tfnome.fill = GridBagConstraints.BOTH;
		gbc_tfnome.gridwidth = 7;
		gbc_tfnome.insets = new Insets(0, 0, 5, 5);
		gbc_tfnome.gridx = 3;
		gbc_tfnome.gridy = 2;
		Aluno.add(tfnome, gbc_tfnome);
		tfnome.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(100, 0));
		horizontalStrut.setMinimumSize(new Dimension(100, 0));
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.gridwidth = 2;
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 10;
		gbc_horizontalStrut.gridy = 2;
		Aluno.add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.WEST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 2;
		gbc_lblEndereo.gridy = 3;
		Aluno.add(lblEndereo, gbc_lblEndereo);
		
		tfendereco = new JTextField();
		tfendereco.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfendereco.setMinimumSize(new Dimension(6, 30));
		tfendereco.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfendereco = new GridBagConstraints();
		gbc_tfendereco.anchor = GridBagConstraints.NORTH;
		gbc_tfendereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfendereco.gridwidth = 7;
		gbc_tfendereco.insets = new Insets(0, 0, 5, 5);
		gbc_tfendereco.gridx = 3;
		gbc_tfendereco.gridy = 3;
		Aluno.add(tfendereco, gbc_tfendereco);
		tfendereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblBairro = new GridBagConstraints();
		gbc_lblBairro.anchor = GridBagConstraints.WEST;
		gbc_lblBairro.insets = new Insets(0, 0, 5, 5);
		gbc_lblBairro.gridx = 2;
		gbc_lblBairro.gridy = 4;
		Aluno.add(lblBairro, gbc_lblBairro);
		
		tfbairro = new JTextField();
		tfbairro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfbairro.setMinimumSize(new Dimension(6, 30));
		tfbairro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfbairro = new GridBagConstraints();
		gbc_tfbairro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfbairro.gridwidth = 7;
		gbc_tfbairro.insets = new Insets(0, 0, 5, 5);
		gbc_tfbairro.gridx = 3;
		gbc_tfbairro.gridy = 4;
		Aluno.add(tfbairro, gbc_tfbairro);
		tfbairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 2;
		gbc_lblCidade.gridy = 5;
		Aluno.add(lblCidade, gbc_lblCidade);
		
		tfcidade = new JTextField();
		tfcidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfcidade.setMinimumSize(new Dimension(6, 30));
		tfcidade.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfcidade = new GridBagConstraints();
		gbc_tfcidade.gridwidth = 2;
		gbc_tfcidade.insets = new Insets(0, 0, 5, 5);
		gbc_tfcidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfcidade.gridx = 3;
		gbc_tfcidade.gridy = 5;
		Aluno.add(tfcidade, gbc_tfcidade);
		tfcidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 5;
		gbc_lblEstado.gridy = 5;
		Aluno.add(lblEstado, gbc_lblEstado);
		
		tfestadoAluno = new JTextField();
		tfestadoAluno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfestadoAluno.setPreferredSize(new Dimension(6, 30));
		tfestadoAluno.setMinimumSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfestadoAluno = new GridBagConstraints();
		gbc_tfestadoAluno.gridwidth = 4;
		gbc_tfestadoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfestadoAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfestadoAluno.gridx = 6;
		gbc_tfestadoAluno.gridy = 5;
		Aluno.add(tfestadoAluno, gbc_tfestadoAluno);
		tfestadoAluno.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setMaximumSize(new Dimension(85, 16));
		lblCep.setPreferredSize(new Dimension(85, 30));
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblCep = new GridBagConstraints();
		gbc_lblCep.anchor = GridBagConstraints.WEST;
		gbc_lblCep.insets = new Insets(0, 0, 5, 5);
		gbc_lblCep.gridx = 2;
		gbc_lblCep.gridy = 6;
		Aluno.add(lblCep, gbc_lblCep);
		
		ftmttfcep  = new MaskFormatter("#####-###");
		tfcep = new JFormattedTextField(ftmttfcep);
		tfcep.setMinimumSize(new Dimension(6, 30));
		ftmttfcep.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfcep.setPreferredSize(new Dimension(6, 30));
		tfcep.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfcep = new GridBagConstraints();
		gbc_tfcep.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfcep.insets = new Insets(0, 0, 5, 5);
		gbc_tfcep.gridx = 3;
		gbc_tfcep.gridy = 6;
		Aluno.add(tfcep, gbc_tfcep);
		tfcep.setColumns(10);
		
		JLabel lblApelido = new JLabel("Apelido");
		lblApelido.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblApelido = new GridBagConstraints();
		gbc_lblApelido.anchor = GridBagConstraints.EAST;
		gbc_lblApelido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApelido.gridx = 5;
		gbc_lblApelido.gridy = 6;
		Aluno.add(lblApelido, gbc_lblApelido);
		
		tfapelido = new JTextField();
		tfapelido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfapelido.setMinimumSize(new Dimension(6, 30));
		tfapelido.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfapelido = new GridBagConstraints();
		gbc_tfapelido.gridwidth = 4;
		gbc_tfapelido.insets = new Insets(0, 0, 5, 5);
		gbc_tfapelido.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfapelido.gridx = 6;
		gbc_tfapelido.gridy = 6;
		Aluno.add(tfapelido, gbc_tfapelido);
		tfapelido.setColumns(10);
		
		JLabel lblNascionalidade = new JLabel("Nascionalidade");
		lblNascionalidade.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNascionalidade = new GridBagConstraints();
		gbc_lblNascionalidade.anchor = GridBagConstraints.WEST;
		gbc_lblNascionalidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblNascionalidade.gridx = 2;
		gbc_lblNascionalidade.gridy = 7;
		Aluno.add(lblNascionalidade, gbc_lblNascionalidade);
		
		tfnacionalidade = new JTextField();
		tfnacionalidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfnacionalidade.setMinimumSize(new Dimension(6, 30));
		tfnacionalidade.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfnacionalidade = new GridBagConstraints();
		gbc_tfnacionalidade.gridwidth = 4;
		gbc_tfnacionalidade.insets = new Insets(0, 0, 5, 5);
		gbc_tfnacionalidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfnacionalidade.gridx = 3;
		gbc_tfnacionalidade.gridy = 7;
		Aluno.add(tfnacionalidade, gbc_tfnacionalidade);
		tfnacionalidade.setColumns(10);
		
		JLabel lblTelefone_Aluno = new JLabel("Telefone");
		lblTelefone_Aluno.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTelefone_Aluno = new GridBagConstraints();
		gbc_lblTelefone_Aluno.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone_Aluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone_Aluno.gridx = 7;
		gbc_lblTelefone_Aluno.gridy = 7;
		Aluno.add(lblTelefone_Aluno, gbc_lblTelefone_Aluno);
		
		ftmttftelefoneAluno = new MaskFormatter("(##)####-####");
		tftelefoneAluno = new JFormattedTextField(ftmttftelefoneAluno);
		ftmttftelefoneAluno.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tftelefoneAluno.setPreferredSize(new Dimension(6, 30));
		tftelefoneAluno.setMinimumSize(new Dimension(6, 30));
		tftelefoneAluno.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tftelefoneAluno = new GridBagConstraints();
		gbc_tftelefoneAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tftelefoneAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tftelefoneAluno.gridx = 8;
		gbc_tftelefoneAluno.gridy = 7;
		Aluno.add(tftelefoneAluno, gbc_tftelefoneAluno);
		tftelefoneAluno.setColumns(10);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade");
		lblNaturalidade.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNaturalidade = new GridBagConstraints();
		gbc_lblNaturalidade.anchor = GridBagConstraints.WEST;
		gbc_lblNaturalidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblNaturalidade.gridx = 2;
		gbc_lblNaturalidade.gridy = 8;
		Aluno.add(lblNaturalidade, gbc_lblNaturalidade);
		
		tfnaturalidade = new JTextField();
		tfnaturalidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfnaturalidade .setMinimumSize(new Dimension(6, 30));
		tfnaturalidade .setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfnaturalidade = new GridBagConstraints();
		gbc_tfnaturalidade.gridwidth = 4;
		gbc_tfnaturalidade.insets = new Insets(0, 0, 5, 5);
		gbc_tfnaturalidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfnaturalidade.gridx = 3;
		gbc_tfnaturalidade.gridy = 8;
		Aluno.add(tfnaturalidade , gbc_tfnaturalidade);
		tfnaturalidade .setColumns(10);
		
		JLabel lblCelular_2 = new JLabel("Celular");
		lblCelular_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblCelular_2 = new GridBagConstraints();
		gbc_lblCelular_2.anchor = GridBagConstraints.EAST;
		gbc_lblCelular_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCelular_2.gridx = 7;
		gbc_lblCelular_2.gridy = 8;
		Aluno.add(lblCelular_2, gbc_lblCelular_2);
		
		ftmtfcelular = new MaskFormatter("(##)###-###-###");
		tfcelular = new JFormattedTextField(ftmtfcelular);
		ftmtfcelular.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfcelular.setMinimumSize(new Dimension(6, 30));
		tfcelular.setPreferredSize(new Dimension(6, 30));
		tfcelular.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfcelularAluno = new GridBagConstraints();
		gbc_tfcelularAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfcelularAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfcelularAluno.gridx = 8;
		gbc_tfcelularAluno.gridy = 8;
		Aluno.add(tfcelular, gbc_tfcelularAluno);
		tfcelular.setColumns(10);
		
		JLabel lblTrabalho_1 = new JLabel("Trabalho");
		lblTrabalho_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTrabalho_1 = new GridBagConstraints();
		gbc_lblTrabalho_1.anchor = GridBagConstraints.EAST;
		gbc_lblTrabalho_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrabalho_1.gridx = 7;
		gbc_lblTrabalho_1.gridy = 9;
		Aluno.add(lblTrabalho_1, gbc_lblTrabalho_1);
		
		ftmttfTrabalho = new MaskFormatter("(##)####-####");
		tfTrabalhoAluno = new JFormattedTextField(ftmttfTrabalho);
		ftmttfTrabalho.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfTrabalhoAluno.setName("tfTrabalhoAluno");
		tfTrabalhoAluno.setMinimumSize(new Dimension(6, 30));
		tfTrabalhoAluno.setPreferredSize(new Dimension(6, 30));
		tfTrabalhoAluno.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfTrabalhoAluno = new GridBagConstraints();
		gbc_tfTrabalhoAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTrabalhoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfTrabalhoAluno.gridx = 8;
		gbc_tfTrabalhoAluno.gridy = 9;
		Aluno.add(tfTrabalhoAluno, gbc_tfTrabalhoAluno);
		tfTrabalhoAluno.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblIdade = new GridBagConstraints();
		gbc_lblIdade.anchor = GridBagConstraints.WEST;
		gbc_lblIdade.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdade.gridx = 2;
		gbc_lblIdade.gridy = 10;
		Aluno.add(lblIdade, gbc_lblIdade);
		
		ftmttfidade = new MaskFormatter("##");
		tfidade = new JFormattedTextField(ftmttfidade);
		ftmttfidade.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfidade.setMinimumSize(new Dimension(6, 30));
		tfidade.setPreferredSize(new Dimension(6, 30));
		tfidade.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfidade = new GridBagConstraints();
		gbc_tfidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfidade.insets = new Insets(0, 0, 5, 5);
		gbc_tfidade.gridx = 3;
		gbc_tfidade.gridy = 10;
		Aluno.add(tfidade, gbc_tfidade);
		tfidade.setColumns(10);
		
		cbIdade = new JComboBox();
		cbIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbIdade.setMinimumSize(new Dimension(31, 30));
		cbIdade.setPreferredSize(new Dimension(31, 30));
		cbIdade.setName("cbidade");
		cbIdade.setModel(new DefaultComboBoxModel(new String[] {" mês  ", " ano  ", "meses", " anos  "}));
		cbIdade.setSelectedIndex(2);
		GridBagConstraints gbc_cbIdade_1 = new GridBagConstraints();
		gbc_cbIdade_1.insets = new Insets(0, 0, 5, 5);
		gbc_cbIdade_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbIdade_1.gridx = 4;
		gbc_cbIdade_1.gridy = 10;
		Aluno.add(cbIdade, gbc_cbIdade_1);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblSexo.setMaximumSize(new Dimension(28, 30));
		lblSexo.setMinimumSize(new Dimension(28, 30));
		lblSexo.setPreferredSize(new Dimension(28, 30));
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 5;
		gbc_lblSexo.gridy = 10;
		Aluno.add(lblSexo, gbc_lblSexo);
		
		cBoxSexo = new JComboBox();
		cBoxSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cBoxSexo.setName("cboxsexo");
		cBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione um item", "MASCULINO       ", "FEMININO         "}));
		cBoxSexo.setSelectedIndex(0);
		cBoxSexo.setPreferredSize(new Dimension(31, 30));
		cBoxSexo.setMinimumSize(new Dimension(31, 30));
		GridBagConstraints gbc_cBoxSexo_1 = new GridBagConstraints();
		gbc_cBoxSexo_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxSexo_1.insets = new Insets(0, 0, 5, 5);
		gbc_cBoxSexo_1.gridx = 6;
		gbc_cBoxSexo_1.gridy = 10;
		Aluno.add(cBoxSexo, gbc_cBoxSexo_1);
		
		JLabel lblDataNasc = new JLabel("Data Nasc");
		lblDataNasc.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblDataNasc = new GridBagConstraints();
		gbc_lblDataNasc.anchor = GridBagConstraints.WEST;
		gbc_lblDataNasc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataNasc.gridx = 2;
		gbc_lblDataNasc.gridy = 11;
		Aluno.add(lblDataNasc, gbc_lblDataNasc);
	
		ftmtfdatanascimento = new MaskFormatter("##/##/####");
		tfdatanascimento = new JFormattedTextField(ftmtfdatanascimento);
		tfdatanascimento.setMinimumSize(new Dimension(6, 30));
		ftmtfdatanascimento.setValidCharacters("0123456789");
		tfdatanascimento.setPreferredSize(new Dimension(6, 30));
		tfdatanascimento.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfdatanascimento = new GridBagConstraints();
		gbc_tfdatanascimento.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdatanascimento.insets = new Insets(0, 0, 5, 5);
		gbc_tfdatanascimento.gridx = 3;
		gbc_tfdatanascimento.gridy = 11;
		Aluno.add(tfdatanascimento, gbc_tfdatanascimento);
		tfdatanascimento.setColumns(10);
		
		JLabel lblDataCadastro = new JLabel("Data Cadastro");
		lblDataCadastro.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblDataCadastro.setMinimumSize(new Dimension(81, 30));
		GridBagConstraints gbc_lblDataCadastro = new GridBagConstraints();
		gbc_lblDataCadastro.anchor = GridBagConstraints.EAST;
		gbc_lblDataCadastro.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataCadastro.gridx = 5;
		gbc_lblDataCadastro.gridy = 11;
		Aluno.add(lblDataCadastro, gbc_lblDataCadastro);
		
		ftmtfdataCadastro = new MaskFormatter("##/##/####");
		tfdataCadastro = new JFormattedTextField(ftmtfdataCadastro);
		tfdataCadastro.setBackground(UIManager.getColor("CheckBox.background"));
		ftmtfdataCadastro.setValidCharacters("0123456789");
		tfdataCadastro.setMinimumSize(new Dimension(6, 30));
		tfdataCadastro.setPreferredSize(new Dimension(6, 30));
		tfdataCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfdataCadastro = new GridBagConstraints();
		gbc_tfdataCadastro.insets = new Insets(0, 0, 5, 5);
		gbc_tfdataCadastro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdataCadastro.gridx = 6;
		gbc_tfdataCadastro.gridy = 11;
		Aluno.add(tfdataCadastro, gbc_tfdataCadastro);
		tfdataCadastro.setColumns(10);
		
		JLabel lblDataAlualizacao = new JLabel("Atualização");
		lblDataAlualizacao.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblDataAlualizacao = new GridBagConstraints();
		gbc_lblDataAlualizacao.anchor = GridBagConstraints.EAST;
		gbc_lblDataAlualizacao.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataAlualizacao.gridx = 7;
		gbc_lblDataAlualizacao.gridy = 11;
		Aluno.add(lblDataAlualizacao, gbc_lblDataAlualizacao);
		
		ftmttfdataAtualizacao = new MaskFormatter("##/##/####");
		tfdataAtualizacao = new JFormattedTextField(ftmttfdataAtualizacao);
		tfdataAtualizacao.setBackground(UIManager.getColor("CheckBox.background"));
		ftmttfdataAtualizacao.setValidCharacters("0123456789");
		tfdataAtualizacao.setMinimumSize(new Dimension(6, 30));
		tfdataAtualizacao.setPreferredSize(new Dimension(6, 30));
		tfdataAtualizacao.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfdataAtualizacao = new GridBagConstraints();
		gbc_tfdataAtualizacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfdataAtualizacao.insets = new Insets(0, 0, 5, 5);
		gbc_tfdataAtualizacao.gridx = 8;
		gbc_tfdataAtualizacao.gridy = 11;
		Aluno.add(tfdataAtualizacao, gbc_tfdataAtualizacao);
		tfdataAtualizacao.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setPreferredSize(new Dimension(57, 16));
		lblEmail_1.setMinimumSize(new Dimension(57, 16));
		lblEmail_1.setMaximumSize(new Dimension(57, 16));
		lblEmail_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 2;
		gbc_lblEmail_1.gridy = 12;
		Aluno.add(lblEmail_1, gbc_lblEmail_1);
		
		tfEmailAluno = new JTextField();
		tfEmailAluno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmailAluno.setName("tfemailaluno");
		tfEmailAluno.setPreferredSize(new Dimension(6, 30));
		tfEmailAluno.setMinimumSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmailAluno = new GridBagConstraints();
		gbc_tfEmailAluno.gridwidth = 2;
		gbc_tfEmailAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmailAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmailAluno.gridx = 3;
		gbc_tfEmailAluno.gridy = 12;
		Aluno.add(tfEmailAluno, gbc_tfEmailAluno);
		tfEmailAluno.setColumns(10);
		
		JLabel lblEmail_2 = new JLabel("Email2");
		lblEmail_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblEmail_2 = new GridBagConstraints();
		gbc_lblEmail_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_2.anchor = GridBagConstraints.EAST;
		gbc_lblEmail_2.gridx = 5;
		gbc_lblEmail_2.gridy = 12;
		Aluno.add(lblEmail_2, gbc_lblEmail_2);
		
		tfEmail2Aluno = new JTextField();
		tfEmail2Aluno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmail2Aluno.setName("tfemail2aluno");
		tfEmail2Aluno.setPreferredSize(new Dimension(6, 30));
		tfEmail2Aluno.setMinimumSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmail2Aluno = new GridBagConstraints();
		gbc_tfEmail2Aluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail2Aluno.gridwidth = 3;
		gbc_tfEmail2Aluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmail2Aluno.gridx = 6;
		gbc_tfEmail2Aluno.gridy = 12;
		Aluno.add(tfEmail2Aluno, gbc_tfEmail2Aluno);
		tfEmail2Aluno.setColumns(10);
		
		JLabel lblEmailTrabalho = new JLabel("Email trabalho");
		lblEmailTrabalho.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblEmailTrabalho = new GridBagConstraints();
		gbc_lblEmailTrabalho.anchor = GridBagConstraints.WEST;
		gbc_lblEmailTrabalho.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailTrabalho.gridx = 2;
		gbc_lblEmailTrabalho.gridy = 13;
		Aluno.add(lblEmailTrabalho, gbc_lblEmailTrabalho);
		
		tfEmailTrabalhoAluno = new JTextField();
		tfEmailTrabalhoAluno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmailTrabalhoAluno.setName("tfemailtrabalhoaluno");
		tfEmailTrabalhoAluno.setMinimumSize(new Dimension(6, 30));
		tfEmailTrabalhoAluno.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfemailTrabalhoAluno = new GridBagConstraints();
		gbc_tfemailTrabalhoAluno.gridwidth = 2;
		gbc_tfemailTrabalhoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfemailTrabalhoAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfemailTrabalhoAluno.gridx = 3;
		gbc_tfemailTrabalhoAluno.gridy = 13;
		Aluno.add(tfEmailTrabalhoAluno, gbc_tfemailTrabalhoAluno);
		tfEmailTrabalhoAluno.setColumns(10);
		
		JLabel lblPai = new JLabel("Pai");
		lblPai.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblPai = new GridBagConstraints();
		gbc_lblPai.fill = GridBagConstraints.VERTICAL;
		gbc_lblPai.anchor = GridBagConstraints.WEST;
		gbc_lblPai.insets = new Insets(0, 0, 5, 5);
		gbc_lblPai.gridx = 2;
		gbc_lblPai.gridy = 15;
		Aluno.add(lblPai, gbc_lblPai);
		
		tfPai = new JTextField();
		tfPai.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfPai.setMinimumSize(new Dimension(6, 30));
		tfPai.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfPai = new GridBagConstraints();
		gbc_tfPai.insets = new Insets(0, 0, 5, 5);
		gbc_tfPai.gridwidth = 7;
		gbc_tfPai.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPai.gridx = 3;
		gbc_tfPai.gridy = 15;
		Aluno.add(tfPai, gbc_tfPai);
		tfPai.setColumns(10);
		
		JLabel lblMae = new JLabel("Mae");
		lblMae.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_lblMae = new GridBagConstraints();
		gbc_lblMae.anchor = GridBagConstraints.WEST;
		gbc_lblMae.insets = new Insets(0, 0, 0, 5);
		gbc_lblMae.gridx = 2;
		gbc_lblMae.gridy = 16;
		Aluno.add(lblMae, gbc_lblMae);
		
		tfMae = new JTextField();
		tfMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfMae.setMinimumSize(new Dimension(6, 30));
		tfMae.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfMae = new GridBagConstraints();
		gbc_tfMae.gridwidth = 7;
		gbc_tfMae.insets = new Insets(0, 0, 0, 5);
		gbc_tfMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMae.gridx = 3;
		gbc_tfMae.gridy = 16;
		Aluno.add(tfMae, gbc_tfMae);
		tfMae.setColumns(10);
		
		JPanel infoResponsaveis = new JPanel();
		infoResponsaveis.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.addTab("Info. Responsáveis", null, infoResponsaveis, null);
		infoResponsaveis.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		infoResponsaveis.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.setAutoscrolls(true);
		scrollPane_1.setViewportView(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{93, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 0};
		gbl_panel_3.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 30, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
				JLabel label_10 = new JLabel("Informações sobre o Pai do aluno");
				GridBagConstraints gbc_label_10 = new GridBagConstraints();
				gbc_label_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_label_10.gridwidth = 4;
				gbc_label_10.insets = new Insets(0, 0, 5, 5);
				gbc_label_10.gridx = 1;
				gbc_label_10.gridy = 1;
				panel_3.add(label_10, gbc_label_10);
				
				JLabel lblCpf_1 = new JLabel("CPF");
				GridBagConstraints gbc_lblCpf_1 = new GridBagConstraints();
				gbc_lblCpf_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCpf_1.gridx = 1;
				gbc_lblCpf_1.gridy = 2;
				panel_3.add(lblCpf_1, gbc_lblCpf_1);
				
				ftmttfCpfpai = new MaskFormatter("###.###.###-##");
				tfCpfpai = new JFormattedTextField(ftmttfCpfpai);
				ftmttfCpfpai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCpfpai.setMinimumSize(new Dimension(6, 30));
				tfCpfpai.setPreferredSize(new Dimension(6, 30));
				tfCpfpai.setHorizontalAlignment(SwingConstants.CENTER);
				tfCpfpai.setName("tfcpfpai");
				GridBagConstraints gbc_tfCpfpai = new GridBagConstraints();
				gbc_tfCpfpai.insets = new Insets(0, 0, 5, 5);
				gbc_tfCpfpai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCpfpai.gridx = 2;
				gbc_tfCpfpai.gridy = 2;
				panel_3.add(tfCpfpai, gbc_tfCpfpai);
				tfCpfpai.setColumns(10);
				
				JLabel lblRg = new JLabel("RG");
				GridBagConstraints gbc_lblRg = new GridBagConstraints();
				gbc_lblRg.insets = new Insets(0, 0, 5, 5);
				gbc_lblRg.gridx = 3;
				gbc_lblRg.gridy = 2;
				panel_3.add(lblRg, gbc_lblRg);
				
				ftmttfRgPai = new MaskFormatter("##########");
				tfRgPai = new JFormattedTextField(ftmttfRgPai);
				ftmttfRgPai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfRgPai.setMinimumSize(new Dimension(6, 30));
				tfRgPai.setPreferredSize(new Dimension(6, 30));
				tfRgPai.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_tfRgPai = new GridBagConstraints();
				gbc_tfRgPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfRgPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfRgPai.gridx = 4;
				gbc_tfRgPai.gridy = 2;
				panel_3.add(tfRgPai, gbc_tfRgPai);
				tfRgPai.setColumns(10);
				
				JLabel label_11 = new JLabel("Nome");
				label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_11 = new GridBagConstraints();
				gbc_label_11.anchor = GridBagConstraints.WEST;
				gbc_label_11.insets = new Insets(0, 0, 5, 5);
				gbc_label_11.gridx = 1;
				gbc_label_11.gridy = 3;
				panel_3.add(label_11, gbc_label_11);
				
				tfNomePai = new JTextField();
				tfNomePai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfNomePai.setPreferredSize(new Dimension(6, 30));
				tfNomePai.setColumns(10);
				GridBagConstraints gbc_tfNomePai = new GridBagConstraints();
				gbc_tfNomePai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNomePai.anchor = GridBagConstraints.NORTH;
				gbc_tfNomePai.gridwidth = 9;
				gbc_tfNomePai.insets = new Insets(0, 0, 5, 5);
				gbc_tfNomePai.gridx = 2;
				gbc_tfNomePai.gridy = 3;
				panel_3.add(tfNomePai, gbc_tfNomePai);
				
				JLabel label_12 = new JLabel("Endereço");
				label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_12 = new GridBagConstraints();
				gbc_label_12.anchor = GridBagConstraints.WEST;
				gbc_label_12.insets = new Insets(0, 0, 5, 5);
				gbc_label_12.gridx = 1;
				gbc_label_12.gridy = 4;
				panel_3.add(label_12, gbc_label_12);
				
				tfEnderecoPai = new JTextField();
				tfEnderecoPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEnderecoPai.setPreferredSize(new Dimension(6, 30));
				tfEnderecoPai.setColumns(10);
				GridBagConstraints gbc_tfEnderecoPai = new GridBagConstraints();
				gbc_tfEnderecoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEnderecoPai.anchor = GridBagConstraints.NORTH;
				gbc_tfEnderecoPai.gridwidth = 9;
				gbc_tfEnderecoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfEnderecoPai.gridx = 2;
				gbc_tfEnderecoPai.gridy = 4;
				panel_3.add(tfEnderecoPai, gbc_tfEnderecoPai);
				
				JLabel label_13 = new JLabel("Bairro");
				label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_13 = new GridBagConstraints();
				gbc_label_13.anchor = GridBagConstraints.WEST;
				gbc_label_13.insets = new Insets(0, 0, 5, 5);
				gbc_label_13.gridx = 1;
				gbc_label_13.gridy = 5;
				panel_3.add(label_13, gbc_label_13);
				
				tfBairroPai = new JTextField();
				tfBairroPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfBairroPai.setPreferredSize(new Dimension(6, 30));
				tfBairroPai.setColumns(10);
				GridBagConstraints gbc_tfBairroPai = new GridBagConstraints();
				gbc_tfBairroPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfBairroPai.anchor = GridBagConstraints.NORTH;
				gbc_tfBairroPai.gridwidth = 9;
				gbc_tfBairroPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfBairroPai.gridx = 2;
				gbc_tfBairroPai.gridy = 5;
				panel_3.add(tfBairroPai, gbc_tfBairroPai);
				
				JLabel label_14 = new JLabel("Cidade");
				label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_label_14 = new GridBagConstraints();
				gbc_label_14.anchor = GridBagConstraints.WEST;
				gbc_label_14.insets = new Insets(0, 0, 5, 5);
				gbc_label_14.gridx = 1;
				gbc_label_14.gridy = 6;
				panel_3.add(label_14, gbc_label_14);
				
				tfCidadePai = new JTextField();
				tfCidadePai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfCidadePai.setPreferredSize(new Dimension(6, 30));
				tfCidadePai.setColumns(10);
				GridBagConstraints gbc_tfCidadePai = new GridBagConstraints();
				gbc_tfCidadePai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCidadePai.anchor = GridBagConstraints.NORTH;
				gbc_tfCidadePai.gridwidth = 9;
				gbc_tfCidadePai.insets = new Insets(0, 0, 5, 5);
				gbc_tfCidadePai.gridx = 2;
				gbc_tfCidadePai.gridy = 6;
				panel_3.add(tfCidadePai, gbc_tfCidadePai);
				
				JLabel label_15 = new JLabel("Cep");
				GridBagConstraints gbc_label_15 = new GridBagConstraints();
				gbc_label_15.anchor = GridBagConstraints.WEST;
				gbc_label_15.insets = new Insets(0, 0, 5, 5);
				gbc_label_15.gridx = 1;
				gbc_label_15.gridy = 7;
				panel_3.add(label_15, gbc_label_15);
				
				ftmtCepPai = new MaskFormatter("#####-###"); 
				tfCepPai = new JFormattedTextField(ftmtCepPai);
				ftmtCepPai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCepPai.setPreferredSize(new Dimension(6, 30));
				tfCepPai.setHorizontalAlignment(SwingConstants.CENTER);
				tfCepPai.setColumns(10);
				GridBagConstraints gbc_tfCepPai = new GridBagConstraints();
				gbc_tfCepPai.anchor = GridBagConstraints.NORTHWEST;
				gbc_tfCepPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfCepPai.gridx = 2;
				gbc_tfCepPai.gridy = 7;
				panel_3.add(tfCepPai, gbc_tfCepPai);
				
				JLabel label_16 = new JLabel("Telefone");
				GridBagConstraints gbc_label_16 = new GridBagConstraints();
				gbc_label_16.anchor = GridBagConstraints.EAST;
				gbc_label_16.insets = new Insets(0, 0, 5, 5);
				gbc_label_16.gridx = 3;
				gbc_label_16.gridy = 7;
				panel_3.add(label_16, gbc_label_16);
				
				ftmttfTelefonePai  = new MaskFormatter("(##)####-####");
				tfTelefonePai = new JFormattedTextField(ftmttfTelefonePai);
				ftmttfTelefonePai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfTelefonePai.setPreferredSize(new Dimension(6, 30));
				tfTelefonePai.setMinimumSize(new Dimension(6, 30));
				tfTelefonePai.setHorizontalAlignment(SwingConstants.CENTER);
				tfTelefonePai.setColumns(10);
				GridBagConstraints gbc_tfTelefonePai = new GridBagConstraints();
				gbc_tfTelefonePai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfTelefonePai.insets = new Insets(0, 0, 5, 5);
				gbc_tfTelefonePai.gridx = 4;
				gbc_tfTelefonePai.gridy = 7;
				panel_3.add(tfTelefonePai, gbc_tfTelefonePai);
				
				JLabel label_17 = new JLabel("Celular");
				GridBagConstraints gbc_label_17 = new GridBagConstraints();
				gbc_label_17.anchor = GridBagConstraints.EAST;
				gbc_label_17.insets = new Insets(0, 0, 5, 5);
				gbc_label_17.gridx = 5;
				gbc_label_17.gridy = 7;
				panel_3.add(label_17, gbc_label_17);
				
				ftmttfCelularPai = new MaskFormatter("(##)###-###-###");
				tfCelularPai = new JFormattedTextField(ftmttfCelularPai);
				ftmttfCelularPai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCelularPai.setPreferredSize(new Dimension(6, 30));
				tfCelularPai.setMinimumSize(new Dimension(6, 30));
				tfCelularPai.setHorizontalAlignment(SwingConstants.CENTER);
				tfCelularPai.setColumns(10);
				GridBagConstraints gbc_tfCelularPai = new GridBagConstraints();
				gbc_tfCelularPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCelularPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfCelularPai.gridx = 6;
				gbc_tfCelularPai.gridy = 7;
				panel_3.add(tfCelularPai, gbc_tfCelularPai);
				
				JLabel label_18 = new JLabel("Trabalho");
				GridBagConstraints gbc_label_18 = new GridBagConstraints();
				gbc_label_18.anchor = GridBagConstraints.EAST;
				gbc_label_18.insets = new Insets(0, 0, 5, 5);
				gbc_label_18.gridx = 7;
				gbc_label_18.gridy = 7;
				panel_3.add(label_18, gbc_label_18);
				
				ftmttfFoneTrabalhoPai = new MaskFormatter("(##)####-####");
				tfFoneTrabalhoPai = new JFormattedTextField(ftmttfFoneTrabalhoPai);
				ftmttfFoneTrabalhoPai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfFoneTrabalhoPai.setPreferredSize(new Dimension(6, 30));
				tfFoneTrabalhoPai.setMinimumSize(new Dimension(6, 30));
				tfFoneTrabalhoPai.setHorizontalAlignment(SwingConstants.CENTER);
				tfFoneTrabalhoPai.setColumns(10);
				GridBagConstraints gbc_tfFoneTrabalhoPai = new GridBagConstraints();
				gbc_tfFoneTrabalhoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfFoneTrabalhoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfFoneTrabalhoPai.gridx = 8;
				gbc_tfFoneTrabalhoPai.gridy = 7;
				panel_3.add(tfFoneTrabalhoPai, gbc_tfFoneTrabalhoPai);
				
				JLabel label_19 = new JLabel("Email");
				GridBagConstraints gbc_label_19 = new GridBagConstraints();
				gbc_label_19.anchor = GridBagConstraints.NORTHWEST;
				gbc_label_19.insets = new Insets(0, 0, 5, 5);
				gbc_label_19.gridx = 1;
				gbc_label_19.gridy = 8;
				panel_3.add(label_19, gbc_label_19);
				
				tfEmailPai = new JTextField();
				tfEmailPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEmailPai.setPreferredSize(new Dimension(6, 30));
				tfEmailPai.setMinimumSize(new Dimension(6, 30));
				tfEmailPai.setColumns(10);
				GridBagConstraints gbc_tfEmailPai = new GridBagConstraints();
				gbc_tfEmailPai.anchor = GridBagConstraints.NORTH;
				gbc_tfEmailPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmailPai.gridwidth = 3;
				gbc_tfEmailPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmailPai.gridx = 2;
				gbc_tfEmailPai.gridy = 8;
				panel_3.add(tfEmailPai, gbc_tfEmailPai);

				
				JLabel lblEmail_3 = new JLabel("Email2");
				GridBagConstraints gbc_lblEmail_3 = new GridBagConstraints();
				gbc_lblEmail_3.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblEmail_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail_3.gridx = 5;
				gbc_lblEmail_3.gridy = 8;
				panel_3.add(lblEmail_3, gbc_lblEmail_3);
				
				tfEmail2Pai = new JTextField();
				tfEmail2Pai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEmail2Pai.setPreferredSize(new Dimension(6, 30));
				tfEmail2Pai.setMinimumSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfEmail2Pai = new GridBagConstraints();
				gbc_tfEmail2Pai.anchor = GridBagConstraints.NORTH;
				gbc_tfEmail2Pai.gridwidth = 5;
				gbc_tfEmail2Pai.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmail2Pai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmail2Pai.gridx = 6;
				gbc_tfEmail2Pai.gridy = 8;
				panel_3.add(tfEmail2Pai, gbc_tfEmail2Pai);
				tfEmail2Pai.setColumns(10);
				
				JLabel lblDataNasc_1 = new JLabel("Data Nasc.");
				GridBagConstraints gbc_lblDataNasc_1 = new GridBagConstraints();
				gbc_lblDataNasc_1.anchor = GridBagConstraints.WEST;
				gbc_lblDataNasc_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblDataNasc_1.gridx = 1;
				gbc_lblDataNasc_1.gridy = 9;
				panel_3.add(lblDataNasc_1, gbc_lblDataNasc_1);
				
				ftmttfDataNascimentoPai = new MaskFormatter("##/##/####");
				tfDataNascimentoPai = new JFormattedTextField(ftmttfDataNascimentoPai);
				ftmttfDataNascimentoPai.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfDataNascimentoPai.setMinimumSize(new Dimension(6, 30));
				tfDataNascimentoPai.setPreferredSize(new Dimension(6, 30));
				tfDataNascimentoPai.setHorizontalAlignment(SwingConstants.CENTER);
				tfDataNascimentoPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_tfDataNascimentoPai = new GridBagConstraints();
				gbc_tfDataNascimentoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfDataNascimentoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfDataNascimentoPai.gridx = 2;
				gbc_tfDataNascimentoPai.gridy = 9;
				panel_3.add(tfDataNascimentoPai, gbc_tfDataNascimentoPai);
				tfDataNascimentoPai.setColumns(10);
				
				JLabel lblEmmailTrabalho = new JLabel("Email Trabalho");
				GridBagConstraints gbc_lblEmmailTrabalho = new GridBagConstraints();
				gbc_lblEmmailTrabalho.anchor = GridBagConstraints.EAST;
				gbc_lblEmmailTrabalho.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmmailTrabalho.gridx = 5;
				gbc_lblEmmailTrabalho.gridy = 9;
				panel_3.add(lblEmmailTrabalho, gbc_lblEmmailTrabalho);
				
				tfEmailTrabalhoPai = new JTextField();
				tfEmailTrabalhoPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEmailTrabalhoPai.setMinimumSize(new Dimension(6, 30));
				tfEmailTrabalhoPai.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfEmailTrabalhoPai = new GridBagConstraints();
				gbc_tfEmailTrabalhoPai.gridwidth = 5;
				gbc_tfEmailTrabalhoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmailTrabalhoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmailTrabalhoPai.gridx = 6;
				gbc_tfEmailTrabalhoPai.gridy = 9;
				panel_3.add(tfEmailTrabalhoPai, gbc_tfEmailTrabalhoPai);
				tfEmailTrabalhoPai.setColumns(10);
				
				JLabel lblProfissao = new JLabel("Profissão");
				GridBagConstraints gbc_lblProfissao = new GridBagConstraints();
				gbc_lblProfissao.anchor = GridBagConstraints.WEST;
				gbc_lblProfissao.insets = new Insets(0, 0, 5, 5);
				gbc_lblProfissao.gridx = 1;
				gbc_lblProfissao.gridy = 10;
				panel_3.add(lblProfissao, gbc_lblProfissao);
				
				tfProfissaoPai = new JTextField();
				tfProfissaoPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfProfissaoPai.setMinimumSize(new Dimension(6, 30));
				tfProfissaoPai.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfProfissaoPai = new GridBagConstraints();
				gbc_tfProfissaoPai.gridwidth = 3;
				gbc_tfProfissaoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfProfissaoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfProfissaoPai.gridx = 2;
				gbc_tfProfissaoPai.gridy = 10;
				panel_3.add(tfProfissaoPai, gbc_tfProfissaoPai);
				tfProfissaoPai.setColumns(10);
				
				JLabel lblLocalTrabalho = new JLabel("Local Trabalho");
				GridBagConstraints gbc_lblLocalTrabalho = new GridBagConstraints();
				gbc_lblLocalTrabalho.anchor = GridBagConstraints.EAST;
				gbc_lblLocalTrabalho.insets = new Insets(0, 0, 5, 5);
				gbc_lblLocalTrabalho.gridx = 5;
				gbc_lblLocalTrabalho.gridy = 10;
				panel_3.add(lblLocalTrabalho, gbc_lblLocalTrabalho);
				
				tfLocalTrabalhoPai = new JTextField();
				tfLocalTrabalhoPai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfLocalTrabalhoPai.setPreferredSize(new Dimension(6, 30));
				tfLocalTrabalhoPai.setMinimumSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfLocalTrabalhoPai = new GridBagConstraints();
				gbc_tfLocalTrabalhoPai.gridwidth = 5;
				gbc_tfLocalTrabalhoPai.insets = new Insets(0, 0, 5, 5);
				gbc_tfLocalTrabalhoPai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfLocalTrabalhoPai.gridx = 6;
				gbc_tfLocalTrabalhoPai.gridy = 10;
				panel_3.add(tfLocalTrabalhoPai, gbc_tfLocalTrabalhoPai);
				tfLocalTrabalhoPai.setColumns(10);
				
				JLabel lblNacionalidade = new JLabel("Nacionalidade");
				GridBagConstraints gbc_lblNacionalidade = new GridBagConstraints();
				gbc_lblNacionalidade.anchor = GridBagConstraints.EAST;
				gbc_lblNacionalidade.insets = new Insets(0, 0, 5, 5);
				gbc_lblNacionalidade.gridx = 1;
				gbc_lblNacionalidade.gridy = 11;
				panel_3.add(lblNacionalidade, gbc_lblNacionalidade);
				
				tfNacionalidadePai = new JTextField();
				tfNacionalidadePai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfNacionalidadePai.setMinimumSize(new Dimension(6, 30));
				tfNacionalidadePai.setPreferredSize(new Dimension(6, 30));
				tfNacionalidadePai.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_tfNacionalidadePai = new GridBagConstraints();
				gbc_tfNacionalidadePai.gridwidth = 3;
				gbc_tfNacionalidadePai.insets = new Insets(0, 0, 5, 5);
				gbc_tfNacionalidadePai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNacionalidadePai.gridx = 2;
				gbc_tfNacionalidadePai.gridy = 11;
				panel_3.add(tfNacionalidadePai, gbc_tfNacionalidadePai);
				tfNacionalidadePai.setColumns(10);
				
				JLabel lblNaturalidade_1 = new JLabel("Naturalidade");
				GridBagConstraints gbc_lblNaturalidade_1 = new GridBagConstraints();
				gbc_lblNaturalidade_1.anchor = GridBagConstraints.EAST;
				gbc_lblNaturalidade_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNaturalidade_1.gridx = 5;
				gbc_lblNaturalidade_1.gridy = 11;
				panel_3.add(lblNaturalidade_1, gbc_lblNaturalidade_1);
				
				tfNaturalidadePai = new JTextField();
				tfNaturalidadePai.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfNaturalidadePai.setMinimumSize(new Dimension(6, 30));
				tfNaturalidadePai.setPreferredSize(new Dimension(6, 30));
				tfNaturalidadePai.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_tfNaturalidadePai = new GridBagConstraints();
				gbc_tfNaturalidadePai.gridwidth = 5;
				gbc_tfNaturalidadePai.insets = new Insets(0, 0, 5, 5);
				gbc_tfNaturalidadePai.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNaturalidadePai.gridx = 6;
				gbc_tfNaturalidadePai.gridy = 11;
				panel_3.add(tfNaturalidadePai, gbc_tfNaturalidadePai);
				tfNaturalidadePai.setColumns(10);
				
				JLabel label = new JLabel("Informação da Mãe do aluno");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.WEST;
				gbc_label.gridwidth = 3;
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 1;
				gbc_label.gridy = 14;
				panel_3.add(label, gbc_label);
				
				JLabel lblCpf = new JLabel("CPF");
				GridBagConstraints gbc_lblCpf = new GridBagConstraints();
				gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
				gbc_lblCpf.gridx = 1;
				gbc_lblCpf.gridy = 15;
				panel_3.add(lblCpf, gbc_lblCpf);
				
				
				
				ftmttfCpfMae = new MaskFormatter("###.###.###-##");
				tfCpfMae = new JFormattedTextField(ftmttfCpfMae);
				ftmttfCpfMae.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCpfMae.setMinimumSize(new Dimension(6, 30));
				tfCpfMae.setPreferredSize(new Dimension(6, 30));
				tfCpfMae.setHorizontalAlignment(SwingConstants.CENTER);
				tfCpfMae.setName("tfcpfMae");
				GridBagConstraints gbc_tfCpfMae = new GridBagConstraints();
				gbc_tfCpfMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfCpfMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCpfMae.gridx = 2;
				gbc_tfCpfMae.gridy = 15;
				panel_3.add(tfCpfMae, gbc_tfCpfMae);
				tfCpfMae.setColumns(10);
				
				JLabel lblRg_1 = new JLabel("RG");
				GridBagConstraints gbc_lblRg_1 = new GridBagConstraints();
				gbc_lblRg_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblRg_1.gridx = 3;
				gbc_lblRg_1.gridy = 15;
				panel_3.add(lblRg_1, gbc_lblRg_1);
				
				ftmttfRgMae = new MaskFormatter("##########");
				tfRgMae = new JFormattedTextField(ftmttfRgMae);
				ftmttfRgMae.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfRgMae.setPreferredSize(new Dimension(6, 30));
				tfRgMae.setMinimumSize(new Dimension(6, 30));
				tfRgMae.setHorizontalAlignment(SwingConstants.CENTER);
				tfRgMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
				GridBagConstraints gbc_tfRgMae = new GridBagConstraints();
				gbc_tfRgMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfRgMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfRgMae.gridx = 4;
				gbc_tfRgMae.gridy = 15;
				panel_3.add(tfRgMae, gbc_tfRgMae);
				tfRgMae.setColumns(10);
				
				JLabel lblNome_2 = new JLabel("Nome");
				GridBagConstraints gbc_lblNome_2 = new GridBagConstraints();
				gbc_lblNome_2.anchor = GridBagConstraints.WEST;
				gbc_lblNome_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNome_2.gridx = 1;
				gbc_lblNome_2.gridy = 16;
				panel_3.add(lblNome_2, gbc_lblNome_2);
				
				tfNomeMae = new JTextField();
				tfNomeMae.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfNomeMae.setMinimumSize(new Dimension(6, 30));
				tfNomeMae.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfNomeMae = new GridBagConstraints();
				gbc_tfNomeMae.gridwidth = 9;
				gbc_tfNomeMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfNomeMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNomeMae.gridx = 2;
				gbc_tfNomeMae.gridy = 16;
				panel_3.add(tfNomeMae, gbc_tfNomeMae);
				tfNomeMae.setColumns(10);
				
				JLabel lblEndereo_1 = new JLabel("Endereço");
				GridBagConstraints gbc_lblEndereo_1 = new GridBagConstraints();
				gbc_lblEndereo_1.anchor = GridBagConstraints.WEST;
				gbc_lblEndereo_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblEndereo_1.gridx = 1;
				gbc_lblEndereo_1.gridy = 17;
				panel_3.add(lblEndereo_1, gbc_lblEndereo_1);
				
				tfEnderecoMae = new JTextField();
				tfEnderecoMae.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEnderecoMae.setMinimumSize(new Dimension(6, 30));
				tfEnderecoMae.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfEnderecoMae = new GridBagConstraints();
				gbc_tfEnderecoMae.gridwidth = 9;
				gbc_tfEnderecoMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfEnderecoMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEnderecoMae.gridx = 2;
				gbc_tfEnderecoMae.gridy = 17;
				panel_3.add(tfEnderecoMae, gbc_tfEnderecoMae);
				tfEnderecoMae.setColumns(10);
				
				JLabel lblBairro_1 = new JLabel("Bairro");
				GridBagConstraints gbc_lblBairro_1 = new GridBagConstraints();
				gbc_lblBairro_1.anchor = GridBagConstraints.WEST;
				gbc_lblBairro_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblBairro_1.gridx = 1;
				gbc_lblBairro_1.gridy = 18;
				panel_3.add(lblBairro_1, gbc_lblBairro_1);
				
				tfBairroMae = new JTextField();
				tfBairroMae.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfBairroMae.setMinimumSize(new Dimension(6, 30));
				tfBairroMae.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfBairroMae = new GridBagConstraints();
				gbc_tfBairroMae.gridwidth = 9;
				gbc_tfBairroMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfBairroMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfBairroMae.gridx = 2;
				gbc_tfBairroMae.gridy = 18;
				panel_3.add(tfBairroMae, gbc_tfBairroMae);
				tfBairroMae.setColumns(10);
				
				JLabel lblCidade_1 = new JLabel("Cidade");
				GridBagConstraints gbc_lblCidade_1 = new GridBagConstraints();
				gbc_lblCidade_1.anchor = GridBagConstraints.WEST;
				gbc_lblCidade_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCidade_1.gridx = 1;
				gbc_lblCidade_1.gridy = 19;
				panel_3.add(lblCidade_1, gbc_lblCidade_1);
				
				tfCidadeMae = new JTextField();
				tfCidadeMae.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfCidadeMae.setMinimumSize(new Dimension(6, 30));
				tfCidadeMae.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfCidadeMae = new GridBagConstraints();
				gbc_tfCidadeMae.gridwidth = 9;
				gbc_tfCidadeMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfCidadeMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCidadeMae.gridx = 2;
				gbc_tfCidadeMae.gridy = 19;
				panel_3.add(tfCidadeMae, gbc_tfCidadeMae);
				tfCidadeMae.setColumns(10);
				
				JLabel lblCep_1 = new JLabel("Cep");
				GridBagConstraints gbc_lblCep_1 = new GridBagConstraints();
				gbc_lblCep_1.anchor = GridBagConstraints.WEST;
				gbc_lblCep_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCep_1.gridx = 1;
				gbc_lblCep_1.gridy = 20;
				panel_3.add(lblCep_1, gbc_lblCep_1);
				
				ftmttfCepMae = new MaskFormatter("#####-###");
				tfCepMae = new JFormattedTextField(ftmttfCepMae);
				ftmttfCepMae.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCepMae.setMinimumSize(new Dimension(6, 30));
				tfCepMae.setPreferredSize(new Dimension(6, 30));
				tfCepMae.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_tfCepMae = new GridBagConstraints();
				gbc_tfCepMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfCepMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCepMae.gridx = 2;
				gbc_tfCepMae.gridy = 20;
				panel_3.add(tfCepMae, gbc_tfCepMae);
				tfCepMae.setColumns(10);
				
				JLabel lblTelefone_1 = new JLabel("Telefone");
				GridBagConstraints gbc_lblTelefone_1 = new GridBagConstraints();
				gbc_lblTelefone_1.anchor = GridBagConstraints.EAST;
				gbc_lblTelefone_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelefone_1.gridx = 3;
				gbc_lblTelefone_1.gridy = 20;
				panel_3.add(lblTelefone_1, gbc_lblTelefone_1);
				
				ftmttfTelefone = new MaskFormatter("(##)####-####");
				tfTelefoneMae = new JFormattedTextField(ftmttfTelefone);
				ftmttfTelefone.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfTelefoneMae.setMinimumSize(new Dimension(6, 30));
				tfTelefoneMae.setPreferredSize(new Dimension(6, 30));
				tfTelefoneMae.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_tfTelefoneMae = new GridBagConstraints();
				gbc_tfTelefoneMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfTelefoneMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfTelefoneMae.gridx = 4;
				gbc_tfTelefoneMae.gridy = 20;
				panel_3.add(tfTelefoneMae, gbc_tfTelefoneMae);
				tfTelefoneMae.setColumns(10);
				
				JLabel lblCelular_1 = new JLabel("Celular");
				GridBagConstraints gbc_lblCelular_1 = new GridBagConstraints();
				gbc_lblCelular_1.anchor = GridBagConstraints.EAST;
				gbc_lblCelular_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCelular_1.gridx = 5;
				gbc_lblCelular_1.gridy = 20;
				panel_3.add(lblCelular_1, gbc_lblCelular_1);
				
				ftmtCelularMae = new MaskFormatter("(##)###-###-###");
				tfCelularMae = new JFormattedTextField(ftmtCelularMae);
				ftmtCelularMae.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfCelularMae.setMinimumSize(new Dimension(6, 30));
				tfCelularMae.setPreferredSize(new Dimension(6, 30));
				tfCelularMae.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_tfCelularMae = new GridBagConstraints();
				gbc_tfCelularMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfCelularMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfCelularMae.gridx = 6;
				gbc_tfCelularMae.gridy = 20;
				panel_3.add(tfCelularMae, gbc_tfCelularMae);
				tfCelularMae.setColumns(10);
				
				JLabel lblTrabalho = new JLabel("Trabalho");
				GridBagConstraints gbc_lblTrabalho = new GridBagConstraints();
				gbc_lblTrabalho.anchor = GridBagConstraints.EAST;
				gbc_lblTrabalho.insets = new Insets(0, 0, 5, 5);
				gbc_lblTrabalho.gridx = 7;
				gbc_lblTrabalho.gridy = 20;
				panel_3.add(lblTrabalho, gbc_lblTrabalho);
				
				ftmttfTtrabalho = new MaskFormatter("(##)####-####");
				tfTrabalhoMae = new JFormattedTextField(ftmttfTtrabalho);
				ftmttfTtrabalho.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
				tfTrabalhoMae.setMinimumSize(new Dimension(6, 30));
				tfTrabalhoMae.setPreferredSize(new Dimension(6, 30));
				tfTrabalhoMae.setHorizontalAlignment(SwingConstants.CENTER);
				GridBagConstraints gbc_tfTrabalhoMae = new GridBagConstraints();
				gbc_tfTrabalhoMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfTrabalhoMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfTrabalhoMae.gridx = 8;
				gbc_tfTrabalhoMae.gridy = 20;
				panel_3.add(tfTrabalhoMae, gbc_tfTrabalhoMae);
				tfTrabalhoMae.setColumns(10);
				
				JLabel lblEmail = new JLabel("Email");
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.anchor = GridBagConstraints.WEST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 1;
				gbc_lblEmail.gridy = 21;
				panel_3.add(lblEmail, gbc_lblEmail);
				
				tfEmailMae = new JTextField();
				tfEmailMae.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						char keyChar = e.getKeyChar();
						if (Character.isLowerCase(keyChar)) {
							e.setKeyChar(Character.toUpperCase(keyChar));
						}
					}
				});
				tfEmailMae.setMinimumSize(new Dimension(6, 30));
				tfEmailMae.setPreferredSize(new Dimension(6, 30));
				GridBagConstraints gbc_tfEmailMae = new GridBagConstraints();
				gbc_tfEmailMae.gridwidth = 3;
				gbc_tfEmailMae.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmailMae.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmailMae.gridx = 2;
				gbc_tfEmailMae.gridy = 21;
				panel_3.add(tfEmailMae, gbc_tfEmailMae);
				tfEmailMae.setColumns(10);

		
		JLabel lblEmail_4 = new JLabel("Email2");
		GridBagConstraints gbc_lblEmail_4 = new GridBagConstraints();
		gbc_lblEmail_4.anchor = GridBagConstraints.EAST;
		gbc_lblEmail_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_4.gridx = 5;
		gbc_lblEmail_4.gridy = 21;
		panel_3.add(lblEmail_4, gbc_lblEmail_4);
		
		tfEmail2Mae = new JTextField();
		tfEmail2Mae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmail2Mae.setMinimumSize(new Dimension(6, 30));
		tfEmail2Mae.setPreferredSize(new Dimension(6, 30));
		tfEmail2Mae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_tfEmail2Mae = new GridBagConstraints();
		gbc_tfEmail2Mae.gridwidth = 5;
		gbc_tfEmail2Mae.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmail2Mae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail2Mae.gridx = 6;
		gbc_tfEmail2Mae.gridy = 21;
		panel_3.add(tfEmail2Mae, gbc_tfEmail2Mae);
		tfEmail2Mae.setColumns(10);
		
		JLabel lblDataNasc_3 = new JLabel("Data Nasc.");
		GridBagConstraints gbc_lblDataNasc_3 = new GridBagConstraints();
		gbc_lblDataNasc_3.anchor = GridBagConstraints.WEST;
		gbc_lblDataNasc_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataNasc_3.gridx = 1;
		gbc_lblDataNasc_3.gridy = 22;
		panel_3.add(lblDataNasc_3, gbc_lblDataNasc_3);
		
		ftmttfDataNascimentoMae  = new MaskFormatter("##/##/####");
		tfDataNascimentoMae = new JFormattedTextField(ftmttfDataNascimentoMae);
		ftmttfDataNascimentoMae.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfDataNascimentoMae.setMinimumSize(new Dimension(6, 30));
		tfDataNascimentoMae.setPreferredSize(new Dimension(6, 30));
		tfDataNascimentoMae.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfDataNascimentoMae = new GridBagConstraints();
		gbc_tfDataNascimentoMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfDataNascimentoMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDataNascimentoMae.gridx = 2;
		gbc_tfDataNascimentoMae.gridy = 22;
		panel_3.add(tfDataNascimentoMae, gbc_tfDataNascimentoMae);
		tfDataNascimentoMae.setColumns(10);
		
		JLabel lblEmailTrabalho_1 = new JLabel("Email Trabalho");
		GridBagConstraints gbc_lblEmailTrabalho_1 = new GridBagConstraints();
		gbc_lblEmailTrabalho_1.anchor = GridBagConstraints.EAST;
		gbc_lblEmailTrabalho_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailTrabalho_1.gridx = 5;
		gbc_lblEmailTrabalho_1.gridy = 22;
		panel_3.add(lblEmailTrabalho_1, gbc_lblEmailTrabalho_1);
		
		tfEmailtrabalhoMae = new JTextField();
		tfEmailtrabalhoMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmailtrabalhoMae.setPreferredSize(new Dimension(6, 30));
		tfEmailtrabalhoMae.setMinimumSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmailtrabalhoMae = new GridBagConstraints();
		gbc_tfEmailtrabalhoMae.gridwidth = 5;
		gbc_tfEmailtrabalhoMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmailtrabalhoMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmailtrabalhoMae.gridx = 6;
		gbc_tfEmailtrabalhoMae.gridy = 22;
		panel_3.add(tfEmailtrabalhoMae, gbc_tfEmailtrabalhoMae);
		tfEmailtrabalhoMae.setColumns(10);
		
		JLabel lblProfisso_1 = new JLabel("Profissão");
		GridBagConstraints gbc_lblProfisso_1 = new GridBagConstraints();
		gbc_lblProfisso_1.anchor = GridBagConstraints.WEST;
		gbc_lblProfisso_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfisso_1.gridx = 1;
		gbc_lblProfisso_1.gridy = 23;
		panel_3.add(lblProfisso_1, gbc_lblProfisso_1);
		
		tfProfissaoMae = new JTextField();
		tfProfissaoMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfProfissaoMae.setPreferredSize(new Dimension(6, 30));
		tfProfissaoMae.setMinimumSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfProfissaoMae = new GridBagConstraints();
		gbc_tfProfissaoMae.gridwidth = 3;
		gbc_tfProfissaoMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfProfissaoMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfProfissaoMae.gridx = 2;
		gbc_tfProfissaoMae.gridy = 23;
		panel_3.add(tfProfissaoMae, gbc_tfProfissaoMae);
		tfProfissaoMae.setColumns(10);
		
		JLabel lblLocalTrabalho_1 = new JLabel("Local Trabalho");
		GridBagConstraints gbc_lblLocalTrabalho_1 = new GridBagConstraints();
		gbc_lblLocalTrabalho_1.anchor = GridBagConstraints.EAST;
		gbc_lblLocalTrabalho_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalTrabalho_1.gridx = 5;
		gbc_lblLocalTrabalho_1.gridy = 23;
		panel_3.add(lblLocalTrabalho_1, gbc_lblLocalTrabalho_1);
		
		tfLocalTrabalhoMae = new JTextField();
		tfLocalTrabalhoMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfLocalTrabalhoMae.setMinimumSize(new Dimension(6, 30));
		tfLocalTrabalhoMae.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfLocalTrabalhoMae = new GridBagConstraints();
		gbc_tfLocalTrabalhoMae.gridwidth = 5;
		gbc_tfLocalTrabalhoMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfLocalTrabalhoMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfLocalTrabalhoMae.gridx = 6;
		gbc_tfLocalTrabalhoMae.gridy = 23;
		panel_3.add(tfLocalTrabalhoMae, gbc_tfLocalTrabalhoMae);
		tfLocalTrabalhoMae.setColumns(10);
		
		JLabel lblNacionalidade_1 = new JLabel("Nacionalidade");
		GridBagConstraints gbc_lblNacionalidade_1 = new GridBagConstraints();
		gbc_lblNacionalidade_1.anchor = GridBagConstraints.EAST;
		gbc_lblNacionalidade_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacionalidade_1.gridx = 1;
		gbc_lblNacionalidade_1.gridy = 24;
		panel_3.add(lblNacionalidade_1, gbc_lblNacionalidade_1);
		
		tfNacionalidadeMae = new JTextField();
		tfNacionalidadeMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfNacionalidadeMae.setMinimumSize(new Dimension(6, 30));
		tfNacionalidadeMae.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfNacionalidadeMae = new GridBagConstraints();
		gbc_tfNacionalidadeMae.gridwidth = 3;
		gbc_tfNacionalidadeMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfNacionalidadeMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNacionalidadeMae.gridx = 2;
		gbc_tfNacionalidadeMae.gridy = 24;
		panel_3.add(tfNacionalidadeMae, gbc_tfNacionalidadeMae);
		tfNacionalidadeMae.setColumns(10);
		
		JLabel lblNaturalidade_3 = new JLabel("Naturalidade");
		GridBagConstraints gbc_lblNaturalidade_3 = new GridBagConstraints();
		gbc_lblNaturalidade_3.anchor = GridBagConstraints.EAST;
		gbc_lblNaturalidade_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNaturalidade_3.gridx = 5;
		gbc_lblNaturalidade_3.gridy = 24;
		panel_3.add(lblNaturalidade_3, gbc_lblNaturalidade_3);
		
		tfNaturalidadeMae = new JTextField();
		tfNaturalidadeMae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfNaturalidadeMae.setMinimumSize(new Dimension(6, 30));
		tfNaturalidadeMae.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfNaturalidadeMae = new GridBagConstraints();
		gbc_tfNaturalidadeMae.gridwidth = 5;
		gbc_tfNaturalidadeMae.insets = new Insets(0, 0, 5, 5);
		gbc_tfNaturalidadeMae.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNaturalidadeMae.gridx = 6;
		gbc_tfNaturalidadeMae.gridy = 24;
		panel_3.add(tfNaturalidadeMae, gbc_tfNaturalidadeMae);
		tfNaturalidadeMae.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.gridheight = 3;
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 25;
		panel_3.add(verticalStrut_2, gbc_verticalStrut_2);
				
		
		
		
		
		JLabel label1 = new JLabel("Informação da Outro Responsável do aluno");
		GridBagConstraints gbc_label1 = new GridBagConstraints();
		gbc_label1.anchor = GridBagConstraints.WEST;
		gbc_label1.gridwidth = 3;
		gbc_label1.insets = new Insets(0, 0, 5, 5);
		gbc_label1.gridx = 1;
		gbc_label1.gridy = 28;
		panel_3.add(label1, gbc_label1);
		
		JLabel  lblCPF_Outro = new JLabel("CPF");
		GridBagConstraints gbc_lblCPF_Outro = new GridBagConstraints();
		gbc_lblCPF_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCPF_Outro.gridy = 29;
		gbc_lblCPF_Outro.gridx = 1;
		panel_3.add(lblCPF_Outro, gbc_lblCPF_Outro);
		
		ftmttfCpfOutro = new MaskFormatter("###.###.###-##");
		tfCpfOutro = new JFormattedTextField(ftmttfCpfOutro);
		ftmttfCpfOutro.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfCpfOutro.setHorizontalAlignment(SwingConstants.CENTER);
		tfCpfOutro.setPreferredSize(new Dimension(6, 30));
		tfCpfOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfCpf_Outro = new GridBagConstraints();
		gbc_tfCpf_Outro.insets = new Insets(0,0,5,5);
		gbc_tfCpf_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCpf_Outro.gridx = 2;
		gbc_tfCpf_Outro.gridy = 29;
		panel_3.add(tfCpfOutro, gbc_tfCpf_Outro);
		
		JLabel lblNewLabel = new JLabel("RG");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 29;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		
		ftmttfRgOutroResp = new MaskFormatter("##########");
		tfRgOutroResp = new JFormattedTextField(ftmttfRgOutroResp);
		ftmttfRgOutroResp.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfRgOutroResp.setMinimumSize(new Dimension(6, 30));
		tfRgOutroResp.setPreferredSize(new Dimension(6, 30));
		tfRgOutroResp.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfRgOutroResp = new GridBagConstraints();
		gbc_tfRgOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfRgOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfRgOutroResp.gridx = 4;
		gbc_tfRgOutroResp.gridy = 29;
		panel_3.add(tfRgOutroResp, gbc_tfRgOutroResp);
		tfRgOutroResp.setColumns(10);
		
		JLabel lblNome_Outro = new JLabel("Nome");
		GridBagConstraints gbc_lblNome_Outro = new GridBagConstraints();
		gbc_lblNome_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblNome_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome_Outro.gridx = 1;
		gbc_lblNome_Outro.gridy = 30;
		panel_3.add(lblNome_Outro, gbc_lblNome_Outro);
		
		tfNomeOutro = new JTextField();
		tfNomeOutro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfNomeOutro.setMinimumSize(new Dimension(6, 30));
		tfNomeOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfNomeOutro = new GridBagConstraints();
		gbc_tfNomeOutro.insets = new Insets(0, 0, 5, 5);
		gbc_tfNomeOutro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNomeOutro.gridwidth = 9;
		gbc_tfNomeOutro.gridx = 2;
		gbc_tfNomeOutro.gridy = 30;
		panel_3.add(tfNomeOutro, gbc_tfNomeOutro);
		tfNomeOutro.setColumns(10);
		
		JLabel lblEndereo_Outro = new JLabel("Endereço");
		GridBagConstraints gbc_lblEndereo_Outro = new GridBagConstraints();
		gbc_lblEndereo_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblEndereo_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo_Outro.gridx = 1;
		gbc_lblEndereo_Outro.gridy = 31;
		panel_3.add(lblEndereo_Outro, gbc_lblEndereo_Outro);
		
		tfEnderecoOutro = new JTextField();
		tfEnderecoOutro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEnderecoOutro.setMinimumSize(new Dimension(6, 30));
		tfEnderecoOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEndereco_Outro = new GridBagConstraints();
		gbc_tfEndereco_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfEndereco_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEndereco_Outro.gridwidth = 9;
		gbc_tfEndereco_Outro.gridx = 2;
		gbc_tfEndereco_Outro.gridy = 31;
		panel_3.add(tfEnderecoOutro, gbc_tfEndereco_Outro);
		tfEnderecoOutro.setColumns(10);
		
		JLabel lblBairroOutro = new JLabel("Bairro");
		GridBagConstraints gbc_lblBairro_Outro = new GridBagConstraints();
		gbc_lblBairro_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblBairro_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblBairro_Outro.gridx = 1;
		gbc_lblBairro_Outro.gridy = 32;
		panel_3.add(lblBairroOutro, gbc_lblBairro_Outro);
		
		tfBairroOutro = new JTextField();
		tfBairroOutro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfBairroOutro.setMinimumSize(new Dimension(6, 30));
		tfBairroOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfBairro_Outro = new GridBagConstraints();
		gbc_tfBairro_Outro.gridwidth = 9;
		gbc_tfBairro_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfBairro_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBairro_Outro.gridx = 2;
		gbc_tfBairro_Outro.gridy = 32;
		panel_3.add(tfBairroOutro, gbc_tfBairro_Outro);
		tfBairroOutro.setColumns(10);
		
		JLabel lblCidadeOutro = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade_Outro = new GridBagConstraints();
		gbc_lblCidade_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblCidade_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade_Outro.gridx = 1;
		gbc_lblCidade_Outro.gridy = 33;
		panel_3.add(lblCidadeOutro, gbc_lblCidade_Outro);
		
		tfCidadeOutro = new JTextField();
		tfCidadeOutro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfCidadeOutro.setMinimumSize(new Dimension(6, 30));
		tfCidadeOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfCidade_Outro = new GridBagConstraints();
		gbc_tfCidade_Outro.gridwidth = 9;
		gbc_tfCidade_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfCidade_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCidade_Outro.gridx = 2;
		gbc_tfCidade_Outro.gridy = 33;
		panel_3.add(tfCidadeOutro, gbc_tfCidade_Outro);
		tfCidadeOutro.setColumns(10);
		
		JLabel lblCepOutro = new JLabel("Cep");
		GridBagConstraints gbc_lblCep_Outro = new GridBagConstraints();
		gbc_lblCep_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblCep_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCep_Outro.gridx = 1;
		gbc_lblCep_Outro.gridy = 34;
		panel_3.add(lblCepOutro, gbc_lblCep_Outro);
		
		ftmttfCepOutro = new MaskFormatter("#####-###");
		tfCepOutro = new JFormattedTextField(ftmttfCepOutro);
		ftmttfCepOutro.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfCepOutro.setMinimumSize(new Dimension(6, 30));
		tfCepOutro.setPreferredSize(new Dimension(6, 30));
		tfCepOutro.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfCep_Outro = new GridBagConstraints();
		gbc_tfCep_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfCep_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCep_Outro.gridx = 2;
		gbc_tfCep_Outro.gridy = 34;
		panel_3.add(tfCepOutro, gbc_tfCep_Outro);
		tfCepOutro.setColumns(10);
		
		JLabel lblTelefone_Outro = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone_Outro = new GridBagConstraints();
		gbc_lblTelefone_Outro.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone_Outro.gridx = 3;
		gbc_lblTelefone_Outro.gridy = 34;
		panel_3.add(lblTelefone_Outro, gbc_lblTelefone_Outro);
		
		ftmttfTelefoneOutro = new MaskFormatter("(##)####-####");
		tfTelefoneOutro = new JFormattedTextField(ftmttfTelefoneOutro);
		ftmttfTelefoneOutro.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfTelefoneOutro.setMinimumSize(new Dimension(6, 30));
		tfTelefoneOutro.setPreferredSize(new Dimension(6, 30));
		tfTelefoneOutro.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfTelefone_Outro = new GridBagConstraints();
		gbc_tfTelefone_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfTelefone_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTelefone_Outro.gridx = 4;
		gbc_tfTelefone_Outro.gridy = 34;
		panel_3.add(tfTelefoneOutro, gbc_tfTelefone_Outro);
		tfTelefoneOutro.setColumns(10);
		
		JLabel lblCelular_Outro = new JLabel("Celular");
		GridBagConstraints gbc_lblCelular_Outro = new GridBagConstraints();
		gbc_lblCelular_Outro.anchor = GridBagConstraints.EAST;
		gbc_lblCelular_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCelular_Outro.gridx = 5;
		gbc_lblCelular_Outro.gridy = 34;
		panel_3.add(lblCelular_Outro, gbc_lblCelular_Outro);
		
		ftmttfCelularOutro = new MaskFormatter("(##)###-###-###");
		tfCelularOutro = new JFormattedTextField(ftmttfCelularOutro);
		ftmttfCelularOutro.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfCelularOutro.setMinimumSize(new Dimension(6, 30));
		tfCelularOutro.setPreferredSize(new Dimension(6, 30));
		tfCelularOutro.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfCelular_Outro = new GridBagConstraints();
		gbc_tfCelular_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfCelular_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCelular_Outro.gridx = 6;
		gbc_tfCelular_Outro.gridy = 34;
		panel_3.add(tfCelularOutro, gbc_tfCelular_Outro);
		tfCelularOutro.setColumns(10);
		
		JLabel lblTrabalho_Outro = new JLabel("Trabalho");
		GridBagConstraints gbc_lblTrabalho_Outro = new GridBagConstraints();
		gbc_lblTrabalho_Outro.anchor = GridBagConstraints.EAST;
		gbc_lblTrabalho_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrabalho_Outro.gridx = 7;
		gbc_lblTrabalho_Outro.gridy = 34;
		panel_3.add(lblTrabalho_Outro, gbc_lblTrabalho_Outro);
		
		ftmttfTrabalhoOutro = new MaskFormatter("(##)###-###-###");
		tfTrabalhoOutro = new JFormattedTextField(ftmttfTrabalhoOutro);
		ftmttfTrabalhoOutro.setValidCharacters("1,2,3,4,5,6,7,8,9");
		tfTrabalhoOutro.setMinimumSize(new Dimension(6, 30));
		tfTrabalhoOutro.setPreferredSize(new Dimension(6, 30));
		tfTrabalhoOutro.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfTrabalho_Outro = new GridBagConstraints();
		gbc_tfTrabalho_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfTrabalho_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTrabalho_Outro.gridx = 8;
		gbc_tfTrabalho_Outro.gridy = 34;
		panel_3.add(tfTrabalhoOutro, gbc_tfTrabalho_Outro);
		tfTrabalhoOutro.setColumns(10);
		
		JLabel lblEmail_Outro = new JLabel("Email");
		GridBagConstraints gbc_lblEmail_Outro = new GridBagConstraints();
		gbc_lblEmail_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_Outro.gridx = 1;
		gbc_lblEmail_Outro.gridy = 35;
		panel_3.add(lblEmail_Outro, gbc_lblEmail_Outro);
		
		tfEmailOutro = new JTextField();
		tfEmailOutro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmailOutro.setMinimumSize(new Dimension(6, 30));
		tfEmailOutro.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmail_Outro = new GridBagConstraints();
		gbc_tfEmail_Outro.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmail_Outro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail_Outro.gridx = 2;
		gbc_tfEmail_Outro.gridy = 35;
		gbc_tfEmail_Outro.gridwidth = 3;
		gbc_lblEmail_Outro.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_Outro.insets = new Insets(0, 0, 5, 5);
		tfEmailOutro.setColumns(10);
		panel_3.add(tfEmailOutro, gbc_tfEmail_Outro);
		
		JLabel lblEmail_5 = new JLabel("Email2");
		GridBagConstraints gbc_lblEmail_5 = new GridBagConstraints();
		gbc_lblEmail_5.anchor = GridBagConstraints.EAST;
		gbc_lblEmail_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_5.gridx = 5;
		gbc_lblEmail_5.gridy = 35;
		panel_3.add(lblEmail_5, gbc_lblEmail_5);
		
		tfEmail2OutroResp = new JTextField();
		tfEmail2OutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmail2OutroResp.setMinimumSize(new Dimension(6, 30));
		tfEmail2OutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmail2OutroResp = new GridBagConstraints();
		gbc_tfEmail2OutroResp.gridwidth = 5;
		gbc_tfEmail2OutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmail2OutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail2OutroResp.gridx = 6;
		gbc_tfEmail2OutroResp.gridy = 35;
		panel_3.add(tfEmail2OutroResp, gbc_tfEmail2OutroResp);
		tfEmail2OutroResp.setColumns(10);
		
		JLabel lblDataNasc_2 = new JLabel("Data Nasc.");
		GridBagConstraints gbc_lblDataNasc_2 = new GridBagConstraints();
		gbc_lblDataNasc_2.anchor = GridBagConstraints.WEST;
		gbc_lblDataNasc_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataNasc_2.gridx = 1;
		gbc_lblDataNasc_2.gridy = 36;
		panel_3.add(lblDataNasc_2, gbc_lblDataNasc_2);
		
		ftmttfDataNascimentoOutroResp  = new MaskFormatter("##/##/####");
		tfDataNascimentoOutroResp = new JFormattedTextField(ftmttfDataNascimentoOutroResp);
		ftmttfDataNascimentoOutroResp.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
		tfDataNascimentoOutroResp.setMinimumSize(new Dimension(6, 30));
		tfDataNascimentoOutroResp.setPreferredSize(new Dimension(6, 30));
		tfDataNascimentoOutroResp.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_tfDataNascimentoOutroResp = new GridBagConstraints();
		gbc_tfDataNascimentoOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfDataNascimentoOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDataNascimentoOutroResp.gridx = 2;
		gbc_tfDataNascimentoOutroResp.gridy = 36;
		panel_3.add(tfDataNascimentoOutroResp, gbc_tfDataNascimentoOutroResp);
		tfDataNascimentoOutroResp.setColumns(10);
		
		JLabel lblEmailTrabalho_2 = new JLabel("Email Trabalho");
		GridBagConstraints gbc_lblEmailTrabalho_2 = new GridBagConstraints();
		gbc_lblEmailTrabalho_2.anchor = GridBagConstraints.EAST;
		gbc_lblEmailTrabalho_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailTrabalho_2.gridx = 5;
		gbc_lblEmailTrabalho_2.gridy = 36;
		panel_3.add(lblEmailTrabalho_2, gbc_lblEmailTrabalho_2);
		
		tfEmailTrabalhoOutroResp = new JTextField();
		tfEmailTrabalhoOutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfEmailTrabalhoOutroResp.setMinimumSize(new Dimension(6, 30));
		tfEmailTrabalhoOutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfEmailTrabalhoOutroResp = new GridBagConstraints();
		gbc_tfEmailTrabalhoOutroResp.gridwidth = 5;
		gbc_tfEmailTrabalhoOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfEmailTrabalhoOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmailTrabalhoOutroResp.gridx = 6;
		gbc_tfEmailTrabalhoOutroResp.gridy = 36;
		panel_3.add(tfEmailTrabalhoOutroResp, gbc_tfEmailTrabalhoOutroResp);
		tfEmailTrabalhoOutroResp.setColumns(10);
		
		JLabel lblProfisso_2 = new JLabel("Profissão");
		GridBagConstraints gbc_lblProfisso_2 = new GridBagConstraints();
		gbc_lblProfisso_2.anchor = GridBagConstraints.WEST;
		gbc_lblProfisso_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfisso_2.gridx = 1;
		gbc_lblProfisso_2.gridy = 37;
		panel_3.add(lblProfisso_2, gbc_lblProfisso_2);
		
		tfProfissaoOutroResp = new JTextField();
		tfProfissaoOutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfProfissaoOutroResp.setMinimumSize(new Dimension(6, 30));
		tfProfissaoOutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfProfissaoOutroResp = new GridBagConstraints();
		gbc_tfProfissaoOutroResp.gridwidth = 3;
		gbc_tfProfissaoOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfProfissaoOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfProfissaoOutroResp.gridx = 2;
		gbc_tfProfissaoOutroResp.gridy = 37;
		panel_3.add(tfProfissaoOutroResp, gbc_tfProfissaoOutroResp);
		tfProfissaoOutroResp.setColumns(10);
		
		JLabel lblLocalTrabalho_2 = new JLabel("Local Trabalho");
		GridBagConstraints gbc_lblLocalTrabalho_2 = new GridBagConstraints();
		gbc_lblLocalTrabalho_2.anchor = GridBagConstraints.EAST;
		gbc_lblLocalTrabalho_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalTrabalho_2.gridx = 5;
		gbc_lblLocalTrabalho_2.gridy = 37;
		panel_3.add(lblLocalTrabalho_2, gbc_lblLocalTrabalho_2);
		
		tfLocalTrabalhoOutroResp = new JTextField();
		tfLocalTrabalhoOutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfLocalTrabalhoOutroResp.setMinimumSize(new Dimension(6, 30));
		tfLocalTrabalhoOutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfLocalTrabalhoOutroResp = new GridBagConstraints();
		gbc_tfLocalTrabalhoOutroResp.gridwidth = 5;
		gbc_tfLocalTrabalhoOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfLocalTrabalhoOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfLocalTrabalhoOutroResp.gridx = 6;
		gbc_tfLocalTrabalhoOutroResp.gridy = 37;
		panel_3.add(tfLocalTrabalhoOutroResp, gbc_tfLocalTrabalhoOutroResp);
		tfLocalTrabalhoOutroResp.setColumns(10);
		
		JLabel lblNacinalidade = new JLabel("Nacinalidade");
		GridBagConstraints gbc_lblNacinalidade = new GridBagConstraints();
		gbc_lblNacinalidade.anchor = GridBagConstraints.WEST;
		gbc_lblNacinalidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblNacinalidade.gridx = 1;
		gbc_lblNacinalidade.gridy = 38;
		panel_3.add(lblNacinalidade, gbc_lblNacinalidade);
		
		tfNacionalidadeOutroResp = new JTextField();
		tfNacionalidadeOutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfNacionalidadeOutroResp.setMinimumSize(new Dimension(6, 30));
		tfNacionalidadeOutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_tfNacionalidadeOutroResp = new GridBagConstraints();
		gbc_tfNacionalidadeOutroResp.gridwidth = 3;
		gbc_tfNacionalidadeOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_tfNacionalidadeOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNacionalidadeOutroResp.gridx = 2;
		gbc_tfNacionalidadeOutroResp.gridy = 38;
		panel_3.add(tfNacionalidadeOutroResp, gbc_tfNacionalidadeOutroResp);
		tfNacionalidadeOutroResp.setColumns(10);
		
		JLabel lblNaturalidade_2 = new JLabel("Naturalidade");
		GridBagConstraints gbc_lblNaturalidade_2 = new GridBagConstraints();
		gbc_lblNaturalidade_2.anchor = GridBagConstraints.WEST;
		gbc_lblNaturalidade_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNaturalidade_2.gridx = 5;
		gbc_lblNaturalidade_2.gridy = 38;
		panel_3.add(lblNaturalidade_2, gbc_lblNaturalidade_2);
		
		tfNaturalidadeOutroResp = new JTextField();
		tfNaturalidadeOutroResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfNaturalidadeOutroResp.setMinimumSize(new Dimension(6, 30));
		tfNaturalidadeOutroResp.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_NaturalidadeOutroResp = new GridBagConstraints();
		gbc_NaturalidadeOutroResp.gridwidth = 5;
		gbc_NaturalidadeOutroResp.insets = new Insets(0, 0, 5, 5);
		gbc_NaturalidadeOutroResp.fill = GridBagConstraints.HORIZONTAL;
		gbc_NaturalidadeOutroResp.gridx = 6;
		gbc_NaturalidadeOutroResp.gridy = 38;
		panel_3.add(tfNaturalidadeOutroResp, gbc_NaturalidadeOutroResp);
		tfNaturalidadeOutroResp.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 40;
		panel_3.add(verticalStrut, gbc_verticalStrut);
		
	
		JPanel infoExtras = new JPanel();
		infoExtras.setFont(new Font("Dialog", Font.PLAIN, 18));
		tabbedPane.addTab("Info.Extras sobre o aluno", null, infoExtras, null);
		tabbedPane.setBackgroundAt(2, new Color(240, 248, 255));
		infoExtras.setLayout(null);
		
		txRelAfetivo = new JTextArea();
		txRelAfetivo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), null, null, null));
		txRelAfetivo.setBounds(92, 56, 904, 201);
		infoExtras.add(txRelAfetivo);
		
		JLabel lblRelacionamentoAfetivo = new JLabel("Relacionamento Afetivo");
		lblRelacionamentoAfetivo.setBounds(92, 27, 192, 16);
		infoExtras.add(lblRelacionamentoAfetivo);
		
		txInfoAdicional = new JTextArea();
		txInfoAdicional.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 255), null, null, null));
		txInfoAdicional.setBounds(92, 336, 904, 201);
		infoExtras.add(txInfoAdicional);
		
		JLabel lblInformaoAdicional = new JLabel("Informação Adicional");
		lblInformaoAdicional.setBounds(92, 307, 192, 16);
		infoExtras.add(lblInformaoAdicional);
		
		JPanel painelFichaMedica = new JPanel();
		painelFichaMedica.setFont(new Font("Dialog", Font.PLAIN, 18));
		painelFichaMedica.setName("painelfichamedica");
		tabbedPane.addTab("Ficha Médica", null, painelFichaMedica, null);
		
		JPanel painelTabela = new JPanel();
		painelTabela.setFont(new Font("Dialog", Font.PLAIN, 18));
		painelTabela.setName("paineltabela");
		tabbedPane.addTab("Resultado Pesquisa", null, painelTabela, null);
		painelTabela.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		painelTabela.add(scrollPane, BorderLayout.CENTER);
		
		criaJTable();
		scrollPane.setViewportView(table);
		
		a.setStatusTelacadastro("standby");
		mudaBotao();	
				
	}
	


	public JTextField getTfRgPai() {
	return tfRgPai;
}



public void setTfRgPai(JTextField tfRgPai) {
	this.tfRgPai = tfRgPai;
}



public MaskFormatter getFtmttfRgPai() {
	return ftmttfRgPai;
}



public void setFtmttfRgPai(MaskFormatter ftmttfRgPai) {
	this.ftmttfRgPai = ftmttfRgPai;
}



	public JTextField getTfestadoAluno() {
	return tfestadoAluno;
}



public void setTfestadoAluno(JTextField tfestadoAluno) {
	this.tfestadoAluno = tfestadoAluno;
}



	private void criaJTable() {
		table = new JTable(modelo);
		getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getTable().setFont(new Font("Tahoma", Font.PLAIN, 15));
		getTable().setRowHeight(30);
		getTable().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		getTable().setMinimumSize(new Dimension(550, 0));
		getTable().setPreferredScrollableViewportSize(new Dimension(550, 400));
		getTable().setDefaultEditor(Object.class, null); // elimina editor de
															// celulas da tabela

		modelo.addColumn("Id");
		modelo.addColumn("Matrícula");
		modelo.addColumn("Nome");
		modelo.addColumn("Apelido");
		modelo.addColumn("Idade");
		modelo.addColumn("Tempo");
		modelo.addColumn("Sexo");
		modelo.addColumn("Pai");
		modelo.addColumn("Mae");
		modelo.addColumn("Outro Responsável");
		modelo.addColumn("Data Nascimento");
		modelo.addColumn("Nacionalidade");
		modelo.addColumn("Naturalidade");
		modelo.addColumn("Endereço");
		modelo.addColumn("Bairro");
		modelo.addColumn("Cidade");
		modelo.addColumn("CEP");
		modelo.addColumn("Relacionamento Afetivo");
		modelo.addColumn("Informação Adicional");
		modelo.addColumn("Data Cadastro");
		modelo.addColumn("Data Atualização");

		modelo.addColumn("Telefone");
		modelo.addColumn("Celular");

		getTable().getColumnModel().getColumn(0).setPreferredWidth(50);
		getTable().getColumnModel().getColumn(1).setPreferredWidth(80);
		getTable().getColumnModel().getColumn(2).setPreferredWidth(300);
		getTable().getColumnModel().getColumn(3).setPreferredWidth(70);
		getTable().getColumnModel().getColumn(4).setPreferredWidth(50);
		getTable().getColumnModel().getColumn(5).setPreferredWidth(55);
		getTable().getColumnModel().getColumn(6).setPreferredWidth(85);

		getTable().getColumnModel().getColumn(7).setPreferredWidth(300);
		getTable().getColumnModel().getColumn(8).setPreferredWidth(300);
		getTable().getColumnModel().getColumn(9).setPreferredWidth(300);
		getTable().getColumnModel().getColumn(10).setPreferredWidth(100);
		getTable().getColumnModel().getColumn(11).setPreferredWidth(110);

		getTable().getColumnModel().getColumn(12).setPreferredWidth(110);
		getTable().getColumnModel().getColumn(13).setPreferredWidth(180);
		getTable().getColumnModel().getColumn(14).setPreferredWidth(160);
		getTable().getColumnModel().getColumn(15).setPreferredWidth(150);
		getTable().getColumnModel().getColumn(16).setPreferredWidth(100);

		getTable().getColumnModel().getColumn(17).setPreferredWidth(120);
		getTable().getColumnModel().getColumn(18).setPreferredWidth(120);
		getTable().getColumnModel().getColumn(19).setPreferredWidth(120);
		getTable().getColumnModel().getColumn(20).setPreferredWidth(120);
		getTable().getColumnModel().getColumn(21).setPreferredWidth(120);

		getTable().getColumnModel().getColumn(22).setPreferredWidth(120);

		pesquisar(modelo);
	}


	public static void pesquisar(DefaultTableModel modelo) {
		modelo.setNumRows(0);
		Conexao conn = new Conexao();
		Aluno a = new Aluno();
	//	for (Aluno a : conn.getAlunoById(Aluno.getId())) {
		a = conn.getAlunoById(Tela_de_Consulta.getVar());
		
		modelo.addRow(new Object[] { 
				Aluno.getId(),
				Aluno.getMatricula(),
				a.getNome(),
				a.getApelido(),
				a.getIdade(),
				a.getCbIdade(),
				a.getSexo(),
				a.getPai(),
				a.getMae(),
				a.getOutResp(),
				a.getDataNasc(),
				a.getNacionalidade(),
			    a.getNaturalidade(),
				a.getEndereco(),
				a.getBairro(),
				a.getCidade(),
				a.getCep(),
				a.getRelAfetivo(),
		    	a.getInfoAdicional(),
		    	a.getDataCadastro(),
		    	a.getDataAtualizacao(),
				a.getTelefone(),
				a.getCelular(),
				a.getFoto()});
		
	}
	
	
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				isCellEditable(table.getSelectedRow(), table.getSelectedColumn());
				if (e.getClickCount() == 2) {
				/*	try {
						Aluno a = new Aluno();
						a.setStatusTelacadastro("Editar");
						int linhaSelecionada = -1;
						linhaSelecionada = getTable().getSelectedRow();
						if (linhaSelecionada >= 0) {
							int idAluno = (int) getTable().getValueAt(linhaSelecionada, 0);
					//		AlunoCadastrarJframe frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
					//		frame.setVisible(true);
					//		frame.getTfdataAtualizacao().setText(getDateTime());
						} else {
							JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");

						}
					} catch (Exception o) {
						o.printStackTrace();
					} */
				}

			}
		});
		table.setName("tabelaAlunos");
	}

	public boolean isCellEditable(int Row, int mColIndex) {
		if (table.isCellEditable(table.getSelectedRow(), table.getSelectedColumn()) == true) {
			return false;
		}
		return false;

	}
	
	// Listener da tabela começa aqui
	
	  public class doubleClickMouseAdpater implements MouseListener {
	  
		  @Override public void mouseClicked(MouseEvent e) {
			  if (e.getClickCount()== 2) { 
			/*	  try { Aluno a = new Aluno(); a.setStatusTelacadastro("Editar");
				  int linhaSelecionada = -1; linhaSelecionada = getTable().getSelectedRow();
				  if (linhaSelecionada >= 0) { int idAluno =(int) getTable().getValueAt(linhaSelecionada, 0);
				//  AlunoCadastrarJframe frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
				//  frame.setVisible(true);
				//  frame.getTfdataAtualizacao().setText(getDateTime()); 
				  } else {
					  JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");} 
				  } catch (Exception o) { o.printStackTrace(); } 
*/
			  }

		  }
	  
	  @Override public void mouseEntered(MouseEvent e) { 
		  }
	  
	  @Override public void mouseExited(MouseEvent e) { 
		  }
	  
	  @Override public void mousePressed(MouseEvent e) { 
		  }
	  
	  @Override public void mouseReleased(MouseEvent e) { 
	  	  }
	 
	  }
	  
//----------------------------------------------------------------------------------------------//
		private void refresh(){
			OutroResponsavel o = new OutroResponsavel();
			Mae m = new Mae();
			Pai p = new Pai(); 
			Aluno a = new Aluno();
			Conexao conexao = new Conexao();
			a = conexao.getAlunoById(Tela_de_Consulta.getVar());
			
			tfmatricula.setText(String.valueOf(Aluno.getMatricula()));
			tfnome.setText(a.getNome());
			tfapelido.setText(a.getApelido());
			tfidade.setText(a.getIdade());
			cbIdade.setSelectedItem(a.getCbIdade());
			cBoxSexo.setSelectedItem(a.getSexo());
			tfdatanascimento.setText(a.getDataNasc());
			tfnacionalidade.setText(a.getNacionalidade());
			tfnaturalidade.setText(a.getNaturalidade());
			tfendereco.setText(a.getEndereco());
			tfbairro.setText(a.getBairro());
			tfcidade.setText(a.getCidade());
			tfestadoAluno.setText(a.getEstado());
			tfcep.setText(a.getCep());
			txRelAfetivo.setText(a.getRelAfetivo());
			txInfoAdicional.setText(a.getInfoAdicional());
			tfdataCadastro.setText(a.getDataCadastro());
			tfdataAtualizacao.setText(a.getDataAtualizacao());
			tftelefoneAluno.setText(a.getTelefone());
			tfcelular.setText(a.getCelular());
			tfTrabalhoAluno.setText(a.getFonetrabalho());
			tfEmailAluno.setText(a.getEmail());
			tfEmail2Aluno.setText(a.getEmail2());
			tfEmailTrabalhoAluno.setText(a.getEmailtrabalhoAluno());
			
			
			
			p = conexao.getPaiById(Tela_de_Consulta.getVar());
			tfCpfpai.setText(p.getCpfPai());
			tfRgPai.setText(p.getRgPai());
			tfNomePai.setText(p.getNomePai());
			tfDataNascimentoPai.setText(p.getDataNascimentoPai());
			tfEnderecoPai.setText(p.getEnderecoPai());
			tfBairroPai.setText(p.getBairroPai());
			tfCidadePai.setText(p.getCidadePai());
			tfCepPai.setText(p.getCepPai());
			tfTelefonePai.setText(p.getTelefonePai());
			tfCelularPai.setText(p.getCelularPai());
			tfFoneTrabalhoPai.setText(p.getFoneTabalhoPai());
			tfEmailPai.setText(p.getEmailPai());
			tfEmail2Pai.setText(p.getEmail2Pai());
			tfEmailTrabalhoPai.setText(p.getEmailTrabalhoPai());
			tfDataNascimentoPai.setText(p.getDataNascimentoPai());
			tfProfissaoPai.setText(p.getProfissaoPai());
			tfLocalTrabalhoPai.setText(p.getLocaltrabalhoPai());
			tfNacionalidadePai.setText(p.getNacionalidadePai());
			tfNaturalidadePai.setText(p.getNaturalidadePai());
			
			tfPai.setText(p.getNomePai()); //jtextField in Aluno
			
			m = conexao.getMaeById(Tela_de_Consulta.getVar());
			tfCpfMae.setText(m.getCpfMae());
			tfRgMae.setText(m.getRgMae());
			tfNomeMae.setText(m.getNomeMae());
			tfEnderecoMae.setText(m.getEnderecoMae());
			tfBairroMae.setText(m.getBairroMae());
			tfCidadeMae.setText(m.getCidadeMae());
			tfCepMae.setText(m.getCepMae());
			tfDataNascimentoMae.setText(m.getDataNascimentoMae());
			tfProfissaoMae.setText(m.getProfissaoMae());
			tfLocalTrabalhoMae.setText(m.getLocalTrabalhoMae());
			tfEmailMae.setText(m.getEmailMae());
			tfEmail2Mae.setText(m.getEmail2Mae());
			tfEmailtrabalhoMae.setText(m.getEmailTrabalhoMae());
			tfTelefoneMae.setText(m.getTelefoneMae());
			tfCelularMae.setText(m.getCelularMae());
			tfTrabalhoMae.setText(m.getfoneTrabalhoMae());
			tfNacionalidadeMae.setText(m.getNacionalidadeMae());
			tfNaturalidadeMae.setText(m.getNaturalidadeMae());
			
			tfMae.setText(m.getNomeMae()); //jtextField in Mae
			
			o = conexao.getOutroResponsavelByID(Tela_de_Consulta.getVar());
			tfCpfOutro.setText(o.getCpfOutroResp());
			tfRgOutroResp.setText(o.getRgOutroResp());
			tfNomeOutro.setText(o.getNomeOutroResp());
			tfEnderecoOutro.setText(o.getEnderecoOutroResp());
			tfBairroOutro.setText(o.getBairroOutroResp());
			tfCidadeOutro.setText(o.getCidadeOutroResp());
			tfCepOutro.setText(o.getCepOutroResp());
			tfDataNascimentoOutroResp.setText(o.getDataNascimentoOutroResp());
			tfProfissaoOutroResp.setText(o.getProfissaoOutroresp());
			tfLocalTrabalhoOutroResp.setText(o.getLocalTrabalhoOutroResp());
			tfEmailOutro.setText(o.getEmailOutroResp());
			tfEmail2OutroResp.setText(o.getEmail2OutroResp());
			tfEmailTrabalhoOutroResp.setText(o.getEmailTrabalhoOutroResp());
			tfTelefoneOutro.setText(o.getTelefoneOutroResp());
			tfCelularOutro.setText(o.getCelularOutroResp());
			tfTrabalhoOutro.setText(o.getFoneTrabalhoOutroResp());
			tfNacionalidadeOutroResp.setText(o.getNacionalidadeOutroResp());
			tfNaturalidadeOutroResp.setText(o.getNaturalidadeOutroResp());
		
			mudaBotao();
		}
		
	  
	  
		@SuppressWarnings("unused")
		private String getDateTime() {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			return dateFormat.format(date);
		}
		
		public void limparTodosCampos(Container container) {
			Component components[] = container.getComponents();
			for (Component component : components) {
				if (component instanceof JFormattedTextField) {
					JFormattedTextField field = (JFormattedTextField) component;
					field.setValue(null);
				} else if (component instanceof JTextField) {
					JTextField field = (JTextField) component;
					field.setText("");
				} else if (component instanceof JTextArea) {
					JTextArea field = (JTextArea) component;
					field.setText("");
				} else if (component instanceof Container) {
					limparTodosCampos((Container) component);
				}
			}
		}

		public void carregaCad(){
		
		Conexao conn = new Conexao();	
		Aluno a = new Aluno();
		OutroResponsavel o = new OutroResponsavel();
		Mae m = new Mae();
		Pai p = new Pai();
		a = conn.getAlunoById(Tela_de_Consulta.getVar());
		
		tfmatricula.setText(String.valueOf(Aluno.getMatricula()));
		tfnome.setText(a.getNome());
		tfapelido.setText(a.getApelido());
		tfidade.setText(a.getIdade());
		cbIdade.setSelectedItem(a.getCbIdade());
		cBoxSexo.setSelectedItem(a.getSexo());
		tfdatanascimento.setText(a.getDataNasc());
		tfnacionalidade.setText(a.getNacionalidade());
		tfnaturalidade.setText(a.getNaturalidade());
		tfendereco.setText(a.getEndereco());
		tfbairro.setText(a.getBairro());
		tfcidade.setText(a.getCidade());
		tfestadoAluno.setText(a.getEstado());
		tfcep.setText(a.getCep());
		txRelAfetivo.setText(a.getRelAfetivo());
		txInfoAdicional.setText(a.getInfoAdicional());
		tfdataCadastro.setText(a.getDataCadastro());
		tfdataAtualizacao.setText(a.getDataAtualizacao());
		tftelefoneAluno.setText(a.getTelefone());
		tfcelular.setText(a.getCelular());
		tftelefoneAluno.setText(a.getFonetrabalho());
		tfEmailAluno.setText(a.getEmail());
		tfEmail2Aluno.setText(a.getEmail2());
		tfEmailTrabalhoAluno.setText(a.getEmailtrabalhoAluno());
							
		conn = new Conexao();
		p = conn.getPaiById(Tela_de_Consulta.getVar());
		tfCpfpai.setText(p.getCpfPai());
		tfRgPai.setText(p.getRgPai());
		tfNomePai.setText(p.getNomePai());
		tfDataNascimentoPai.setText(p.getDataNascimentoPai());
		tfEnderecoPai.setText(p.getEnderecoPai());
		tfBairroPai.setText(p.getBairroPai());
		tfCidadePai.setText(p.getCidadePai());
		
		tfCepPai.setText(p.getCepPai());
		tfTelefonePai.setText(p.getTelefonePai());
		tfCelularPai.setText(p.getCelularPai());
		tfFoneTrabalhoPai.setText(p.getFoneTabalhoPai());
		tfEmailPai.setText(p.getEmailPai());
		tfEmail2Pai.setText(p.getEmail2Pai());
		tfEmailTrabalhoPai.setText(p.getEmailTrabalhoPai());
		tfDataNascimentoPai.setText(p.getDataNascimentoPai());
		tfProfissaoPai.setText(p.getProfissaoPai());
		tfLocalTrabalhoPai.setText(p.getLocaltrabalhoPai());
		tfNacionalidadePai.setText(p.getNacionalidadePai());
		tfNaturalidadePai.setText(p.getNaturalidadePai());
		
		tfPai.setText(p.getNomePai()); //jtextField in Aluno
		
		conn = new Conexao();
		m = conn.getMaeById(Tela_de_Consulta.getVar());
		tfCpfMae.setText(m.getCpfMae());
		tfRgMae.setText(m.getRgMae());
		tfNomeMae.setText(m.getNomeMae());
		tfEnderecoMae.setText(m.getEnderecoMae());
		tfBairroMae.setText(m.getBairroMae());
		tfCidadeMae.setText(m.getCidadeMae());
		
		tfCepMae.setText(m.getCepMae());
		tfDataNascimentoMae.setText(m.getDataNascimentoMae());
		tfProfissaoMae.setText(m.getProfissaoMae());
		tfLocalTrabalhoMae.setText(m.getLocalTrabalhoMae());
		tfEmailMae.setText(m.getEmailMae());
		tfEmail2Mae.setText(m.getEmail2Mae());
		tfEmailtrabalhoMae.setText(m.getEmailTrabalhoMae());
		tfTelefoneMae.setText(m.getTelefoneMae());
		tfCelularMae.setText(m.getCelularMae());
		tfTrabalhoMae.setText(m.getfoneTrabalhoMae());
		tfNacionalidadeMae.setText(m.getNacionalidadeMae());
		tfNaturalidadeMae.setText(m.getNaturalidadeMae());
		
		tfMae.setText(m.getNomeMae()); //jtextField in Mae
		
		conn = new Conexao();
		o = conn.getOutroResponsavelByID(Tela_de_Consulta.getVar());
		tfCpfOutro.setText(o.getCpfOutroResp());
		tfRgOutroResp.setText(o.getRgOutroResp());
		tfNomeOutro.setText(o.getNomeOutroResp());
		tfEnderecoOutro.setText(o.getEnderecoOutroResp());
		tfBairroOutro.setText(o.getBairroOutroResp());
		tfCidadeOutro.setText(o.getCidadeOutroResp());
		
		tfCepOutro.setText(o.getCepOutroResp());
		tfDataNascimentoOutroResp.setText(o.getDataNascimentoOutroResp());
		tfProfissaoOutroResp.setText(o.getProfissaoOutroresp());
		tfLocalTrabalhoOutroResp.setText(o.getLocalTrabalhoOutroResp());
		tfEmailOutro.setText(o.getEmailOutroResp());
		tfEmail2OutroResp.setText(o.getEmail2OutroResp());
		tfEmailTrabalhoOutroResp.setText(o.getEmailTrabalhoOutroResp());
		tfTelefoneOutro.setText(o.getTelefoneOutroResp());
		tfCelularOutro.setText(o.getCelularOutroResp());
		tfTrabalhoOutro.setText(o.getFoneTrabalhoOutroResp());
		tfNacionalidadeOutroResp.setText(o.getNacionalidadeOutroResp());
		tfNaturalidadeOutroResp.setText(o.getNaturalidadeOutroResp());
		}
		
		private void mudaBotao() {
			if (Aluno.getStatusTelacadastro() == "Cadastrar") {
				btnCadastrar.setEnabled(true);
				btnEditar.setEnabled(false);
				btnApagar.setEnabled(false);
				btnCancelar.setEnabled(true);
				btnSair.setEnabled(true);
				btnNovo.setEnabled(false);
			}
			if (Aluno.getStatusTelacadastro() == "Editar") {
				btnCadastrar.setEnabled(false);
				btnEditar.setEnabled(true);
				btnApagar.setEnabled(true);
				btnCancelar.setEnabled(true);
				btnNovo.setEnabled(true);
			}
			if (Aluno.getStatusTelacadastro() == "Apagar") {
				btnCadastrar.setEnabled(false);
				btnEditar.setEnabled(false);
				btnApagar.setEnabled(true);
				btnCancelar.setEnabled(false);
			
			}
			if(Aluno.getStatusTelacadastro()=="standby"){
				btnCadastrar.setEnabled(false);
				btnEditar.setEnabled(false);
				btnApagar.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnNovo.setEnabled(true);
			}
		}
		
		public String getFrameState() {
			return frameState;
		}


		public void setFrameState(String frameState) {
			this.frameState = frameState;
		}


		public JTextField getTfmatricula() {
			return tfmatricula;
		}


		public void setTfmatricula(JTextField tfmatricula) {
			this.tfmatricula = tfmatricula;
		}


		public JTextField getTfnome() {
			return tfnome;
		}


		public void setTfnome(JTextField tfnome) {
			this.tfnome = tfnome;
		}

		
		public JTextField getTfcep() {
		return tfcep;
	}


	public void setTfcep(JTextField tfcep) {
		this.tfcep = tfcep;
	}


	public JTextField getTfdatanascimento() {
		return tfdatanascimento;
	}


	public void setTfdatanascimento(JTextField tfdatanascimento) {
		this.tfdatanascimento = tfdatanascimento;
	}


	public JTextField getTfendereco() {
		return tfendereco;
	}


	public void setTfendereco(JTextField tfendereco) {
		this.tfendereco = tfendereco;
	}


	public JTextField getTfbairro() {
		return tfbairro;
	}


	public void setTfbairro(JTextField tfbairro) {
		this.tfbairro = tfbairro;
	}


	public JTextField getTfcidade() {
		return tfcidade;
	}


	public void setTfcidade(JTextField tfcidade) {
		this.tfcidade = tfcidade;
	}


	public JTextField getTfidade() {
		return tfidade;
	}


	public void setTfidade(JTextField tfidade) {
		this.tfidade = tfidade;
	}


	public JTextField getTfdataCadastro() {
		return tfdataCadastro;
	}


	public void setTfdataCadastro(JTextField tfdataCadastro) {
		this.tfdataCadastro = tfdataCadastro;
	}


	public JTextField getTfapelido() {
		return tfapelido;
	}


	public void setTfapelido(JTextField tfapelido) {
		this.tfapelido = tfapelido;
	}


	public JTextField getTfdataAtualizacao() {
		return tfdataAtualizacao;
	}


	public void setTfdataAtualizacao(JTextField tfdataAtualizacao) {
		this.tfdataAtualizacao = tfdataAtualizacao;
	}


	public JTextField getTfnacionalidade() {
		return tfnacionalidade;
	}


	public void setTfnacionalidade(JTextField tfnacionalidade) {
		this.tfnacionalidade = tfnacionalidade;
	}


	public JTextField getTfnaturalidade() {
		return tfnaturalidade;
	}


	public void setTfnaturalidade(JTextField tfnaturalidade) {
		this.tfnaturalidade = tfnaturalidade;
	}


	public JTextField getTfpai() {
		return tfPai;
	}


	public void setTfpai(JTextField tfpai) {
		this.tfPai = tfpai;
	}


	public JTextField getTfmae() {
		return tfMae;
	}


	public void setTfmae(JTextField tfmae) {
		this.tfMae = tfmae;
	}


	public JTextArea getTxRelAfetivo() {
		return txRelAfetivo;
	}


	public void setTxRelAfetivo(JTextArea txRelAfetivo) {
		this.txRelAfetivo = txRelAfetivo;
	}


	public JTextArea getTxInfoAdicional() {
		return txInfoAdicional;
	}


	public void setTxInfoAdicional(JTextArea txInfoAdicional) {
		this.txInfoAdicional = txInfoAdicional;
	}


	public JTextField getTfcelular() {
		return tfcelular;
	}


	public void setTfcelular(JTextField tfcelular) {
		this.tfcelular = tfcelular;
	}


	public JTextField getTfEmailAluno() {
		return tfEmailAluno;
	}


	public void setTfEmailAluno(JTextField tfEmailAluno) {
		this.tfEmailAluno = tfEmailAluno;
	}


	public JTextField getTfEmail2Aluno() {
		return tfEmail2Aluno;
	}


	public void setTfEmail2Aluno(JTextField tfEmail2Aluno) {
		this.tfEmail2Aluno = tfEmail2Aluno;
	}


	public JTextField getTfTrabalhoAluno() {
		return tfTrabalhoAluno;
	}


	public void setTfTrabalhoAluno(JTextField tfTrabalhoAluno) {
		this.tfTrabalhoAluno = tfTrabalhoAluno;
	}


	public JTextField getTfEmailTrabalhoAluno() {
		return tfEmailTrabalhoAluno;
	}


	public void setTfEmailTrabalhoAluno(JTextField tfEmailTrabalhoAluno) {
		this.tfEmailTrabalhoAluno = tfEmailTrabalhoAluno;
	}


	public JTextField getTfNomePai() {
		return tfNomePai;
	}


	public void setTfNomePai(JTextField tfNomePai) {
		this.tfNomePai = tfNomePai;
	}


	public JTextField getTfEnderecoPai() {
		return tfEnderecoPai;
	}


	public void setTfEnderecoPai(JTextField tfEnderecoPai) {
		this.tfEnderecoPai = tfEnderecoPai;
	}


	public JTextField getTfBairroPai() {
		return tfBairroPai;
	}


	public void setTfBairroPai(JTextField tfBairroPai) {
		this.tfBairroPai = tfBairroPai;
	}


	public JTextField getTfCidadePai() {
		return tfCidadePai;
	}


	public void setTfCidadePai(JTextField tfCidadePai) {
		this.tfCidadePai = tfCidadePai;
	}


	public JTextField getTfCepPai() {
		return tfCepPai;
	}


	public void setTfCepPai(JTextField tfCepPai) {
		this.tfCepPai = tfCepPai;
	}


	public JTextField getTfTelefonePai() {
		return tfTelefonePai;
	}


	public void setTfTelefonePai(JTextField tfTelefonePai) {
		this.tfTelefonePai = tfTelefonePai;
	}


	public JTextField getTfCelularPai() {
		return tfCelularPai;
	}


	public void setTfCelularPai(JTextField tfCelularPai) {
		this.tfCelularPai = tfCelularPai;
	}


	public JTextField getTfTrabalhoPai() {
		return tfFoneTrabalhoPai;
	}


	public void setTfTrabalhoPai(JTextField tfTrabalhoPai) {
		this.tfFoneTrabalhoPai = tfTrabalhoPai;
	}


	public JTextField getTfEmailPai() {
		return tfEmailPai;
	}


	public void setTfEmailPai(JTextField tfEmailPai) {
		this.tfEmailPai = tfEmailPai;
	}


	public JTextField getTfNomeMae() {
		return tfNomeMae;
	}


	public void setTfNomeMae(JTextField tfNomeMae) {
		this.tfNomeMae = tfNomeMae;
	}


	public JTextField getTfEnderecoMae() {
		return tfEnderecoMae;
	}


	public void setTfEnderecoMae(JTextField tfEnderecoMae) {
		this.tfEnderecoMae = tfEnderecoMae;
	}


	public JTextField getTfBairroMae() {
		return tfBairroMae;
	}


	public void setTfBairroMae(JTextField tfBairroMae) {
		this.tfBairroMae = tfBairroMae;
	}


	public JTextField getTfCidadeMae() {
		return tfCidadeMae;
	}


	public void setTfCidadeMae(JTextField tfCidadeMae) {
		this.tfCidadeMae = tfCidadeMae;
	}


	public JTextField getTfCepMae() {
		return tfCepMae;
	}


	public void setTfCepMae(JTextField tfCepMae) {
		this.tfCepMae = tfCepMae;
	}


	public JTextField getTfTelefoneMae() {
		return tfTelefoneMae;
	}


	public void setTfTelefoneMae(JTextField tfTelefoneMae) {
		this.tfTelefoneMae = tfTelefoneMae;
	}


	public JTextField getTfTrabalhoMae() {
		return tfTrabalhoMae;
	}


	public void setTfTrabalhoMae(JTextField tfTrabalhoMae) {
		this.tfTrabalhoMae = tfTrabalhoMae;
	}


	public JTextField getTfEmailMae() {
		return tfEmailMae;
	}


	public void setTfEmailMae(JTextField tfEmailMae) {
		this.tfEmailMae = tfEmailMae;
	}


	public JTextField getTfCelularMae() {
		return tfCelularMae;
	}


	public void setTfCelularMae(JTextField tfCelularMae) {
		this.tfCelularMae = tfCelularMae;
	}


	public JTextField getTfCidadeOutro() {
		return tfCidadeOutro;
	}


	public void setTfCidadeOutro(JTextField tfCidadeOutro) {
		this.tfCidadeOutro = tfCidadeOutro;
	}


	public JTextField getTfNomeOutro() {
		return tfNomeOutro;
	}


	public void setTfNomeOutro(JTextField tfNomeOutro) {
		this.tfNomeOutro = tfNomeOutro;
	}


	public JTextField getTfEnderecoOutro() {
		return tfEnderecoOutro;
	}


	public void setTfEnderecoOutro(JTextField tfEnderecoOutro) {
		this.tfEnderecoOutro = tfEnderecoOutro;
	}


	public JTextField getTfBairroOutro() {
		return tfBairroOutro;
	}


	public void setTfBairroOutro(JTextField tfBairroOutro) {
		this.tfBairroOutro = tfBairroOutro;
	}


	public JTextField getTfCepOutro() {
		return tfCepOutro;
	}


	public void setTfCepOutro(JTextField tfCepOutro) {
		this.tfCepOutro = tfCepOutro;
	}


	public JTextField getTfTelefoneOutro() {
		return tfTelefoneOutro;
	}


	public void setTfTelefoneOutro(JTextField tfTelefoneOutro) {
		this.tfTelefoneOutro = tfTelefoneOutro;
	}


	public JTextField getTfCelularOutro() {
		return tfCelularOutro;
	}


	public void setTfCelularOutro(JTextField tfCelularOutro) {
		this.tfCelularOutro = tfCelularOutro;
	}


	public JTextField getTfTrabalhoOutro() {
		return tfTrabalhoOutro;
	}


	public void setTfTrabalhoOutro(JTextField tfTrabalhoOutro) {
		this.tfTrabalhoOutro = tfTrabalhoOutro;
	}


	public JTextField getTfEmailOutro() {
		return tfEmailOutro;
	}


	public void setTfEmailOutro(JTextField tfEmailOutro) {
		this.tfEmailOutro = tfEmailOutro;
	}


	public JTextField getTftelefone() {
		return tftelefoneAluno;
	}


	public void setTftelefone(JTextField tftelefoneAluno) {
		this.tftelefoneAluno = tftelefoneAluno;
	}


	public JTextField getTfCpfMae() {
		return tfCpfMae;
	}


	public void setTfCpfMae(JTextField tfCpfMae) {
		this.tfCpfMae = tfCpfMae;
	}


	public JTextField getTfCpfpai() {
		return tfCpfpai;
	}


	public void setTfCpfpai(JTextField tfCpfpai) {
		this.tfCpfpai = tfCpfpai;
	}



	public JComboBox getCbIdade() {
		return cbIdade;
	}



	public void setCbIdade(JComboBox cbIdade) {
		this.cbIdade = cbIdade;
	}



	public JComboBox getcBoxSexo() {
		return cBoxSexo;
	}



	public void setcBoxSexo(JComboBox cBoxSexo) {
		this.cBoxSexo = cBoxSexo;
	}



	public JTextComponent getTfDataNascimentoPai() {
		return tfDataNascimentoPai;
	}



	public JTextField getTfFoneTrabalhoPai() {
		return tfFoneTrabalhoPai;
	}



	public void setTfFoneTrabalhoPai(JTextField tfFoneTrabalhoPai) {
		this.tfFoneTrabalhoPai = tfFoneTrabalhoPai;
	}



	public JTextField getTfCpfOutro() {
		return tfCpfOutro;
	}



	public void setTfCpfOutro(JTextField tfCpfOutro) {
		this.tfCpfOutro = tfCpfOutro;
	}



	public JTextField getTfProfissaoPai() {
		return tfProfissaoPai;
	}



	public void setTfProfissaoPai(JTextField tfProfissaoPai) {
		this.tfProfissaoPai = tfProfissaoPai;
	}



	public JTextField getTfLocalTrabalhoPai() {
		return tfLocalTrabalhoPai;
	}



	public void setTfLocalTrabalhoPai(JTextField tfLocalTrabalhoPai) {
		this.tfLocalTrabalhoPai = tfLocalTrabalhoPai;
	}



	public JTextField getTfEmail2Pai() {
		return tfEmail2Pai;
	}



	public void setTfEmail2Pai(JTextField tfEmail2Pai) {
		this.tfEmail2Pai = tfEmail2Pai;
	}



	public JTextField getTfEmailTrabalhoPai() {
		return tfEmailTrabalhoPai;
	}



	public void setTfEmailTrabalhoPai(JTextField tfEmailTrabalhoPai) {
		this.tfEmailTrabalhoPai = tfEmailTrabalhoPai;
	}



	public JTextField getTfRgMae() {
		return tfRgMae;
	}



	public void setTfRgMae(JTextField tfRgMae) {
		this.tfRgMae = tfRgMae;
	}



	public JTextField getTfRgOutroResp() {
		return tfRgOutroResp;
	}



	public void setTfRgOutroResp(JTextField tfRgOutroResp) {
		this.tfRgOutroResp = tfRgOutroResp;
	}



	public JTextField getTfProfissaoMae() {
		return tfProfissaoMae;
	}



	public void setTfProfissaoMae(JTextField tfProfissaoMae) {
		this.tfProfissaoMae = tfProfissaoMae;
	}



	public JTextField getTfEmail2Mae() {
		return tfEmail2Mae;
	}



	public void setTfEmail2Mae(JTextField tfEmail2Mae) {
		this.tfEmail2Mae = tfEmail2Mae;
	}



	public JTextField getTfEmailtrabalhoMae() {
		return tfEmailtrabalhoMae;
	}



	public void setTfEmailtrabalhoMae(JTextField tfEmailtrabalhoMae) {
		this.tfEmailtrabalhoMae = tfEmailtrabalhoMae;
	}



	public JTextField getTfEmail2OutroResp() {
		return tfEmail2OutroResp;
	}



	public void setTfEmail2OutroResp(JTextField tfEmail2OutroResp) {
		this.tfEmail2OutroResp = tfEmail2OutroResp;
	}



	public JTextField getTfProfissaoOutroResp() {
		return tfProfissaoOutroResp;
	}



	public void setTfProfissaoOutroResp(JTextField tfProfissaoOutroResp) {
		this.tfProfissaoOutroResp = tfProfissaoOutroResp;
	}



	public JTextField getTfEmailTrabalhoOutroResp() {
		return tfEmailTrabalhoOutroResp;
	}



	public void setTfEmailTrabalhoOutroResp(JTextField tfEmailTrabalhoOutroResp) {
		this.tfEmailTrabalhoOutroResp = tfEmailTrabalhoOutroResp;
	}



	public JTextField getTfLocalTrabalhoMae() {
		return tfLocalTrabalhoMae;
	}



	public void setTfLocalTrabalhoMae(JTextField tfLocalTrabalhoMae) {
		this.tfLocalTrabalhoMae = tfLocalTrabalhoMae;
	}



	public JTextField getTfLocalTrabalhoOutroResp() {
		return tfLocalTrabalhoOutroResp;
	}



	public void setTfLocalTrabalhoOutroResp(JTextField tfLocalTrabalhoOutroResp) {
		this.tfLocalTrabalhoOutroResp = tfLocalTrabalhoOutroResp;
	}



	public JTextField getTftelefoneAluno() {
		return tftelefoneAluno;
	}



	public void setTftelefoneAluno(JTextField tftelefoneAluno) {
		this.tftelefoneAluno = tftelefoneAluno;
	}



	public JTextField getTfNacionalidadePai() {
		return tfNacionalidadePai;
	}



	public void setTfNacionalidadePai(JTextField tfNacionalidadePai) {
		this.tfNacionalidadePai = tfNacionalidadePai;
	}



	public JTextField getTfNaturalidadePai() {
		return tfNaturalidadePai;
	}



	public void setTfNaturalidadePai(JTextField tfNaturalidadePai) {
		this.tfNaturalidadePai = tfNaturalidadePai;
	}



	public JTextField getTfDataNascimentoOutroResp() {
		return tfDataNascimentoOutroResp;
	}



	public void setTfDataNascimentoOutroResp(JTextField tfDataNascimentoOutroResp) {
		this.tfDataNascimentoOutroResp = tfDataNascimentoOutroResp;
	}



	public JTextField getTfNacionalidadeOutroResp() {
		return tfNacionalidadeOutroResp;
	}



	public void setTfNacionalidadeOutroResp(JTextField tfNacionalidadeOutroResp) {
		this.tfNacionalidadeOutroResp = tfNacionalidadeOutroResp;
	}



	public JTextField getTfNaturalidadeOutroResp() {
		return tfNaturalidadeOutroResp;
	}



	public void setTfNaturalidadeOutroResp(JTextField tfNaturalidadeOutroResp) {
		this.tfNaturalidadeOutroResp = tfNaturalidadeOutroResp;
	}



	public JTextField getTfDataNascimentoMae() {
		return tfDataNascimentoMae;
	}



	public void setTfDataNascimentoMae(JTextField tfDataNascimentoMae) {
		this.tfDataNascimentoMae = tfDataNascimentoMae;
	}



	public JTextField getTfNacionalidadeMae() {
		return tfNacionalidadeMae;
	}



	public void setTfNacionalidadeMae(JTextField tfNacionalidadeMae) {
		this.tfNacionalidadeMae = tfNacionalidadeMae;
	}



	public JTextField getTfNaturalidadeMae() {
		return tfNaturalidadeMae;
	}



	public void setTfNaturalidadeMae(JTextField tfNaturalidadeMae) {
		this.tfNaturalidadeMae = tfNaturalidadeMae;
	}



	public void setTfDataNascimentoPai(JTextField tfDataNascimentoPai) {
		this.tfDataNascimentoPai = tfDataNascimentoPai;
	}



	public static String getStatusTelacadastro() {
		return statusTelacadastro;
	}



	public static void setStatusTelacadastro(String statusTelacadastro) {
		CadastroAlunos.statusTelacadastro = statusTelacadastro;
	}


}
