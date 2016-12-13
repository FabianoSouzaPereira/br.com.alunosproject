package br.com.alunosproject.cadastro.cadastros;

public class Responsaveis {

	
	private static int id;
	private int matricula;
	private String nome;
	private String apelido;
	private String idade;
	private String tempo;
	private String sexo;
	private String pai;
	private String mae;
	private String outroResponsavel;
	private String dataNascimento;
	private String nacionalidade;
	private String naturalidade;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String relacionamentoAfetivo;
	private String informacaoAdicional;
	private String dataCadastro;
	private String dataAtualizacao;
	private String telefone;
	private String Celular;
	
	
	public Responsaveis(){
		Responsaveis.setId(id);
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setApelido(apelido);
		this.setIdade(idade);
		this.setTempo(tempo);
		this.setSexo(sexo);
		this.setPai(pai);
		this.setMae(mae);
		this.setOutroResponsavel(outroResponsavel);
		this.setDataNascimento(dataNascimento);
		this.setNacionalidade(nacionalidade);
		this.setNaturalidade(naturalidade);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setCep(cep);
		this.setRelacionamentoAfetivo(relacionamentoAfetivo);
		this.setInformacaoAdicional(informacaoAdicional);
		this.setDataCadastro(dataCadastro);
		this.setDataAtualizacao(dataAtualizacao);
		this.setTelefone(telefone);
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Responsaveis.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getOutroResponsavel() {
		return outroResponsavel;
	}
	public void setOutroResponsavel(String outroResponsavel) {
		this.outroResponsavel = outroResponsavel;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRelacionamentoAfetivo() {
		return relacionamentoAfetivo;
	}
	public void setRelacionamentoAfetivo(String relacionamentoAfetivo) {
		this.relacionamentoAfetivo = relacionamentoAfetivo;
	}
	public String getInformacaoAdicional() {
		return informacaoAdicional;
	}
	public void setInformacaoAdicional(String informacaoAdicional) {
		this.informacaoAdicional = informacaoAdicional;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	

	
}
