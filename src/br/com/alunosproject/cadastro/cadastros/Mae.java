package br.com.alunosproject.cadastro.cadastros;

public class Mae extends Pessoa {
	private static int idMae;
	private String cpfMae;
	private String rgMae;
	private String nomeMae;
	private String dataNascimentoMae;
	private String profissaoMae;
	private String localTrabalhoMae;
	private String nacionalidadeMae;
	private String naturalidadeMae;
	private String enderecoMae;
	private String bairroMae;
	private String cidadeMae;
	private String estadoMae;
	private String cepMae;
	private String telefoneMae; 
	private String celularMae;  
	private String fonetrabalhoMae; // job phone
	private String emailMae;
	private String email2Mae;
	private String emailTrabalhoMae;
	private String localTrabalho;
	private int flagMae = 2;
	private int status = 1;
	
	
	public Mae(){
		this.setNomeMae(nomeMae);
		this.setCpfMae(cpfMae);
		this.setRgMae(rgMae);
		this.setProfissaoMae(profissaoMae);
		this.setLocalTrabalhoMae(localTrabalhoMae);
		this.setRuaMae(enderecoMae);
		this.setBairroMae(bairroMae);
		this.setCidadeMae(cidadeMae);
		this.setEstadoMae(estadoMae);
		this.setCepMae(cepMae);
		this.setTelefoneMae(telefoneMae);
		this.setCelularMae(celularMae);
		this.setFoneTrabalhoMae(fonetrabalhoMae);
		this.setEmailMae(emailMae);
		this.setEmail2Mae(email2Mae);
		this.setEmailTrabalhoMae(emailTrabalhoMae);
		this.setFlagMae(flagMae);
		
	}
	
	public void setRgMae(String rgMae) {
		this.rgMae = rgMae;
		
	}

	
	public String getRgMae() {
		return rgMae;
	}

	public void setProfissaoMae(String profissaoMae) {
		this.profissaoMae = profissaoMae;
		
	}

	public String getProfissaoMae() {
		return profissaoMae;
	}

	public String getLocalTrabalhoMae() {
		return localTrabalhoMae;
	}

	public void setLocalTrabalhoMae(String localTrabalhoMae) {
		this.localTrabalhoMae = localTrabalhoMae;
	}

	public String getEnderecoMae() {
		return enderecoMae;
	}

	public void setEnderecoMae(String enderecoMae) {
		this.enderecoMae = enderecoMae;
	}

	public void setCpfMae(String cpfMae) {
		this.cpfMae = cpfMae;
	}
	
	public String getCpfMae(){
		return cpfMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomeMae(){
		return nomeMae;
	}
	


	public String getRuaMae() {
		return enderecoMae;
	}

	public void setRuaMae(String ruaMae) {
		this.enderecoMae = ruaMae;
	}

	public void setBairroMae(String bairroMae) {
		this.bairroMae = bairroMae;
		
	}
	
	public String getBairroMae(){
		return bairroMae;
	}
	
	public void setCidadeMae(String cidadeMae) {
		this.cidadeMae = cidadeMae;		
	}
	
	public String getCidadeMae(){
		return cidadeMae;
	}


	public String getEstadoMae() {
		return estadoMae;
	}

	public void setEstadoMae(String estadoMae) {
		this.estadoMae = estadoMae;
	}

	public String getCepMae() {
		return cepMae;
	}

	public void setCepMae(String cepMae) {
		this.cepMae = cepMae;
	}

	public void setCelularMae(String celularMae) {
		this.celularMae = celularMae;		
	}
	
	public String getCelularMae(){
		return celularMae;
	}
	
	public void setEmailMae(String emailMae) {
		this.emailMae = emailMae;
		
	}
	
	public String getEmailMae(){
		return emailMae;
	}
	
	public String getEmail2Mae() {
		return email2Mae;
	}

	public void setEmail2Mae(String email2Mae) {
		this.email2Mae = email2Mae;
	}

	public String getEmailTrabalhoMae() {
		return emailTrabalhoMae;
	}

	public void setEmailTrabalhoMae(String emailTrabalhoMae) {
		this.emailTrabalhoMae = emailTrabalhoMae;
	}

	public String getTelefoneMae() {
		return telefoneMae;
	}

	public void setTelefoneMae(String telefoneMae) {
		this.telefoneMae = telefoneMae;
	}

	public String getfoneTrabalhoMae() {
		return fonetrabalhoMae;
	}

	public void setFoneTrabalhoMae(String foneTrabalhoMae) {
		this.fonetrabalhoMae = foneTrabalhoMae;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}


	
	public String getFonetrabalhoMae() {
		return fonetrabalhoMae;
	}

	public void setFonetrabalhoMae(String fonetrabalhoMae) {
		this.fonetrabalhoMae = fonetrabalhoMae;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getFlagMae() {
		return flagMae;
	}

	public void setFlagMae(int flagMae) {
		this.flagMae = flagMae;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}



	public static String getCpf() {
		return Mae.getCpf();
	}

	public static void setCpf(String cpf) {
		Mae.setCpf(cpf);
	}

	@Override
	public String getRg() {
		return super.getRg();
	}

	@Override
	public void setRg(long rg) {
		super.setRg(rg);
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public String getIdade() {
		return super.getIdade();
	}

	@Override
	public void setIdade(String idade) {
		super.setIdade(idade);
	}

	@Override
	public String getSexo() {
		return super.getSexo();
	}

	@Override
	public void setSexo(String sexo) {
		super.setSexo(sexo);
	}

	public String getDataNascimentoMae() {
		return dataNascimentoMae;
	}

	public void setDataNascimentoMae(String dataNascimentoMae) {
		this.dataNascimentoMae = dataNascimentoMae;
	}

	public String getNacionalidadeMae() {
		return nacionalidadeMae;
	}

	public void setNacionalidadeMae(String nacionalidadeMae) {
		this.nacionalidadeMae = nacionalidadeMae;
	}

	public String getNaturalidadeMae() {
		return naturalidadeMae;
	}

	public void setNaturalidadeMae(String naturalidadeMae) {
		this.naturalidadeMae = naturalidadeMae;
	}

	public static int getIdMae() {
		return idMae;
	}

	public static void setIdMae(int idMae) {
		Mae.idMae = idMae;
	}


}
