package br.com.cauezito.curso.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.cauezito.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}