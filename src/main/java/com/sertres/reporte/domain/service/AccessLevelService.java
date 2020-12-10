package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.AccessLevel;
import com.sertres.reporte.domain.repository.AccessLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessLevelService {

    @Autowired
    private AccessLevelRepository accessLevelRepository;

    public List<AccessLevel> getAll(){
        return accessLevelRepository.getAll();
    }

    public List<AccessLevel> getByAccessLevelId(int accessLevelId){
        return accessLevelRepository.getByAcceslevelId(accessLevelId);
    }

    public List<AccessLevel> getByAccessLevelType(String accessType){
        return accessLevelRepository.getByAccessLevelType(accessType);
    }

    //save and delete
    public AccessLevel save (AccessLevel accessLevel){
        return accessLevelRepository.save(accessLevel);
    }

    public void delete (int accessLevelId){
        accessLevelRepository.delete(accessLevelId);
    }
}
