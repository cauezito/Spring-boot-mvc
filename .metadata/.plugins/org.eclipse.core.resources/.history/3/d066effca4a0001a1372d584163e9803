package br.com.cauezito.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 60)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
