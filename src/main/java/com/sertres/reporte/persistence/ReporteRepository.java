package com.sertres.reporte.persistence;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.repository.ReportRepository;
import com.sertres.reporte.persistence.crud.ReporteCrudRepository;
import com.sertres.reporte.persistence.entity.Reporte;
import com.sertres.reporte.persistence.mapper.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReporteRepository implements ReportRepository {

    @Autowired
    private ReporteCrudRepository reporteCrudRepository;
    @Autowired
    private ReportMapper mapper;

    @Override
    public List<Report> getAll(){
        List<Reporte> reportes = (List<Reporte>) reporteCrudRepository.findAll();
        return mapper.toReports(reportes);
    }

    @Override
    public List<Report> GetByReport(int reportId) {
        List<Reporte> reportes = reporteCrudRepository.findByIdReporte(reportId);
        return mapper.toReports(reportes);
    }



    @Override
    public Report save(Report report) {
        Reporte reporte = mapper.toReport(report);
        return mapper.toReport(reporteCrudRepository.save(reporte));
    }

    @Override
    public void delete(int reportId) {
        reporteCrudRepository.deleteById(reportId);
    }

}
