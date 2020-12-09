package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();
    List<User> getByUserId(int userId);
    List<User> getByAccessLevel (int AccessLevel);
    //save and delete
    User save (User user);
    void delete (int userId);
}
