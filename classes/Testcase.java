package classes;

import org.junit.Assert;
import org.junit.Test;

import br.com.alunosproject.cadastro.cadastros.Aluno;


public class Testcase {

	@Test
	public void cadastrar() {
		Aluno a  = new Aluno();
		a.setMatricula(Integer.valueOf("1"));
		a.setNome("ANITA GARIBALDE");
		a.setApelido("ANINHA");
		a.setIdade("3");
		a.setCbIdade("ANOS");
		a.setSexo("MASCULINO");
		a.setDataNasc("2007-12-12");
		a.setNacionalidade("BRASILEIRA");
		a.setNaturalidade("SÃO JOSÉ");
		a.setPai("CARLOS FONSECA");
		a.setMae("PAULO COSTA");
		a.setOutResp("NÃO HÁ");
		a.setEndereco("PEDRO COSTA");
		a.setBairro("CENTRO");
		a.setCidade("MONTENEGRO");
		a.setCep("88032010");
		a.setRelAfetivo("NADA CONSTA");
		a.setInfoAdicional("TUDO CONSTA NA ATA DO ALUNO.");
		a.setDataCadastro("2016-12-12");
		a.setDataAtualizacao("2016-12-10");
		a.setFoto("x");
		a.setTelefone("4732324323");
		a.setCelular("4896965849");

		Assert.assertEquals("ANITA GARIBALDE",a.getNome());
	}

}
