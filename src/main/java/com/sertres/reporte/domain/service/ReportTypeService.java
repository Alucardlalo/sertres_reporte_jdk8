package com.sertres.reporte.domain.service;

import com.sertres.reporte.domain.ReportType;
import com.sertres.reporte.domain.repository.ReportTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportTypeService {

    @Autowired
    private ReportTypeRepository reportTypeRepository;

    public List<ReportType> getAll() {
        return reportTypeRepository.getAll();
    }

    public List<ReportType> getBYReportTypeId(int reportTypeId){
        return reportTypeRepository.GetByReportTypeId(reportTypeId);
    }

    public Optional<List<ReportType>> getReportType(int reportType){
        return reportTypeRepository.GetReportType(reportType);
    }

    //save and delete
    public ReportType save(ReportType reportType){
        return reportTypeRepository.save(reportType);
    }

    public void delete (int reportTypeId){
        reportTypeRepository.delete(reportTypeId);
    }
}
