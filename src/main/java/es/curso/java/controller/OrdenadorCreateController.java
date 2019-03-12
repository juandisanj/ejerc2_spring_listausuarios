package es.curso.java.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.curso.java.domain.Ordenador;
import es.curso.java.domain.OrdenadorCreateForm;
import es.curso.java.service.OrdenadorService;

@Controller
public class OrdenadorCreateController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrdenadorCreateController.class);
	private final OrdenadorService ordenadorService;
//	private final OrdenadorCreateFormPasswordValidator passwordValidator;
	
	@Inject
	public OrdenadorCreateController(OrdenadorService ordenadorService) {
		this.ordenadorService = ordenadorService;
		// inicializar el validador
	}
	
	// @InitBinder para añadir la validación
	
	@RequestMapping(value="/ordenador_create.html", method=RequestMethod.GET)
	public ModelAndView getCreateOrdenadorView() {
		LOGGER.debug("Received request for ordenador create view");
		return new ModelAndView("ordenador_create", "ordenadorForm", new OrdenadorCreateForm());
	}
	
	@RequestMapping(value="/ordenador_create.html", method = RequestMethod.POST)
	public String createOrdenador(@ModelAttribute("ordenadorForm") @Valid OrdenadorCreateForm ordenadorForm, BindingResult result) {
		LOGGER.debug("Received request to create {}, with result={}", ordenadorForm, result);
		if(result.hasErrors()) {
			return "ordenador_create";
		}
		try {
			ordenadorService.save(new Ordenador(ordenadorForm.getId(), ordenadorForm.getMarca(), ordenadorForm.getModelo(), ordenadorForm.getPassword1()));
		}catch(Exception e) {
			LOGGER.debug("Tried to create ordenador with existing id", e);
			result.reject("ordenador.error.exists"); // ********************************** PENDIENTE AÑADIR EL VALIDADOR
			return "ordenador_create";
		}
		return "redirect:/ordenador_list.html";
	}

}
