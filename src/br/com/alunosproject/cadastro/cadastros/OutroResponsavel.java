package br.com.alunosproject.cadastro.cadastros;

public class OutroResponsavel extends Pessoa{
	private static int idOutroResp;
	private String cpfOutroResp;
	private String rgOutroResp;
	private String nomeOutroResp;
	private String dataNascimentoOutroResp;
	private String profissaoOutroresp;
	private String localTrabalhoOutroResp;
	private String nacionalidadeOutroResp;
	private String naturalidadeOutroResp;
	private String enderecoOutroResp;
	private String bairroOutroResp;
	private String cidadeOutroResp;
	private String estadoOutroResp;
	private String cepOutroResp;
	private String telefoneOutroResp;
	private String celularOutroResp;
	private String foneTrabalhoOutroResp;
	private String emailOutroResp;
	private String email2OutroResp;
	private String emailTrabalhoOutroResp;
	private int flagOutroResp = 3;
	private int status = 1;
	

	public OutroResponsavel(){
		this.setCpfOutroResp(cpfOutroResp);
		this.setRgOutroResp(rgOutroResp);
		this.setNomeOutroResp(nomeOutroResp);
		this.setEnderecoOutroResp(enderecoOutroResp);
		this.setBairroOutroResp(bairroOutroResp);
		this.setCidadeOutroResp(cidadeOutroResp);
		this.setEstadoOutroResp(estadoOutroResp);
		this.setCepOutroResp(cepOutroResp);
		this.setProfissaoOutroresp(profissaoOutroresp);
		this.setDataNascimentoOutroResp(dataNascimentoOutroResp);
		this.setNacionalidadeOutroResp(nacionalidadeOutroResp);
		this.setNaturalidadeOutroResp(naturalidadeOutroResp);
		this.setLocalTrabalhoOutroResp(localTrabalhoOutroResp);
		this.setTelefoneOutroResp(telefoneOutroResp);
		this.setCelularOutroResp(celularOutroResp);
		this.setFoneTrabalhoOutroResp(foneTrabalhoOutroResp);
		this.setEmailOutroResp(emailOutroResp);
		this.setEmail2OutroResp(email2OutroResp);
		this.setEmailTrabalhoOutroResp(emailTrabalhoOutroResp);
		this.setFlagOutroResp(flagOutroResp);
		this.setStatus(status);
		
	}

	public String getNomeOutroResp() {
		return nomeOutroResp;
	}

	public void setNomeOutroResp(String nomeOutroResp) {
		this.nomeOutroResp = nomeOutroResp;
	}

	public String getCpfOutroResp() {
		return cpfOutroResp;
	}

	public void setCpfOutroResp(String cpfOutroResp) {
		this.cpfOutroResp = cpfOutroResp;
	}

	public String getRgOutroResp() {
		return rgOutroResp;
	}

	public void setRgOutroResp(String rgOutroResp) {
		this.rgOutroResp = rgOutroResp;
	}

	public String getProfissaoOutroresp() {
		return profissaoOutroresp;
	}

	public void setProfissaoOutroresp(String profissaoOutroresp) {
		this.profissaoOutroresp = profissaoOutroresp;
	}

	public String getLocalTrabalhoOutroResp() {
		return localTrabalhoOutroResp;
	}

	public void setLocalTrabalhoOutroResp(String localTrabalhoOutroResp) {
		this.localTrabalhoOutroResp = localTrabalhoOutroResp;
	}

	public int getFlagOutroResp() {
		return flagOutroResp;
	}

	public void setFlagOutroResp(int flagOutroResp2) {
		this.flagOutroResp = flagOutroResp2;
	}

	public String getEnderecoOutroResp() {
		return enderecoOutroResp;
	}

	public void setEnderecoOutroResp(String enderecoOutroResp) {
		this.enderecoOutroResp = enderecoOutroResp;
	}

	public String getBairroOutroResp() {
		return bairroOutroResp;
	}

	public void setBairroOutroResp(String bairroOutroResp) {
		this.bairroOutroResp = bairroOutroResp;
	}

	public String getCidadeOutroResp() {
		return cidadeOutroResp;
	}

	public void setCidadeOutroResp(String cidadeOutroResp) {
		this.cidadeOutroResp = cidadeOutroResp;
	}

	public String getEstadoOutroResp() {
		return estadoOutroResp;
	}

	public void setEstadoOutroResp(String estadoOutroResp) {
		this.estadoOutroResp = estadoOutroResp;
	}

	public String getCepOutroResp() {
		return cepOutroResp;
	}

	public void setCepOutroResp(String cepOutroResp) {
		this.cepOutroResp = cepOutroResp;
	}


	public String getDataNascimentoOutroResp() {
		return dataNascimentoOutroResp;
	}

	public void setDataNascimentoOutroResp(String dataNascimentoOutroResp) {
		this.dataNascimentoOutroResp = dataNascimentoOutroResp;
	}

	public String getNacionalidadeOutroResp() {
		return nacionalidadeOutroResp;
	}

	public void setNacionalidadeOutroResp(String nacionalidadeOutroResp) {
		this.nacionalidadeOutroResp = nacionalidadeOutroResp;
	}

	public String getNaturalidadeOutroResp() {
		return naturalidadeOutroResp;
	}

	public void setNaturalidadeOutroResp(String naturalidadeOutroResp) {
		this.naturalidadeOutroResp = naturalidadeOutroResp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTelefoneOutroResp() {
		return telefoneOutroResp;
	}

	public void setTelefoneOutroResp(String telefoneOutroResp) {
		this.telefoneOutroResp = telefoneOutroResp;
	}

	public String getCelularOutroResp() {
		return celularOutroResp;
	}

	public void setCelularOutroResp(String celularOutroResp) {
		this.celularOutroResp = celularOutroResp;
	}

	public String getFoneTrabalhoOutroResp() {
		return foneTrabalhoOutroResp;
	}

	public void setFoneTrabalhoOutroResp(String foneTrabalhoOutroResp) {
		this.foneTrabalhoOutroResp = foneTrabalhoOutroResp;
	}

	public String getEmailOutroResp() {
		return emailOutroResp;
	}

	public void setEmailOutroResp(String emailOutroResp) {
		this.emailOutroResp = emailOutroResp;
	}

	public String getEmail2OutroResp() {
		return email2OutroResp;
	}

	public void setEmail2OutroResp(String email2OutroResp) {
		this.email2OutroResp = email2OutroResp;
	}

	public String getEmailTrabalhoOutroResp() {
		return emailTrabalhoOutroResp;
	}

	public void setEmailTrabalhoOutroResp(String emailTrabalhoOutroResp) {
		this.emailTrabalhoOutroResp = emailTrabalhoOutroResp;
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

	public static String getCpf() {
		return OutroResponsavel.getCpf();
	}

	
	public static void setCpf(String cpf) {
		OutroResponsavel.setCpf(cpf);
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

	public static int getIdOutroResp() {
		return idOutroResp;
	}

	public static void setIdOutroResp(int idOutroResp) {
		OutroResponsavel.idOutroResp = idOutroResp;
	}

}
