package com.sertres.reporte.domain.repository;

import com.sertres.reporte.domain.AccessLevel;

import java.util.List;
import java.util.Optional;

public interface AccessLevelRepository {

    List<AccessLevel> getAll();
    List<AccessLevel> getByAcceslevelId (int accessLevelId);
    //save and delete
    AccessLevel save (AccessLevel accessLevel);
    void delete(int accessLEvelId);
}
