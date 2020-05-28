package br.com.cauezito.curso.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.cauezito.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
