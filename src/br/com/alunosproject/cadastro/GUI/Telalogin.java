package br.com.alunosproject.cadastro.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.alunosproject.dao.Conexao;

import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Telalogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField tfPassword;
	private String usuario;
	private String senha;
	private String bloqueio;
	private String status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telalogin frame = new Telalogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Telalogin() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				Conexao conn = new Conexao();

			}
		});
		setBackground(new Color(204, 204, 0));
		setTitle("Faça o login antes de usar o sistema");
		setExtendedState(Frame.ICONIFIED);
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfLogin = new JTextField();
		tfLogin.setMinimumSize(new Dimension(6, 30));
		tfLogin.setPreferredSize(new Dimension(6, 30));
		tfLogin.setBounds(167, 66, 116, 30);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfPassword = new JTextField();
		tfPassword.setMinimumSize(new Dimension(6, 30));
		tfPassword.setPreferredSize(new Dimension(6, 30));
		tfPassword.setBounds(167, 113, 116, 30);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);
		
		JLabel lblUser = new JLabel("Usuário");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUser.setBounds(86, 69, 69, 16);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(86, 116, 69, 16);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setMaximumSize(new Dimension(97, 30));
		btnNewButton.setMinimumSize(new Dimension(97, 30));
		btnNewButton.setBounds(167, 168, 116, 45);
		contentPane.add(btnNewButton);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(String bloqueio) {
		this.bloqueio = bloqueio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
