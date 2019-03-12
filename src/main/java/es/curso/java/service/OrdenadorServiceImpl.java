package es.curso.java.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import es.curso.java.domain.Ordenador;
import es.curso.java.repository.OrdenadorRepository;

@Service
@Validated
public class OrdenadorServiceImpl implements OrdenadorService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrdenadorServiceImpl.class);
	private final OrdenadorRepository ordenadorRepository;
	
	public OrdenadorServiceImpl(final OrdenadorRepository ordenadorRepository) {
		this.ordenadorRepository = ordenadorRepository;
	}

	@Override
	@Transactional
	public Ordenador save(Ordenador ordenador) {
		LOGGER.debug("Creatint {}", ordenador);
		return ordenadorRepository.save(ordenador);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Ordenador> getList() {
		LOGGER.debug("Retrieving the list of all users");
		return ordenadorRepository.findAll();
	}

}
