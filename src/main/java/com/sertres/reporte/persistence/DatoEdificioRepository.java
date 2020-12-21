package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.BuildingData;
import com.sertres.reporte.domain.repository.BuildingDataRepository;
import com.sertres.reporte.persistence.crud.DatoEdificioCrudRepository;
import com.sertres.reporte.persistence.entity.DatoEdificio;
import com.sertres.reporte.persistence.mapper.BuildingDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatoEdificioRepository implements BuildingDataRepository {

    @Autowired
    private DatoEdificioCrudRepository datoEdificioCrudRepository;

    @Autowired
    private BuildingDataMapper mapper;

    @Override
    public List<BuildingData> GetAll() {
        List<DatoEdificio> datoEdificios = (List<DatoEdificio>) datoEdificioCrudRepository.findAll();
        return mapper.toBuildingsData(datoEdificios);
    }

    @Override
    public BuildingData save(BuildingData buildingData) {
        DatoEdificio datoEdificioS = mapper.toDatoEdificio(buildingData);
        return mapper.toBuildingData(datoEdificioCrudRepository.save(datoEdificioS));
    }

    @Override
    public void delete(int buildingDataId) {
        datoEdificioCrudRepository.deleteById(buildingDataId);
    }
}
