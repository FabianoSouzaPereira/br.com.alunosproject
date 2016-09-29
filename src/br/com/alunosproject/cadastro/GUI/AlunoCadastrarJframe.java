package br.com.alunosproject.cadastro.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import br.com.alunosproject.cadastro.cadastros.Aluno;
import br.com.alunosproject.cadastro.cadastros.ImageChoose;
import br.com.alunosproject.dao.Conexao;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.SwingConstants;

public class AlunoCadastrarJframe extends JFrame implements ActionListener {
	/**
	 * Fabiano de Souza Pereira ADS0033;
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * classe JFrame fica responsavel por controlar as ações desses botões pois
	 * criou a interface ActionListener
	 */
	private DefaultTableModel modelo = new DefaultTableModel();
	private int matricula;
	private JTextField tfnome;
	private JTextField tfpai;
	private JTextField tfmae;
	private JTextField tfoutResp;
	private JFormattedTextField tfdatanascimento;
	private MaskFormatter ftmtfdatanascimento;
	private JTextField tfnacionalidade;
	private JTextField tfnaturalidade;
	private JTextField tfendereco;
	private JTextField tfbairro;
	private JTextField tfcidade;
	private JFormattedTextField tfcep;
	private MaskFormatter ftmtfcep;
	private JTextArea txtrinfoAdicional;
	private JTextArea txtrrelAfetivo;
	private JTextField tfrelAfetivo;
	private JFormattedTextField tfdataCadastro;
	private MaskFormatter ftmtfdataCadastro;
	private JFormattedTextField tfdataAtualizacao;
	private MaskFormatter ftmtfdataAtualizacao;
	private JLabel lblfoto;
	private JFormattedTextField tftelefone;
	private MaskFormatter ftmtftelefone;
	private JFormattedTextField tfcelular;
	private MaskFormatter ftmtfcelular;
	public JTextField tfmatricula;
	private JTextField tfsituacao;
	private JTextField tfapelido;
	private JButton btnCadastrar;
	private JButton btnEditar;
	private JButton btnApagar;
	private JButton btnCancelar;
	private JButton btnSair;
	Aluno aluno;
	@SuppressWarnings("unused")
	private int linhaSelecionada;
	int idupdate;
	@SuppressWarnings("rawtypes")
	private JComboBox cBoxSexo;
	@SuppressWarnings("rawtypes")
	private JComboBox cbIdade;
	private JTextField tfidade;

	public AlunoCadastrarJframe(DefaultTableModel md, int id, int linha) throws ParseException {
		aluno = new Aluno();
		criaJanela();
		mudaBotao(Aluno.getStatusTelacadastro());
		Conexao conn = new Conexao();
		aluno = conn.getAlunoById(id);
		tfmatricula.setText(Integer.toString(aluno.getMatricula()));
		tfapelido.setText(aluno.getApelido());
		tfnome.setText(aluno.getNome());
		tfidade.setText(aluno.getIdade());
		cbIdade.setSelectedItem(aluno.getCbIdade());
		cBoxSexo.setSelectedItem((aluno.getSexo()));
		tfdatanascimento.setText(aluno.splitDate(aluno.getDataNasc()));
		tfnacionalidade.setText(aluno.getNacionalidade());
		tfnaturalidade.setText(aluno.getNaturalidade());
		tfpai.setText(aluno.getPai());
		tfmae.setText(aluno.getMae());
		tfoutResp.setText(aluno.getOutResp());
		tfendereco.setText(aluno.getEndereco());
		tfbairro.setText(aluno.getBairro());
		tfcidade.setText(aluno.getCidade());
		tfcep.setText(aluno.getCep());
		txtrrelAfetivo.setText(aluno.getRelAfetivo());
		txtrinfoAdicional.setText(aluno.getInfoAdicional());
		tfdataCadastro.setText(aluno.splitDate(aluno.getDataCadastro()));
		tfdataAtualizacao.setText(aluno.splitDate(aluno.getDataAtualizacao()));
		ImageIcon foto = new ImageIcon(aluno.getFoto());
		lblfoto.setIcon(foto);
		// lblfoto.setIcon(getClass().getResource(aluno.getFoto()));
		tftelefone.setText(aluno.getTelefone());
		tfcelular.setText(aluno.getCelular());
		linhaSelecionada = linha;
		idupdate = id;

	}

	public AlunoCadastrarJframe() throws ParseException {
		criaJanela();
		mudaBotao(Aluno.getStatusTelacadastro());
		ImageIcon img = new ImageIcon("C:\\Users\\Fabiano\\workspace\\br.com.alunosproject\\imagem\\pessoa.png");
		lblfoto.setIcon(img);

	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void criaJanela() throws ParseException {

		setExtendedState(Frame.MAXIMIZED_BOTH);
		getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		setMinimumSize(new Dimension(800, 620));
		setPreferredSize(new Dimension(800, 620));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 808, 624);
		setTitle("Cadastro de Alunos");

		JPanel contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setPreferredSize(new Dimension(800, 600));
		contentPane.setMinimumSize(new Dimension(800, 596));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[90px][130px,grow][89px][grow][89px][115px,grow][][]",
				"[22px][32px][22px][][][22px][][][][][][22px][][103px,grow][15px,grow]"));

		JLabel lblMatricula = new JLabel("Matrícula");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMatricula, "cell 0 0,alignx left");

		tfmatricula = new JTextField();
		tfmatricula.setFocusable(false);
		tfmatricula.setBackground(UIManager.getColor("Button.background"));
		tfmatricula.setEditable(false);
		tfmatricula.setPreferredSize(new Dimension(6, 30));
		tfmatricula.setMinimumSize(new Dimension(6, 30));
		tfmatricula.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(tfmatricula, "cell 1 0,growx");
		tfmatricula.setColumns(10);

		JLabel lblSitucao = new JLabel("Situação  ");
		lblSitucao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblSitucao, "cell 2 0,alignx trailing");

		tfsituacao = new JTextField();
		tfsituacao.setEditable(false);
		tfsituacao.setFocusable(false);
		tfsituacao.setForeground(new Color(0, 0, 0));
		tfsituacao.setBackground(new Color(102, 255, 102));
		situacaoText();
		tfsituacao.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(tfsituacao, "cell 3 0,grow");
		tfsituacao.setColumns(10);

		JLabel lblApelido = new JLabel("Apelido   ");
		lblApelido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblApelido, "cell 4 0,alignx trailing");

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
		tfapelido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfapelido, "cell 5 0,grow");
		tfapelido.setColumns(10);

		lblfoto = new JLabel();
		lblfoto.setMinimumSize(new Dimension(150, 150));
		lblfoto.setPreferredSize(new Dimension(120, 90));
		lblfoto.setBackground(SystemColor.activeCaptionBorder);
		lblfoto.setLocale(new Locale("pt", "BR"));
		lblfoto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(lblfoto, "cell 7 0 1 7,grow");
		lblfoto.getSize();

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNome, "cell 0 1,alignx left,aligny center");

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
		tfnome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfnome.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfnome, "cell 1 1 5 1,growx,aligny top");
		tfnome.setColumns(10);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalTextPosition(SwingConstants.LEFT);
		lblIdade.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdade.setForeground(Color.BLACK);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblIdade, "cell 0 2,alignx left,aligny center");

		tfidade = new JTextField();
		tfidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfidade.setMinimumSize(new Dimension(20, 30));
		contentPane.add(tfidade, "flowx,cell 1 2");
		tfidade.setColumns(10);

		cbIdade = new JComboBox();
		cbIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbIdade.setMinimumSize(new Dimension(76, 30));
		cbIdade.setPreferredSize(new Dimension(20, 22));
		cbIdade.setModel(new DefaultComboBoxModel(new String[] { " mês  ", " ano  ", " meses", " anos " }));
		contentPane.add(cbIdade, "cell 1 2,growx");

		JLabel lblSexo = new JLabel("  Sexo    ");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblSexo, "cell 2 2,alignx trailing,growy");

		cBoxSexo = new JComboBox();
		cBoxSexo.setMinimumSize(new Dimension(31, 30));
		cBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));
		contentPane.add(cBoxSexo, "cell 3 2,growx");

		JLabel lblDataNascimento = new JLabel("  Data Nascimento    ");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDataNascimento, "cell 4 2,alignx right,aligny center");

		ftmtfdatanascimento = new MaskFormatter("##/##/####");
		tfdatanascimento = new JFormattedTextField(ftmtfdatanascimento);
		ftmtfdatanascimento.setValidCharacters("0123456789");
		tfdatanascimento.setHorizontalAlignment(SwingConstants.CENTER);
		tfdatanascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfdatanascimento.setPreferredSize(new Dimension(300, 50));
		contentPane.add(tfdatanascimento, "cell 5 2,growx,aligny top");
		tfdatanascimento.setColumns(10);

		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNacionalidade.setForeground(Color.BLACK);
		contentPane.add(lblNacionalidade, "cell 0 3,alignx left");

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
		tfnacionalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfnacionalidade, "cell 1 3 2 1,growx");
		tfnacionalidade.setColumns(10);

		JLabel lblNaturalidade = new JLabel("Naturalidade      ");
		lblNaturalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNaturalidade, "cell 3 3,alignx right");

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
		tfnaturalidade.setMinimumSize(new Dimension(6, 30));
		tfnaturalidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfnaturalidade, "cell 4 3 2 1,growx");
		tfnaturalidade.setColumns(10);

		JLabel lblPai = new JLabel("Nome do Pai");
		lblPai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblPai, "cell 0 4,alignx left,aligny center");

		tfpai = new JTextField();
		tfpai.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfpai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfpai.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfpai, "cell 1 4 5 1,growx,aligny top");
		tfpai.setColumns(10);

		JLabel lblMae = new JLabel("Nome da Mãe");
		lblMae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMae, "cell 0 5,alignx left,growy");

		tfmae = new JTextField();
		tfmae.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfmae.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfmae.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfmae, "cell 1 5 5 1,growx,aligny top");
		tfmae.setColumns(10);

		JLabel lblOutro = new JLabel("Outro Resp.");
		lblOutro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblOutro, "cell 0 6,alignx left,growy");

		tfoutResp = new JTextField();
		tfoutResp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		tfoutResp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfoutResp.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfoutResp, "cell 1 6 5 1,growx,aligny top");
		tfoutResp.setColumns(10);

		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblEndereo, "cell 0 7,alignx left");

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
		tfendereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfendereco, "cell 1 7 5 1,growx,aligny top");
		tfendereco.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblBairro, "cell 0 8,alignx left");

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
		tfbairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfbairro.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfbairro, "cell 1 8 5 1,growx");
		tfbairro.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCidade, "cell 0 9,alignx left");

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
		tfcidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfcidade.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfcidade, "cell 1 9 5 1,growx");
		tfcidade.setColumns(10);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCep, "cell 0 10,alignx left");

		ftmtfcep = new MaskFormatter("#####-###");
		tfcep = new JFormattedTextField(ftmtfcep);
		ftmtfcep.setValidCharacters("0123456789");
		tfcep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfcep.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfcep, "cell 1 10,growx");
		tfcep.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTelefone, "cell 2 10,alignx trailing");

		ftmtftelefone = new MaskFormatter("(##)####-####");
		tftelefone = new JFormattedTextField(ftmtftelefone);
		ftmtftelefone.setValidCharacters("0123456789");
		tftelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tftelefone.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tftelefone, "cell 3 10,growx");
		tftelefone.setColumns(10);

		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCelular, "cell 4 10,alignx trailing");

		ftmtfcelular = new MaskFormatter("(##)####-####");
		tfcelular = new JFormattedTextField(ftmtfcelular);
		ftmtfcelular.setValidCharacters("0123456789");
		tfcelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfcelular.setMinimumSize(new Dimension(6, 30));
		contentPane.add(tfcelular, "cell 5 10,growx");
		tfcelular.setColumns(10);

		JLabel lblDataCadastro = new JLabel("Data Cadastro");
		lblDataCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblDataCadastro, "cell 2 11,alignx trailing,growy");

		ftmtfdataCadastro = new MaskFormatter("##/##/####");
		tfdataCadastro = new JFormattedTextField(ftmtfdataCadastro);
		tfdataCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		tfdataCadastro.setEditable(false);
		ftmtfdataCadastro.setValidCharacters("0123456789");
		tfdataCadastro.setMinimumSize(new Dimension(6, 30));
		tfdataCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfdataCadastro, "cell 3 11,grow");
		tfdataCadastro.setColumns(10);

		JLabel lbldataAtualizacao = new JLabel("Data Atualização");
		lbldataAtualizacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lbldataAtualizacao, "cell 4 11,alignx right,growy");

		ftmtfdataAtualizacao = new MaskFormatter("##/##/####");
		tfdataAtualizacao = new JFormattedTextField(ftmtfdataAtualizacao);
		tfdataAtualizacao.setEditable(false);
		tfdataAtualizacao.setHorizontalAlignment(SwingConstants.CENTER);
		ftmtfdataAtualizacao.setValidCharacters("0123456789");
		tfdataAtualizacao.setMinimumSize(new Dimension(6, 30));
		tfdataAtualizacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(tfdataAtualizacao, "cell 5 11,grow");
		tfdataAtualizacao.setColumns(10);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 13 8 1,grow");
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Informações Adicionais:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(scrollPane);

		txtrinfoAdicional = new JTextArea();
		txtrinfoAdicional.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		scrollPane.setViewportView(txtrinfoAdicional);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new TitledBorder(null, "Relação afetiva do aluno: ", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_1.add(scrollPane_1);

		txtrrelAfetivo = new JTextArea();
		txtrrelAfetivo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					e.setKeyChar(Character.toUpperCase(keyChar));
				}
			}
		});
		scrollPane_1.setViewportView(txtrrelAfetivo);

		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 14 12 1,growx,aligny center");

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnCadastrar);
		btnCadastrar.setPreferredSize(new Dimension(100, 40));
		btnCadastrar.setMaximumSize(new Dimension(100, 40));
		btnCadastrar.setMinimumSize(new Dimension(100, 40));
		btnCadastrar.setActionCommand("Cadastrar");

		btnEditar = new JButton("Atualizar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setMaximumSize(new Dimension(100, 40));
		btnEditar.setMinimumSize(new Dimension(100, 40));
		btnEditar.setPreferredSize(new Dimension(100, 40));
		panel.add(btnEditar);
		btnEditar.setActionCommand("Atualizar");

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnCancelar);
		btnCancelar.setMaximumSize(new Dimension(100, 40));
		btnCancelar.setPreferredSize(new Dimension(100, 40));
		btnCancelar.setMinimumSize(new Dimension(100, 40));
		btnCancelar.setActionCommand("Cancelar");

		btnApagar = new JButton("Apagar");
		btnApagar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnApagar);
		btnApagar.setPreferredSize(new Dimension(100, 40));
		btnApagar.setMaximumSize(new Dimension(100, 40));
		btnApagar.setMinimumSize(new Dimension(100, 40));
		btnApagar.setActionCommand("Apagar");

		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnSair);
		btnSair.setMaximumSize(new Dimension(100, 40));
		btnSair.setMinimumSize(new Dimension(100, 40));
		btnSair.setPreferredSize(new Dimension(100, 40));

		btnCadastrar.addActionListener(new btnCadastrarListener());
		btnEditar.addActionListener(new btnAtualizarListener());
		btnCancelar.addActionListener(new btnCancelarListener());
		btnApagar.addActionListener(new btnApagarListener());
		btnSair.addActionListener(new btnSairActionListener());

		cbIdade.addActionListener(new cbIdadeListener());
		cBoxSexo.addActionListener(new cBoxSexoListener());
		lblfoto.addMouseListener(new MouseAdapter());

	}

	/** Implementa��o do metodo ActionEvent do JFrame */
	private class btnCadastrarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Aluno a = new Aluno();
			a.setMatricula(matricula);// parei aqui
			a.setNome(tfnome.getText());
			a.setApelido(tfapelido.getText());
			a.setIdade(tfidade.getText().trim());
			a.setCbIdade((String) cbIdade.getSelectedItem());
			a.setSexo((String) cBoxSexo.getSelectedItem());
			a.setDataNasc(tfdatanascimento.getText());
			a.setNacionalidade(tfnacionalidade.getText());
			a.setNaturalidade(tfnaturalidade.getText());
			a.setPai(tfpai.getText());
			a.setMae(tfmae.getText());
			a.setOutResp(tfoutResp.getText());
			a.setEndereco(tfendereco.getText());
			a.setBairro(tfbairro.getText());
			a.setCidade(tfcidade.getText());
			a.setCep(tfcep.getText());
			a.setRelAfetivo(txtrrelAfetivo.getText());
			a.setInfoAdicional(txtrinfoAdicional.getText());
			a.setDataCadastro(tfdataCadastro.getText());
			a.setDataAtualizacao(tfdataAtualizacao.getText());
			a.setFoto(Aluno.getCaminhofoto());
			a.setTelefone(tftelefone.getText().trim());
			a.setCelular(tfcelular.getText().trim());

			Conexao conn = new Conexao();
			conn.inserir(a);
			Mainwindow.pesquisar(modelo);
			dispose();

		}
	}

	/** Botão editar */
	private class btnAtualizarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Aluno a = new Aluno();
			a.setNome(tfnome.getText());
			a.setApelido(tfapelido.getText());
			a.setIdade(tfidade.getText());
			a.setCbIdade((String) cbIdade.getSelectedItem());
			a.setSexo((String) cBoxSexo.getSelectedItem());

			a.setDataNasc(aluno.joinDate(tfdatanascimento.getText()));
			a.setNacionalidade(tfnacionalidade.getText());
			a.setNaturalidade(tfnaturalidade.getText());
			a.setPai(tfpai.getText());
			a.setMae(tfmae.getText());
			a.setOutResp(tfoutResp.getText());

			a.setEndereco(tfendereco.getText());
			a.setBairro(tfbairro.getText());
			a.setCidade(tfcidade.getText());
			a.setCep(tfcep.getText().trim());
			a.setRelAfetivo(txtrrelAfetivo.getText());

			a.setInfoAdicional(txtrinfoAdicional.getText());
			a.setDataAtualizacao(aluno.joinDate(tfdataAtualizacao.getText()));
			a.setFoto(Aluno.getCaminhofoto());

			a.setTelefone(tftelefone.getText());
			a.setCelular(tfcelular.getText());
			a.setId(idupdate);

			Conexao conn = new Conexao();
			conn.atualizar(a);
			Mainwindow.pesquisar(modelo);
			dispose();

		}
	}

	private class btnCancelarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			limparTodosCampos(rootPane);
		}
	}

	private class btnApagarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Aluno aluno = new Aluno();
			limparTodosCampos(rootPane);
			Conexao conn = new Conexao();
			conn.apagar(aluno.getId());
			dispose();
		}

	}

	private class btnSairActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			limparTodosCampos(rootPane);
			dispose();
		}
	}

	private class cbIdadeListener implements ActionListener {
		@SuppressWarnings({ "unused", "rawtypes" })
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox cbIdade = (JComboBox) e.getSource();
			String cbIdadeselecionado = (String) cbIdade.getSelectedItem();
		}
	}

	private class cBoxSexoListener implements ActionListener {
		@SuppressWarnings({ "rawtypes", "unused" })
		@Override
		public void actionPerformed(ActionEvent e) {
			JComboBox cBoxSexo = (JComboBox) e.getSource();
			String cbselecionado = (String) cBoxSexo.getSelectedItem();
		}
	}

	private class MouseAdapter implements ActionListener, MouseListener {
		public void mouseClicked(MouseEvent arg0) {
			try {
				ImageChoose.abrirImage();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			Aluno aluno = new Aluno();
			aluno.setFoto(Aluno.getCaminhofoto());
			ImageIcon foto = new ImageIcon(aluno.getFoto());
			lblfoto.setIcon(foto);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
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

	private void situacaoText() {
		Aluno aluno = new Aluno();
		if (aluno.getStatus() == 1) {
			tfsituacao.setText("Ativo");
		}
		if (aluno.getStatus() == 0) {
			tfsituacao.setText("Inativo");
		}
	}

	private void mudaBotao(String estado) {
		if (Aluno.getStatusTelacadastro() == "Cadastrar") {
			btnCadastrar.setEnabled(true);
			btnEditar.setEnabled(false);
			btnApagar.setEnabled(false);
			btnCancelar.setEnabled(true);
			btnSair.setEnabled(true);
		}
		if (Aluno.getStatusTelacadastro() == "Editar") {
			btnCadastrar.setEnabled(false);
			btnEditar.setEnabled(true);
			btnApagar.setEnabled(false);
			btnCancelar.setEnabled(true);
			btnSair.setEnabled(true);
		}
		if (Aluno.getStatusTelacadastro() == "Apagar") {
			btnCadastrar.setEnabled(false);
			btnEditar.setEnabled(false);
			btnApagar.setEnabled(true);
			btnCancelar.setEnabled(false);
			btnSair.setEnabled(true);
		}
	}

	// -------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------

	public JTextField gettxtrrelAfetivo() {
		return tfrelAfetivo;
	}

	public void setTxtrrelAfetivo(JTextArea txtrrelAfetivo) {
		this.txtrrelAfetivo = txtrrelAfetivo;
	}

	public JTextArea getTxtrinfoAdicional() {
		return txtrinfoAdicional;
	}

	public void setTxtrinfoAdicional(JTextArea txtrinfoAdicional) {
		this.txtrinfoAdicional = txtrinfoAdicional;
	}

	public JTextField getTfdataAtualizacao() {
		return tfdataAtualizacao;
	}

	public void setTfdataAtualizacao(JFormattedTextField tfdataAtualizacao) {
		this.tfdataAtualizacao = tfdataAtualizacao;
	}

	public JLabel getLblfoto() {
		return lblfoto;
	}

	public void setLblfoto(JLabel lblfoto) {
		this.lblfoto = lblfoto;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public JTextField getTfnome() {
		return tfnome;
	}

	public void setTfnome(JTextField tfnome) {
		this.tfnome = tfnome;
	}

	public JTextField getTfidade() {
		return tfidade;
	}

	public void setTfidade(JTextField tfidade) {
		this.tfidade = tfidade;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getCBoxSexo() {
		return cBoxSexo;
	}

	@SuppressWarnings("rawtypes")
	public void setCBoxSexo(JComboBox cBoxSexo) {
		this.cBoxSexo = cBoxSexo;
	}

	public JTextField getTfpai() {
		return tfpai;
	}

	public void setTfpai(JTextField tfpai) {
		this.tfpai = tfpai;
	}

	public JTextField getTfmae() {
		return tfmae;
	}

	public void setTfmae(JTextField tfmae) {
		this.tfmae = tfmae;
	}

	public JTextField getTfoutResp() {
		return tfoutResp;
	}

	public void setTfoutResp(JTextField tfoutResp) {
		this.tfoutResp = tfoutResp;
	}

	public JFormattedTextField getTfdatanascimento() {
		return tfdatanascimento;
	}

	public void setTfdatanascimento(JFormattedTextField tfdatanascimento) {
		this.tfdatanascimento = tfdatanascimento;
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

	public JTextField getTfcep() {
		return tfcep;
	}

	public void setTfcep(JFormattedTextField tfcep) {
		this.tfcep = tfcep;
	}

	public JTextField getTfrelAfetivo() {
		return tfrelAfetivo;
	}

	public void setTfrelAfetivo(JTextField tfrelAfetivo) {
		this.tfrelAfetivo = tfrelAfetivo;
	}

	public JFormattedTextField getTfdataCadastro() {
		return tfdataCadastro;
	}

	public void setTfdataCadastro(JFormattedTextField tfdataCadastro) {
		this.tfdataCadastro = tfdataCadastro;
	}

	public JFormattedTextField getTftelefone() {
		return tftelefone;
	}

	public void setTftelefone(JFormattedTextField tftelefone) {
		this.tftelefone = tftelefone;
	}

	public JFormattedTextField getTfcelular() {
		return tfcelular;
	}

	public void setTfcelular(JFormattedTextField tfcelular) {
		this.tfcelular = tfcelular;
	}

	public JTextField getTfmatricula() {
		return tfmatricula;
	}

	public void setTfmatricula(JTextField tfmatricula) {
		this.tfmatricula = tfmatricula;
	}

	public JTextField getTfsituacao() {
		return tfsituacao;
	}

	public void setTfsituacao(JTextField tfsituacao) {
		this.tfsituacao = tfsituacao;
	}

	public JTextField getTfapelido() {
		return tfapelido;
	}

	public void setTfapelido(JTextField tfapelido) {
		this.tfapelido = tfapelido;
	}

	public JTextArea getTxtrrelAfetivo() {
		return txtrrelAfetivo;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
