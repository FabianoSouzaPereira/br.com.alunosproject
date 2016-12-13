package Midia;


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserDialog {
  public static void abrirFile() {
    JFileChooser fileopen = new JFileChooser();
    FileFilter filter = new FileNameExtensionFilter("*.txt", "txt");
    FileFilter filter1 = new FileNameExtensionFilter("*.docx","docx");
    FileFilter filter2 = new FileNameExtensionFilter("*.html","html");
    FileFilter filter3 = new FileNameExtensionFilter("*.pdf","pdf");
    FileFilter filter4 = new FileNameExtensionFilter("*.jpg","jpg");
    fileopen.addChoosableFileFilter(filter);
    fileopen.addChoosableFileFilter(filter1);
    fileopen.addChoosableFileFilter(filter2);
    fileopen.addChoosableFileFilter(filter3);
    fileopen.addChoosableFileFilter(filter4);

    int ret = fileopen.showDialog(null, "Open file");
    if (ret == JFileChooser.APPROVE_OPTION) {
      File file = fileopen.getSelectedFile();
      System.out.println(file);
    }
  }
}
    