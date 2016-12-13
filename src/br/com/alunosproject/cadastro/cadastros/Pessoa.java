package br.com.alunosproject.cadastro.cadastros;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	private static String cpf;
	private String rg;
	private String nome;
	private String idade;
	private String sexo;
	
	/** Retira "-" de qualquer campo */
	public static String splitstring(String splited) {
		if (((splited).length()) != 0) {
			String array[] = splited.split("-");
			splited = array[1];
		}
		return splited;
	}
	
	/** Tira os "-" e coloca "/" e inverte data para apresentar no formulário */
	public static String splitDate(String s) {
		try{
		if (((s).length()) != 0) {
			String array[] = s.split("-");
			String s0 = array[0];
			String s1 = array[1];
			String s2 = array[2];
			s = (s2 + "/" + s1 + "/" + s0);
			}
		}catch(Exception e) {
			 System.out.println("Preencha a data corretamente");  
	          e.printStackTrace();
		}
		return s;

	}
	
	/** substitue "/" por "-" e inverte data para gravar no banco. */
	 public static String joinDate(String o){
		 try{
		 if (!(o.equals("  /  /    "))) {
			 String array [] = o.split("/");
			 String s0 = array[0];
			 String s1 = array[1];
			 String s2 = array[2];
			 o = (s2+"-"+s1+"-"+s0);
			 }else{
				 JOptionPane.showMessageDialog(null, "Preencha a data corretamente");
				 return null;
			 }
		 }catch(Exception e) {
			 System.out.println("Preencha a data corretamente");  
	          e.printStackTrace();
	     }
		 return o;
	 }
	
	 /** tira "." ; "-" ; "(" e ")" da qualquer variavel que vai pro banco. */
	 public static String MaskFormatterPull(String x){
		 try{
			x = x.replace(".", "");
			x = x.replace("-", "");
			x = x.replace("(", "");
			x = x.replace(")", "");
		 }catch(Exception e) {
			 System.out.println("Preencha os campos corretamente");  
	          e.printStackTrace();
		 }
		 return x;
	 }
	 
	 
	 /** Converte a data que vem do banco de yyy-mm-dd para dd/mm/yyyy */
	 public static String converteDataToString(Date data){  
		   SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
		   SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		   data = new Date();
		   try {  
		     return   out.format(in.parse(data.toString()));   
		   } catch (ParseException Ex) {  
		      return "Erro na conversão da data";  
		   }  
		}

	 /**
		 * Converte uma String para um objeto Date. Caso a String seja vazia ou nula, 
		 * retorna null - para facilitar em casos onde formulários podem ter campos
		 * de datas vazios.
		 * @param data String no formato dd/MM/yyyy a ser formatada
		 * @return Date Objeto Date ou null caso receba uma String vazia ou nula
		 * @throws Exception Caso a String esteja no formato errado
		 */
		@SuppressWarnings("cast")
		public static Date formataData(String data) throws Exception { 
			if (data == null || data.equals(""))
				return null;
	        Date date = null;
	        try {
	            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	            date = (java.util.Date)formatter.parse(data);
	        } catch (ParseException e) {            
	            throw e;
	        }
	        return date;
		}
		
		/** Chama data atual do sistema */
		public static String Tempo(){
		    return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		}
		
		
	public static String getCpf() {
		return cpf;
	}
	public static void setCpf(String cpf) {
		Pessoa.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setRg(long rg) {
		// TODO Auto-generated method stub
		
	}

	public void setCpf(long cpf) {
		// TODO Auto-generated method stub
		
	}

}
