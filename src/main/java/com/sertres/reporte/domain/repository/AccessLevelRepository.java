package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.AccessLevel;

import java.util.List;

public interface AccessLevelRepository {

    List<AccessLevel> getAll();
    List<AccessLevel> getByAcceslevelId (int accessLevelId);
    List<AccessLevel> getByAccessLevelType (String accessLevelType);
    //save and delete
    AccessLevel save (AccessLevel accessLevel);
    void delete(int accessLEvelId);
}
