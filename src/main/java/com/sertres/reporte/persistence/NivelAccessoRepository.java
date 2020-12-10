package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.AccessLevel;
import com.sertres.reporte.domain.repository.AccessLevelRepository;
import com.sertres.reporte.persistence.crud.NivelAccessoCrudRepository;
import com.sertres.reporte.persistence.entity.NivelAcceso;
import com.sertres.reporte.persistence.mapper.AccessLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NivelAccessoRepository implements AccessLevelRepository {

    @Autowired
    private NivelAccessoCrudRepository nivelAccessoCrudRepository;

    @Autowired
    private AccessLevelMapper mapper;

    @Override
    public List<AccessLevel> getAll() {
        List<NivelAcceso> accesos = (List<NivelAcceso>) nivelAccessoCrudRepository.findAll();
        return mapper.toAccessLevels(accesos);
    }

    @Override
    public List<AccessLevel> getByAcceslevelId(int accessLevelId) {
        List<NivelAcceso> accesos = nivelAccessoCrudRepository.findByIdNivelAcceso(accessLevelId);
        return mapper.toAccessLevels(accesos);
    }

    @Override
    public AccessLevel save(AccessLevel accessLevel) {
        NivelAcceso acceso1 = mapper.toNivelAcceso(accessLevel);
        return mapper.toAccessLevel(nivelAccessoCrudRepository.save(acceso1));
    }

    @Override
    public void delete(int accessLevelId) {
        nivelAccessoCrudRepository.deleteById(accessLevelId);
    }
}
