package es.curso.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.java.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}

