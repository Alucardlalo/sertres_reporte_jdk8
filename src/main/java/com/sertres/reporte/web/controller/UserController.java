package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.User;
import com.sertres.reporte.domain.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(description = "This API has a CRUD for Users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @ApiOperation("Get all users")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("Search an Users with an Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public List<User> getByUserId(@ApiParam(value = "The User Id",required = true) @PathVariable("id") int userId){
        return userService.getByUserId(userId);
    }

    @GetMapping("/access/{id}")
    @ApiOperation("Search an User with an access level Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Access level not found")
    })
    public List<User> getByAccessLevel(@ApiParam(value = "The Access level Id",required = true)@PathVariable("id") int accessId){
        return userService.getByAccessLevel(accessId);
    }

    @PostMapping("/save")
    @ApiOperation("Save new User")
    @ApiResponses({
            @ApiResponse(code = 200, message = "User created")
    })
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Delete User by Id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "User delete"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public void delete(@ApiParam(value = "The User Id",required = true)@PathVariable("id") int userId){
        userService.delete(userId);
    }
}
