package com.sertres.reporte.web.controller;

import com.sertres.reporte.domain.AccessLevel;
import com.sertres.reporte.domain.service.AccessLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/access")
public class AccessLevelController {

    @Autowired
    private AccessLevelService accessLevelService;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<AccessLevel> getAll(){
        return accessLevelService.getAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<AccessLevel> getByAccessLevelId (@PathVariable("id") int accessLevel){
        return accessLevelService.getByAccessLevelId(accessLevel);
    }

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:3000")
    public AccessLevel save(@RequestBody AccessLevel accessLevel){
        return accessLevelService.save(accessLevel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int accessLevelId){
         accessLevelService.delete(accessLevelId);
    }
}
