package br.com.cauezito.curso.boot.domain;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
	//O id é herdado
	@Column(nullable = false, unique = true, length = 60)
	private String nome;

	//O relacionamento entre departamento e cargo é bidirecional, quando isso ocorre, é necessário definir qual o lado
	//fraco e o forte da relação. O forte é o que contém a chave estrangeira e o mappedBy serve para mapear isso.
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

}
