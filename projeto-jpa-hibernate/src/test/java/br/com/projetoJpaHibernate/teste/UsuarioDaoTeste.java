package br.com.projetoJpaHibernate.teste;

import org.junit.Test;

import br.com.projetoJpaHibernate.dao.DaoGeneric;
import br.com.projetoJpaHibernate.model.UsuarioPessoa;

public class UsuarioDaoTeste {

	// @Test
	public void usuarioDaoTestSalvar() {

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

	// @Test
	public void usuarioDaoTestBuscar() {

		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(2L);

		pessoa = daoGeneric.pesquisar(pessoa);

		/* Imprimi o toString */
		System.out.println(pessoa);
	}

	// @Test
	public void usuarioDaoTestBuscar2() {

		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L, UsuarioPessoa.class);

		/* Imprimi o toString */
		System.out.println(pessoa);
	}

	@Test
	public void usuarioDaoTestAtualizar() {

		// Cria o entityManager
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		// Busca o usuário pelo id
		UsuarioPessoa pessoa = daoGeneric.pesquisar(2L, UsuarioPessoa.class);
		
		// Seta novos valores
		pessoa.setIdade(27);
		pessoa.setEmail("psilva@gmail.com");
		
		// Chama o método atualizar
		pessoa = daoGeneric.atualizar(pessoa);

		/* Imprimi o toString */
		System.out.println(pessoa);
	}

}
