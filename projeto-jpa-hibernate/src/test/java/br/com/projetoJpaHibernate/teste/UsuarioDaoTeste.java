package br.com.projetoJpaHibernate.teste;

import org.junit.Test;

import br.com.projetoJpaHibernate.dao.DaoGeneric;
import br.com.projetoJpaHibernate.model.UsuarioPessoa;

public class UsuarioDaoTeste {
	
	@Test
	public void usuarioDaoTest() {
		
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setNome("Paula");
		pessoa.setSobrenome("Silva");
		pessoa.setEmail("paula@gmail.com");
		pessoa.setLogin("paula-silva");
		pessoa.setSenha("123");
		pessoa.setIdade(34);
		
		daoGeneric.salvar(pessoa);
	}

}
