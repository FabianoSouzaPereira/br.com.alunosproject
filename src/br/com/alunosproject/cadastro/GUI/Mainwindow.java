package br.com.alunosproject.cadastro.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import br.com.alunosproject.cadastro.cadastros.Aluno;

import br.com.alunosproject.cadastro.cadastros.FileChooserDialog;
import br.com.alunosproject.dao.Conexao;
import net.miginfocom.swing.MigLayout;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.awt.event.WindowEvent;

public class Mainwindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private Connection connection = null;
	static DefaultTableModel modelo = new DefaultTableModel();
	private JTable tabela;
	public static final int YES_OPTION = 0;
	public static final int NO_OPTION = 1;

	public Mainwindow() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				Mainwindow.pesquisar(modelo);
			}

			public void windowLostFocus(WindowEvent arg0) {
			}
		});
		@SuppressWarnings("unused")
		Aluno aluno = new Aluno();
		// criaJTable();

		criaPrincipal();

	}

	/**
	 * Create the frame.
	 * 
	 * @param ResultSet
	 */
	public void criaPrincipal() {

		setExtendedState(Frame.MAXIMIZED_BOTH);
		setPreferredSize(new Dimension(1024, 768));
		setMinimumSize(new Dimension(800, 600));
		setSize(new Dimension(800, 600));
		setTitle("Cadastro de Alunos");
		getContentPane().setMinimumSize(new Dimension(800, 600));
		getContentPane().setMaximumSize(new Dimension(0, 0));
		getContentPane().setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		toolBar.setPreferredSize(new Dimension(13, 40));
		toolBar.setSize(new Dimension(40, 40));
		toolBar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		toolBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(toolBar, BorderLayout.NORTH);

		JButton btnListaCadastro = new JButton("");
		btnListaCadastro.setPreferredSize(new Dimension(33, 40));
		btnListaCadastro.setMinimumSize(new Dimension(33, 40));
		btnListaCadastro.setMaximumSize(new Dimension(55, 40));
		btnListaCadastro.setToolTipText("Lista de Cadastrados");
		btnListaCadastro.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/table.gif")));
		toolBar.add(btnListaCadastro);

		JButton btnNovoCadastro = new JButton("");
		btnNovoCadastro.setActionCommand("Novo Cadastro");
		btnNovoCadastro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNovoCadastro.setToolTipText("Novo Cadastro");
		btnNovoCadastro.setPreferredSize(new Dimension(33, 40));
		btnNovoCadastro.setMaximumSize(new Dimension(55, 40));
		btnNovoCadastro.setMinimumSize(new Dimension(33, 40));
		btnNovoCadastro.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/page_new.gif")));
		toolBar.add(btnNovoCadastro);

		JButton btnEditarCadastro = new JButton("");
		btnEditarCadastro.setToolTipText("Editar Cadastro");
		btnEditarCadastro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEditarCadastro.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/page_edit.gif")));
		btnEditarCadastro.setMaximumSize(new Dimension(55, 40));
		btnEditarCadastro.setMinimumSize(new Dimension(33, 40));
		btnEditarCadastro.setPreferredSize(new Dimension(33, 40));
		toolBar.add(btnEditarCadastro);

		JButton btnApagarCadastro = new JButton("");
		btnApagarCadastro.setToolTipText("Apagar Cadastro");
		btnApagarCadastro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnApagarCadastro.setMaximumSize(new Dimension(55, 40));
		btnApagarCadastro.setMinimumSize(new Dimension(33, 40));
		btnApagarCadastro.setPreferredSize(new Dimension(33, 40));
		btnApagarCadastro.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/page_delete.gif")));
		toolBar.add(btnApagarCadastro);

		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setMaximumSize(new Dimension(10, 32767));
		toolBar.add(separator);

		JButton btnNovo = new JButton("");
		btnNovo.setToolTipText("Novo Documento");
		btnNovo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNovo.setMinimumSize(new Dimension(33, 30));
		btnNovo.setMargin(new Insets(4, 10, 4, 10));
		btnNovo.setMaximumSize(new Dimension(55, 40));
		btnNovo.setPreferredSize(new Dimension(33, 40));
		btnNovo.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/folder.gif")));
		btnNovo.setActionCommand("mnNovo");
		toolBar.add(btnNovo);

		JButton btnAbrir = new JButton("");
		btnAbrir.setToolTipText("Abrir novo documento");
		btnAbrir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAbrir.setMinimumSize(new Dimension(33, 30));
		btnAbrir.setMargin(new Insets(4, 10, 4, 10));
		btnAbrir.setMaximumSize(new Dimension(55, 40));
		btnAbrir.setPreferredSize(new Dimension(33, 40));
		btnAbrir.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/folder_page.gif")));
		btnAbrir.setActionCommand("Abrir");
		toolBar.add(btnAbrir);

		JButton btnSalvar = new JButton("");
		btnSalvar.setToolTipText("Salaver documento");
		btnSalvar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSalvar.setMinimumSize(new Dimension(33, 30));
		btnSalvar.setMargin(new Insets(4, 10, 4, 10));
		btnSalvar.setMaximumSize(new Dimension(55, 40));
		btnSalvar.setPreferredSize(new Dimension(33, 40));
		btnSalvar.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/action_save.gif")));
		btnSalvar.setActionCommand("Salvar");
		toolBar.add(btnSalvar);

		JButton btnEditar = new JButton("");
		btnEditar.setToolTipText("Editar documentos");
		btnEditar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEditar.setMinimumSize(new Dimension(33, 30));
		btnEditar.setMargin(new Insets(4, 10, 4, 10));
		btnEditar.setMaximumSize(new Dimension(55, 40));
		btnEditar.setPreferredSize(new Dimension(33, 40));
		btnEditar.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/page_edit.gif")));
		btnEditar.setActionCommand("Editar");
		toolBar.add(btnEditar);

		JButton btnApagar = new JButton("");
		btnApagar.setToolTipText("Excluir documentos");
		btnApagar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnApagar.setMinimumSize(new Dimension(33, 30));
		btnApagar.setMargin(new Insets(4, 10, 4, 10));
		btnApagar.setMaximumSize(new Dimension(55, 40));
		btnApagar.setPreferredSize(new Dimension(33, 40));
		btnApagar.setIcon(new ImageIcon(Mainwindow.class.getResource("/famfamfam_mini_icons/folder_delete.gif")));
		btnApagar.setActionCommand("Apagar");
		toolBar.add(btnApagar);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(448, 70));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setMinimumSize(new Dimension(10, 70));
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 90, 15));

		JButton btnSair = new JButton("Sair");
		btnSair.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnSair.setMargin(new Insets(2, 5, 2, 14));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setMaximumSize(new Dimension(85, 30));
		btnSair.setMinimumSize(new Dimension(85, 30));
		btnSair.setPreferredSize(new Dimension(85, 40));
		btnSair.setIcon(new ImageIcon(
				"C:\\Users\\Fabiano\\workspace\\br.com.alunosproject\\ico\\famfamfam_mini_icons\\action_stop.gif"));
		btnSair.setActionCommand("Terminar");
		panel.add(btnSair);

		btnNovoCadastro.addActionListener(new btnNovoCadastroActionListener());
		btnEditarCadastro.addActionListener(new btnEditarCadastroActionListener());
		btnApagarCadastro.addActionListener(new btnApagarCadastroActionListener());

		btnNovo.addActionListener(new btnNovoActionListener());
		btnAbrir.addActionListener(new btnAbrirActionListener());
		btnSalvar.addActionListener(new btnSalvarActionListener());
		btnEditar.addActionListener(new btnEditarActionListener());
		btnApagar.addActionListener(new btnApagarActionListener());

		btnSair.addActionListener(new btnSairActionListener());

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 700));
		panel_1.setMinimumSize(new Dimension(10, 700));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[1826px]", "[1826px]")); // largura
																		// mínima,preferida,maxima.

		Icon img = new ImageIcon(
				"C:\\Users\\Fabiano\\workspace\\br.com.alunosproject\\imagem\\wallpaper-coffee-1024x576.jpg");
		JLabel fotoPrincipal = new JLabel();
		fotoPrincipal.setIcon(img);

		/*
		 * InputStream stream =
		 * this.getClass().getClassLoader().getResourceAsStream(
		 * "C://Users//Fabiano//workspace//br.com.alunosproject//imagem//wallpaper-coffee-1024x576.jpg"
		 * ); BufferedImage bufferedImage = null; try { bufferedImage =
		 * ImageIO.read(stream); } catch (IOException e) { e.printStackTrace();
		 * } ImageIcon icon = new ImageIcon(bufferedImage); JLabel fotoPrincipal
		 * = new JLabel(); fotoPrincipal.setIcon(icon);
		 */
		// JScrollPane scrollPane = new JScrollPane(getTabela());
		JScrollPane scrollPane = new JScrollPane(fotoPrincipal);
		scrollPane.setBounds(new Rectangle(0, 0, 550, 0));
		scrollPane.setIgnoreRepaint(true);
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setMinimumSize(new Dimension(550, 150));
		panel_1.add(scrollPane, "cell 0 0,grow");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		JMenuItem mntmNovoCadastro = new JMenuItem("Novo Cadastro");
		mntmNovoCadastro.addActionListener(new mntmCadastrarActionListener());
		mnArquivo.add(mntmNovoCadastro);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArquivo.add(mntmAbrir);

		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);

		JMenuItem mntmSalvarComo = new JMenuItem("Salvar Como");
		mnArquivo.add(mntmSalvarComo);

		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mnArquivo.add(mntmFechar);

		JMenuItem mntmFecharTudo = new JMenuItem("Fechar Tudo");
		mnArquivo.add(mntmFecharTudo);

		JSeparator separator_1 = new JSeparator();
		mnArquivo.add(separator_1);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);

		JMenu mntmEditar = new JMenu("Editar");
		menuBar.add(mntmEditar);

		JMenuItem mntmDesfazer = new JMenuItem("Desfazer");
		mntmEditar.add(mntmDesfazer);

		JMenuItem mntmRefazer = new JMenuItem("Refazer");
		mntmEditar.add(mntmRefazer);

		JSeparator separator_2 = new JSeparator();
		mntmEditar.add(separator_2);

		JMenuItem mntmRecortar = new JMenuItem("Recortar");
		mntmEditar.add(mntmRecortar);

		JMenuItem mntmColar = new JMenuItem("Colar");
		mntmEditar.add(mntmColar);

		JSeparator separator_3 = new JSeparator();
		mntmEditar.add(separator_3);

		JMenuItem mntmApagar = new JMenuItem("Apagar");
		mntmEditar.add(mntmApagar);

		JMenu mnProcurar = new JMenu("Procurar");
		menuBar.add(mnProcurar);

		JMenuItem mntmCadastroAlunos = new JMenuItem("Cadastro Alunos");
		mnProcurar.add(mntmCadastroAlunos);

		JMenuItem mntmPesquisaAvanada = new JMenuItem("Pesquisa Avançada");
		mnProcurar.add(mntmPesquisaAvanada);

		JMenu mnImpressora = new JMenu("Impressora");
		menuBar.add(mnImpressora);

		JMenuItem mntmConfigurarImpressora = new JMenuItem("Configurar impressora");
		mnImpressora.add(mntmConfigurarImpressora);

		mntmNovoCadastro.addActionListener(new mntmCadastrarActionListener());
		mntmAbrir.addActionListener(new mntmAbrirActionListener());
		mntmSalvar.addActionListener(new mntmSalvarActionListener());
		mntmSalvarComo.addActionListener(new mntmSalvarActionListener());
		mntmEditar.addActionListener(new mntmEditarActionListener());
		mntmApagar.addActionListener(new mntmApagarActionListener());
		mntmSair.addActionListener(new mntmSairActionListener());

		// tabela.addMouseListener(new doubleClickMouseAdpater());

	}

	private void criaJTable() {
		setTabela(new JTable(modelo));
		getTabela().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getTabela().setFont(new Font("Tahoma", Font.PLAIN, 15));
		getTabela().setRowHeight(30);
		getTabela().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		getTabela().setMinimumSize(new Dimension(550, 0));
		getTabela().setPreferredScrollableViewportSize(new Dimension(550, 400));
		getTabela().setDefaultEditor(Object.class, null); // elimina editor de
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

		getTabela().getColumnModel().getColumn(0).setPreferredWidth(50);
		getTabela().getColumnModel().getColumn(1).setPreferredWidth(80);
		getTabela().getColumnModel().getColumn(2).setPreferredWidth(300);
		getTabela().getColumnModel().getColumn(3).setPreferredWidth(70);
		getTabela().getColumnModel().getColumn(4).setPreferredWidth(50);
		getTabela().getColumnModel().getColumn(5).setPreferredWidth(55);
		getTabela().getColumnModel().getColumn(6).setPreferredWidth(85);

		getTabela().getColumnModel().getColumn(7).setPreferredWidth(300);
		getTabela().getColumnModel().getColumn(8).setPreferredWidth(300);
		getTabela().getColumnModel().getColumn(9).setPreferredWidth(300);
		getTabela().getColumnModel().getColumn(10).setPreferredWidth(100);
		getTabela().getColumnModel().getColumn(11).setPreferredWidth(110);

		getTabela().getColumnModel().getColumn(12).setPreferredWidth(110);
		getTabela().getColumnModel().getColumn(13).setPreferredWidth(180);
		getTabela().getColumnModel().getColumn(14).setPreferredWidth(160);
		getTabela().getColumnModel().getColumn(15).setPreferredWidth(150);
		getTabela().getColumnModel().getColumn(16).setPreferredWidth(100);

		getTabela().getColumnModel().getColumn(17).setPreferredWidth(120);
		getTabela().getColumnModel().getColumn(18).setPreferredWidth(120);
		getTabela().getColumnModel().getColumn(19).setPreferredWidth(120);
		getTabela().getColumnModel().getColumn(20).setPreferredWidth(120);
		getTabela().getColumnModel().getColumn(21).setPreferredWidth(120);

		getTabela().getColumnModel().getColumn(22).setPreferredWidth(120);

		pesquisar(modelo);
	}

	public static void pesquisar(DefaultTableModel modelo) {
		modelo.setNumRows(0);
		Conexao conn = new Conexao();

		for (Aluno a : conn.getAlunos()) {
			modelo.addRow(new Object[] { a.getId(), a.getMatricula(), a.getNome(), a.getApelido(), a.getIdade(),
					a.getCbIdade(), a.getSexo(), a.getPai(), a.getMae(), a.getOutResp(), a.splitDate(a.getDataNasc()),
					a.getNacionalidade(), a.getNaturalidade(), a.getEndereco(), a.getBairro(), a.getCidade(),
					a.getCep(), a.getRelAfetivo(), a.getInfoAdicional(), a.splitDate(a.getDataCadastro()),
					a.splitDate(a.getDataAtualizacao()), a.getTelefone(), a.getCelular(), a.getFoto() });
		}
	}

	// listener dos botoes começa aqui.

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				isCellEditable(tabela.getSelectedRow(), tabela.getSelectedColumn());
				if (e.getClickCount() == 2) {
					try {
						Aluno a = new Aluno();
						a.setStatusTelacadastro("Editar");
						int linhaSelecionada = -1;
						linhaSelecionada = getTabela().getSelectedRow();
						if (linhaSelecionada >= 0) {
							int idAluno = (int) getTabela().getValueAt(linhaSelecionada, 0);
							AlunoCadastrarJframe frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
							frame.setVisible(true);
							frame.getTfdataAtualizacao().setText(getDateTime());
						} else {
							JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");

						}
					} catch (Exception o) {
						o.printStackTrace();
					}
				}

			}
		});
		tabela.setName("tabelaAlunos");
	}

	public boolean isCellEditable(int Row, int mColIndex) {
		if (tabela.isCellEditable(tabela.getSelectedRow(), tabela.getSelectedColumn()) == true) {
			return false;
		}
		return false;

	}

	public class btnNovoCadastroActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Aluno a = new Aluno();
				a.setStatusTelacadastro("Cadastrar");
				AlunoCadastrarJframe frame = new AlunoCadastrarJframe();
				frame.setVisible(true);
				frame.getTfdataCadastro().setText(getDateTime());
				frame.getTfdataAtualizacao().setText(getDateTime());
			} catch (Exception o) {
				o.printStackTrace();
			}
		}

	}

	public class btnEditarCadastroActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				Aluno a = new Aluno();
				a.setStatusTelacadastro("Editar");
				int linhaSelecionada = -1;
				linhaSelecionada = getTabela().getSelectedRow();
				if (linhaSelecionada >= 0) {
					int idAluno = (int) getTabela().getValueAt(linhaSelecionada, 0);
					AlunoCadastrarJframe frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
					frame.setVisible(true);
					frame.getTfdataAtualizacao().setText(getDateTime());
				} else {
					JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");

				}
			} catch (Exception o) {
				o.printStackTrace();
			}
		}

	}

	public class btnApagarCadastroActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Aluno a = new Aluno();
				a.setStatusTelacadastro("Apagar");
				int linhaSelecionada = -1;
				linhaSelecionada = getTabela().getSelectedRow();
				if (linhaSelecionada >= 0) {
					int idAluno = (int) getTabela().getValueAt(linhaSelecionada, 0);
					AlunoCadastrarJframe frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
					frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");
				}
			} catch (Exception o) {
				o.printStackTrace();

			}
		}
	}

	public class btnNovoActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// FileChooserDialog f = new FileChooserDialog();
			FileChooserDialog.abrirFile();
		}
	}

	public class btnAbrirActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {

			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}

	public class btnSalvarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {

			} catch (Exception a) {
				a.printStackTrace();
			}
		}

	}

	public class btnEditarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	public class btnApagarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	public class btnSairActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame janela = new JFrame();
			int resposta = JOptionPane.showConfirmDialog(janela, "SAIR DO PROGRAMA ?", "CADASTRO DE ALUNOS",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resposta == YES_OPTION) {
				System.exit(0);
			} else {
				return;
			}
		}

	}

	// listener do menu começa aqui.

	private class mntmCadastrarActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				AlunoCadastrarJframe frame = new AlunoCadastrarJframe();
				frame.setVisible(true);
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}

	private class mntmAbrirActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// FileChooserDialog f = new FileChooserDialog();
			FileChooserDialog.abrirFile();
		}
	}

	public class mntmSalvarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

		}

	}

	public class mntmEditarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

		}

	}

	public class mntmApagarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

		}

	}

	public class mntmSairActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame janela = new JFrame();
			int resposta = JOptionPane.showConfirmDialog(janela, "SAIR DO PROGRAMA ?", "CADASTRO DE ALUNOS",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resposta == YES_OPTION) {
				System.exit(0);
			} else {
				return; // para forçar saída do procedimento
			}
		}

	}

	// Listener da tabela começa aqui
	/*
	 * public class doubleClickMouseAdpater implements MouseListener {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { if (e.getClickCount()
	 * == 2) { try { Aluno a = new Aluno(); a.setStatusTelacadastro("Editar");
	 * int linhaSelecionada = -1; linhaSelecionada =
	 * getTabela().getSelectedRow(); if (linhaSelecionada >= 0) { int idAluno =
	 * (int) getTabela().getValueAt(linhaSelecionada, 0); AlunoCadastrarJframe
	 * frame = new AlunoCadastrarJframe(modelo, idAluno, linhaSelecionada);
	 * frame.setVisible(true);
	 * frame.getTfdataAtualizacao().setText(getDateTime()); } else {
	 * JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha.");
	 * 
	 * } } catch (Exception o) { o.printStackTrace(); } }
	 * 
	 * }
	 * 
	 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void mouseReleased(MouseEvent e) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 *
	 * }
	 */
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public Image getImage(String path) {
		URL imageURL = getClass().getResource(path);
		if (imageURL == null)
			return null;
		return new ImageIcon(imageURL).getImage();
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Dimension dDesktop = this.getSize();
		double width = dDesktop.getWidth();
		double height = dDesktop.getHeight();
		Image background = new ImageIcon(this.image.getScaledInstance((int) width, (int) height, 1)).getImage();
		g.drawImage(background, 0, 0, this);
	}

	/**
	 * ; Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {

					Mainwindow frame = new Mainwindow();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
