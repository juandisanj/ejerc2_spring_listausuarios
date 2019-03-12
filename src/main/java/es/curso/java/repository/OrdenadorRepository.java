package es.curso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.java.domain.Ordenador;

public interface OrdenadorRepository extends JpaRepository<Ordenador, String> {

}
