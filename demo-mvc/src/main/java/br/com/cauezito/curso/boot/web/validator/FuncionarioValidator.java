package br.com.cauezito.curso.boot.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.cauezito.curso.boot.domain.Funcionario;

public class FuncionarioValidator implements Validator {

	//valida o objeto recebido
	@Override
	public boolean supports(Class<?> clazz) {
		//Clazz = objeto que temos no formulário
		//Compara se a classe que está esperando é do mesmo tipo do argumento clazz.
		//Se sim, o método vai para o validate.
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {		
		Funcionario f = (Funcionario) object;		
		LocalDate entrada = f.getDataEntrada();		
		if (f.getDataSaida() != null) {
			if (f.getDataSaida().isBefore(entrada)) {
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
			}
		}
	}

}
