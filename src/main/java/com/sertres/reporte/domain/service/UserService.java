package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.User;
import com.sertres.reporte.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public List<User> getByUserId(int userId){
        return userRepository.getByUserId(userId);
    }

    public List<User> getByAccessLevel(int accessLevelId){
        return userRepository.getByAccessLevel(accessLevelId);
    }

    //save and delete
    public User save (User user){
        return userRepository.save(user);
    }

    public void delete(int userId){
        userRepository.delete(userId);
    }
    
}
