package es.curso.java.service;

import java.util.List;

import es.curso.java.domain.Ordenador;

public interface OrdenadorService {
	
	public Ordenador save(Ordenador ordenador);
	
	List<Ordenador> getList();

}
