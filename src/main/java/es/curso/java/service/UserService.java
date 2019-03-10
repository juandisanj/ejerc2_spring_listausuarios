package es.curso.java.service;

import java.util.List;

import es.curso.java.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
