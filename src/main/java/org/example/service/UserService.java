package org.example.service;

import org.example.domain.User;

import java.util.List;

public interface UserService {

    User insert(User user);

    List<User> getAll();

    User getById(int id);

    User getByName(String name);

    User update(int id, String name);

    void deleteById(int id);

}
