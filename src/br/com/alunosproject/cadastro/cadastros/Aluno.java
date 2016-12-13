package br.com.alunosproject.cadastro.cadastros;

public class Aluno extends Pessoa{
	private int idResp;
	private static int id;
	private static String cpf;
	private static int matricula;
	private String nome;
	private String apelido;
	private String idade;
	private String cbIdade;
	private String sexo;
	private String dataNasc;
	private String pai;
	private String mae;
	private String outResp;
	private String nacionalidade;
	private String naturalidade;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String relAfetivo;
	private String infoAdicional;
	private String dataCadastro;
	private String dataAtualizacao;
	private String foto;
	private String telefone;
	private String celular;
	private String fonetrabalho;
	private String email;
	private String email2;
	private String emailtrabalhoAluno;
	private String flagAluno = "0";
	private int status= 1;
	private static String statusTelacadastro;
	private int linhaSelecionada;
	private String infoMedica;
	private int idTurma;
	private static String caminhofoto;
	private static String pastaImg;
	

	
	
	/** Cria uma lista de alunos. Depois � procurada pelo haschcode e equals
	 *  que trabalham juntos 
	 */
	
		
	public Aluno() {
		Aluno.setId(id);
		this.setIdResp(idResp);
		Aluno.setMatricula(matricula);
		this.setNome(nome);
		this.setApelido(apelido);
		this.setIdade(idade);
		this.setDataNasc(dataNasc);
		this.setSexo(sexo);
		this.setPai(pai);
		this.setMae(mae);
		this.setOutResp(outResp);
		this.setNacionalidade(nacionalidade);
		this.setNaturalidade(naturalidade);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setCep(cep);
		this.setRelAfetivo(relAfetivo);
		this.setInfoMedica(infoMedica);
		this.setInfoAdicional(infoAdicional);
		this.setDataCadastro(dataCadastro);
		this.setDataAtualizacao(dataAtualizacao);
		this.setFoto(foto);
		this.setTelefone(telefone);
		this.setCelular(celular);
		this.setStatus(status);
		this.setStatusTelacadastro(statusTelacadastro);
		this.setLinhaSelecionada(linhaSelecionada);
		Aluno.setCpf(cpf);
		this.setEmailtrabalhoAluno(emailtrabalhoAluno);
		this.setIdTurma(idTurma);
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado(){
		return estado;
	}
	public void setFlagAluno(String flagAluno) {
		this.flagAluno = flagAluno;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Aluno.id = id;
	}
	public static int getMatricula() {
		return matricula;
	}
	public static void setMatricula(int matricula) {
		Aluno.matricula = matricula;
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
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	@Override
	public String getSexo() {
		return sexo;
	}
	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String getIdade() {
		return idade;
	}
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCbIdade() {
		return cbIdade;
	}
	public void setCbIdade(String cbIdade) {
		this.cbIdade = cbIdade;
	}
	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc){
		this.dataNasc = dataNasc;
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
	public String getOutResp() {
		return outResp;
	}
	public void setOutResp(String outResp){
		this.outResp = outResp;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade){
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
	public String getRelAfetivo() {
		
		return relAfetivo;
	}
	public void setRelAfetivo(String relAfetivo) {
		
		this.relAfetivo = relAfetivo;
	}
	public String getInfoAdicional() {
		
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getFoto() {
		
		return foto;
	}
	public void setFoto(String foto) {
		
		this.foto = foto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@SuppressWarnings("static-method")
	public String getStatus(int status) {
		if (status != 0){
			return "Ativo";
		}
		return "Inativo";
	}
	public  void setStatus(int status) {
		this.status = status;
	}
	public  static String getStatusTelacadastro() {
		return statusTelacadastro;
	}
	@SuppressWarnings("static-method")
	public void setStatusTelacadastro(String statusTelacadastro) {
		Aluno.statusTelacadastro = statusTelacadastro;
	}
	public int getLinhaSelecionada() {
		return linhaSelecionada;
	}
	public void setLinhaSelecionada(int linhaSelecionada) {
		this.linhaSelecionada = linhaSelecionada;
	}
	public int getStatus() {
		return status;
	}
	public static String getCaminhofoto() {
		return caminhofoto;
	}
	public static void setCaminhofoto(String caminhofoto) {
		Aluno.caminhofoto = caminhofoto;
	}
	public static String getCpf() {
		return cpf;
	}
	public static void setCpf(String cpf) {
		Aluno.cpf = cpf;
	}
	public static String getPastaImg() {
		return pastaImg;
	}
	public static void setPastaImg(String pastaImg) {
		Aluno.pastaImg = pastaImg;
	}
	public String getFonetrabalho() {
		return fonetrabalho;
	}
	public void setFonetrabalho(String fonetrabalho) {
		this.fonetrabalho = fonetrabalho;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getEmailtrabalhoAluno() {
		return emailtrabalhoAluno;
	}
	public void setEmailtrabalhoAluno(String emailtrabalhoAluno) {
		this.emailtrabalhoAluno = emailtrabalhoAluno;
	}
	public String getFlagAluno() {
		return flagAluno;
	}
	public int getIdResp() {
		return idResp;
	}
	public void setIdResp(int idResp) {
		this.idResp = idResp;
	}
	public String getInfoMedica() {
		return infoMedica;
	}
	public void setInfoMedica(String infoMedica){
		this.infoMedica = infoMedica;
	}



	public int getIdTurma() {
		return idTurma;
	}
	
	public void setIdTurma(int idTurma){
		this.idTurma = idTurma;
	}

	
}
