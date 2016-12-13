package br.com.alunosproject.cadastro.cadastros;

public class Pai extends Pessoa{
	private static int idPai;
	private String cpfPai;
	private String rgPai;
	private String nomePai;
	private String enderecoPai;
	private String bairroPai;
	private String cidadePai;
	private String estadoPai;
	private String cepPai;
	private String profissaoPai;
	private String dataNascimentoPai;
	private String nacionalidadePai;
	private String naturalidadePai;
	private String localtrabalhoPai;
	private String telefonePai;
	private String celularPai;
	private String foneTabalhoPai;
	private String emailPai;
	private String email2Pai;
	private String emailTrabalhoPai;
	private int flagPai = 1;
	private int status = 1;
	
	public Pai(){
		this.setCpfPai(cpfPai);
		this.setRgPai(rgPai);
		this.setNomePai(nomePai);
		this.setEnderecoPai(enderecoPai);
		this.setBairroPai(bairroPai);
		this.setCidadePai(cidadePai);
		this.setEstadoPai(estadoPai);
		this.setCepPai(cepPai);
		this.setProfissaoPai(profissaoPai);
		this.setDataNascimentoPai(dataNascimentoPai);
		this.setNacionalidadePai(nacionalidadePai);
		this.setNaturalidadePai(naturalidadePai);
		this.setLocaltrabalhaoPai(localtrabalhoPai);
		this.setStatus(status);
		this.setTelefonePai(telefonePai);
		this.setCelularPai(celularPai);
		this.setFoneTabalhoPai(foneTabalhoPai);
		this.setEmailPai(emailPai);
		this.setEmail2Pai(email2Pai);
		this.setEmailTrabalhoPai(emailTrabalhoPai);
		this.setFlagPai(flagPai);
	}
	
	public String getCpfPai() {
		return cpfPai;
	}
	public void setCpfPai(String string) {
		this.cpfPai = string;
	}
	public String getRgPai() {
		return rgPai;
	}

	public void setRgPai(String rgPai) {
		this.rgPai = rgPai;
	}

	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getEndPai() {
		return enderecoPai;
	}
	public void setEndPai(String enderecoPai) {
		this.enderecoPai = enderecoPai;
	}
	public String getBairroPai() {
		return bairroPai;
	}
	public void setBaiPai(String bairroPai) {
		this.bairroPai = bairroPai;
	}
	public String getCidPai() {
		return cidadePai;
	}
	public void setCidPai(String cidadePai) {
		this.cidadePai = cidadePai;
	}
	public String getEstPai() {
		return estadoPai;
	}
	public void setEstPai(String estPai) {
		this.estadoPai = estPai;
	}
	public String getCepPai() {
		return cepPai;
	}
	public void setCepPai(String cepPai) {
		this.cepPai = cepPai;
	}
	public String getProfissaoPai() {
		return profissaoPai;
	}
	public void setProfissaoPai(String profissaoPai) {
		this.profissaoPai = profissaoPai;
	}
	public String getDataNascimentoPai() {
		return dataNascimentoPai;
	}
	public void setDataNascimentoPai(String dataNascimentoPai) {
		this.dataNascimentoPai = dataNascimentoPai;
	}
	public String getNascionalidadePai() {
		return nacionalidadePai;
	}
	public void setNascionalidadePai(String nacionalidadePai) {
		this.nacionalidadePai = nacionalidadePai;
	}
	public String getNaturalidadePai() {
		return naturalidadePai;
	}
	public void setNaturalidadePai(String naturalidadePai) {
		this.naturalidadePai = naturalidadePai;
	}
	public String getLocaltrabalhoPai() {
		return localtrabalhoPai;
	}
	public void setLocaltrabalhaoPai(String localtrabalhoPai) {
		this.localtrabalhoPai = localtrabalhoPai;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getEnderecoPai() {
		return enderecoPai;
	}
	public void setEnderecoPai(String enderecoPai) {
		this.enderecoPai = enderecoPai;
	}
	public String getCidadePai() {
		return cidadePai;
	}
	public void setCidadePai(String cidadePai) {
		this.cidadePai = cidadePai;
	}
	public String getEstadoPai() {
		return estadoPai;
	}
	public void setEstadoPai(String estadoPai) {
		this.estadoPai = estadoPai;
	}
	public String getNacionalidadePai() {
		return nacionalidadePai;
	}
	public void setNacionalidadePai(String nacionalidadePai) {
		this.nacionalidadePai = nacionalidadePai;
	}
	public String getFoneTabalhoPai() {
		return foneTabalhoPai;
	}
	public void setFoneTabalhoPai(String foneTabalhoPai) {
		this.foneTabalhoPai = foneTabalhoPai;
	}
	public String getEmail2Pai() {
		return email2Pai;
	}
	public void setEmail2Pai(String email2Pai) {
		this.email2Pai = email2Pai;
	}
	public String getEmailTrabalhoPai() {
		return emailTrabalhoPai;
	}
	public void setEmailTrabalhoPai(String emailTrabalhoPai) {
		this.emailTrabalhoPai = emailTrabalhoPai;
	}
	public int getFlagPai() {
		return flagPai;
	}
	public void setFlagPai(int flagPai) {
		this.flagPai = flagPai;
	}
	public void setBairroPai(String bairroPai) {
		this.bairroPai = bairroPai;
	}
	public String getTelefonePai(){
		return telefonePai;
	}
	public void setTelefonePai(String telefonePai) {
		this.telefonePai = telefonePai;
		
	}
	public String getCelularPai(){
		return celularPai;
	}
	public void setCelularPai(String celularPai) {
		this.celularPai = celularPai;
		
	}
	public String getEmailPai(){
		return emailPai;
	}
	public void setEmailPai(String emailPai) {
		this.emailPai = emailPai;
		
	}
	public int getflagPai() {
		return flagPai;
	}

	public static String getCpf() {
		return Pai.getCpf();
	}
	
	public static void setCpf(String cpf) {
		Pai.setCpf(cpf);
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

	public static int getIdPai() {
		return idPai;
	}

	public static void setIdPai(int idPai) {
		Pai.idPai = idPai;
	}

	public void setLocaltrabalhoPai(String localtrabalhoPai) {
		this.localtrabalhoPai = localtrabalhoPai;
	}

	
	
}
