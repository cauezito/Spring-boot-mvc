package br.com.cauezito.curso.boot.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.cauezito.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	/*@Override
	public List<Funcionario> findByNome(String nome) {
		//consulta JPQL
		TypedQuery<Funcionario> query = getEntityManager().createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
		//inclusão do parâmetro
		query.setParameter("nome", nome);		
		return query.getResultList();
	}*/
	
	public List<Funcionario> findByNome(String nome){
		return createQuery("select f from Funcionario f where f.nome like concat ('%', ?1, '%') " , nome);
	}

}
