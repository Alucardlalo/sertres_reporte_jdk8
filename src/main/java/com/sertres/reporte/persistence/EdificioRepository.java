package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.Building;
import com.sertres.reporte.domain.repository.BuildingRepository;
import com.sertres.reporte.persistence.crud.EdificioCrudRepository;
import com.sertres.reporte.persistence.entity.Edificio;
import com.sertres.reporte.persistence.mapper.BuildingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EdificioRepository implements BuildingRepository {

    @Autowired
    private EdificioCrudRepository edificioCrudRepository;

    @Autowired
    private BuildingMapper mapper;

    @Override
    public List<Building> getAll() {
        List<Edificio> edificios = (List<Edificio>) edificioCrudRepository.findAll();
        return mapper.toBuildings(edificios);
    }

    @Override
    public List<Building> getByBuildingId(int buildingId) {
        List<Edificio> edificios = edificioCrudRepository.findByIdEdificio(buildingId);
        return mapper.toBuildings(edificios);
    }

    @Override
    public Building save(Building building) {
        Edificio edificioS = mapper.toEdificio(building);
        return mapper.toBuilding(edificioCrudRepository.save(edificioS));
    }

    @Override
    public void delete(int buildingId) {
        edificioCrudRepository.deleteById(buildingId);
    }
}
