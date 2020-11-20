package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.domain.repository.ReportTypeRepository;
import com.sertres.reporte.persistence.crud.TipoReporteCrudRepository;
import com.sertres.reporte.persistence.entity.TipoReporte;
import com.sertres.reporte.persistence.mapper.ReportTypeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TipoReporteRepository implements ReportTypeRepository {
    private TipoReporteCrudRepository tipoReporteCrudRepository;
    private ReportTypeMapper mapper;

    @Override
    public List<ReportType> getAll() {
        List<TipoReporte> tipoReportes = (List<TipoReporte>) tipoReporteCrudRepository.findAll();
        return mapper.toReportTypes(tipoReportes);
    }

    @Override
    public List<ReportType> GetByReportTypeId(int reportTypeId) {
        List<TipoReporte> tipoReportes = tipoReporteCrudRepository.findByIdTipoReporte(reportTypeId);
        return mapper.toReportTypes(tipoReportes);
    }

    @Override
    public Optional<List<ReportType>> GetReportType(int reportTypeId) {
        List<TipoReporte> tipoReportes = tipoReporteCrudRepository.findByIdTipoReporte(reportTypeId);
        return Optional.of(mapper.toReportTypes(tipoReportes));//resive un optional
    }

    @Override
    public ReportType save(ReportType reportType) {
        TipoReporte tipoReporte = mapper.toTipoReporte(reportType);
        return mapper.toReportType(tipoReporteCrudRepository.save(tipoReporte));
    }

    @Override
    public void delete(int reportTypeId) {
        tipoReporteCrudRepository.deleteById(reportTypeId);
    }

}
