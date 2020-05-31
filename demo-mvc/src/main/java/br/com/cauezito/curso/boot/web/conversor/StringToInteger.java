package br.com.cauezito.curso.boot.web.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToInteger implements Converter<String, Integer> {

	@Override
	public Integer convert(String text) {
		//Remove espaços em branco no final da String
		text = text.trim();
		//+ = várias aparições de dígitos entre 0 e 9
		if(text.matches("[0-9]+")) {
			return Integer.valueOf(text);
		}
		return null;
	}

}