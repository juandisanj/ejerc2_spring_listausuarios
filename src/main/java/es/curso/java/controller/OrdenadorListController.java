package es.curso.java.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.curso.java.service.OrdenadorService;

@Controller
public class OrdenadorListController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrdenadorListController.class);
	private final OrdenadorService ordenadorService;
	
	@Inject
	public OrdenadorListController(OrdenadorService ordenadorService) {
		this.ordenadorService = ordenadorService;
	}
	
	@RequestMapping(value="/ordenador_list.html", method=RequestMethod.GET)
	public ModelAndView getListOrdenadoresView() {
		LOGGER.debug("Error showing list computers");
		ModelMap model = new ModelMap();
		model.addAttribute("listOrdenadores", ordenadorService.getList());
		return new ModelAndView("ordenador_list", model);
	}

}
