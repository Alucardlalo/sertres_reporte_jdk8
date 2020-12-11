package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.ReportStatus;
import com.sertres.reporte.domain.repository.ReportStatusRepository;
import com.sertres.reporte.persistence.crud.EstadoReporteCrudRepository;
import com.sertres.reporte.persistence.entity.EstadoReporte;
import com.sertres.reporte.persistence.mapper.ReportStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstadoReporteRepository implements ReportStatusRepository {

    @Autowired
    private EstadoReporteCrudRepository estadoReporteCrudRepository;

    @Autowired
    private ReportStatusMapper mapper;

    @Override
    public List<ReportStatus> getAll() {
        List<EstadoReporte> estadoReportes = (List<EstadoReporte>) estadoReporteCrudRepository.findAll();
        return mapper.toReportStatusL(estadoReportes);
    }

    @Override
    public ReportStatus save(ReportStatus reportStatus) {
        EstadoReporte estadoReporteS = mapper.toEstadoReporte(reportStatus);
        return mapper.toReportStatus(estadoReporteCrudRepository.save(estadoReporteS));
    }

    @Override
    public void delete(int reportStatusId) {
        estadoReporteCrudRepository.deleteById(reportStatusId);
    }
}
