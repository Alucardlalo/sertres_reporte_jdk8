package com.sertres.reporte.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ReportType {


    private Integer reportTypeId;

    private String reportType;

    private String description;


    public Integer getIdReportType() {
        return reportTypeId;
    }

    public void setIdReportType(Integer reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
