package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.User;
import com.sertres.reporte.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public List<User> getByUserId(@PathVariable("id") int userId){
        return userService.getByUserId(userId);
    }

    @GetMapping("/access/{id}")
    public List<User> getByAccessLevel(@PathVariable("id") int accessId){
        return userService.getByAccessLevel(accessId);
    }

    @GetMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int userId){
        userService.delete(userId);
    }
}
