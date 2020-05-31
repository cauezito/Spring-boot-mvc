package br.com.cauezito.curso.boot.web.error;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyErrorView implements ErrorViewResolver {

	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> map) {
		/*status:404
		error:Not Found
		message:No message available
		path:/departamentos/lis
		Como?
		map.forEach((k,v) -> System.out.println(k + ":" + v + "\n"));*/
		
		ModelAndView model = new ModelAndView("/error");
		model.addObject("status", status.value());
		switch (status.value()) {
		case 404:
			model.addObject("error","Página não encontrada.");
			model.addObject("message", "A URL para a página '" + map.get("path") + "' não existe!");
			break;
		case 500:
			model.addObject("error","Ocorreu um erro interno no servidor.");
			model.addObject("message", "Erro inesperado, tente mais tarde.");
			break;
		default:
			model.addObject("error", map.get("error"));
			model.addObject("message", map.get("message"));
			break;
		}
		return model;
		
	}

}
