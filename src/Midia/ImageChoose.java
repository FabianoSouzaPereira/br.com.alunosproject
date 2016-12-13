package Midia;


import java.awt.image.BufferedImage;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import br.com.alunosproject.dao.Conexao;
import br.com.alunosproject.cadastro.GUI.AlunoCadastrarJframe;
import br.com.alunosproject.cadastro.GUI.Mainwindow;
import br.com.alunosproject.cadastro.cadastros.Aluno;

public class ImageChoose {
	
	  public static void abrirImage() throws Throwable {
		    JFileChooser fc = new JFileChooser();

		    FileFilter filter = new FileNameExtensionFilter("*.jpg","jpg");
		    FileFilter filter1 = new FileNameExtensionFilter("*.jpeg","jpeg");
		    FileFilter filter2 = new FileNameExtensionFilter("*.bmp","bmp");
		    fc.addChoosableFileFilter(filter);
		    fc.addChoosableFileFilter(filter1);
		    fc.addChoosableFileFilter(filter2);
		    Mainwindow frame = new Mainwindow();
		    Aluno aluno = new Aluno();
		    Aluno.setPastaImg("C:\\Users\\Fabiano\\Pictures\\");
		    if(fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION){
			    String foto = (fc.getSelectedFile().getAbsolutePath());
			    Aluno.setCaminhofoto(foto);
		    try {
		    	BufferedImage img = ImageIO.read(fc.getSelectedFile());
				ImageIO.write(img,"jpg",new File(Aluno.getPastaImg(),(frame.getTabela().getModel().getColumnName(Id) )+".jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}   
    
	    }
		    
		  /*  int ret = fileopen.showDialog(null, "Abrir Imagem");
		    if (ret == JFileChooser.APPROVE_OPTION) {
		      File file = fileopen.getSelectedFile();
		      Aluno aluno = Aluno();
		      aluno.setFoto(file); 
		    }
		  }*/
		}
		  
}
