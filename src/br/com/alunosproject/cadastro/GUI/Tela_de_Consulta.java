package br.com.alunosproject.cadastro.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.MaskFormatter;

import br.com.alunosproject.cadastro.cadastros.Aluno;
import br.com.alunosproject.cadastro.cadastros.Pessoa;
import br.com.alunosproject.dao.Conexao;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Tela_de_Consulta extends JFrame {

	private JPanel contentPane;
	public static int var;
	private JTextField tfCPF;
	private MaskFormatter ftmttfCPF;

	/**
	 * Create the frame.
	 * 
	 */							
	public Tela_de_Consulta() throws ParseException {
		setPreferredSize(new Dimension(450, 240));
		setMaximumSize(new Dimension(450, 240));
		setTitle("Tela de Consulta do CPF");
		setMinimumSize(new Dimension(450, 240));
		setSize(new Dimension(453, 240));
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 52, 88, 125, 40, 32, 82, 0 };
		gbl_contentPane.rowHeights = new int[] { 40, 30, 37, 0, 29, 42, 47, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		contentPane.add(verticalStrut, gbc_verticalStrut);
		
			JTextPane txt = new JTextPane();
			txt.setEditable(false);
			txt.setForeground(Color.RED);
			txt.setText("Para criar um novo cadastro \r\nverifique primeiro, o cpf do cliente. ");
			txt.setBackground(UIManager.getColor("ColorChooser.background"));
			GridBagConstraints gbc_txt = new GridBagConstraints();
			gbc_txt.gridwidth = 3;
			gbc_txt.insets = new Insets(0, 0, 5, 5);
			gbc_txt.fill = GridBagConstraints.BOTH;
			gbc_txt.gridx = 2;
			gbc_txt.gridy = 1;
			contentPane.add(txt, gbc_txt);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		contentPane.add(horizontalStrut, gbc_horizontalStrut);

		JLabel lblCpf = new JLabel("CPF:");
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.anchor = GridBagConstraints.EAST;
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 2;
		contentPane.add(lblCpf, gbc_lblCpf);

		
			ftmttfCPF  = new MaskFormatter("###.###.###-##");
			tfCPF = new JFormattedTextField(ftmttfCPF);
			tfCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
			tfCPF.setHorizontalAlignment(SwingConstants.CENTER);
			tfCPF.setMinimumSize(new Dimension(70, 35));
			tfCPF.setPreferredSize(new Dimension(70, 35));
			ftmttfCPF.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
			GridBagConstraints gbc_tfCPF = new GridBagConstraints();
			gbc_tfCPF.gridwidth = 2;
			gbc_tfCPF.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCPF.insets = new Insets(0, 0, 5, 5);
			gbc_tfCPF.gridx = 2;
			gbc_tfCPF.gridy = 2;
			contentPane.add(tfCPF, gbc_tfCPF);
			tfCPF.setColumns(10);
				
			JButton btnConsultar = new JButton("Consultar");
			btnConsultar.setMinimumSize(new Dimension(120, 35));
			btnConsultar.setPreferredSize(new Dimension(120, 35));
			btnConsultar.setMaximumSize(new Dimension(120, 35));
			btnConsultar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = Pessoa.MaskFormatterPull(tfCPF.getText());
					if (text == "           " || text.equals("           ")){
						JOptionPane.showMessageDialog(null, "Preencha o campo CPF");
					}else{
						if (tfCPF.getText() != "" ){
						Aluno a = new Aluno();
						Aluno.setCpf(text);
						Conexao conn = new Conexao();
						var=0;
						Aluno.setId(0);
						conn.getIdFromTables(Aluno.getCpf());
						var = Aluno.getId();
						
						if (var != 0){
							JOptionPane.showMessageDialog(null, "CPF já foi cadastrado.");
							a.setStatusTelacadastro("Editar");
							dispose();
						}else{
							int option = JOptionPane.showConfirmDialog(null, "CPF não cadastrado! \n "
									+ "Se deseja Cadastrar um novo aluno, aperte sim. \n"
									+ "Caso deseje repitir a pesquisa digite não. ",null,
									JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
							if(option == JOptionPane.YES_OPTION){
								a.setStatusTelacadastro("Cadastrar");
								Aluno.setMatricula(0);
								conn.getMaximaMatricula();
								dispose();
							}
							if (option == JOptionPane.CANCEL_OPTION){
								a.setStatusTelacadastro("standby");
								dispose();
							}
						}  //close second else

					}
				  }
				}  //close first else
			});
			GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
			gbc_btnConsultar.gridwidth = 2;
			gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
			gbc_btnConsultar.gridx = 2;
			gbc_btnConsultar.gridy = 5;
			contentPane.add(btnConsultar, gbc_btnConsultar);

	}


	public JTextField getTfCPF() {
		return tfCPF;
	}

	public void setTfCPF(JTextField tfCPF) {
		this.tfCPF = tfCPF;
	}

	public static int getVar() {
		return var;
	}

	public static void setVar(int var) {
		Tela_de_Consulta.var = var;
	}


	
}
