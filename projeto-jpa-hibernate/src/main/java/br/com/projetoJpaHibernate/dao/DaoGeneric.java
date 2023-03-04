package br.com.projetoJpaHibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.projetoJpaHibernate.util.HibernateUtil;

public class DaoGeneric<E> {

	/* Cria um entityManager para abrir a conexão com o banco de dados 
	 * para prover a parte de persistência */
	private EntityManager entityManager = HibernateUtil.geEntityManager();
	
	public void salvar(E entidade) {
		
		/* Captura uma transação para a criação do entityManager */
		EntityTransaction transaction = entityManager.getTransaction();
		
		/* Abrir a transação */
		transaction.begin();
		
		/* Persistir no banco os dados do usuário*/
		entityManager.persist(entidade);
		
		/* Salva (ou comita) no banco de dados */
		transaction.commit();
	}
	
	public E pesquisar(E entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		
		E pesquisa = (E) entityManager.find(entidade.getClass(), id);
		return pesquisa;
	}
	
	public E pesquisar(Long id, Class<E> entidade) {
		
		E pesquisa = (E) entityManager.find(entidade, id);
		return pesquisa;
	}
}
