package br.com.alunosproject.cadastro.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

import br.com.alunosproject.cadastro.cadastros.Aluno;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Mainwindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int YES_OPTION = 0;
	public static final int NO_OPTION = 1;
	public static int tac= 0;


	public Mainwindow() {
		setPreferredSize(new Dimension(750, 600));
		setMinimumSize(new Dimension(1200, 600));
		getContentPane().setPreferredSize(new Dimension(800, 600));
		getContentPane().setMinimumSize(new Dimension(1200, 600));
		setSize(new Dimension(800, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 65));
		panel_1.setMinimumSize(new Dimension(10, 65));
		panel_1.setSize(new Dimension(0, 50));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.DARK_GRAY, null));
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(null);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int Option = JOptionPane.showConfirmDialog(null, "Deseja Sair da aplicação mesmo? ",null,
					JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(Option == JOptionPane.YES_OPTION){
					System.exit(0);
					}
				 }
		});
		btnSair.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		btnSair.setMinimumSize(new Dimension(97, 40));
		btnSair.setMaximumSize(new Dimension(97, 45));
		btnSair.setPreferredSize(new Dimension(97, 40));
		btnSair.setBounds(796, 13, 97, 39);
		panel_1.add(btnSair);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.DARK_GRAY, null));
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Mainwindow.class.getResource("/iconi_grande/fotoPrincipal.png")));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, Color.BLUE));
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		fotoprincipal();
		criaPrincipal();

	}

	/**
	 * Create the frame.
	 * 
	 * @param ResultSet
	 */
	public void criaPrincipal() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Cadastro de Alunos");
																
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(0, 50));
		menuBar.setMinimumSize(new Dimension(0, 50));
		menuBar.setMaximumSize(new Dimension(0, 50));
		menuBar.setAlignmentY(Panel.CENTER_ALIGNMENT);
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mnArquivo.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mnArquivo.setToolTipText("Cadastramentos");
		mnArquivo.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmCadastro.setToolTipText("Cadastar novo aluno e responsáveis.");
		mntmCadastro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnArquivo.add(mntmCadastro);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArquivo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmAbrir.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmAbrir.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmAbrir.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmAbrir.setEnabled(false);
		mnArquivo.add(mntmAbrir);

		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		 mntmSalvar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmSalvar.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmSalvar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmSalvar.setEnabled(false);
		mnArquivo.add(mntmSalvar);

		JMenuItem mntmSalvarComo = new JMenuItem("Salvar Como");
		 mntmSalvarComo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmSalvarComo.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmSalvarComo.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmSalvarComo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmSalvarComo.setEnabled(false);
		mnArquivo.add(mntmSalvarComo);

		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mntmFechar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmFechar.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmFechar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmFechar.setEnabled(false);
		mnArquivo.add(mntmFechar);

		JMenuItem mntmFecharTudo = new JMenuItem("Fechar Tudo");
		mntmFecharTudo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmFecharTudo.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmFecharTudo.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmFecharTudo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmFecharTudo.setEnabled(false);
		mnArquivo.add(mntmFecharTudo);

		JSeparator separator_1 = new JSeparator();
		mnArquivo.add(separator_1);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmSair.setToolTipText("Sair da Aplicação.");
		mntmSair.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnArquivo.add(mntmSair);

		JMenu mntmEditar = new JMenu("Editar");
		mntmEditar.setToolTipText("Edição de documentos.\r\nHabilitado no modulo 2.");
		mntmEditar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		menuBar.add(mntmEditar);

		JMenuItem mntmDesfazer = new JMenuItem("Desfazer");
		mntmDesfazer.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmDesfazer.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmDesfazer.setEnabled(false);
		mntmEditar.add(mntmDesfazer);

		JMenuItem mntmRefazer = new JMenuItem("Refazer");
		mntmRefazer.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmRefazer.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmRefazer.setEnabled(false);
		mntmEditar.add(mntmRefazer);

		JSeparator separator_2 = new JSeparator();
		mntmEditar.add(separator_2);

		JMenuItem mntmRecortar = new JMenuItem("Recortar");
		mntmRecortar.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmRecortar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmRecortar.setEnabled(false);
		mntmEditar.add(mntmRecortar);

		JMenuItem mntmColar = new JMenuItem("Colar");
		mntmColar.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmColar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmColar.setEnabled(false);
		mntmEditar.add(mntmColar);

		JSeparator separator_3 = new JSeparator();
		mntmEditar.add(separator_3);

		JMenuItem mntmApagar = new JMenuItem("Apagar");
		mntmApagar.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmApagar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mntmApagar.setEnabled(false);
		mntmEditar.add(mntmApagar);

		JMenu mnProcurar = new JMenu("Procurar");
		mnProcurar.setToolTipText("Procurar dados");
		mnProcurar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		menuBar.add(mnProcurar);

		JMenuItem mntmCadastroAlunos = new JMenuItem("Cadastro Alunos");
		mntmCadastroAlunos.setEnabled(false);
		mntmCadastroAlunos.setToolTipText("Procura Alunos na base de dados.");
		mntmCadastroAlunos.setFont(new Font("Dialog", Font.PLAIN, 18));
		mnProcurar.add(mntmCadastroAlunos);

		JMenuItem mntmPesquisaAvancada = new JMenuItem("Pesquisa Avançada");
		mntmPesquisaAvancada.setEnabled(false);
		mntmPesquisaAvancada.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mntmPesquisaAvancada.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		mntmPesquisaAvancada.setToolTipText("Pesquisa sobre o aluno e seus paise responsáveis.");
		mntmPesquisaAvancada.setFont(new Font("Dialog", Font.PLAIN, 18));
		mnProcurar.add(mntmPesquisaAvancada);

		JMenu mnImpressora = new JMenu("Impressora");
		mnImpressora.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		menuBar.add(mnImpressora);

		JMenuItem mntmConfigurarImpressora = new JMenuItem("Configurar impressora");
		mntmConfigurarImpressora.setToolTipText("Habilitado na nova verão do aplicativo.");
		mntmConfigurarImpressora.setFont(new Font("Dialog", Font.PLAIN, 18));
		mntmConfigurarImpressora.setEnabled(false);
		mnImpressora.add(mntmConfigurarImpressora);
		
		mntmCadastro.addActionListener(new mntmCadastroActionListener());
		mntmSair.addActionListener(new mntmSairActionListener());

	}
	

	@SuppressWarnings("static-method")
	public void fotoprincipal(){

		Icon img = new ImageIcon(
				"B:\\WorkspaceSVN\\br.com.alunosproject\\imagem\\wallpaper-coffee-1024x576.jpg");
		JLabel fotoPrincipal = new JLabel();
		fotoPrincipal.setIcon(img);

	}



	// listener of menu start here.

	private class mntmCadastroActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ev) {
			try {
				Aluno a = new Aluno();
				CadastroAlunos cadastro = new  CadastroAlunos();
				a.setStatusTelacadastro("standby");
				cadastro.setVisible(true);
				
		//		Tela_de_Consulta consulta = new Tela_de_Consulta(cadastro);
		//		consulta.setVisible(true);
			} catch (Exception o) {
			o.printStackTrace();
			}
		}
	}
	
	private class mntmSairActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			int Option = JOptionPane.showConfirmDialog(null, "Deseja Sair da aplicação mesmo? ",null,
					JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(Option == JOptionPane.YES_OPTION){
			System.exit(0);
			}
		}
	}


	public Image getImage(String path) {
		URL imageURL = getClass().getResource(path);
		if (imageURL == null)
			return null;
		return new ImageIcon(imageURL).getImage();
	}

	/**
	 * ; Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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
